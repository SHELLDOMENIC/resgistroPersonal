package espoch.edu.ec.registropersonal.Modelo;

/**
 *
 * @author and_j
 */
public class Persona {

    static void add(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private String Nombre;
    private String Apellido;
    private int Edad;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido, int Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        if (Edad > 0) {
            this.Edad = Edad;
        } else {
            System.out.println("Ingrese una edad positiva");
        }
    }

    @Override
    public String toString() {
        return this.Nombre + "" + this.Apellido + "" + this.Edad + "";
    }
}
