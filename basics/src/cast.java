public class cast {
    public static void main(String[] args) {
        // 형변환 타입캐스팅 
        // 정수형에서 실수형으로 
        // 실수형에서 정수형으로 

        int score = 90;
        System.out.println(score); // 93
        System.out.println((float)score); // 93.0
        System.out.println((double)score); // 93.0

        float score_f = 93.3F;
        double score_d = 98.8;

        //소수점 이하 다 버림. 
        System.out.println((int) score_f); // 93
        System.out.println((int) score_d); // 98

        // 정수 + 실수 연산
        int add = 93 + (int)98.8;
        System.out.println(add); // 191 

        score_d = (double)93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        // 1. 더 큰 데이터 -> 작은 데이터 
        double donvertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double

        // 2. 더 작은 데이터 -> 큰 데이터
        int convertedScoreInt = (int) score_d; // 191.8 -> 191

        // 숫자를 문자열로 (String/Integer 클래스 이용)
        String s1 = String.valueOf(93); // 방법 1
        s1 = Integer.toString(93); // 방법 2
        System.out.println(s1); //93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); //98.8

        // 문자열을 숫자로 
        int i = Integer.parseInt("93");
        System.out.println(i); // 93

        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8

        // 오류 예제
        // int error = Integer.parseInt("자바");
    }
}
