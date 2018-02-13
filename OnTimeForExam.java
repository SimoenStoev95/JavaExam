import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int hours1 = Integer.parseInt(scanner.nextLine());
        int minutes1 = Integer.parseInt(scanner.nextLine());
        int exam = hours*60 + minutes;
        int student = hours1*60 + minutes1;
        if(exam >= student){
            int temp = exam - student;
            if(temp == 0){
                System.out.println("On time");
            }
            else if(temp >= 1 && temp <= 30){
                System.out.println("On time");
                System.out.printf("%d minutes before the start%n", temp);
            }
            else{
                System.out.println("Early");
                int helpHours = temp / 60;
                int helpMinutes = temp % 60;
                if(helpHours == 0){
                    System.out.printf("%d minutes before the start%n", helpMinutes);
                }
                else{
                    if(helpMinutes < 10) {
                        System.out.printf("%d:0%d hours before the start%n", helpHours, helpMinutes);
                    }
                    else{
                        System.out.printf("%d:%d hours before the start%n", helpHours, helpMinutes);
                    }
                }
            }
        }
        else{
            System.out.println("Late");
            int temp = student - exam;
            if(temp >= 0 && temp <= 59) {
                System.out.printf("%d minutes after the start%n", temp);

            }
            else{
                int hoursHelp = temp / 60;
                int minutesHelp = temp % 60;
                if(minutesHelp < 10){
                    System.out.printf("%d:0%d hours after the start%n", hoursHelp, minutesHelp);
                }
                else{
                    System.out.printf("%d:%d hours after the start%n", hoursHelp, minutesHelp);
                }
            }
        }
    }
}
