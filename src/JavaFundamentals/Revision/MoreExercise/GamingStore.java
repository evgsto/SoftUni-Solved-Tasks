package JavaFundamentals.Revision.MoreExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double gamePrice = 0;
        double totalSum = 0;
        boolean noGame = false ;
        boolean noMoney = false ;
        while (!input.equals("Game Time")) {
            noGame=false;


            switch (input) {
                case "OutFall 4":
                    gamePrice = 39.99;
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;
                default: {
                    System.out.println("Not Found");
                    noGame = true;
                    break;
                }
            }

            if (budget<gamePrice){
                System.out.println("Too Expensive");
            }else  {
                if (!noGame) {
                    System.out.println("Bought " + input);
                }
                budget -= gamePrice;
                totalSum+=gamePrice;
                gamePrice = 0;
            }
            if (budget<=0){
                System.out.println("Out of money!");
                noMoney = true;
                break;
            }

            input = scanner.nextLine();
        }
        if(!noMoney) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSum, budget);
        }
        }
    }

