package classroom;

public class Asignatura {
	String nombre;
    String n = nombre;
    int codigoInterno;
    int codigoExterno;
    Tipo tipo;

    Asignatura() {
        this.nombre = "Sin nombre";
    }

    Asignatura(short codigoInterno,Tipo tipo) {
        this("Sin nombre", codigoInterno, 0,tipo);
    }

    Asignatura(int codigoExterno,Tipo tipo) {
        this("Sin nombre", 0, codigoExterno,tipo);
    }

    Asignatura(String nombre, Tipo tipo) {
        this(nombre,0,0,tipo);
    }

    Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    void cambiarDatos(short codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    void cambiarDatos(int codigoExterno) {
    	int coNuevo=codigoExterno;
        this.codigoExterno = coNuevo;
    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public int getCodigoInterno(int codigoInterno) {
        return this.codigoInterno;
    }
    
    public void setCodigoInterno(short codigoInterno) {
    	int nuevoCo = codigoInterno;
    	this.codigoInterno = nuevoCo;
    }
    
    public int getCodigoInterno(short codigoInterno) {
        return this.codigoInterno;
    }
}
