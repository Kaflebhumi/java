import java.util.List;
class HotelRegistrationsDataSource extends TouristDataSource{
    HotelRegistrationsDataSource(){
        super("Kathmandu Hotels Registrations");
    }
    @Override
    List<String> fetchData() throws DataSourceAccessException{
        class AuthenticationFailedException extends DataSourceAccessException {
        AuthenticationFailedException(String message) {
            super(message);
        }
    }
    if(sourceName.contains("Hotels") && Math.random() <0.2){
        throw new AuthenticationFailedException("Hotel API authentication failed! Did someone forget the password again?");
    }
    else 
        return List.of("Guest: Namuxa , NP Hotel: Max");
  }
  public static void main(String[] args){
    HotelRegistrationsDataSource h1= new HotelRegistrationsDataSource();
    try {
        h1.fetchData();
    } catch (DataSourceAccessException e){
        System.out.println(e.getMessage());
    }
  }
}