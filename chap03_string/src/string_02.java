public class string_02 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace("and",",")); // and를 ,로 변환해서 출력
        System.out.println(s.substring(7)); //인덱스 기준 7부터 시작 (이전 내용 삭제)
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // Java로 시작하는 위치부터 .로 끝나는 위치까지

        // 공백 제거
        s = "          I love Java.           ";
        System.out.println(s.trim());

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + "," + s2); // Java,Python
        System.out.println(s1.concat(",").concat(s2)); // Java,Python


    }
}
