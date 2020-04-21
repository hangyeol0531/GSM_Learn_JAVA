public class GSM08 {
    //메서드=머리(원형=프로토타입)+몸(바디=구현부)
    public static void main(String[] args) {
        // 메서드 => 동작(행위정보)
        // 메서드를 호출(call->부른다)
        int v= total(1, 10); // parameter passing(인수 전달기법) -> Call by Value
        System.out.println(v);
        System.out.println(twoHap(1, 100));
    }
    // 매개변수로 2개의 정수를 받아서 총합을 구하여 리턴하는 메서드를 정의 하시오.
    public static int total(int a, int b) {
        int value = a + b;
        return value;
    }
    
    // 매개변수로 두 개의 정수를 받아서 두 수 사이의 총합을 구하여 리턴하는 메서드를 정의하시오
    public static int twoHap(int a, int b) {
        int result = 0;
        for(int i=a; i<=b; i++) {
            result +=i;
        }
        return result;
    }
}