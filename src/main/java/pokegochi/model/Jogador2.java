package pokegochi.model;

public class Jogador2 implements Runnable {

	private String nome = "";
	private int count = 0;
	private int ultimoAlimento = 0;
	private int[] alimentosDoDia = new int[6];
	private Pokegochi pokegochi;
	private Jogador2 inimigo;
	private boolean podeAtacar = false;
	

	public void setPokegochi(Pokegochi pokegochi) {
		this.pokegochi = pokegochi;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return this.pokegochi.getVida();
	}

	public int getDano() {
		return this.pokegochi.getDano();
	}

	public int getVelocidadeAtaque() {
		return this.pokegochi.getVelocidadeAtaque();
	}

	public int getDefesa() {
		return this.pokegochi.getDefesa();
	}

	public Pokegochi getPokegochi() {
		return pokegochi;
	}


	private void receberDano(int dano) {
		this.pokegochi.receberDano(dano);
	}

	public void setTarget(Jogador2 inimigo) {
		this.inimigo = inimigo;
		this.podeAtacar = true;
	}

	public void run() {
		try {
			
			if(this.podeAtacar){
				while(this.inimigo.getVida() >= 0){
					Thread.sleep(getVelocidadeAtaque());
					//se ainda pode continuar atacando
					if(getVida() < 0){
						this.podeAtacar = false;
						System.out.println(this.nome + " PERDEU a batalha");
						break;
					}
					this.inimigo.receberDano(getDano());
					System.out.println(" ");
					System.out.println("Ataque: " + this.nome + " - HP: " + getVida());
					System.out.println("HP inimigo " + this.inimigo.getNome() + " : " + this.inimigo.getVida());
					System.out.println(" ");
				}
				if(getVida() >= 0)
					System.out.println(this.nome + " GANHOU a batalha");
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void alimenta(int alimento) {
		if(count == 0){
			this.alimentosDoDia[count] = alimento;
			count++;
		}else if(count > 0 | count < 6){
			this.alimentosDoDia[count] = alimento;
			count++;
		}else{
			System.out.println("nao pode se alimentar mais");
		}
	}

}
