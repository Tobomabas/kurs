package pl.com.tkarolczyk.solid.open_close_principle.exc.application;

import pl.com.tkarolczyk.solid.open_close_principle.exc.controler.UserControler;
import pl.com.tkarolczyk.solid.open_close_principle.exc.controler.impl.UserControlerImpl;
import pl.com.tkarolczyk.solid.open_close_principle.exc.repository.UserDao;
import pl.com.tkarolczyk.solid.open_close_principle.exc.repository.impl.CloudReader;
import pl.com.tkarolczyk.solid.open_close_principle.exc.service.UserService;
import pl.com.tkarolczyk.solid.open_close_principle.exc.service.impl.UserServiceImpl;

public class CloudApp {
    public static void main(String[] args) {
        UserDao cloudDao = new CloudReader();
        UserService userService = new UserServiceImpl(cloudDao);
        UserControler userControler = new UserControlerImpl(userService);
        userControler.renderUserPage();

    }





}
