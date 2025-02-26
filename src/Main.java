import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num1 = -1; // while문이 실행되는 조건을 충족하기 위해 임의의 숫자에 -1을 담움

            int num2 = -1; // 위와 마찬가지로 while문이 처음에 실행되게 하기 위해 조건에 맞는 -1을 할당.

            while (num1 <= 0) {
                System.out.print("숫자를 입력해주세요: ");
                num1 = scanner.nextInt();
                if (num1 <= 0) {
                    System.out.println("0보다 큰 숫자를 입력해주세요.");
                }
            } // 0보다 큰 수가 입력이 되면 while문을 빠져나옴.


            while (true) {
                System.out.print("기호를 입력하세요(+, -, *, /): ");
                char sym = scanner.next().charAt(0);
                switch (sym) {
                    case '+':
                    case '-':
                    case '*':
                    case '/': // 모든 기호가 같은 문구를 사용하므로 묶어서 사용. 코드 간략하게 작성
                        System.out.println("입력된 기호: " + sym);
                        break;
                    default:
                        System.out.println("잘못된 기호입니다.");
                        continue; // 잘못된 기호이면 다시 반복문으로 돌아감
                }
                break;
            }

            while (num2 <= 0) {
                System.out.print("숫자를 입력해주세요: ");
                num2 = scanner.nextInt();
                if (num2 <= 0) {
                    System.out.println("0보다 큰 숫자를 입력해주세요.");
                }
            } // 0보다 큰 수가 입력이 되면 while문을 빠져나옴.

            int res = num1 + num2;
            System.out.println("결과: " + res);

            System.out.println("계산기 종료를 원하시면 exit를 입력해주세요: ");
            scanner.nextLine();
            if (scanner.nextLine().equals("exit")) {
                break;
            } else {
                continue;
            }
        }
    }
}