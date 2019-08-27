/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profile_doctor;


import java.util.ArrayList;

interface dentiseplan {
    public void setprofile_Doctor(Profil_Doctor profile_doctor );
    public void seteducation_section(ArrayList<education_section> education_section );
    public void setAddress(ArrayList<Adress> address);
    public void setSpecialization_section(ArrayList<Specialization_Section> Specialization_section);

}

public class Dentise implements dentiseplan {
    private Profil_Doctor profile_doctor;
    private ArrayList<education_section> education_section;
    private ArrayList<Adress> address;
    private ArrayList<Specialization_Section> Specialization_section;


    @Override
    public void setprofile_Doctor(Profil_Doctor profile_doctor) {
        this.profile_doctor=profile_doctor;
    }

    @Override
    public void seteducation_section(ArrayList<education_section> Education) {
    this.education_section=education_section;
    }

    @Override
    public void setAddress(ArrayList<Adress> address) {
     this.address=address;
    }

    @Override
    public void setSpecialization_section(ArrayList<Specialization_Section> Specialization_section) {
        this.Specialization_section=Specialization_section;
    }

    public Profil_Doctor getProfile_doctor() {
        return profile_doctor;
    }

    public ArrayList<education_section> getEducation_section() {
        return education_section;
    }

    public ArrayList<Adress> getAddress() {
        return address;
    }

    public ArrayList<Specialization_Section> getSpecialization_section() {
        return Specialization_section;
    }

    @Override
    public String toString() {
        return "Dentise{" + "profile_doctor=" + profile_doctor .toString()+ ", education_section=" + education_section .toString()+ ", address=" + address.toString() + ", Specialization_section=" + Specialization_section .toString()+ '}';
    }
    
    
}




