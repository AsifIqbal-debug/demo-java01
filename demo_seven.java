class StudentOne{
    private String studentName;
    private int rollNumber;
    private char section;
    private String department;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        if( rollNumber<= 1)
        {
            throw new IllegalArgumentException("Invalid Args");
        }
        this.rollNumber = rollNumber;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
//    public void printStudentOne(){
//        System.out.println("Your name is "+studentName +" Your roll number is "+rollNumber+" Your Section is "+section+" Your department is "+department);
    }


public class demo_seven {
public static void main(String[]args){
    StudentOne student1= new StudentOne();
    student1.setStudentName("Asif");
    student1.setRollNumber(10);
    student1.setSection('D');
    student1.setDepartment("Bachelor's in CSE");
    System.out.println(student1.getStudentName());
    System.out.println(student1.getRollNumber());
    System.out.println(student1.getSection());
    System.out.println(student1.getDepartment());
}
}
