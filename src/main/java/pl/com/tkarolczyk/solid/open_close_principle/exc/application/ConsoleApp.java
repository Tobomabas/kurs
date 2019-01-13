package pl.com.tkarolczyk.solid.open_close_principle.exc.application;

import pl.com.tkarolczyk.solid.open_close_principle.exc.controler.UserControler;
import pl.com.tkarolczyk.solid.open_close_principle.exc.controler.impl.UserControlerImpl;
import pl.com.tkarolczyk.solid.open_close_principle.exc.repository.UserDao;
import pl.com.tkarolczyk.solid.open_close_principle.exc.repository.impl.DbReader;
import pl.com.tkarolczyk.solid.open_close_principle.exc.service.UserService;
import pl.com.tkarolczyk.solid.open_close_principle.exc.service.impl.UserServiceImpl;

public class ConsoleApp {

    public static void main(String[] args) {


        UserDao dbDao = new DbReader();
        UserService userService = new UserServiceImpl(dbDao);
        UserControler userControler = new UserControlerImpl(userService);

        userControler.renderUserPage();



    }
}
