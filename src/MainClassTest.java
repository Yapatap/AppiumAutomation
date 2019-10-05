import org.junit.Test;

public class MainClassTest
{
        MainClass Local = new MainClass();
@Test
    public void testGetLocalNumber()
    {

        if (Local.a == 14) {
            System.out.println("This is what we expected");
        } else {
            System.out.println("This is not what we expected");
        }
    }
}
