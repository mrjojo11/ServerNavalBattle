package rest;
import Server.entity.User;
import Server.rest.UserRestController;
import Server.service.UserService;
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
 * The type User rest controller test.
 */
@RunWith(MockitoJUnitRunner.class)
public class UserRestControllerTest {

    @Mock
    private UserService mockUserService;

    @InjectMocks
    private UserRestController userRestControllerUnderTest;
    public User test1;
    public User test2;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {

        test1 = new User();
        test2 = new User();

        test1.setId(1);
        test1.setPassword("test1");
        test1.setBike(11);
        test1.setCar(11);
        test1.setProduce(11);
        test1.setPublic_transportation(11);
        test1.setSolar(11);
        test1.setTemperature(11);
        test1.setTotal(11);
        test1.setTotal_saved(11);
        test1.setTotal_used(11);
        test1.setUser_name("test1");
        test1.setVegetarian(11);

        test2.setId(11);
        test2.setPassword("test2");
        test2.setBike(11);
        test2.setCar(11);
        test2.setProduce(11);
        test2.setPublic_transportation(11);
        test2.setSolar(11);
        test2.setTemperature(11);
        test2.setTotal(11);
        test2.setTotal_saved(11);
        test2.setTotal_used(11);
        test2.setUser_name("test2");
        test2.setVegetarian(11);

        initMocks(this);
    }



    /**
     * Test get users.
     */
    @Test
    public void testGetUsers() {

        final List<User> expectedResult = new ArrayList<>();
        expectedResult.add(0, test1);
        expectedResult.add(1, test2);

        when(mockUserService.getUsers()).thenReturn(expectedResult);
        assertEquals(expectedResult, userRestControllerUnderTest.getUsers());
    }

    /**
     * Test get user.
     */
    @Test
    public void testGetUser() {

        when(mockUserService.getUser(1)).thenReturn(test1);
        assertEquals(test1, userRestControllerUnderTest.getUser(1));
    }

    /**
     * Test get user safe.
     */
    @Test
    public void testGetUserSafe() {

        when(mockUserService.getUserSafe(test1)).thenReturn(test1);
        assertEquals(test1, userRestControllerUnderTest.getUserSafe(test1));
    }

    /**
     * Test get user 2.
     */
    @Test
    public void testGetUser2() {

        when(mockUserService.getUser2("test1", "test1")).thenReturn(test1);
        assertEquals(test1, userRestControllerUnderTest.getUser2("test1", "test1"));
    }

    /**
     * Test get user 3.
     */
    @Test
    public void testGetUser3() {

        when(mockUserService.getUser3("test1")).thenReturn(test1);
        assertEquals(test1, userRestControllerUnderTest.getUser3("test1"));
    }

    /**
     * Test add user.
     */
    @Test
    public void testAddUser() {

        when(mockUserService.saveUser(test1)).thenReturn(test1);
        assertEquals(test1, userRestControllerUnderTest.addUser(test1));

    }

    /**
     * Test update user.
     */
    @Test
    public void testUpdateUser() {

        when(mockUserService.saveUser(test1)).thenReturn(test1);
        assertEquals(test1, userRestControllerUnderTest.updateUser(test1));

    }

    /**
     * Test delete user.
     */
    @Test
    public void testDeleteUser() {

        when(mockUserService.deleteUser(1)).thenReturn(1);
        assertEquals("Deleted user id - " +1, userRestControllerUnderTest.deleteUser(1));
    }
}
