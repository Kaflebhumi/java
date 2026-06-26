import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UniqueVisitorCounter implements DataProcessor {
    class EmptyDataException extends RuntimeException {
        public EmptyDataException(String message) {
            super(message);
        }
    }
    @Override
    public List<String> process(List<String> rawData) {
        if (rawData.isEmpty()) {
            throw new EmptyDataException("No raw data to process");
        }
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < rawData.size(); i++) {
            String data = rawData.get(i);
            String name = data.split(",")[0].replace("Visitor", "");
            map.put(name, "1");
        }
         return List.of(
            "Unique Visitors Count: " + map.size(),
            "Names: " + map.keySet()
        );
    }
    public static void main(String[] args) {

        UniqueVisitorCounter c1 = new UniqueVisitorCounter();
        List<String> data = List.of( "Visitor: Lilac, Korea", "Visitor: Lilac, Korea" );
        try {
            c1.process(List.of());
        } catch (UniqueVisitorCounter.EmptyDataException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(c1.process(data));
        } catch (UniqueVisitorCounter.EmptyDataException e) {
            System.out.println(e.getMessage());
        }
    }
}