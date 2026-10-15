import java.util.Random;
import java.util.Scanner;

public class RPSLS {

    enum Move {
        ROCK, PAPER, SCISSORS, LIZARD, SPOCK
    }

    static int winner(Move a, Move b) {

        if (a == b)
            return 0;

        boolean win = switch (a) {
            case ROCK -> b == SCISSORS || b == LIZARD;
            case PAPER -> b == ROCK || b == SPOCK;
            case SCISSORS -> b == PAPER || b == LIZARD;
            case LIZARD -> b == SPOCK || b == PAPER;
            case SPOCK -> b == SCISSORS || b == ROCK;
        };

        return win ? 1 : -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int you = 0;
        int computer = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nRound " + i);
            System.out.print("Enter ROCK, PAPER, SCISSORS, LIZARD or SPOCK: ");

            Move player = Move.valueOf(sc.next().toUpperCase());
            Move comp = Move.values()[random.nextInt(5)];

            System.out.println("You: " + player);
            System.out.println("Computer: " + comp);

            int result = winner(player, comp);

            if (result == 1) {
                System.out.println("You win this round!");
                you++;
            } else if (result == -1) {
                System.out.println("Computer wins this round!");
                computer++;
            } else {
                System.out.println("Tie!");
            }
        }

        System.out.println("\nFinal Score: You " + you + " - " + computer + " Computer");

        if (you > computer)
            System.out.println("You win!");
        else if (computer > you)
            System.out.println("Computer wins!");
        else
            System.out.println("Match tied!");

        sc.close();
    }
}