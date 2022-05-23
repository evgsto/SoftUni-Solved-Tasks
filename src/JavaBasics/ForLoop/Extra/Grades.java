package JavaBasics.ForLoop.Extra;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        double two = 0;
        double three = 0;
        double four = 0;
        double five = 0;
        double avarage = 0;
        for (int i = 0; i < students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade>=2.00 && grade<3){
                two++;
            }else if(grade >=3 && grade<4){
                three++;
            }else if (grade>=4 && grade <5){
                four++;
            }else if (grade>=5 && grade<=6 ){
                five++;
            }
            avarage +=grade;
        }

        System.out.printf("Top students: %.2f%%%n",five/students*100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",four/students*100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",three/students*100);
        System.out.printf("Fail: %.2f%%%n",two/students*100);
        System.out.printf("Average: %.2f",avarage  /students);

    }
}
