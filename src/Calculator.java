import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

    private List<Number> results = new ArrayList<>(); // 결과는 Number 타입으로 받기

    public <T extends Number> T calculate(Operator operator, T a, T b) {
        T result = operator.apply(a, b); // Enum의 apply 메서드 호출
        results.add(result); // 결과 저장
        return result;
    }

    public void printResults() {
        System.out.println("결과들: " + results);
    }

    public void deleteResult(int index) {
        System.out.println("삭제 전: " + results);
        if (index > 0 && index <= results.size()) {
            results.remove(index - 1); // index는 0부터 시작
            System.out.println("삭제 후: " + results);
        } else {
            System.out.println("잘못된 인덱스입니다.");
        }
    }

    public int printResultSize() {
        return results.size();
    }

    public List<Number> getResults() {
        return results;
    }

    public void setResults(List<Number> results) {
        this.results = results;
    }

    public void printResultsGraterThan(Number x){
        List<Number> filteredResults = results.stream()
                .filter(result -> result.doubleValue() > x.doubleValue()) // 둘 다 더블형으로 형변환 후 대소 비교
                .collect(Collectors.toList());

        System.out.println(filteredResults);
    }
}