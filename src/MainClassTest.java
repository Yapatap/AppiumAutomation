import org.junit.Test;

public class MainClassTest
{
        MainClass number = new MainClass();
@Test
    public void testGetClassNumber() {
    if (number.getClassNumber() < 45) {
        System.out.println("True, because number is less then 45");
    } else if (number.getClassNumber() > 45) {
        System.out.println("False, because number is more than 45");
    }
}

}
