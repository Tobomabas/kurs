package pl.com.tkarolczyk.solid.open_close_principle.exc.controler.impl;
import pl.com.tkarolczyk.solid.open_close_principle.exc.controler.UserControler;
import pl.com.tkarolczyk.solid.open_close_principle.exc.exception.UserNotFoundCheckedExc;
import pl.com.tkarolczyk.solid.open_close_principle.exc.service.UserService;
import java.util.Objects;

public class UserControlerImpl implements UserControler {

    private UserService userService;


    public UserControlerImpl(UserService userService){
        this.userService = Objects.requireNonNull(userService);

    }
    @Override
    public String renderUserPage() {
        System.out.println("Making html with user data");

        try {
            userService.getUser();
        } catch (UserNotFoundCheckedExc userNotFoundCheckedExc) {
        //    userNotFoundCheckedExc.printStackTrace();
        }
        return null;


    }

}

