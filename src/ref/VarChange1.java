package ref;

public class VarChange1 {
    public static void main(String[] args) {
        // 초기값 설정
        int a = 10;
        int b = a;  // a의 값(10)을 b에 복사 - 값 복사가 일어남

        System.out.println("a = " + a);  // a = 10
        System.out.println("b = " + b);  // b = 10

        // a 변경 - b에는 영향 없음
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);  // a = 20
        System.out.println("b = " + b);  // b = 10 (변경되지 않음)

        // b 변경 - a에는 영향 없음
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a);  // a = 20 (변경되지 않음)
        System.out.println("b = " + b);  // b = 30
    }
}
