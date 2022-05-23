package JavaBasics.ContestSoftUni;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int height = 5364;
        int daysCount = 0 ;
        boolean flag = false ;
        int newMeters = 0;
        boolean brake = false ;



        String input = scanner.nextLine();


        while(!input.equals("END")) {

            if (input.equals("Yes")){
                brake = true;

                if (daysCount>5){
                    break;
                }
                daysCount++;

                input = scanner.nextLine();
                continue;
            }else if (input.equals("No")){
                brake = false;
                daysCount++;
                input = scanner.nextLine();
            }
            newMeters = Integer.parseInt(input);

            height+=newMeters;


            if (height>=8848){
                flag = true;
                break;
            }
            if (daysCount > 5 ){
                break;
            }




            input= scanner.nextLine();
        }




        if(flag){
            System.out.printf("Goal reached for %d days!",daysCount);
        }else {
            System.out.println("Failed!");
            System.out.printf("%d",height);
        }

    }
}
