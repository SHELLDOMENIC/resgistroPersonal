package espoch.edu.ec.registropersonal.Modelo;

import espoch.edu.ec.registropersonal.vista.IuVista;

/**
 *
 * @author and_j
 */
public class GestionarPersona {

    Persona[] vectPersona = new Persona[5];

    public void agregarPersona(String Nombre, String Apellido, int Edad) {
        if (Edad > 0) {
            Persona.add(new Persona(Nombre, Apellido, Edad));
        } else {
            System.out.println("La edad debe ser un numero positivo");
        }
    }

    public Persona obtenerLista(Persona objagregarPersona) {
        return objagregarPersona;
    }

}
