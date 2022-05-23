package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Flowers = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budjet = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double price = 0;
        //Съществуват следните отстъпки:
        //•	Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
        //•	Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
        //•	Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
        //•	Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        //•	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%
        //От конзолата се четат 3 реда:
        //•	Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        //•	Брой цветя - цяло число в интервала [10…1000]
        //•	Бюджет - цяло число в интервала [50…2500]

        switch (Flowers) {
            case "Roses":
                price = 5;
                if (count <= 80) {
                    sum = count * price;
                } else {
                    sum = (count * price);
                    sum = sum - sum * 0.10;
                }
                break;
            case "Dahlias":
                price = 3.80;
                if (count <= 90) {
                    sum = count * price;
                } else {
                    sum = (count * price);
                    sum = sum - sum * 0.15;
                }
                break;
            case "Tulips":
                price = 2.80;
                if (count <= 80) {
                    sum = count * price;
                } else {
                    sum = (count * price);
                    sum = sum - sum * 0.15;
                }
                break;
            case "Narcissus":
                price = 3.00;
                if (count >= 120) {
                    sum = count * price;
                } else {
                    sum = (count * price);
                    sum = sum + sum * 0.15;
                }
                break;
            case "Gladiolus":
                price = 2.50;
                if (count >= 80) {
                    sum = count * price;
                } else {
                    sum = (count * price);
                    sum = sum + sum * 0.20;
                }
                break;

        }
        if (budjet >= sum) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, Flowers, (budjet - sum));
        }
        if (sum > budjet) {
            System.out.printf("Not enough money, you need %.2f leva more.", sum - budjet);
        }
    }
}
