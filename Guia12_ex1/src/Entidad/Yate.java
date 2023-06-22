package entidad;

public class Yate extends Barco { 

    private Integer camarote;

    public Yate() {
          
    }

    public Yate(Integer camarote) {
        this.camarote = camarote;
    }

    public Yate(Integer camarote, Integer cv) {
        super(cv);
        this.camarote = camarote;
    }

    public Yate(Integer camarote, Integer cv, String matricula, Integer eslora, Integer anoFab) {
        super(cv, matricula, eslora, anoFab);
        this.camarote = camarote;
    }

    public Integer getCamarote() {
        return camarote;
    }

    public void setCamarote(Integer camarote) {
        this.camarote = camarote;
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
        return "Yate{" + "camarote=" + camarote +" "+ super.toString()+ '}';
    }
       
    
}
