import ra.Animals;
import ra.Person;
import ra.Student;
import ra.Teacher;

public class Main {
    public static void main(String[] args) {
      // Tạo đối tượng từ lớp Student ké thừa lớp Person
        Person per = new Person("Nam",true,18);
        System.out.println(per);


        Student stu1 = new Student("Hùng",true,23); // cách 1
        System.out.println(" Tên học sinh "+ stu1.getName());
        System.out.println(" Tuổi "+ stu1.getAge());
        System.out.println(" Giới tính "+(stu1.isSex()?"Nam":"Nữ"));
        System.out.println(" work: "+stu1.work());
        stu1.setMaSv("SV001");
        System.out.println(" Mã sinh viên : " +stu1.getMaSv());



        // đa hình
        Person per2 = new Student();
        Student stu2 = new Student();// cách 2
        Student stu3 = new Student("Khánh",false,"SV004"); //cách 3

        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);

        // Tất cả class  đều kê thừa lớp Object
        Object o = new Person();
        Object o1 = new Student();

        Person p1 = (Person)o;
        Person p2 = (Person)o1;


        Animals animals = new Animals();
//        Person p3 = (Person) animals;
//        Teacher t = (Teacher) o1;
//        System.out.println(t);


        // íntanceof
        System.out.println(per instanceof Person);
    }
}