public class string_01 {
    public static void main(String[] args) throws Exception {
        String s = "I like java";
        System.out.println(s);

        // 문자열의 길이 - .length()
        System.out.println(s.length());

        // 대소문자 변경 - toupper/tolower
        System.out.println(s.toLowerCase(null));
        System.out.println(s.toUpperCase(null));

        // 포함 관계 확인 
        System.out.println(s.contains("java")); // T/F 반환
        System.out.println(s.indexOf("like", 0)); // 처음 일치하는 위치 반환
        System.out.println(s.lastIndexOf("a", 0)); // 마지막으로 일치하는 위치 반환
        System.out.println(s.startsWith("I like", 0)); // 입력받은 구문으로 시작하는 지 확인 후 TF반환
        System.out.println(s.endsWith("java")); // 입력받은 구문으로 끝나는 지 확인 후 TF반환
    }
}
