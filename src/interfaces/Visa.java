package interfaces;

public class Visa implements IBandeiraCartao {

private int setor;
	
	
	public int getSetor() {
		return setor;
	}

	public void setSetor(int setor) {
		this.setor = setor;
	}
	
	@Override
	public String verificarBandeira(int setor) {
		if (setor == 4)
			return ">> BANDEIRA CONFERE VISA";
		else
			return "* * * BANDEIRA INVÁLIDA PARA VISA * * *";
	}

}
