import java.util.Scanner;
import java.util.Random;
public class Numbergame{
    public static void main(String[]args){
        Scanner SC = new Scanner(System.in);
        Random random = new Random();
        int MinRange = 1;
        int MaxRange = 100;
        int attempts = 5;
        int score = 0;
        System.out.println("Welcome To The Number Guessing Game!");
        do{
            int randomNumber = random.nextInt(MaxRange - MinRange + 1)+MinRange;
            System.out.println("\n I Have Picked A Number Between "+ MinRange+"and"+MaxRange+".Guess it!");
            for(int attempt = 1; attempt<=attempts;attempt++){
                System.out.println("Attempt"+attempt+"-Enter your Guess :");
                int UserGuess = SC.nextInt();
                if(UserGuess == randomNumber){
                    System.out.println("Congrats! you guessed it right in"+attempt+"attempts.");
                    score+= attempts - attempt+1;
                    break;
                }else if(UserGuess<randomNumber){
                    System.out.println("Too Low,Try Again!");
                }else{
                    System.out.println("Too High,Try Again");
                }
                if(attempt==attempts){
                    System.out.println("Ohhh! You Have Completed all attempts. The Number Was:"+randomNumber);
                }
            }
            System.out.println("Do You Want To Play Again?(Yes/No):");
            String PlayAgain = SC.next();
            if(PlayAgain.equalsIgnoreCase("No")){
                break;
            }
        }while(true);
        System.out.println(" Total Score  :"+score);
        System.out.println("Thanks For Playing");
    }
}