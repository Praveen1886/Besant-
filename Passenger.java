
package week5;

import java.time.LocalDate;

enum Berth{
    UPPER,
    MIDDLE,
    LOWER
}
enum Source{
  EGMORE,  
}
enum Destination{
  COIMBATORE,
  MADURAI;
}

public class Passenger {

    private int id;

    private String name;
    
    private Source prefsource;
    
    private Destination prefdestination;

    private Berth prefBerth;

    private Berth allocatedBerth;

    private LocalDate bkdDate = LocalDate.now();

    public Passenger(int id,String name,Source prefsource,Destination prefdestination,Berth prefBerth){
        this.id = id;
        this.name=name;
        this.prefsource=prefsource;
        this.prefdestination=prefdestination;
        this.prefBerth=prefBerth;
    }
    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prefsource=" + prefsource +
                ", prefdestination=" + prefdestination +
                ", prefBerth=" + prefBerth +
                ", allocatedBerth=" + allocatedBerth +
                ", bkdDate=" + bkdDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Source getPrefsource() {
        return prefsource;
    }

    public void setPrefsource(Source prefsource) {
        this.prefsource = prefsource;
    }
    
    public Destination getPrefdestination() {
        return prefdestination;
    }

    public void setPrefdestination(Destination prefdestination) {
        this.prefdestination = prefdestination;
    }

    public Berth getPrefBerth() {
        return prefBerth;
    }

    public void setPrefBerth(Berth prefBerth) {
        this.prefBerth = prefBerth;
    }

    public Berth getAllocatedBerth() {
        return allocatedBerth;
    }

    public void setAllocatedBerth(Berth allocatedBerth) {
        this.allocatedBerth = allocatedBerth;
    }

    public LocalDate getBkdDate() {
        return bkdDate;
    }

    public void setBkdDate(LocalDate bkdDate) {
        this.bkdDate = bkdDate;
    }
}