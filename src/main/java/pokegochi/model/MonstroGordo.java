package pokegochi.model;

public class MonstroGordo implements Pokegochi{

	private int vida = 100;
	private int dano = 10;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dano;
		result = prime * result + defesa;
		result = prime * result + velocidadeAtaque;
		result = prime * result + vida;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MonstroGordo other = (MonstroGordo) obj;
		if (dano != other.dano)
			return false;
		if (defesa != other.defesa)
			return false;
		if (velocidadeAtaque != other.velocidadeAtaque)
			return false;
		if (vida != other.vida)
			return false;
		return true;
	}
	
}
