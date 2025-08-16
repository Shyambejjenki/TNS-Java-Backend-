public class student{
    int roll_no;
    String name;
    String branch;
    static String collegename ="IIT Hyderabad";

    void display()
    {
        System.out.println("this is Details of Students:" +"name:"+ name + "roll_no:"+ roll_no + "branch:"+ branch + collegename);
    }
    

//main method

    public static void main(String[] args)
        {
        student ob= new student();
        ob.name="shyam";
        ob.roll_no=6679;
        ob.branch="aiml";
        ob.display();

        student object=new student();
        o.name="harsha";
        o.roll_no=6680;
        o.branch="ds";
        o.display();
        }

    
}
