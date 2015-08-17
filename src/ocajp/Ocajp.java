package ocajp;

public class Ocajp implements IOcajp{
	{
		System.out.println("inicio");
	}
	private String teste = "xuxu";
	enum Shiribruias{BLA(),BLUM, FOFA}
	public void testeParametro(String entrada){
		entrada = "Saída";
	}
	public static void main(String[] args) {
		Ocajp ocajp =new Ocajp();
		ocajp.testeParametro(ocajp.teste);
		ocajp.methodWithException();
		System.out.println(ocajp.teste);
		System.out.println(">"+Shiribruias.BLA);
		ocajp.vararg(1);
		
		SuperClasse superClasse = new SubClasse();
		ocajp.overLoad(superClasse);
		
		
		
	}
	static{
		System.out.println("static");
		
		
	}
	{
		System.out.println("final");
	}
	@Override
	public void methodWithException() {
		// TODO Auto-generated method stub
		
	}
	public void vararg(int... args){
		
		System.out.println(args);
		
	}
	public void overLoad(SuperClasse superClasse){
		System.out.println("Super");
		superClasse.metodoBestinha();
	}
	public void overLoad(SubClasse subClasse){
		System.out.println("Sub");
		subClasse.metodoBestinha();
	}
	

}
