package com.company;

public class Bil {



        // instansvariabler til disse egenskaber, fx

        // stelnummer,
        // antal døre,
        // softwareversion,
        // GPS koordinater,
        // hastighed
        // m.fl. Være opmærksom på at vælge de rigtige variabeltyper. Lav getters og setters til disse egenskaber.

        String biltype = "Tesla";
        String model = "Model X";
        String stelnummer = "02930923";
        int doors = 4;
        String softwareversion = "0.0.1";
        double cord_x = 55.22458; //(55.22458, 11.757075)
        double cord_y = 11.757075;
        double hastighed = 20.0; // km/t

  /*  public Bil(String tesla, String model_x, String s, int i, String s1, double v, double v1, int i1) {
    }*/

    public String toString() {
        return String.format("%s\n%s\n%s\n%1d\n%s\n%02.5f\n%02.5f\n%.2f",
                this.biltype, this.model, this.stelnummer, this.doors, this.softwareversion, this.cord_x, this.cord_y, this.hastighed);
    }

    //GETTERS
    public String getBiltype() {
        return biltype;
    }
    public String getModel() {
        return model;
    }
    public String getStelnummer() {
        return stelnummer;
    }
    public int getDoors() {
        return doors;
    }
    public String getSoftwareversion() {
        return softwareversion;
    }
    public double getCord_x() {
        return cord_x;
    }
    public double getCord_y() {
        return cord_y;
    }
    public double getHastighed() {
        return hastighed;
    }
//SETTERS
    public void setBiltype(String biltype) {
        this.biltype = biltype;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setStelnummer(String stelnummer) {
        this.stelnummer = stelnummer;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public void setSoftwareversion(String softwareversion) {
        this.softwareversion = softwareversion;
    }
    public void setCord_x(double cord_x) {
        this.cord_x = cord_x;
    }
    public void setCord_y(double cord_y) {
        this.cord_y = cord_y;
    }
    public void setHastighed(float hastighed) {
        this.hastighed = hastighed;
    }
}
