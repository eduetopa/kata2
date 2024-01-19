package kata;
import java.util.List;
import java.util.Map;
public class Main {

    public static void main(String[] args){
        List<Person> people =
                TsvFilePersonLoader.with("hw_2500.tsv").load();
        Map<String, Integer> histogram = new WeightHistogramCalculator(people).calculate();
        for(String key: histogram.keySet().stream().sorted().toList()){
            System.out.println(key + " " + histogram.get(key));
        }
    }
}

