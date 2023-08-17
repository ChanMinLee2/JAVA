public class string_03 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 같은 지 여부에 따라 T/F반환
        System.out.println(s2.equalsIgnoreCase(s1)); // 대소문자 구분 없이 일치여부 파악

        s1 = "1234"; // 벽에 붙은 메모지 정보
        s2 = "1234";

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        
    }
}
