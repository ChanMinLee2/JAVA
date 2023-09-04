public class method_01 {
    public static void sayhello()
    {
        System.out.println("안녕하세요? 메소드입니다.");
    }

    public static void main(String[] args) throws Exception {

        // 메소드 호출
        System.out.println("메소드 호출 전");
        sayhello();
        System.out.println("메소드 호출 후");
    }
}
