import java.util.Scanner;

class RockPaperScissors {
    static Scanner sc = new Scanner(System.in);
    static final int ROCK     = 1;
    static final int PAPER    = 2;
    static final int SCISSORS = 3;
    static int player = 0; //what did the player throw
    static int comp   = 0; //what did the computer throw
    static int wins = 0, losses = 0, ties = 0;
    public static void main (String[] args) {
        String play = "y";
        
        System.out.println("GLHF");
        System.out.println("****************");
        while (play.equals ("y")){
            playerThrow();
            computerThrow();
            whoWins();
            
            System.out.print("Play again? [Y,N] ");
            play = sc.next();
        }
        System.out.println("****************");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Ties: " + ties);
    }
    public static void playerThrow (){
        System.out.print("What do you throw? [1] Rock, [2] Paper, [3] Scissors? ");
        player = sc.nextInt();
        
        if (player == ROCK){
            System.out.print("You threw ROCK! ");
        } else if (player == PAPER){
            System.out.print("You threw PAPER! ");
        } else if (player == SCISSORS){
            System.out.print("You threw SCISSORS! ");
        }
        
    }
    public static void computerThrow (){
        int i = 0; //computer choice
        
        i = (int) (Math.random() * 3) +1;
        if (i == 1){
            comp = ROCK;
            System.out.println("I threw ROCK!");
        } else if (i == 2){
            comp = PAPER;
            System.out.println("I threw PAPER!");
        } else if (i == 3){
            comp = SCISSORS;
            System.out.println("I threw SCISSORS!");
        }
    }
    public static void whoWins (){
        if (player == comp){
            System.out.println("Hey! Stop copying me! Let's go again...");
            System.out.println("");
            ties++;
        } else if (player == ROCK && comp == SCISSORS || player == PAPER && comp == ROCK || player == SCISSORS && comp == PAPER){
            System.out.println("Oh rats! You beat me! Let's go again...");
            System.out.println("");
            wins++;
        } else {
            System.out.println("Haha! I'm victorius! Let's go again...");
            System.out.println("");
            losses++;
        }
    }
}