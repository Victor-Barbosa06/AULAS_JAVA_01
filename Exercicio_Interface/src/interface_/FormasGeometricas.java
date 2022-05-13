package interface_;

public abstract class FormasGeometricas implements Calculo {
	public double Quadrilatero(double l1,double l2,double l3,double l4) {
		return l1+l2+l3+l4;
	}
	public double Quadrado(double lado) {
		return lado*4;
	}
	public double Retangulo(double base, double altura) {
		return base*2 + altura*2;
	}
	public double Circulo(double raio) {
		return 2*3.14*raio;
	}
	public double AreaQuadrado(double lado) {
		return lado*lado;
	}
	public double AreaRetangulo(double base, double altura) {
		return base * altura;
	}
	public double AreaCirculo(double raio) {
		return Math.pow(3.14*raio , 2);
	}
}
