package com.student.studentintroduce.security;

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
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        UserDo userDo = accountRepository.findById();
        UserRole userRole = roleRepository.findById(userName);

        if (userDo == null) {
            log.info("사용자가 없음");
            throw new UsernameNotFoundException("사용자를 찾을 수 없습니다.");
        }
        log.info("사용자가 있음");
        log.info(userDo.toString());

        AddUserDto accountDto = AddUserDto.builder()
                .userId(userDo.getUserId())
                .userName(userDo.getUserName())
                .userName(userDo.getEmail())
                .password(userDo.getPassword())
                .role(userRole.getRole())
                .build();

        CustomUserDetails customUserDetails = new CustomUserDetails(accountDto);

        log.info(customUserDetails.toString());

        return customUserDetails;
    }

}