package com.texas.professional.dto;

public class AuthResponse {
    private long expirationDate;
    private String accessToken;

    public AuthResponse(String accessToken,long expirationDate) {
        this.expirationDate = expirationDate;
        this.accessToken = accessToken;
    }

    public AuthResponse() {
    }

    public long getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(long expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
