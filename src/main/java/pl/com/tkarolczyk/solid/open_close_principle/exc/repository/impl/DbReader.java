package pl.com.tkarolczyk.solid.open_close_principle.exc.repository.impl;
import pl.com.tkarolczyk.solid.open_close_principle.exc.exception.UserNotFoundCheckedExc;
import pl.com.tkarolczyk.solid.open_close_principle.exc.repository.UserDao;

public class DbReader implements UserDao {
    @Override
    public String getUserFromDb() throws UserNotFoundCheckedExc {
        throw new UserNotFoundCheckedExc("Not found!");


    }


}
