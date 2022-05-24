import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 400, n2 = 540, n3 = 120, number = 9, amount = 550;
        System.out.println("The coffee machine has: ");
        System.out.println(n1 + " ml of water");
        System.out.println(n2 + " ml of milk");
        System.out.println(n3 + " ml of coffee beans");
        System.out.println(number + " disposable cups");
        System.out.println("$" + amount + " of money");
        System.out.println("Write action (buy, fill, take): ");
        String choice = sc.next();

        switch (choice) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        n1 -= 250;
                        n3 -= 16;
                        amount += 4;
                        number--;
                        checkCups(n1,n2,n3,number,amount);
                        break;
                    case 2:
                        n1 -= 350;
                        n2-=75;
                        n3 -= 20;
                        amount += 7;
                        number--;
                        checkCups(n1,n2,n3,number,amount);
                        break;
                    case 3:
                        n1 -= 200;
                        n2-=100;
                        n3 -= 12;
                        amount += 6;
                        number--;
                        checkCups(n1,n2,n3,number,amount);
                        break;
                }
                break;
            case "fill":
                System.out.println("Write how many ml of water you want to add: ");
                int w = sc.nextInt();
                System.out.println("Write how many ml of milk you want to add: ");
                int m = sc.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add: ");
                int c = sc.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add: ");
                int cups = sc.nextInt();

                n1+=w;  n2+=m; n3+=c; number+=cups;
                checkCups(n1,n2,n3,number,amount);
                break;
            case "take":
                System.out.println("I gave you $"+amount);
                amount=0;
                checkCups(n1,n2,n3,number,amount);
                break;
            default:
                System.out.println("error");
                break;
        }
    }

    public static void checkCups(int n1, int n2, int n3,int number,int amount){
        System.out.println("The coffee machine has: ");
        System.out.println(n1 + " ml of water");
        System.out.println(n2 + " ml of milk");
        System.out.println(n3 + " ml of coffee beans");
        System.out.println(number + " disposable cups");
        System.out.println("$" + amount + " of money");

    }
}
