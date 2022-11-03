import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) // isme göre sıralama
public class Junit4Example extends Junit4Base {

    @Test
    public void assertEquals() {
        Assert.assertEquals("test tamamlanamadı...", 1, 1);
        System.out.println("test başarılı bir şekilde tamamlandı.");
    }

    @Test
    public void assertNotEquals() {
        Assert.assertNotEquals("test tamamlanamadı...", 1, 2);
        System.out.println("test başarılı bir şekilde tamamlandı.");
    }

    @Test
    public void arrayEquals() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        Assert.assertArrayEquals("test tamamlanamadı...", arr1, arr2);
        System.out.println("test başarılı bir şekilde tamamlandı.");
    }

    @Test
    public void arrayNotEquals() {
        String[] arr1 = {"Testinium,", "Test", "Test"};
        String[] arr2 = {"Test", "Testinium,", "Test"};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Assert.assertNotEquals("test tamamlanamadı...", arr1, arr2);
        System.out.println("test başarılı bir şekilde tamamlandı.");
    }

    @Test
    public void assertListEquals() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);

        List<Integer> list2 = Arrays.asList(2, 1, 3);

        Collections.sort(list1);
        Collections.sort(list2);

        Assert.assertEquals("test tamamlanamadı...", list1, list2);
        System.out.println("List test başarılı bir şekilde tamamlandı.");
    }

    @Test
    public void assertListNotEquals() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);

        List<Integer> list2 = Arrays.asList(2, 1, 3);

        Collections.sort(list1);
        Collections.sort(list2);

        Assert.assertNotEquals("test tamamlanamadı...", list1, list2);
        System.out.println("List test başarılı bir şekilde tamamlandı.");
    }

    @Test
    public void assertTrue() {
        int a = 1;
        int b = 2;
        Assert.assertTrue("test tamamlanamadı...", a < b);
        System.out.println("test başarılı bir şekilde tamamlandı.");
    }

    @Test
    public void assertFalse() {
        int a = 1;
        int b = 2;
        //a 4 ten büyük 2 ye bölünebilen
        Assert.assertFalse("test tamamlanamadı...", a > 4 && b % 2 == 0);
        System.out.println("test başarılı bir şekilde tamamlandı.");
    }
    @Test
    public void assertNull() {
        String a = null;
        Assert.assertNull("test tamamlanamadı...", a);
        System.out.println("test başarılı bir şekilde tamamlandı.");
    }
    @Test
    public void assertNotNull() {
        String a = "Testinium";
        Assert.assertNotNull("test tamamlanamadı...", a);
        System.out.println("test başarılı bir şekilde tamamlandı.");
    }
    @Test
    @Ignore
    public void testIgnore(){
        System.out.println("test başarılı bir şekilde tamamlandı.");
    }
}
