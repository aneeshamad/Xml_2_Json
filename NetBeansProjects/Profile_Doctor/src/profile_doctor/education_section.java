
package profile_doctor;

public class education_section {
    
    private  String Degree ;
    private  String Mojor ;
    private  String school;
    private String year;

    public education_section(String school, String year, String Mojor, String Degree) {
        this.Degree = Degree;
        this.Mojor = Mojor;
        this.school = school;
        this.year = year;
    }
    
    public String getDegree() {
        return Degree;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    public String getMojor() {
        return Mojor;
    }

    public void setMojor(String Mojor) {
        this.Mojor = Mojor;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "education_section{" + "Degree=" + Degree + ", Mojor=" + Mojor + ", school=" + school + ", year=" + year + '}';
    }
    
    
    
    
    
}
