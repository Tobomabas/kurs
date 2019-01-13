package pl.com.tkarolczyk.solid.open_close_principle.exc.service.impl;

import pl.com.tkarolczyk.solid.open_close_principle.exc.domain.User;
import pl.com.tkarolczyk.solid.open_close_principle.exc.exception.UserNotFoundCheckedExc;
import pl.com.tkarolczyk.solid.open_close_principle.exc.repository.UserDao;
import pl.com.tkarolczyk.solid.open_close_principle.exc.service.UserService;

import java.util.Objects;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = Objects.requireNonNull(userDao);


    }

    @Override
    public User getUser() throws UserNotFoundCheckedExc {
        System.out.println("Some Text");
        return new User(userDao.getUserFromDb());
    }
}


//    @Override
//    public String getUser() {
//        System.out.println("lsdcsdlcskcm");
//
//            return userDao.getUserFromDb()
//
//        }
//    }

