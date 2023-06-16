import java.util.HashSet;
import java.util.Set;
public class Department {
    private int id;
    private static int nextId=1;
    private String name;
    private Set<Student> students=null;

    public Department(String name) {
        this.name = name;
        this.students=new HashSet<Student>();

    }

    public String getName() {
        return "Department:" +name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
    public void addToDepartment(Student student) {
        this.students.add(e:student);
    }

    public Student getFromDepartment(int id) {
        for(Student b:this.students) {
            if(id==b.getID()) {return b;}
        }
        return null;

    }
}

