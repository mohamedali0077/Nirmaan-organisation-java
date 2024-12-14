import java.util.Scanner;

public class Bank
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        IndianBank bank = new IndianBank();

        System.out.println("Enter The pin :");
        int pin = sc.nextInt();

        boolean isTrue = true;

        while(isTrue) {
                if (bank.getPin() == pin) {

                    System.out.println("Available balance :" + bank.getBalance());

                    System.out.println("Enter your choice\n 1 for deposit\n  2 for withdraw\n 0 for Exit");
                    int decision = sc.nextInt();

                    if (decision == 1) {

                        System.out.println("Enter the amount to deposit");
                        int total = sc.nextInt();

                        bank.setBalance(bank.getBalance() + total);
                        System.out.println("Your current balance " + bank.getBalance());

                    }
                    else if(decision==0) {
                        isTrue=false;
                        System.out.println("Thanks for using indian bank");
                    }
                    else {
                        System.out.println("Enter The pin :");
                        int pin1 = sc.nextInt();
                        sc.nextLine();
                        if(pin1==pin) {

                            System.out.println("Enter the amount for withdrawal ");
                            int withdraw = sc.nextInt();
                            if (withdraw <= bank.getBalance()) {
                                double total = bank.getBalance() - withdraw;
                                bank.setBalance(total);
                                System.out.println(bank.getBalance());

                            } else {
                                System.out.println("invalid amount");
                            }
                        }
                        else {
                            System.out.println("Enter correct pin");
                        }
                    }

                } else {
                    System.out.println("wrong pin, Please check the correct pin");
                }
            }

        }

    }

