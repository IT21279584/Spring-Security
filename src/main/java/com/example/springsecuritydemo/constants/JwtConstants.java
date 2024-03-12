package com.example.springsecuritydemo.constants;

public class JwtConstants {
    public static final String SECRET = "12345";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}

