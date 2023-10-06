class Student{
    String studentName;
    int studentAge;

    public void printInfo() {
        System.out.println("Student Age is " + this.studentAge);
        System.out.println("Student Name is " + this.studentName);
    }

    public void method(){
        System.out.println("Hello Java");
    }
}
class Pen{
    String penColor;
    String penType;

    public void printInfo(){
        System.out.println("This Pen Colour is "+ penColor);
        System.out.println("This Pen type is "+ penType);
    }
}

class demo_one {
    public static void main(String[] args) {
        Student studentOne = new Student();
        studentOne.studentAge = 20;
        studentOne.studentName = "Kabir";
        studentOne.printInfo();

        Pen penOne=new Pen();
        penOne.penType="Pen";
        penOne.penColor="Blue";
        penOne.printInfo();
        studentOne.method();

    }
}



