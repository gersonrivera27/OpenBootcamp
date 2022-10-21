public class Polimorfismo {
    public static void main(String[] args){

        Cliente cliente = new Cliente();
        cliente.setEdad(19);
        cliente.setNombre("Gerson");
        cliente.setTelefono(78721461);
        cliente.setCredito(1200);
        System.out.println("Bienvenido " + cliente.getNombre() + " Edad:" + cliente.getEdad()+ " Telefono: "+ cliente.getTelefono()+ " Su credito es de: $"+cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Gerson");
        trabajador.setEdad(19);
        trabajador.setTelefono(83838383);
        trabajador.setSalario(1000);
        System.out.println("Trabajador " + trabajador.getNombre()+ " Edad: " + trabajador.getEdad()+ " Telefono:" + trabajador.getTelefono()+ " Su salario es de: $ " + trabajador.getSalario());

    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
     int credito; 

     public void setCredito( int credito){
        this.credito = credito;

     }
     public int getCredito(){
        return credito;
     }
}

class Trabajador extends Persona{
    int salario;

    public int getSalario(){
        return salario;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }

}

  

