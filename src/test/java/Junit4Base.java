import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit4Base {

    @BeforeClass
    public static void beforeClass() {       //1 kere çalışır
        System.out.println("BeforeClass");
    }
    @Before
    public void before() {
        System.out.println("Before");
    }
    @Test
    public void test1() {
        System.out.println("Test1");
    }
    @Test
    public void test2() {
        System.out.println("Test2");
    }
    @After
    public void after() {
        System.out.println("After");
    }
    @AfterClass
    public static void afterClass() { // 1 kere çalışır
        System.out.println("AfterClass");
    }
}
