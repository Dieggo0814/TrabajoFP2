package PaqG01;

public class Hub {

    //hub de contenedores
    private Contenedor[][] hub; //un hub tiene 10 filas y 12 columnas

    //constructor
    public Hub(){
        this.hub = new Contenedor[10][12];
    }

    //setter y getter
    public void setHub(Contenedor[][] hub) {
        if(this.hub != null) this.hub = hub;
    }
    public Contenedor[][] getHub(){
        return this.hub;
    }

}
