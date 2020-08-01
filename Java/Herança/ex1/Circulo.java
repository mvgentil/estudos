

public class Circulo extends Figura{

  private double raio;

  public double getRaio(){
    return raio;
  }

  public void setRaio(double raio){
    this.raio = raio;
  }

  @Override
  public double obterArea(){
    return Math.PI * raio * raio;
  }

}
