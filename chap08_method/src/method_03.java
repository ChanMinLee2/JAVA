public class method_03 {
    // 호텔 전화번호 
    public static String getPhoneNumber()
    {
        String PhoneNumber = " 02-1234-5678";
        return PhoneNumber;
    }

    public static String getAddress()
    {
        return "서울시 어딘가";
    }

    public static String getActivities()
    {
        return "볼링장 탁구장, 노래방";
    }

    public static void main(String[] args) {
        // 반환값 
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + contactNumber);

        String address = getAddress();
        System.out.println("호텔 주소 : " + address );

        String act = getActivities();
        System.out.println("호텔 여가활동장 : " + act);
    }
}
