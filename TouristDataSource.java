import java.util.List;

abstract class TouristDataSource {
   String sourceName;
    TouristDataSource(String sn) {
        this.sourceName=sn;
    }
   abstract List<String> fetchData() throws DataSourceAccessException;
}
    class DataSourceAccessException extends Exception{
    DataSourceAccessException(String message){
        super(message);
    }
     }