import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Junit5Base {

    @BeforeAll
    public static void beforeAll() {       //1 kere çalışır
        System.out.println("BeforeAll");
    }
    @BeforeEach
    public void beforeEach() {
        System.out.println("BeforeEach");
    }
    @Test
    public void test1() {
        System.out.println("Test1");
    }
    @Test
    public void test2() {
        System.out.println("Test2");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("AfterEach");
    }
    @AfterAll
    public static void afterAll() { // 1 kere çalışır
        System.out.println("AfterAll");
    }
}
