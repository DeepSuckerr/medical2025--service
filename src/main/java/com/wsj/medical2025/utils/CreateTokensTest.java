package com.wsj.medical2025.utils;

import io.jsonwebtoken.*;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CreateTokensTest {

    static String siganture = "hello";

    public static String createToken(Long id, String username) {
        // 创建JWT对象
        JwtBuilder jwtBuilder = Jwts.builder();
        String jwtToken = jwtBuilder
                // 设置header
                .setHeaderParam("HS256", "HS256")
                //设置数据或者参数 payload
                .claim("id", id)
                .claim("username", username)
                // 可以设置主题
                // 设置有效时长
                .setExpiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 100))
                .setId(UUID.randomUUID().toString())
                // 设置signature 签名
                .signWith(SignatureAlgorithm.HS256, siganture)
                .compact();
        return jwtToken;

    }

    public static boolean checkToken(String token) {

        if (token == null) {
            return false;
        }
        try {
            Jws<Claims> claimsJws = Jwts.parser().setSigningKey("hello").parseClaimsJws(token);
        }catch (ExpiredJwtException e) {
            return false;
        }


        return true;
    }

    public static Map<String,Object> getIdAndNameFromToken(String token) {
        Jws<Claims> claimsJws = Jwts.parser().setSigningKey("hello").parseClaimsJws(token);
        Claims claims = claimsJws.getBody();
        Map<String, Object> map = new HashMap<>();
        map.put("id", claims.get("id"));
        map.put("username", claims.get("username"));
        return map;

    }

}

//    @Test
//    public void createTokensTest(){
//        String jwtToken  = "";
//        JwtParser parser = Jwts.parser();
//        Jws<Claims> claimsJws = parser.setSigningKey("hello").parseClaimsJws(token);
//        Claims body = claimsJws.getBody();
//        System.out.println(body.get("username"));
//        System.out.println(body.get("loginRole"));
//        System.out.println(body.getId());
//        System.out.println(body.getSubject());
//        System.out.println(body.getExpiration());
//        createTokens();
//    }

