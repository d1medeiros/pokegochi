package pokegochi.model;

public class MonstroMagro implements Pokegochi{

	private int vida = 35;
	private int dano = 6;
	private int velocidadeAtaque = 600;
	private int defesa = 2;
	
	
	public int getVida() {
		return vida;
	}
	public int getDano() {
		return dano;
	}
	public int getVelocidadeAtaque() {
		return velocidadeAtaque;
	}
	public int getDefesa() {
		return defesa;
	}
	public void receberDano(int dano) {
		this.vida -= dano;
	}
	public void setDano(int i) {
		this.dano += i;
	}
	
	

}
