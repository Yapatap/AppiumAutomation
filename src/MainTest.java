import org.junit.Test;

public class MainTest extends CoreTestCase
{
    MathHelper Math = new MathHelper();
    int a = 5;
    int b = 11;
    @Test
    public void myFirstTest()
    {
        int a = Math.multiply(5);
        System.out.println(a);
        int b = Math.multiply(10, 15);
        System.out.println(b);
    }
}

