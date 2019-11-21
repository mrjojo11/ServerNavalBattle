package rest;
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
 * The type Friend rest controller test.
 */
@RunWith(MockitoJUnitRunner.class)
public class FriendRestControllerTest {

    @Mock
    private FriendService mockFriendService;

    @InjectMocks
    private FriendRestController friendRestControllerUnderTest;
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

        when(mockFriendService.getFriends()).thenReturn(expectedResult);
        assertEquals(expectedResult, friendRestControllerUnderTest.getFriends());
    }


    /**
     * Test get friends 1.
     */
    @Test
    public void testGetFriends1() {

        final List<Friend> expectedResult = new ArrayList<>();
        expectedResult.add(0, test1);
        expectedResult.add(1, test2);

        when(mockFriendService.getFriends("Test2222")).thenReturn(expectedResult);
        assertEquals(expectedResult, friendRestControllerUnderTest.getFriends("Test2222"));
    }

    /**
     * Test add friend.
     */
    @Test
    public void testAddFriend() {

        when(mockFriendService.saveFriend(test1)).thenReturn(test1);
        assertEquals(test1, friendRestControllerUnderTest.addFriend(test1));
    }

    /**
     * Test update friend.
     */
    @Test
    public void testUpdateFriend() {

        when(mockFriendService.saveFriend(test1)).thenReturn(test1);
        assertEquals(test1, friendRestControllerUnderTest.updateFriend(test1));
    }

    /**
     * Test delete friend.
     */
    @Test
    public void testDeleteFriend() {

        when(mockFriendService.deleteFriend(111)).thenReturn(111);
        assertEquals("Deleted user id - " + 111, friendRestControllerUnderTest.deleteFriend(111));
    }
}
