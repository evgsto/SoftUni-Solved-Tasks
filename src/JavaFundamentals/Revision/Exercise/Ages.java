package JavaFundamentals.Revision.Exercise;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String type = "";
        if (age>=0 && age <=2){
            type = "baby";
        }else if (age>2&& age<=13){
            type = "child";
        }else if (age>13&&age<=19){
            type = "teenager";
        }else if (age>19&&age<=65){
            type = "adult";
        }else if (age>65){
            type = "elder";
        }
        System.out.println(type);
    }
}
