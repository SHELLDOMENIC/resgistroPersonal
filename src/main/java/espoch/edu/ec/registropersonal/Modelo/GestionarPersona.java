
package espoch.edu.ec.registropersonal.Modelo;

import espoch.edu.ec.registropersonal.vista.IuVista;

/**
 *
 * @author and_j
 */
public class GestionarPersona {
    Persona[] vectPersona = new Persona[5];
    
    
     
    public void agregarVectorPersona(IuVista objIuVista){
        String resultPersona;
        for(int i=0 ;i<5; i++){
         if(vectPersona == null){
             vectPersona[i] = new Persona() ;
             resultPersona = String.valueOf (objIuVista.getEdad());
            // vectPersona[i].getNombre(objIuVista.setName(objIuVista));
             //vectPersona[i].getApellido(objIuVista.setApellido);
             //vectPersona[i].getEdad(objIuVista.setEdad);
             break;
             
         }
        
        }
     
    }
    
}
