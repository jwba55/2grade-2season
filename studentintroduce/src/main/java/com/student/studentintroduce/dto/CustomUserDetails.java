package com.student.studentintroduce.dto;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@RequiredArgsConstructor
public class CustomUserDetails implements UserDetails {

	private final AddUserDto adduserDto;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // 사용자 권한 정보 추출
        String role = adduserDto.getRole();

        log.info("권한 : " + role);

        // GrantedAuthority 객체로 변환
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role);

        // 권한 목록 반환
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(grantedAuthority);
        return authorities;
    }

    @Override
    public String getPassword() {
        return adduserDto.getPassword();
    }

    @Override
    public String getUsername() {
    	String username = String.valueOf(adduserDto.getUsername());
    	
        return username;
    }
    
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}