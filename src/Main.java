import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성

        while (true) { // break로 빠져 나오기 전까지 반복되서 실행됨.
            int num1 = 0;

            int num2 = 0;

            while (num1 <= 0) { // num의 초기값이 -1이므로 실행됨
                System.out.print("숫자를 입력해주세요: ");
                num1 = scanner.nextInt();
                if (num1 <= 0) {
                    System.out.println("0보다 큰 숫자를 입력해주세요.");
                }
            } // 0보다 큰 수가 입력이 되면 while문을 빠져나옴.(while 조건이 만족하지 않으므로)

            char sym = ' ';
            while (true) { // break로 빠져 나오기 전까지 while문이 반복됨.
                System.out.print("기호를 입력하세요(+, -, *, /): ");
                sym = scanner.next().charAt(0);
                if (sym == '+' || sym == '-' || sym == '*' || sym == '/') {
                    System.out.println("입력된 기호: " + sym);
                } else {
                    System.out.println("잘못된 기호 입니다. 다시 입력해주세요.");
                }
                break; // 올바른 기호가 입력되면 while문을 종료
            }

            while (num2 <= 0) {
                System.out.print("숫자를 입력해주세요: ");
                num2 = scanner.nextInt();
                if (num2 <= 0) {
                    System.out.println("0보다 큰 숫자를 입력해주세요.");
                }
            } // 0보다 큰 수가 입력이 되면 while문을 빠져나옴.

            int res = 0;

            switch (sym) {
                case '+':
                    res = num1 + num2;
                    break;
                case '-':
                    res = num1 - num2;
                    break;
                case '*':
                    res = num1 * num2;
                    break;
                case '/':
                    res = num1 / num2;
                    break;
                default:
                    System.out.println("잘못된 기호입니다.");
                    continue; // 잘못된 기호이면 올바른 기호를 입력받기 위해 반복문을 다시 실행.
            }

            System.out.println("결과: " + res);

            // 계산기 종료 확인
            System.out.println("계산기 종료를 원하시면 'exit'을 입력해주세요, 계속하려면 아무 키나 입력하세요.");
            scanner.nextLine(); // 개행 문자 처리
            String esc = scanner.nextLine();
            if (esc.equalsIgnoreCase("exit")) { // 대소문자 구분하지 exit 입력만해도 종료
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
        scanner.close(); // 스캐너 닫기
    }
}
