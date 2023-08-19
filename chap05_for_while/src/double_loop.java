public class double_loop {
    public static void main(String[] args) {
        
        // 별로 사각형 만들기 

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
        

        // 별로 왼쪽 삼각형 만들기

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

        // 별로 오른쪽 삼각형 만들기

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.println(" ");
            }

            for (int k = 0; k <= 1; k++) {
                System.out.println("*");
            }
            System.out.println();
        }



    }
}
