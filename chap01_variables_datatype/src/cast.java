public class cast {
    public static void main(String[] args) {
        // ����ȯ Ÿ��ĳ���� 
        // ���������� �Ǽ������� 
        // �Ǽ������� ���������� 

        int score = 90;
        System.out.println(score); // 93
        System.out.println((float)score); // 93.0
        System.out.println((double)score); // 93.0

        float score_f = 93.3F;
        double score_d = 98.8;

        //�Ҽ��� ���� �� ����. 
        System.out.println((int) score_f); // 93
        System.out.println((int) score_d); // 98

        // ���� + �Ǽ� ����
        int add = 93 + (int)98.8;
        System.out.println(add); // 191 

        score_d = (double)93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d);

        // ������ ����ȯ�� ������ ����ֱ�
        // 1. �� ū ������ -> ���� ������ 
        double donvertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double

        // 2. �� ���� ������ -> ū ������
        int convertedScoreInt = (int) score_d; // 191.8 -> 191

        // ���ڸ� ���ڿ��� (String/Integer Ŭ���� �̿�)
        String s1 = String.valueOf(93); // ��� 1
        s1 = Integer.toString(93); // ��� 2
        System.out.println(s1); //93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); //98.8

        // ���ڿ��� ���ڷ� 
        int i = Integer.parseInt("93");
        System.out.println(i); // 93

        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8

        // ���� ����
        // int error = Integer.parseInt("�ڹ�");
    }
}
