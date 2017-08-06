package shared_classes;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;
import spock.lang.Specification;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class UserTest {

    @Test
    public void userRespondsTosetName(){
        String expectedName = "mike";
        User user = new User(expectedName, 12);

        assertEquals(expectedName, user.getName());
        assertEquals("Foo", user.getName());
    }
}
