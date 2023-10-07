class Day{
    String day;
    public void dayInfo(){
        switch (day)
        {
            case "Sunday" : System.out.println("Today is Sunday Man");
            break;
            case "Monday" : System.out.println("Today is Monday Man");
            break;
            case "Tuesday" : System.out.println("Today is Tuesday Man");
            break;
            case "Wednesday" : System.out.println("Today is Wednesday Man");
            break;
            case "Thursday" : System.out.println("Today is Thursday Man");
            break;
            case "Friday" : System.out.println("Today is Friday Man");
            break;
            case "Saturday" : System.out.println("Today is Saturday Man");
            break;
            default: System.out.println("Its no a day");
        }
    }
}
public class demo_six {
    public static void main(String[] args){
        Day dayOne=new Day();
        Day dayTwo=new Day();
        dayOne.day="Saturday";
        dayOne.dayInfo();
        dayTwo.day="Kawsar";
        dayTwo.dayInfo();

    }

}
