class StudentOne{
    String studentName;
    int rollNumber;
    char section;
    String department;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        if( rollNumber<= 1)
        {
            throw new IllegalArgumentException("Invalid Args");
        }
        rollNumber = rollNumber;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        section = section;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        department = department;
    }
    public void printStudentOne(){
        System.out.println("Your name is "+studentName +" Your roll number is "+rollNumber+" Your Section is "+section+" Your department is "+department);
    }

}
public class demo_seven {
public static void main(String[]args){
    StudentOne student1= new StudentOne();
    student1.studentName="Mahbuba";
    student1.rollNumber= -1;
    student1.section='C';
    student1.department="CSE";
    student1.setRollNumber(-1);
    student1.printStudentOne();
}
}
