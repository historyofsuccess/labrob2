package university;
public class University {
    public static void main(String[] args) {
        Department my=new Department(name: "Dep1");
        Student student1=new Student(name: "Yuri", surname: "Caesar");
        my.addToDepatment(student: student1);
        Student student2=new Student(name: "Mikhail", surname: "Semechkin")
        my.addToDepartment(student: student2);

        for(Student b:my.getStudents()){
            System.out.println(x:b.toString());
        }
    }
}
