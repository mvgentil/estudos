

public class Retangulo extends Figura{
    
  private double largura;
  private double altura;

  public double getLargura(){
    return largura;
  }

  public void setLargura(double largura){
    this.largura = largura;
  }

  public double getAltura(){
    return altura;
  }

  public void setAltura(double altura){
    this.altura = altura;
  }

  @Override
  public double obterArea(){
    return altura * largura;
  }

}
