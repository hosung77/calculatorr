import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요: ");
        int num1 = scanner.nextInt();

        if (num1 >= 1) {
            System.out.println("입력된 숫자: " + num1);
        } else {
            System.out.println("0보다 큰 숫자를 입력해주세요.");
        }

        System.out.print("기호를 입력하세요: ");
        char sym = scanner.next().charAt(0);

        System.out.println("숫자를 입력해주세요: ");
        int num2 = scanner.nextInt();

        if (num2 >= 1) {
            System.out.println("입력된 숫자: " + num2);
        } else {
            System.out.println("0보다 큰 숫자를 입력해주세요.");
        }

    }
}