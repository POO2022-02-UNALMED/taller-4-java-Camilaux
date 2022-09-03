package classroom;

public class Persona {
	
	private long cedula;
    private String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
    }
    
    Persona(){
    	this.cedula = 0;
    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = "";
        this.cedula = 1;
        totalPersonas++;
    }
    
    long getCedula() {
        return cedula;
    }
    
    void setCedula(long cedula){
    	this.cedula = cedula;
    }
    
    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
