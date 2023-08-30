public class array_01 {
    public static void main(String[] args) throws Exception {
        //배열 : 같은 자료형의 값 여러개를 저장하는 연속 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println(coffeeMonica + " 하나");

        // 배열 선언 첫번째 방법
        String[] coffees = new String[4];

        // 배열 선언 두번째 방법
        //String coffes[] = new String[4];
        //coffees[0] = "아메리카노"; // 0부터시작
        //coffees[1] = "카페모카"; 
        //coffees[2] = "라떼"; 
        //coffees[3] = "카푸치노"; 

        // 배열 선언 세번째 방법
        //String[] coffees = new String[] {
        //    "아메리카노", "카페모카", "라떼", "카푸치노"
        //};

        // 배열 선언 네번째 방법
       // String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노" };
    }
}
