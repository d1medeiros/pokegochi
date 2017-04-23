package pokegochi.model;

public class Pokegochi {


	private int vida = 100;
	private int dano = 10;
	private int velocidadeAtaque = 4000;
	private int defesa = 2;
	
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getVida() {
		return this.vida;
	}
	public void setVelocidadeAtaque(int velocidadeAtaque) {
		this.velocidadeAtaque -= velocidadeAtaque;
	}
	public int getVelocidadeAtaque() {
		return this.velocidadeAtaque;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	public int getDefesa() {
		return this.defesa;
	}
	public void setDano(int i) {
		this.dano += i;
	}
	public int getDano() {
		return this.dano;
	}
	public void receberDano(int dano) {
		this.vida -= dano;
	}
	
	
}
