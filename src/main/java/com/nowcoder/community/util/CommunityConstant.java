package com.nowcoder.community.util;

/**
 * @author: Ran
 * @create: 2023-04-03 18:51
 * @Descripton:
 */
public interface CommunityConstant {
    /**
     * 激活成功
     */
    int ACTIVATION_SUCCESS = 0;
    /**
     * 重复激活
     */
    int ACTIVATION_REPEAT = 1;
    /**
     * 激活失败
     */
    int ACTIVATION_FAILURE = 2;
    /**
     * 默认状态的登陆凭证的超时时间
     */
    int DEFAULT_EXPIRED_SECONDS = 3600 * 12 ;
    /**
     * 记住状态的登陆凭证超时时间
     */
    int REMEMBER_EXPIRED_SECONDS = 3600 * 24 * 100;

}
