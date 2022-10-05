public class main {
    public static void main(String []args) {
        Coche primer = new Coche();
        primer.aumentarPuertas();
        System.out.println(primer.puertas);
    
     
     var resultado = suma(10,10,10);
     System.out.println(resultado);



    }
    
    public static int suma(int a, int b,int c){
        return a+b+c;
    }
}


class Coche{
    public int puertas = 4;

    public void aumentarPuertas(){
        this.puertas++;
    }
}