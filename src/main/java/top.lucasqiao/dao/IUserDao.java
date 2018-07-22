package top.lucasqiao.dao;


import top.lucasqiao.model.User;

public interface IUserDao {

    User selectUser(long id);

}
