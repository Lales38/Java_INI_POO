package entidad;

public class Barco extends Embarcacion{

    protected Integer cv;

    public Barco() {
    }

    public Barco(Integer cv) {
        this.cv = cv;
    }

    public Barco(Integer cv, String matricula, Integer eslora, Integer anoFab) {
        super(matricula, eslora, anoFab);
        this.cv = cv;
    }

    public Integer getCv() {
        return cv;
    }

    public void setCv(Integer cv) {
        this.cv = cv;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(Integer anoFab) {
        this.anoFab = anoFab;
    }

    @Override
    public String toString() {
        return "Embarcacion{" + "cv=" + cv + " "+ super.toString() + '}';
    }
    
    
    
    
    
}
