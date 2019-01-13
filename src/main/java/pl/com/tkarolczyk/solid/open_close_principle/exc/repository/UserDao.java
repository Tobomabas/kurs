package pl.com.tkarolczyk.solid.open_close_principle.exc.repository;

import pl.com.tkarolczyk.solid.open_close_principle.exc.exception.UserNotFoundCheckedExc;

public interface UserDao {

    String getUserFromDb() throws UserNotFoundCheckedExc;
    }


