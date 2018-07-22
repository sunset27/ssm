package top.lucasqiao.service.Impl;



import top.lucasqiao.dao.IUserDao;
import top.lucasqiao.model.User;
import top.lucasqiao.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}
