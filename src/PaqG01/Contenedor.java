package PaqG01;

public class Contenedor {

    //informacion asociada a un contenedor
    private int ID;
    private int peso;
    private String paisProcedencia;
    private boolean inspeccionado;
    private int prioridad;
    private String descripcionContenido;
    private String empresaEnvia;
    private String empresaRecibe;

    //atributos que hacen falta
    private int columna;

    //creamos un hub
    private Contenedor[][] hub;

    //constructores
    public Contenedor(int ID){
        if(ID < 0) ID = -ID; //si el id pasado es negativo se pone positivo
        this.ID = ID;
        this.prioridad = 3;
    }
    public Contenedor(int ID,int peso,String paisProcedencia,int prioridad,String descripcionContenido,String empresaEnvia,String empresaRecibe){
        this.ID = ID;
        this.peso = peso;
        this.paisProcedencia = paisProcedencia;
        this.prioridad = prioridad;
        this.descripcionContenido = descripcionContenido;
        this.empresaEnvia = empresaEnvia;
        this.empresaRecibe = empresaRecibe;
    }

    //setters y getters
    public void setID(int ID){
        this.ID = ID;
    }
    public int getID(){
        return this.ID;
    }
    public void setPeso(int peso){
        if(this.peso > 0) this.peso = peso;
    }
    public int getPeso(){
        return this.peso;
    }
    public void setPaisProcedencia(String paisProcedencia){
        this.paisProcedencia = paisProcedencia;
    }
    public String getPaisProcedencia(){
        return this.paisProcedencia;
    }
    public void setInspeccionado(boolean inspeccionado){
        this.inspeccionado = inspeccionado;
    }
    public boolean isInspeccionado(){ //getter de un boolean
        return this.inspeccionado;
    }
    public void setPrioridad(int prioridad){
        if(this.prioridad >= 1 && this.prioridad <=3) this.prioridad = prioridad;
    }
    public int getPrioridad(){
        return this.prioridad;
    }
    public void setDescripcionContenido(String descripcionContenido){
        this.descripcionContenido = descripcionContenido;
    }
    public String getDescripcionContenido(){
        return this.descripcionContenido;
    }
    public void setEmpresaEnvia(String empresaEnvia){
        this.empresaEnvia = empresaEnvia;
    }
    public String getEmpresaEnvia(){
        return this.empresaEnvia;
    }
    public void setEmpresaRecibe(String empresaRecibe) {
        this.empresaRecibe = empresaRecibe;
    }
    public String getEmpresaRecibe() {
        return empresaRecibe;
    }


}
