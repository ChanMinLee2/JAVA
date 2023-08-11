package array;

public class array {
    public static void main(String[] args)
    {
        // 45개 정수값 저장가능 배열
        int[] ball = new int[45];

        // 배열 각 요소에 1~45의 값 저장
        for(int i=0; i < ball.length; i++)
            ball[i] = i + 1;

        int temp = 0; // 스왑 변수
        int j = 0;

        // 배열의 값이 잘 섞이도록 큰 반복횟수 지정
        // 첫 요소와 임의 요소에 저장된 값 스왑하기 
        for(int i=0; i<100; i++)
        {
            j = (int)(Math.random() * 45); // 배열 범위의 임의의 값
            temp = ball[0];
            ball[0] = ball[j];
            ball[j] = temp;
        }

        //배열 앞에서부터 6개 출력
        for(int i=0; i<6; i++)
        {
            System.out.print(ball[i]+" ");
        }
    }
}
