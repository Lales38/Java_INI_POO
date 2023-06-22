package entidad;

public class Embarcacion {

    protected String matricula;

    protected Integer eslora;

    protected Integer anoFab;

    public Embarcacion() {
    }

    public Embarcacion(String matricula, Integer eslora, Integer anoFab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFab = anoFab;
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
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anoFab=" + anoFab + '}';
    }
    
    
    
    
    
}
