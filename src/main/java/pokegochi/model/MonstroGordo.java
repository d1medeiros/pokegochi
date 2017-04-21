package pokegochi.model;

public class MonstroGordo implements Pokegochi{

	private int vida = 135;
	private int dano = 20;
	private int velocidadeAtaque = 4000;
	private int defesa = 2;
	
	
	public int getVida() {
		return this.vida;
	}
	public int getDano() {
		return this.dano;
	}
	public int getVelocidadeAtaque() {
		return this.velocidadeAtaque;
	}
	public int getDefesa() {
		return this.defesa;
	}
	public void receberDano(int dano) {
		this.vida -= dano;
	}
	public void setDano(int i) {
		this.dano += i;
	}
	

}
