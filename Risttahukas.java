public class Risttahukas{

	double a, b, c;
	public Risttahukas(double pikkus, double laius, double korgus){
	
		a = pikkus;
		b = laius;
		c = korgus;
		
	}
	
	public double pohjaPindala(){
	
		return a*b;
		
	}
	
	public double Ruumala(){

		return a*b*c;
	
	}
	
	public String toString(){
	
		return "Risttahuka("+a+", "+b+", "+c+
			")pohjapindala: "+pohjaPindala()+
			" ja ruumala: "+Ruumala();
	
	}
	

}