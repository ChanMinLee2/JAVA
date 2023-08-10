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

        
    }
}
