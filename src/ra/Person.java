package ra;

public class Person {
    private  String name = "Hùng";
    private  boolean sex = true;
    private  int age = 18;

    public Person() {
    }
    public Person(String name, boolean sex){
        this.name= name;
        this.sex = sex;
    }

    public Person(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : "+ name + " | Sex : "+(sex?"Nam":"Nữ") + " | Age : "+ age;
    }

    public String work(){
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getNamePerson(Student student){
        return student.getName();
    }
    public String getNamePerson(Teacher teacher){
        return teacher.getName();
    }
}
