package array;

public class array {
    public static void main(String[] args)
    {
        // 45�� ������ ���尡�� �迭
        int[] ball = new int[45];

        // �迭 �� ��ҿ� 1~45�� �� ����
        for(int i=0; i < ball.length; i++)
            ball[i] = i + 1;

        int temp = 0; // ���� ����
        int j = 0;

        // �迭�� ���� �� ���̵��� ū �ݺ�Ƚ�� ����
        // ù ��ҿ� ���� ��ҿ� ����� �� �����ϱ� 
        for(int i=0; i<100; i++)
        {
            j = (int)(Math.random() * 45); // �迭 ������ ������ ��
            temp = ball[0];
            ball[0] = ball[j];
            ball[j] = temp;
        }

        //�迭 �տ������� 6�� ���
        for(int i=0; i<6; i++)
        {
            System.out.print(ball[i]+" ");
        }
    }
}
