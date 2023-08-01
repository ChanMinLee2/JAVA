public class variables_type.java
{
    public static void main(String args[])
    {
        boolean sign = true; // 논리형
        int number = 2003; // 정수형
        long tel = 2147483647; // int의 범위는 식별자 필요 없음
        tel = 2147483648L; // 변수 tel에 최종으로 저장되는 값
        float radius = 3.14F;
        double radius_2 = 3.14159265; // 기본 실수형
        String name = "이찬민"; // 참조형

        System.out.println("boolean:"+sign);
        System.out.println("int:"+number);
        System.out.println("long:"+tel);
        System.out.println("float:"+radius);
        System.out.println("duble:"+radius_2);
        System.out.println("String:"+name);

    }
}