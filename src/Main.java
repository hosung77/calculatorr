import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
        Calculator cal = new Calculator();

        while (true) { // break로 빠져 나오기 전까지 반복되서 실행됨.
            int num1 = 0;
            int num2 = 0;
            int deleteNum = 0;

            // 첫 번째 숫자 입력
            while (num1 <= 0) {
                System.out.print("숫자를 입력해주세요: ");
                try {
                    num1 = sc.nextInt(); // 숫자 입력 받기
                    if (num1 <= 0) {
                        System.out.print("0보다 큰 숫자를 입력해주세요.");
                    }
                } catch (Exception e) { // 숫자가 아닌 입력이 들어오면 예외 처리
                    System.out.println("잘못된 입력입니다. 숫자만 입력해주세요.");
                    sc.nextLine(); // 잘못된 입력 후 버퍼에 남은 잘못된 값을 제거하기 위해 nextLine() 호출
                }
            }

            char sym = ' ';
            Operator operator = null;
            // 기호 입력
            while (true) {
                System.out.print("기호를 입력하세요(+, -, *, /): ");
                sym = sc.next().charAt(0);
                try {
                    operator = Operator.fromSymbol(sym);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            // 두 번째 숫자 입력
            while (num2 <= 0) {
                System.out.print("숫자를 입력해주세요: ");
                try {
                    num2 = sc.nextInt(); // 숫자 입력 받기
                    if (num2 <= 0) {
                        System.out.print("0보다 큰 숫자를 입력해주세요.");
                    }
                } catch (Exception e) { // 숫자가 아닌 입력이 들어오면 예외 처리
                    System.out.println("잘못된 입력입니다. 숫자만 입력해주세요.");
                    sc.nextLine(); // 잘못된 입력 후 버퍼에 남은 잘못된 값을 제거하기 위해 nextLine() 호출
                }
            }

            int res = cal.calculate(operator, num1, num2);
            System.out.println("결과: " + res);

            sc.nextLine(); // 개행 문자 처리(nextInt를 사용하고 나면 /n(개행문자가 남음)

            // 메뉴 출력
            while (true) {
                System.out.println("계산기 작업을 선택하세요:");
                System.out.println("1. 계산기 결과들 보기");
                System.out.println("2. 계산기 기록 삭제하기");
                System.out.println("3. 계산기 종료하기");
                System.out.println("4. 계산기 계속하기");
                System.out.print("원하는 작업의 번호를 입력해주세요: ");
                String choice = sc.nextLine(); // 사용자 입력 받기

                switch (choice) {
                    case "1":
                        // 결과 보기
                        cal.printResults();
                        continue;
                    case "2":
                        // 기록 삭제하기
                        int resSize = cal.printResultSize();
                        System.out.print("삭제할 기록 번호를 입력하세요(0을 입력하면 취소): ");
                        try {
                            deleteNum = sc.nextInt();
                            sc.nextLine(); // 버퍼 비우기
                            if (deleteNum == 0) {
                                System.out.println("삭제를 취소합니다.");
                            } else if (deleteNum > 0 && deleteNum <= resSize) {
                                cal.deleteResult(deleteNum);
                                System.out.println("삭제가 완료되었습니다.");
                            } else {
                                System.out.println("범위에 맞지 않는 숫자입니다. 다시 입력해주세요.");
                            }
                        } catch (Exception e) {
                            System.out.println("잘못된 입력입니다. 숫자만 입력해주세요.");
                            sc.nextLine(); // 잘못된 입력 후 버퍼에 남은 잘못된 값을 제거하기 위해 nextLine() 호출
                        }
                        continue;
                    case "3":
                        // 계산기 종료
                        System.out.println("계산기를 종료합니다.");
                        sc.close();
                        return;  // 종료
                    case "4":
                        // 계속하기
                        System.out.println("계산기를 계속합니다.");
                        break;
                    default:
                        System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                        break;
                }
                break; // 올바른 선택이 들어오면 반복문 종료
            }
        }
    }
}