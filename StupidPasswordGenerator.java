import java.util.Scanner;

public class StupidPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(char c = 'a'; c < ('a' + L); c++){
                    for(char d = 'a'; d < ('a' + L); d++){
                        for(int k = 1; k <= n; k++){
                            if(k > i && k > j) {
                                System.out.print(i + "" + j + "" + c + "" + d + "" + k + " ");
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
    }
}
