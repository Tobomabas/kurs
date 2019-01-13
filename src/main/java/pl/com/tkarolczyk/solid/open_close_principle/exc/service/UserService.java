package pl.com.tkarolczyk.solid.open_close_principle.exc.service;

import pl.com.tkarolczyk.solid.open_close_principle.exc.domain.User;
import pl.com.tkarolczyk.solid.open_close_principle.exc.exception.UserNotFoundCheckedExc;

public interface UserService {

    User getUser() throws UserNotFoundCheckedExc;
    }


