package pokegochi.model;

public class Jogador implements Runnable{
	
	
	private String nome;
	private int vida;
	private int dano;
	private int defesa;
	private int danoMagico;
	private int resistenciaMagica;
	private Jogador j2;
	private boolean podeAtacar = false;
	private int tempoDeAtaque;
	
	public Jogador(){
		this.vida = 10;
		this.dano = 1;
		this.defesa = 1;
		this.danoMagico = 1;
		this.resistenciaMagica = 1;
	}

	public void escolheTarget(Jogador j2) {
		this.j2 = j2;
		this.podeAtacar = true;
	}
	public int getVida() {
		return vida;
	}
	public int getDano() {
		return dano;
	}
	public int getDefesa() {
		return defesa;
	}
	public int getDanoMagico() {
		return danoMagico;
	}
	public int getResistenciaMagica() {
		return resistenciaMagica;
	}


	public void run() {
		
		try {
		
			if(this.podeAtacar){
				while(this.vida >= 0){
					j2.darDano(this.dano);
					System.out.println("hp: " + this.nome + " - " + this.vida + " - " + " - hp inimigo: " + this.j2.getNome() + " - " + this.j2.getVida());
						Thread.sleep(this.tempoDeAtaque);
					if(j2.getVida() < 0){
						this.podeAtacar = false;
						break;
					}
				}
			}
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
			
	}

	public void darDano(int i) {
		this.vida -= i;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setVida(int vida) {
		this.vida += vida;
	}

	public int getTempoDeAtaque() {
		return tempoDeAtaque;
	}

	public void setTempoDeAtaque(int tempoDeAtaque) {
		this.tempoDeAtaque = tempoDeAtaque;
	}
	
	
}
