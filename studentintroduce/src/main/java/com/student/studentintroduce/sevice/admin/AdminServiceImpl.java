package com.student.studentintroduce.sevice.admin;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.student.studentintroduce.domain.Lesson;
import com.student.studentintroduce.domain.UserDo;
import com.student.studentintroduce.domain.UserRole;
import com.student.studentintroduce.dto.AddUserDto;
import com.student.studentintroduce.dto.ApiResponseDto;
import com.student.studentintroduce.dto.UserDto;
import com.student.studentintroduce.exception.SpecialExceptional.UserAlreadyExistsException;
import com.student.studentintroduce.repository.UserRepository;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AdminServiceImpl implements AdminService {
	
    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;
    
    @Autowired
    LessonRepository lessonRepository;

    @Transactional
	@Override
	public ApiResponseDto putUser(AddUserDto adduserDto) throws UserAlreadyExistsException{
		String encodedPw = passwordEncoder.encode(adduserDto.getPassword());

        // Check for duplicate username before saving
        if (userRepository.findById(adduserDto.getUserName()) == null) {
        	
        	Lesson lesson = Lesson.builder()
                    .lessonName(adduserDto.getUserName())
                    .build();

            lesson = lessonRepository.save(lesson);

            UserDo userDo = UserDo.builder()
                    .email(adduserDto.getUserName())
                    .password(encodedPw)
                    .build();

            userDo = userRepository.save(userDo);
            
            UserRole userRole = userRole.builder()
                    .status(adduserDto.getUserName())
                    .password(encodedPw)
                    .build();

            userRole = userRepository.save(userDo);
            
            
            
            log.info("회원가입된 회원 아이디" + userDo.getUserId());

        } else {
            throw new UserAlreadyExistsException();
        }
        
        return ApiResponseDto.builder()
                .message("회원 등록이 완료되었습니다.")
                .status(HttpStatus.CREATED)
                .build();
	}

}
