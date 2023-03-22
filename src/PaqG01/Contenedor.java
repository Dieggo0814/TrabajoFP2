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


}
