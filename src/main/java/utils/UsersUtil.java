package utils;


import models.Users;

public class UsersUtil {

    public static Users createUser() {

        Users user = new Users();
        user.setName("Maxym");
        user.setSecondName("Yuriyovuch");
        user.setSurname("Ratoshniuk");
        return user;
    }
}
