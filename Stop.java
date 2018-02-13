import java.util.Scanner;

public class Stop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        String line = repeatStr(".", n+1) + repeatStr("_", 2*n + 1)
                + repeatStr(".", n+1);
        System.out.println(line);
        for(int i = n; i > 0; i--){
            String line1 = repeatStr(".", i) + "//" + repeatStr("_", 2*n - 1 + counter)
                    + "\\" + "\\" + repeatStr(".", i);
            counter += 2;
            System.out.println(line1);
        }
        String line3 = "//" + repeatStr("_", 2*n-3) + "STOP!" + repeatStr("_", 2*n-3)
                + "\\" + "\\";
        System.out.println(line3);
        String line4 = "\\" + "\\" + repeatStr("_", 4*n-1) + "//";
        System.out.println(line4);
        for(int i = 1; i <= n-1; i++){
            String line7 = repeatStr(".", i) + "\\" + "\\" + repeatStr("_", 4*n + 3 - 2*i - 4)
                    + "//" + repeatStr(".", i);
            System.out.println(line7);
        }
    }

    public static String repeatStr(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }

}
