package org;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ManageUTest {
	 ManageU manageU;
     User user1;
     User user2;

    @Before
    public void setUp() {
        manageU = new ManageU();
        user1 = new User(1,"John");
        user2 = new User(2,"Jane");
    }


	@Test
	public void testAddUser() {
		manageU.addUser(user1);
        manageU.addUser(user2);

        assertEquals(2, manageU.getUsers().size());
        assertTrue(manageU.getUsers().contains(user1));
        assertTrue(manageU.getUsers().contains(user2));
	}

	@Test
	public void testRemoveUser() {
		manageU.addUser(user1);
		manageU.addUser(user2);

		manageU.removeUser(user1);

        assertEquals(1, manageU.getUsers().size());
        assertFalse(manageU.getUsers().contains(user1));
        assertTrue(manageU.getUsers().contains(user2));
	}

	@Test
	public void testUpdateUser() {
		manageU.addUser(user1);
		manageU.addUser(user2);

        String newName = "John Doe";
        manageU.updateUser(user1, newName);

        assertEquals(newName, user1.getNom());
	}

	@Test
	public void testGetUsers() {
		manageU.getUsers();
	}

	
}
