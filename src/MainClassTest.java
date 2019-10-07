import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
        MainClass string = new MainClass();
@Test
    public void testGetClassString() {
    if (string.contains("Hello") | string.contains("hello")) {
        System.out.println("Word Hello is here!");
    }
    if (!string.contains("Hello") | !string.contains("hello")) {
        Assert.fail("Word Hello/hello is missing here (assert)");
    }
    }

}


