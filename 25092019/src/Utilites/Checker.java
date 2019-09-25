package Utilites;

import Entries.Cookie;
import Entries.User;

public class Checker {
    boolean check(User user){
        return Cookie.cookies.contains(user);
    }
}
