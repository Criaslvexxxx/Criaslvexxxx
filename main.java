package contadebanco;

public class Main {

	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco(false , 0.0f);
		
		c1.abrirConta();
		c1.setDono("joao");
		c1.setTipo("cc");
		c1.setSaldo(5000.0f);
		
		if(c1.tipo == "cc") {
			
			c1.saldo = saldo + 50;
			
		}
		if(c1.tipo == "cp") {
			
			c1.saldo = saldo + 150;
		}
		
		c1.pagarMensal();
		c1.setsaque(2500.0f);
		c1.sacar();
		c1.impressao();
		
	}
}
