import java.util.stream.*;
public class Main {
    private static final String ID = "PipelineStage_c24751";
    public static void main(String[] args) { System.out.println("[" + ID + "] Running stream pipeline..."); var result = IntStream.rangeClosed(1, 20).map(x -> x * x).filter(x -> x % 2 == 0).boxed().collect(Collectors.toList()); System.out.println("[" + ID + "] Results: " + result); System.out.println("[" + ID + "] Count: " + result.size()); }
}
