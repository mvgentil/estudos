

public class Main {
  
  public static void main(String args[]){
 
    Circulo circ = new Circulo();
    Retangulo ret = new Retangulo();

    circ.setRaio(5);
    ret.setAltura(10);
    ret.setLargura(10);
       
    System.out.println("Area do Circulo = " + circ.obterArea());
    System.out.println("Area do Retangulo = " + ret.obterArea());

}



}