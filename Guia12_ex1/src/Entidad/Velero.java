package entidad;

public class Velero extends Embarcacion {

    private Integer mastiles;

    public Velero() {
    }

    public Velero(Integer mastiles) {
        this.mastiles = mastiles;
    }

    public Velero(Integer mastiles, String matricula, Integer eslora, Integer anoFab) {
        super(matricula, eslora, anoFab);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "mastiles=" + mastiles +" "+ super.toString()+ '}';
    }

    
   
    
}
