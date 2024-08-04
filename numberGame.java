import java.util.Random;
import java.util.Scanner;

class Game{
    int computer;
    public Game(){
        Random rand=new Random();
        computer =rand.nextInt( 100);
        System.out.println("Guess the number from 1 to 100: ");
    }
    public int computer(){return computer;}
}
public class numberGame{
    static int takeUserInput(){
        int user;
        System.out.print("Enter Number: ");
        Scanner sc=new Scanner(System.in);
        user=sc.nextInt();
        return user;

    }
    static void isCorrectNumber(int i, int j){
        if(i==j){
            System.out.println("Correct ̥̥Guess");
        }
        else if(i>j){
            System.out.println("Your number is bigger than computer number ");
        }
        else{
            System.out.println("Your number is smaller than computer number ");
        }
    }

    public static void main(String args[]){
        int user=0,computer=0,itterating=0;
        Game g=new Game();
        System.out.println("WELCOME TO the NUMBER GUESSING GAME ");
        do{
            user=takeUserInput();
            computer =g.computer();


            isCorrectNumber(user,computer);
            itterating++;
        }
        while(user!=computer);
            System.out.println("You guess the number in "+itterating+" ITTERATIONS");
            System.out.println("EXIT");
        
    }
}