/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profile_doctor;

import java.util.ArrayList;

interface Buldier {
    public void buildprofile_Doctor();
    public void buildEducation();
    public void buildAddress();
    public Dentise getDentise();
}
 class SpecialistDentist implements Buldier {
    private Dentise dentise;
    private Profil_Doctor profile_doctor;
    private ArrayList<education_section> education_section;
    private ArrayList<Adress> address;
    private ArrayList<Specialization_Section> Specialization_section;
    public SpecialistDentist(Profil_Doctor profile_doctor, ArrayList<education_section> education_section, ArrayList<Adress> addresse, ArrayList<Specialization_Section> Specialization_section) {
        this.dentise = new Dentise();
        this.profile_doctor= profile_doctor;
        this.education_section=education_section;
        this.address=addresse;
        this.Specialization_section=Specialization_section;
    }

    @Override
    public void buildprofile_Doctor() {
     dentise.setprofile_Doctor(profile_doctor);
    }

    @Override
    public void buildEducation() {
dentise.seteducation_section(education_section);
    }

    @Override
    public void buildAddress() {
dentise.setAddress(address);
    }
    public void buildSpecializationArea() {
        dentise.setSpecialization_section(Specialization_section);
    }
    @Override
    public Dentise getDentise() {
        return dentise;
    }
}
class  GeneralDentist implements Buldier{
    private Dentise dentise;
    private Profil_Doctor profile_doctor;
    private ArrayList<education_section> education_section;
    private ArrayList<Adress> address;
    
    
    public GeneralDentist(Profil_Doctor profile_doctor, ArrayList<education_section> education_section, ArrayList<Adress> addresse) {
        this.dentise = new Dentise();
        this.profile_doctor= profile_doctor;
        this.education_section=education_section;
        this.address=addresse;
    }

    @Override
    public void buildprofile_Doctor() {
        dentise.setprofile_Doctor(profile_doctor);
    }

    @Override
    public void buildEducation() {
dentise.seteducation_section(education_section);
    }

    @Override
    public void buildAddress() {
dentise.setAddress(address);
    }

    @Override
    public Dentise getDentise() {
        return this.dentise;
    }

    @Override
    public String toString() {
        return "GeneralDentist{" + "dentise=" + dentise.toString() + '}';
    }
    
}

