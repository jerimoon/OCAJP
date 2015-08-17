package ocajp;

public class SubClasse extends SuperClasse {
	SubClasse(){
		System.out.println("Construtor Sub");
	}
	SubClasse(String a){
		this();
		
	}
	public void metodoBestinha(){
		System.out.println("Método SubClasse METODO ");
	}

}
