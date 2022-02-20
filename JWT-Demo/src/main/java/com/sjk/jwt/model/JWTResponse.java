package com.sjk.jwt.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JWTResponse {

    @Getter@Setter
    private String jwtToken;


}
