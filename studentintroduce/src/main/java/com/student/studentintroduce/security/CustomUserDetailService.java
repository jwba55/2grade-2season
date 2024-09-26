package com.student.studentintroduce.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.student.studentintroduce.domain.UserDo;
import com.student.studentintroduce.domain.UserRole;
import com.student.studentintroduce.dto.AddUserDto;
import com.student.studentintroduce.dto.CustomUserDetails;
import com.student.studentintroduce.repository.UserRepository;
import com.student.studentintroduce.repository.UserRoleRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    UserRepository accountRepository;
    
    @Autowired
    UserRoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    	Long userId = Long.valueOf(username);
    	
        Optional<UserDo> userDo = accountRepository.findById(userId);

        log.info("사용자가 있음");
        log.info(userDo.toString());

        AddUserDto accountDto = AddUserDto.builder()
                .username(userDo.get().getUsername())
                .name(userDo.get().getName())
                .email(userDo.get().getEmail())
                .password(userDo.get().getPassword())
                .lessonId(userDo.get().getLesson().getLessonId())
                .userroleId(userDo.get().getUserRole().getUserroleId())
                .build();

        CustomUserDetails customUserDetails = new CustomUserDetails(accountDto);

        log.info(customUserDetails.toString());

        return customUserDetails;
    }

} 