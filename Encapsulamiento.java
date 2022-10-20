public class Encapsulamiento {
    public static void main (String []args){
        Persona persona = new Persona();
        persona.setNombre("Gerson");
        persona.setEdad(19);
        persona.setTelefono(78723641);
        System.out.println("Mi nombre es: "+ persona.getNombre() + " Mi edad es :" + persona.getEdad()+" y mi numero de telefono es :" + persona.getTelefono());


    }
}
class Persona{
    private String nombre;
    private int edad;
    private int telefono;

//setters
    public void setNombre(String name){
        this.nombre = name;
    }
    public void setEdad(int age){
        this.edad = age;
    }
    public void setTelefono(int phone){
        this.telefono = phone;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public int getTelefono(){
        return this.telefono;
    }



}