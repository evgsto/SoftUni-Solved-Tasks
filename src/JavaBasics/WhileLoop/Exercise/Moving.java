package JavaBasics.WhileLoop.Exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int width = Integer.parseInt(scanner.nextLine());
    int length = Integer.parseInt(scanner.nextLine());
    int height  = Integer.parseInt(scanner.nextLine());
    int availableSpace = width*length*height ;
    int boxesSum = 0 ;
    boolean flag = true;
    String input = scanner.nextLine();
    while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            boxesSum+=boxes;
            if (boxesSum>availableSpace){
                System.out.printf("No more free space! You need %d Cubic meters more.",boxesSum-availableSpace);
                flag = false ;
                break;
            }

        input = scanner.nextLine();
    }
    if (flag){
        System.out.printf("%d Cubic meters left.",availableSpace-boxesSum);
    }


    }
}
