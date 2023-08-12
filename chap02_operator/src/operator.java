public class operator {
    public static void main(String[] args) throws Exception {
        int number_1 = 0;
        int number_2 = 1;
        int buf = number_1 + number_2;
        System.out.println(buf);
        // 대입 연산 간소화
        buf -= (number_1 + number_2);
        System.out.println(buf);

        // 증감 연산 -> ++ or -- 
        buf++;
        System.out.println(buf);
        buf--;
        System.out.println(buf);

        // 대입 연산 -> =
        int a = 1 + 3;

        // 비교 연산
        System.out.println(5>3);

        // 논리 연산  
        boolean 김치찌개 = true;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 && 계란말이 && 제육볶음);
        System.out.println(김치찌개 || 계란말이 || 제육볶음);


    }
}
