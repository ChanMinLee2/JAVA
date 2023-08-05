import java.util.Scanner;

public class plustest {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // 입력 방법 1. 정수로 바로 받기
        int num = scanner.nextInt();

        System.out.printf("%d", num);
        
        scanner.close();
    }
    
}
