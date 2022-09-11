package teste_curso_games;

public class Player {
	
	public int vida = 100;
	public String nome = "Fabio";
	
	public void perderVida() {
		vida-= 1;
	}
	
	public void ganharVida() {
		vida+= 1;
	}

}
