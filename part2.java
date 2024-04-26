package contadebanco;

public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	private float deposito;
	private float saque ;
	
	
	public ContaBanco(boolean m ,float n ) {
		this.status = m;
		this.saldo = n;
	}
	
	
	public int getNumConta() {
		return this.numConta;
	}
	public void setNumConta (int n) {
		this.numConta = n ;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo (String t) {
		this.tipo = t ;
	}
	public String getDono() {
		return this.dono;
	}
	public void setDono(String d) {
		this.dono = d;
	}
	public float getSaldo(){
		return this.saldo;
	}
	public void setSaldo(float s) {
		this.saldo = s;
	}
	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean k) {
		this.status = k;
	}
	public float getsaque() {
		return this.saque;
	}
	public void setsaque(float w) {
		this.saque = w;
	}
	public float getDeposito() {
		return this.deposito;
	}
	public void setDeposito(float v) {
		this.deposito = v;
	}
	
	
	public void abrirConta() {
		setStatus(true);
	}

	public void fecharConta() {
		if(this.saldo == 0) {
			this.setStatus(false); 
		}
		else 
			System.out.println("nao eh possivel fechar a conta");
	}
	
	public void depositar() {
        if(this.status=true) {
			this.saldo = saldo + deposito;
		}
	}
	
	public void sacar() {
		if(this.status=true) {
			if(this.saldo > 0) {
			this.saldo = saldo - saque;
			}
		}
	}
	
	public void pagarMensal() {
		if(this.tipo == "cc") {
			this.saldo = saldo - 12;
	}
		if(this.tipo == "cp") {
			this.saldo = saldo - 20;
		}
 }
	
	public void impressao() {
		System.out.println("o status da conta eh = " + getStatus() );
		System.out.println("a conta eh do tipo = "+ getTipo());
		System.out.println("o nome do titular da conta eh = "+ getDono());
		System.out.println(" o saldo da conta eh = " + getSaldo());
	}
}
