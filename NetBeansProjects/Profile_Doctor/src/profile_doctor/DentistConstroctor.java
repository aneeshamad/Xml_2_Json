/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profile_doctor;

/**
 *
 * @author aneeshamad
 */
public class DentistConstroctor {
    
    
    private Buldier buldier;

    public DentistConstroctor(Buldier buldier) {
        this.buldier = buldier;
    }

    public Dentise getDentise(){
        return this.buldier.getDentise();
    }
    public void constructDentist() {
        this.buldier.buildprofile_Doctor();
        this.buldier.buildEducation();
        this.buldier.buildAddress();
        if(this.buldier instanceof SpecialistDentist)
            ((SpecialistDentist) this.buldier).buildSpecializationArea();
    }

    @Override
    public String toString() {
        return "DentistConstroctor{" + "buldier=" + buldier.toString() + '}';
    }
    
}
