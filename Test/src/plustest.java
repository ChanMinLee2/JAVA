import java.util.Scanner;

public class plustest {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // 입력 방법 1. 정수로 바로 받기
        int num = scanner.nextInt();

        System.out.printf("input number : %d\n", num);
        
        // 2. 문자열로 받고 정수 전환
        String strNumber = "42";
        System.out.printf("number 2 : 42\n");
        try {
            // Convert the string to an integer using parseInt()
            int intValue = Integer.parseInt(strNumber);
            System.out.println("Converted integer value: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Unable to convert the string to an integer.");
        }
        scanner.close();
    }
    
}
