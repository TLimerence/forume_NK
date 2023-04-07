package com.nowcoder.community.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author: Ran
 * @create: 2023-04-06 20:51
 * @Descripton:
 */
public class CookieUtil {
    public static String getValue(HttpServletRequest request,String name){
        if(request == null || name == null){
            throw new IllegalArgumentException("参数为空!");
        }
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for (Cookie cookie : cookies) {
                if(cookie.getName().equals(name)){
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
}
