import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 속성
    private List<Integer> results = new ArrayList<>(); // 내부에서만 값 수정가능

    // 생성자(따로 생성하지 않았으니 기본 생성자가 자동으로 살행됨)

    // 기능
    public int add(int a, int b) {
        int result = a + b;
        results.add(result);
        return a + b;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        results.add(result);
        return a - b;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        results.add(result);
        return a * b;
    }

    public int divide(int a, int b) {
        int result = a / b;
        results.add(result);
        return a / b;
    }

    public void printResults() {
        System.out.println(results);
    }
    public void deleteResult(int index) {
        System.out.println("삭제 전: " + results);
        results.remove(index-1); // index는 1부터 시작하므로
        System.out.println("삭제 후: "+ results);
    }

    public int printResultSize() {
        return results.size();
    }

    // Getter
    public List<Integer> getResults() {
        return results;
    }

    // Setter
    public void setResults(List<Integer> results) {
        this.results = results;
    }

}
