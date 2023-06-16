package test.studenttest;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import students;

public class StudentTest {
    Student ab=null;

    @BeforeAll
    @Test
    public void annotInform(){
        ab=new Student();
    }

    public void toStringTest() {
        Student a=new Book(42,"Nikolay", "Ivanov");
        System.out.print("42 Nikolay Ivanov",a.toString());
    }
    @Test
    public void getNameTest() {
        assertNull(ab.getName());
    }
}
