public class array_02_arrayloop {
    public static void main(String[] args) {
        // �迭 ��ȸ
        String[] coffees = { "�Ƹ޸�ī��", "ī���ī", "��", "īǪġ��"};

        // �迭�� ���̸� �̿��� ��ȸ
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " �ϳ�");
        }
        System.out.println("�ּ���.");
    }
}
