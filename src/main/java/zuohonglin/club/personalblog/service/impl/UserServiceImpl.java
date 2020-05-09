package zuohonglin.club.personalblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zuohonglin.club.personalblog.dao.UserDao;
import zuohonglin.club.personalblog.entity.User;
import zuohonglin.club.personalblog.service.UserServiceI;

import java.util.List;

@Service
public class UserServiceImpl implements UserServiceI {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUser() {

        return userDao.getAllUser();
    }
}
