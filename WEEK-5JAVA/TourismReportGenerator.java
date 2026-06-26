import java.util.ArrayList;
import java.util.List;

class TourismReportGenerator {
    void generateOverallReport(List<TouristDataSource> dataSources, DataProcessor processor) {
        System.out.println("Generating overall tourism report");
        for (TouristDataSource dataSource : dataSources) {
            List<String> data;
            try {
                data = dataSource.fetchData();
            }
            catch (DataSourceAccessException e) {
                System.out.println("Could not fetch data from " + dataSource.sourceName + ": "+ e.getMessage()+ ". Skipping this source.");
                if (e.getCause() != null) {System.out.println("Reason: "+ e.getCause().getMessage());
                }
                continue;
            }
            try {
                List<String> processedData =processor.process(data);
                System.out.println(processedData);
            }
            catch (DataProcessingException e) {
                System.out.println("Error processing data from "+ dataSource.sourceName + ": " + e.getMessage() + ". Skipping this data.");
            }
            finally {
                System.out.println("Data handling from " + dataSource.sourceName + " completed.");
            }
        }
    }
    public static void main(String[] args) {

        ArrayList<TouristDataSource> sdata = new ArrayList<>();
        sdata.add(new AirportArrivalsDataSource());
        sdata.add(new HotelRegistrationsDataSource());
        DataProcessor processor =new UniqueVisitorCounter();
        TourismReportGenerator g1 =new TourismReportGenerator();
        g1.generateOverallReport(sdata, processor);
    }
}