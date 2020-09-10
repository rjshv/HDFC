package HDFC.core.module.user.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import HDFC.core.module.user.service.UserService;
import HDFC.db.entity.User;
import HDFC.db.entity.property.UserProperties;
import HDFC.db.mapper.UserMapper;

/**
 * 用户service实现
 *
 * @author IBIT TECH
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;


    /**
     * 通过用户名查询用户
     *
     * @param username 用户名
     * @return 用户
     */
    @Override
    public User getByUsername(String username) {
        if (StringUtils.isBlank(username)) {
            return null;
        }
        return mapper
                .createQuery()
                .columnDefaultPo()
                .fromDefault()
                .andWhere(UserProperties.userName.eq(username))
                .limit(1)
                .executeQueryOne();
    }

}
