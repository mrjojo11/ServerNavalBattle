package entity;

import Server.entity.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * The type User test.
 */
public class UserTest {

	@Test
	public void testConstructor() {
		User test = new User();
		assertNotNull(test);
	}
	
    @Test
    public void testToString() {
        // Setup
        final String expectedResult = "User [id=0, user_name=null, password=null, vegetarian=0, produce=0, car=0, public_transportation=0, bike=0, temperature=0, solar =0, total_saved=0, total_used=0, total=0]";
        User test = new User();
        
        // Run the test
        final String result = test.toString();

        // Verify the results
        assertEquals(expectedResult, result);
    }


    @Test
    public void getId() {
        User test = new User();
        assertEquals(test.getId(), 0);
    }

    @Test
    public void setId() {
        User test = new User();
        test.setId(1);
        assertEquals(test.getId(), 1);
    }

    @Test
    public void getUser_name() {
        User test = new User();
        assertNull(test.getUser_name());
    }

    @Test
    public void setUser_name() {
        User test = new User();
        test.setUser_name("src/main/Test");
        assertEquals(test.getUser_name(), "src/main/Test");
    }

    @Test
    public void getPassword() {
        User test = new User();
        assertNull(test.getPassword());
    }

    @Test
    public void setPassword() {
        User test = new User();
        test.setPassword("src/main/Test");
        assertEquals(test.getPassword(), "src/main/Test");
    }

    @Test
    public void getVegetarian() {
        User test = new User();
        assertEquals(test.getVegetarian(), 0);
    }

    @Test
    public void setVegetarian() {
        User test = new User();
        test.setVegetarian(100);
        assertEquals(test.getVegetarian(), 100);
    }

    @Test
    public void getProduce() {
        User test = new User();
        assertEquals(test.getProduce(), 0);
    }

    @Test
    public void setProduce() {
        User test = new User();
        test.setProduce(100);
        assertEquals(test.getProduce(), 100);
    }

    @Test
    public void getPublic_transportation() {
        User test = new User();
        assertEquals(test.getPublic_transportation(), 0);
    }

    @Test
    public void setPublic_transportation() {
        User test = new User();
        test.setPublic_transportation(100);
        assertEquals(test.getPublic_transportation(), 100);
    }

    @Test
    public void getTemperature() {
        User test = new User();
        assertEquals(test.getTemperature(), 0);
    }

    @Test
    public void setTemperature() {
        User test = new User();
        test.setTemperature(100);
        assertEquals(test.getTemperature(), 100);
    }

    @Test
    public void getSolar() {
        User test = new User();
        assertEquals(test.getSolar(), 0);
    }

    @Test
    public void setSolar() {
        User test = new User();
        test.setSolar(100);
        assertEquals(test.getSolar(), 100);
    }
    
    @Test
    public void getCar() {
        User test = new User();
        assertEquals(test.getCar(), 0);
    }

    @Test
    public void setCar() {
        User test = new User();
        test.setCar(100);
        assertEquals(test.getCar(), 100);
    }
    
    @Test
    public void getBike() {
        User test = new User();
        assertEquals(test.getBike(), 0);
    }
    
    @Test
    public void setBike() {
        User test = new User();
        test.setBike(100);
        assertEquals(test.getBike(), 100);
    }

    @Test
    public void getTotal_saved() {
        User test = new User();
        assertEquals(test.getTotal_saved(), 0);
    }
    
    @Test
    public void setTotal_saved() {
        User test = new User();
        test.setTotal_saved(100);
        assertEquals(test.getTotal_saved(), 100);
    }
    
    @Test
    public void getTotal_used() {
        User test = new User();
        assertEquals(test.getTotal_used(), 0);
    }
    
    @Test
    public void setTotal_used() {
        User test = new User();
        test.setTotal_used(100);
        assertEquals(test.getTotal_used(), 100);
    }
    
    @Test
    public void getTotal() {
        User test = new User();
        assertEquals(test.getTotal(), 0);
    }
    
    @Test
    public void setTotal() {
        User test = new User();
        test.setTotal(100);
        assertEquals(test.getTotal(), 100);
    }
}
