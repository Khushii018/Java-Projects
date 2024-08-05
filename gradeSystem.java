import java.util.Scanner;
public class gradeSystem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float english,mathematics,science;
        System.out.println("English");
        english=sc.nextFloat();
        System.out.println("Mathemtics");
        mathematics=sc.nextFloat();
        System.out.println("Science");
        science=sc.nextFloat();
        float average=(english+mathematics+science)/3;
        System.out.println("Average:"+average);

        if(average>90){
            System.out.println("Grade: A");
        }
        else if(average<90&& average>80){
            System.out.println("Grade : B");
        }
        else if(average>70&&average<80){
            System.out.println("Grade:C");
        }
        else if(average>60&&average<70){
            System.out.println("Grade:D");
        }
        else{
            System.out.println("Fail");
        }

    }
}