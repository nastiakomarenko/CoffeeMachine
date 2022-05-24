package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 400, n2 = 540, n3 = 120, number = 9, amount = 550, i = 1;
        /*System.out.println("The coffee machine has: ");
        System.out.println(n1 + " ml of water");
        System.out.println(n2 + " ml of milk");
        System.out.println(n3 + " ml of coffee beans");
        System.out.println(number + " disposable cups");
        System.out.println("$" + amount + " of money");*/
        while (i > 0) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String choice = sc.next();
            System.out.println();

            switch (choice) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    String ch = sc.next();
                    switch (ch) {
                        case "1":
                            n1 -= 250;
                            n3 -= 16;
                            amount += 4;
                            number--;
                            error(n1, n2, n3, number, amount);
                            //checkCups(n1, n2, n3, number, amount);
                            if(n1<0||n2<0||n3<0||number<0||amount<0){
                                n1 += 250;
                                n3 += 16;
                                amount -= 4;
                                number++;
                            }
                            break;
                        case "2":
                            n1 -= 350;
                            n2 -= 75;
                            n3 -= 20;
                            amount += 7;
                            number--;
                            error(n1, n2, n3, number, amount);
                            //checkCups(n1, n2, n3, number, amount);
                            if(n1<0||n2<0||n3<0||number<0||amount<0){
                                n1 += 350;
                                n2 += 75;
                                n3 += 20;
                                amount -= 7;
                                number++;
                            }
                            break;
                        case "3":
                            n1 -= 200;
                            n2 -= 100;
                            n3 -= 12;
                            amount += 6;
                            number--;
                            error(n1, n2, n3, number, amount);
                            //checkCups(n1, n2, n3, number, amount);
                            if(n1<0||n2<0||n3<0||number<0||amount<0){
                                n1 += 200;
                                n2 += 100;
                                n3 += 12;
                                amount -= 6;
                                number++;
                            }
                            break;
                        default: break;
                    }
                    System.out.println();
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

                    n1 += w;
                    n2 += m;
                    n3 += c;
                    number += cups;
                    //checkCups(n1, n2, n3, number, amount);
                    System.out.println();
                    break;
                case "take":
                    System.out.println("I gave you $" + amount);
                    amount = 0;
                    //checkCups(n1, n2, n3, number, amount);
                    System.out.println();
                    break;
                case "remaining":
                    checkCups(n1, n2, n3, number, amount);
                    System.out.println();
                    break;
                case "exit": i--;
                break;
                default:
                    System.out.println("error");
                    break;
            }
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
    public static  void error(int n1, int n2, int n3,int number,int amount){
        if(n1<0){
            System.out.println("Sorry, not enough water!");
        }
        if(n2<0){
            System.out.println("Sorry, not enough milk!");
        }
        if(n3<0){
            System.out.println("Sorry, not enough coffee beans!");
        }
        if(number<0){
            System.out.println("Sorry, not enough disposable cups!");
        }
        if(amount<0){
            System.out.println("Sorry, not enough money!");
        }
        if(n1>0&&n2>0&&n3>0&&number>0&&amount>0){
            System.out.println("I have enough resources, making you a coffee!");
        }

    }
}
