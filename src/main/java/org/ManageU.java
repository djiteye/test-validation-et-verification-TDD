package org;

import java.util.ArrayList;
import java.util.List;

public class ManageU {
	private List<User> userList;

    public ManageU() {
        userList = new ArrayList<User>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user) {
        userList.remove(user);
    }

    public void updateUser(User user, String newName) {
        user.setNom(newName);
    }

    public List<User> getUsers() {
        return userList;
    	
    }

}
