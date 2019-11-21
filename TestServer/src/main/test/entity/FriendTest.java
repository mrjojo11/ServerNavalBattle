package entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class FriendTest {

    @Test
    public void getId() {
        Friend test = new Friend();
        test.setId(1);
        assertEquals(test.getId(),1);
    }

    @Test
    public void setId() {
        Friend test = new Friend();
        test.setId(1);
        assertEquals(test.getId(),1);
    }

    @Test
    public void getUser_name_entry() {
        Friend test = new Friend();
        test.setUser_name_entry("test");
        assertEquals(test.getUser_name_entry(),"test");
    }

    @Test
    public void setUser_name_entry() {
        Friend test = new Friend();
        test.setUser_name_entry("test");
        assertEquals(test.getUser_name_entry(),"test");
    }

    @Test
    public void getFriend_name() {
        Friend test = new Friend();
        test.setFriend_name("test");
        assertEquals(test.getFriend_name(),"test");
    }

    @Test
    public void setFriend_name() {
        Friend test = new Friend();
        test.setFriend_name("test");
        assertEquals(test.getFriend_name(),"test");
    }

    @Test
	public void testFriend_toString() {
		Friend Test = new Friend();
		Test.setId(12);
		Test.setFriend_name("Ardy");
		Test.setUser_name_entry("Nick");
		assertEquals(Test.toString(), "Friend [id=12, user_name_entry=Nick, friend_name=Ardy]");
	}

}