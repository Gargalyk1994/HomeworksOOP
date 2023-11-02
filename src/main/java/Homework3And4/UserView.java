package Homework3And4;

import java.util.List;

public interface UserView <T extends User> {

    public void sendOnConsole(List<T> userList);

}