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

    public Controlador objControlador(IuVista objIuVista) {
        this.objIuVista = new IuVista();
        this.objPersona = new Persona();
        this.objGestionarPersona = new GestionarPersona();
        return null;
    }

    public void Persona(IuVista obIuVista) {
        try {
            String Nombre;
            String Apellido;
            int Edad;
          //  objGestionarPersona.agregarVectorPersona(objIuVista.setName(Nombre), objIuVista.setL);

        } catch (Exception e) {
            System.out.println("Ingrese de nuevo los datos"+e);

        }
    }

    public void mostrarDatos() {
        try {
           // System.out.println("Datos Almacenados"+objGestionarPersona.agregarVectorPersona(objIuVista);

        } catch (Exception e) {
            System.out.println("Ingrese bien los datos"+e);
        }

    }

}
