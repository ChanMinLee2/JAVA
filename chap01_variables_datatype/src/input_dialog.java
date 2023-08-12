import javax.swing.*;

public class input_dialog {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;
        String temp = "";
        int count = 0;

        do{
            count++;
            temp = JOptionPane.showInputDialog("1~100 사이의 숫자를 입력하세요. ", " 끝내려면 -1을 입력하세요.");

            // -1입력이나 취소버튼 입력시 종료
            if(temp == null || temp.equals("-1")) 
                break;

            System.out.println("입력값 : "+temp);

            // 사용자 입력을 문자열로 받기 때문에 int형으로 변환
            input = Integer.parseInt((temp)); 
        }
        while(temp != null);
    }
}
