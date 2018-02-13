import java.util.Scanner;

public class SmartLili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double pricePer = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        int moneyToys = 0, moneyBirthday = 0;
        for(int i = 1; i <= age; i += 2){
            moneyToys += priceToy;
        }
        int money = 10;
        for(int i = 2; i <= age; i += 2){
            moneyBirthday += money;
            money += 10;
        }
        moneyBirthday -= (age/2);
        double finalMoney = 1.0*moneyBirthday + moneyToys;
        if(finalMoney >= pricePer){
            System.out.printf("Yes! %.2f", finalMoney - pricePer);
        }
        else{
            System.out.printf("No! %.2f", pricePer - finalMoney);
        }
    }
}
