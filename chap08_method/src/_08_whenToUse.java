public class _08_whenToUse {
    public static int getPower(int number){
        return getPower(number, 2);
    }

    public static int getPower(int number, int exponent)
    {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // �޼ҵ尡 �ʿ��� ����

        // 2�� 2���� ���ϱ�
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result);

        // �޼ҵ� ���
        System.out.println(getPower(2, 2));

        // 3�� 3���� ���ϱ�

        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result);

        // �޼ҵ� ���
        System.out.println(getPower(3, 3));

        // 4�� 2���� ���ϱ�
        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result); 

        // �޼ҵ� ���
        System.out.println(getPower(4, 2));
    }
}
