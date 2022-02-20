package com.sjk.jwt.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JWTRequest {

    @Getter@Setter
    private String userName;
    @Getter @Setter
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
