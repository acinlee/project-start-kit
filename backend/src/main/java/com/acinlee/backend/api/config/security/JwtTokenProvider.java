package com.acinlee.backend.api.config.security;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    private String secretKey = "acinlee";

    // 토큰 유효 시간 설정 (1시간)
    private long tokenValidTime = 60 * 60 * 1000L;

    private final UserDetailsService userDetailsService;

    public JwtTokenProvider(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }
}
