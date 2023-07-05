package Edunova08;

public class Pas extends Sisavac{

private String pasmina;




public Pas() {
	super();
}

public String getPasmina() {
	return pasmina;
}

public void setPasmina(String pasmina) {
	this.pasmina = pasmina;
}

public Pas(String vrsta, String staniste, String pasmina) {
	super(vrsta, staniste);
	this.pasmina = pasmina;
}

public Pas(String vrsta, String staniste) {
	super(vrsta, staniste);
}


}
