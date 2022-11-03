import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //methodları sıralamamızı sağlıyor
@TestClassOrder(ClassOrderer.class) //classları sıralamamızı sağlıyor

public class Junit5Example extends Junit5Base {

    @Order(2)
    @Test
    public void assertEquals() {

        Assertions.assertEquals(1, 1, "test tamamlanamadı...");
        System.out.println("test başarılı bir şekilde tamamlandı.");
    }
    @Order(3)
    @ParameterizedTest
    @ValueSource(strings = {"Testinium", "Test", "Test"})
    public void paramTest(String str) {
        Assertions.assertEquals("Testinium", str, "test tamamlanamadı...");
        System.out.println("test başarılı bir şekilde tamamlandı.");
    }
    String getUsername() {
        return "Kullanıcı 1<br>";
    }

    @Order(1)
    @Test
    void assertEqual() {
        String username = getUsername().trim().replaceAll("<br>", "");
        Assertions.assertEquals("Kullanıcı 1", username, "test tamamlanamadı...");
        System.out.println("pass");
    }
}
