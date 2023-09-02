public class array_02_arrayloop {
    public static void main(String[] args) {
        // 배열 순회
        String[] coffees = { "아메리카노", "카페모카", "라떼", "카푸치노"};

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요.");
    }
}
