public class continue_01 {
    public static void main(String[] args) throws Exception {
        int max = 20; // 최대 치킨 판매 가능 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번 손님 노쇼 

        for (int i = 0; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면? 
            if(i == noShow)
            {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }

            sold++;
            if (sold == max) {
                System.out.println("오늘 재료는 모두 소진되었습니다 죄송합니다.");
                break;
            }
        }
    }
}
