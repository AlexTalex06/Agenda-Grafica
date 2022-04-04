import java.util.*;
public class Agenda
 {
    static int ag = 0;
    static ArrayList<Persona> ArrPersona = new ArrayList<Persona>();
    private Persona objPersona;
    
    public Agenda() {
    }
    
    public void agregar(String nombre, String telefono, String correo, String cumple) {
        objPersona = new Persona();
        objPersona.setNombre(nombre);
        objPersona.setTelefono(telefono);
        objPersona.setCorreo(correo);
        objPersona.setFechaCumple(cumple);
        
        ArrPersona.add(objPersona);
        ag++;
    }
    
    public int getPersona(String nombre) {
        for(int x=0; x<ag; x++) {
            if (ArrPersona.get(x).getNombre().equals(nombre)) {
                return x;
            }
        }
        return -2;
    }
    
    public Persona consultar (int ag) {
        return ArrPersona.get(ag);
    }
    
    public void modificar(int ag, Persona p) {
        ArrPersona.set(ag, p);
    }
    
    public void eliminar(int ag) {
        ArrPersona.remove(ag);
        this.ag--;
    }
    
    public ArrayList Datos() {
        return ArrPersona;
    }
}
