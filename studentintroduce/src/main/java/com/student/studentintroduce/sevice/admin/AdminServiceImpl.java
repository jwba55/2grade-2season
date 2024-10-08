package com.student.studentintroduce.sevice.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.student.studentintroduce.domain.Lesson;
import com.student.studentintroduce.domain.UserDo;
import com.student.studentintroduce.domain.UserRole;
import com.student.studentintroduce.dto.AddUserDto;
import com.student.studentintroduce.dto.ApiResponseDto;
import com.student.studentintroduce.exception.SpecialExceptional.UserAlreadyExistsException;
import com.student.studentintroduce.repository.LessonRepository;
import com.student.studentintroduce.repository.UserRepository;
import com.student.studentintroduce.repository.UserRoleRepository;

import io.jsonwebtoken.io.IOException;
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
    
    @Autowired
    UserRoleRepository userRoleRepository;

    @Transactional
	@Override
	public ApiResponseDto addUser(AddUserDto adduserDto, Long username) throws UserAlreadyExistsException, IOException{
		String encodedPw = passwordEncoder.encode(adduserDto.getPassword());
		
		Lesson lesson = lessonRepository.getReferenceById(adduserDto.getLessonId());
		UserRole userRole = userRoleRepository.getReferenceById(adduserDto.getUserroleId());

        // Check for duplicate username before saving
        if (userRepository.findById(username).isPresent()) {
            throw new UserAlreadyExistsException();
        } else{

            UserDo userDo = UserDo.builder()
                    .username(adduserDto.getUsername())
            		.password(encodedPw)
                    .email(adduserDto.getEmail())
                    .name(adduserDto.getName())
                    .birthday(adduserDto.getBirthday())
                    .phone(adduserDto.getPhone())
                    .address(adduserDto.getAddress())
                    .userDate(adduserDto.getUserDate())
                    .gender(adduserDto.getGender())
                    .lesson(lesson)
                    .userRole(userRole)
                    .build();

            userDo = userRepository.save(userDo);
            
            log.info("회원 등록된 회원 아이디" + userDo.getUsername());

        }

        
        return ApiResponseDto.builder()
                .message("회원 등록이 완료되었습니다.")
                .status(HttpStatus.CREATED)
                .build();
    }

}
