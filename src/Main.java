public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad (42);
        persona.setNombre ("Patricio");
        persona.setTelefono (416499752);

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());

    }
}
class Persona{
    private Integer edad;
    private String nombre;
    private Integer telefono;

    public Integer getEdad(){
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public Integer getTelefono() {
        return telefono;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
}