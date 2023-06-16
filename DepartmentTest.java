package test.departmenttest;
import org.junit.jupiter.api.Test;
import static junit.framework.Assert.assertEquals;
import Department;
public class DepartmentTest {
    @Test
    public void setNameTest(){
        Department test=new Department(name: "Dep1");
        assertEquals(expected: "Dep1", actual: test.getName());
        test.setName(name: "Dep1");
        assertEquals(expected: "Dep1", actual: test.getName());
    }

}
