import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
        MainClass string = new MainClass();
        String s = string.getClassString();

@Test
    public void testGetClassString() {
    if (s.contains("Hello")) {
        System.out.println("Word Hello is here!");
    } if (s.contains("hello")) {
        System.out.println("Word hello is here!");
    }
    if (!s.contains("Hello") | !s.contains("hello")) {
        Assert.fail("Other words are missing here (assert)");
    }
    }

}


