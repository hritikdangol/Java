import java.util.List;

class TourismReportGenerator{
    void generateOverallReport(List<TouristDataSource> dataSources, DataProcessor processor){
        System.out.println("Generating overall tourism report..");
        for(TouristDataSource source: dataSources){
            try {
                source.fetchData();
            }
            catch(DataSourceAccessException e){
                System.out.println("Could not fetch data from " + source.sourceName + ": " + e.getMessage() + ". Skipping this source.");
                if(e.getCause()!=null){
                    System.out.println("Reason: " + e.getCause().getMessage());
                }
            }
             continue;
        }
        if
       
    }
}