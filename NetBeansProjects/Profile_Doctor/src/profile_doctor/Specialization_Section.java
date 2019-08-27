
package profile_doctor;

public class Specialization_Section {
    
    private String Area_of_Specialization;
    private String Start_year;

    public Specialization_Section(String Area_of_Specialization, String Start_year) {
        this.Area_of_Specialization = Area_of_Specialization;
        this.Start_year = Start_year;
    }

    
    public String getArea_of_Specialization() {
        return Area_of_Specialization;
    }

    public void setArea_of_Specialization(String Area_of_Specialization) {
        this.Area_of_Specialization = Area_of_Specialization;
    }

    public String getStart_year() {
        return Start_year;
    }

    public void setStart_year(String Start_year) {
        this.Start_year = Start_year;
    }

    @Override
    public String toString() {
        return "Specialization_Section{" + "Area_of_Specialization=" + Area_of_Specialization + ", Start_year=" + Start_year + '}';
    }
    
    
    
}
