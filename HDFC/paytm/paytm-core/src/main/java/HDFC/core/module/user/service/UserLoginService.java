package HDFC.core.module.user.service;

import HDFC.core.module.user.dto.UserLoginDto;
import HDFC.core.module.user.param.LoginParam;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户登陆service
 *
 * @author IBIT TECH
 */
public interface UserLoginService {

    /**
     * 用户登陆
     *
     * @param request    请求
     * @param loginParam 登陆参数
     * @return 用户
     */
    UserLoginDto login(HttpServletRequest request, LoginParam loginParam);


    /**
     * 获取登陆对象
     *
     * @param request 请求
     * @return 登陆对象
     */
    UserLoginDto getLoginInfo(HttpServletRequest request);

    /**
     * 注销登陆
     *
     * @param request 请求
     */
    void logout(HttpServletRequest request);
}
