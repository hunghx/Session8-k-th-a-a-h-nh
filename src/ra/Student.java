package ra;


//student  gọi là subtype, person gọi là supertype
public class Student extends Person {
//    @Override
//    public String work(){
//        return "Đi học";
//    }
    private String maSv;

    public Student() {
    }

    public Student(String name, boolean sex, int age) {
        super(name, sex, age);
    }
    public Student(String name, boolean sex,String maSv){
        super(name, sex);
        this.maSv = maSv;

    }

    @Override
    public String work() {
        return "Đi học";
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    @Override
    public final String toString() {
        return super.toString() + " | Mã SV : " +maSv;
    }
}
