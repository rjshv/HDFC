package HDFC.core.module.user.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 登陆参数
 *
 * @author IBIT TECH
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginParam {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

}
