package service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * The type Friend service impl test.
 */
@RunWith(MockitoJUnitRunner.class)
public class FriendServiceImplTest {

    @Mock
    private FriendDAO mockFriendDAO;

    @InjectMocks
    private FriendServiceImpl friendServiceImplUnderTest;
    public Friend test1;
    public Friend test2;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {

        test1 = new Friend();
        test2 = new Friend();

        test1.setFriend_name("Test1111");
        test1.setUser_name_entry("Test2222");
        test1.setId(111);

        test2.setFriend_name("Test3333");
        test2.setUser_name_entry("Test2222");
        test2.setId(112);

        initMocks(this);
    }

    /**
     * Test get friends.
     */
    @Test
    public void testGetFriends() {

        final List<Friend> expectedResult = new ArrayList<>();
        expectedResult.add(0, test1);
        expectedResult.add(1, test2);

        when(mockFriendDAO.getFriends()).thenReturn(expectedResult);
        assertEquals(expectedResult, friendServiceImplUnderTest.getFriends());
    }

    /**
     * Test get friends 1.
     */
    @Test
    public void testGetFriends1() {

        final List<Friend> expectedResult = new ArrayList<>();
        expectedResult.add(0, test1);
        expectedResult.add(1, test2);

        when(mockFriendDAO.getFriends("Test2222")).thenReturn(expectedResult);
        assertEquals(expectedResult, friendServiceImplUnderTest.getFriends("Test2222"));
    }

    /**
     * Test save friend.
     */
    @Test
    public void testSaveFriend() {

        when(mockFriendDAO.saveFriend(test1)).thenReturn(test1);
        assertEquals(test1, friendServiceImplUnderTest.saveFriend(test1));

    }

    /**
     * Test delete friend.
     */
    @Test
    public void testDeleteFriend() {

        when(mockFriendDAO.deleteFriend(111)).thenReturn(111);
        assertEquals(111, friendServiceImplUnderTest.deleteFriend(111));
    }
}
