public class _01_if {
    public static void main(String[] args) {
        // 조건문 elseif

        // 한라봉 에이드가 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean hallabongAde = true;
        boolean mangojuice = true;

        if(hallabongAde)
        {
            System.out.println("한라봉 에이드 +1");
        }
        else if(mangojuice)
        {
            System.out.println("망고 주스 +1");
        }
        else
        {
            System.out.println("아이스 아메리카노 +1");
        }

        System.out.println("커피 주문 완료 #1");
    }
    
}
