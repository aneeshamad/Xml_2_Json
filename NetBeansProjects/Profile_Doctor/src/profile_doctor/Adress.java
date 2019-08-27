
package profile_doctor;

interface address{

public void setCountry(String country) ;

public void setState(String State) ; 
       
public void setCity(String city) ;
    

public void setPostalCode(String postalCode); 


}
public class Adress implements address{
    private  String  country;
    private  String State;
    private  String city;
    private  String street;
    private  String postalCode;

    public Adress(String country, String State, String city, String street, String postalCode) {
        this.country = country;
        this.State = State;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    public String getStare() {
        return State;
    }

    @Override
    public void setState(String State) {
        this.State = State;
    }

    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Adress{" + "country=" + country + ", Stare=" + State + ", city=" + city + ", street=" + street + ", postalCode=" + postalCode + '}';
    }
    
    
}
