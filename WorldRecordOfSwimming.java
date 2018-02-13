import java.util.Scanner;

public class WorldRecordOfSwimming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());
        double time = meters * secondsPerMeter;
        double backTime = Math.floor(meters / 15) * 12.5;
        double finalTime = time + backTime;
        if (finalTime < worldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalTime);
        }
        else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", finalTime - worldRecord);
        }
    }
}
