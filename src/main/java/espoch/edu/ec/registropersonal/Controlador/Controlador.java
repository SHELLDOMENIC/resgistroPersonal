package espoch.edu.ec.registropersonal.Controlador;

import espoch.edu.ec.registropersonal.Modelo.GestionarPersona;
import espoch.edu.ec.registropersonal.Modelo.Persona;
import espoch.edu.ec.registropersonal.vista.IuVista;

/**
 *
 * @author and_j
 */
public class Controlador {

    private IuVista objIuVista;
    private Persona objPersona;
    private GestionarPersona objGestionarPersona;
    private Controlador objControlador;
    Persona[] vectPersona = new Persona[5];

    public Controlador objControlador(IuVista objIuVista, GestionarPersona objGestionarPersona) {
        this.objIuVista = objIuVista;
        this.objPersona = new Persona();
        this.objGestionarPersona = new GestionarPersona();
        return null;
    }

    public void setagregarPersona() {

        String Nombre = objIuVista.getNombre();
        String Apellido = objIuVista.getApellido();
        int Edad;
        String resultEdad;
        Edad = Integer.parseInt(objIuVista.getEdad());
        for (int i = 0; i < 5; i++) {
            if (vectPersona == null) {
                vectPersona[i] = new Persona();
                resultEdad = String.valueOf(objIuVista.getEdad());
                vectPersona[i].getApellido();
                vectPersona[i].getNombre();
                vectPersona[i].getEdad();
                break;
            }
        } 
    }
     public void mostrarPersona() {
        objIuVista.setagregarPersona();
         System.out.println("El personal Dministrado es el siguiente");
         objControlador.setagregarPersona();
    }
}
 
