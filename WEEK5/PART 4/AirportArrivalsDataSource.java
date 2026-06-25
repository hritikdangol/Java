import java.util.List;
class AirportArrivalsDataSource extends TouristDataSource {
    AirportArrivalsDataSource() {
        super("Tribhuvan Airport Arrivals");
    }
    @Override
List<String> fetchData() throws DataSourceAccessException {

    class ConnectionLostException extends DataSourceAccessException {
        ConnectionLostException(String message) {
            super(message);
        }
    }
    if (sourceName.contains("Tribhuvan") && Math.random() < 0.3) {
        throw new ConnectionLostException("Airport data connection lost! Maybe a pigeon sat on the antenna?");
    }
    else
    return List.of("Visitor: John Doe, USA");
}
public static void main(String[] args){
    AirportArrivalsDataSource a1= new AirportArrivalsDataSource();
    try {
        a1.fetchData();
    } catch  (DataSourceAccessException  e) {
       System.out.println(e.getMessage());
    }
}
}