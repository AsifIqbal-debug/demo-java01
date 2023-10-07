class age{
  int age;
  public void ageType()
  {
      if (this.age<18)
      {
          System.out.println("Your age type is Children");

      }
      else if(this.age>=18 & this.age<70)
      {
          System.out.println("Your age type is Adult");
      }
      else
      {
          System.out.println("Your age type is Old");
      }
  }
}

public class demo_five {
    public static void main(String[] args){
        age a1=new age();
        a1.age=45;
        a1.ageType();
    }
}
