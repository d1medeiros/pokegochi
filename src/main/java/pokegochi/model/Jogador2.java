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

	public void run() {

		
		try {
			
			if(this.podeAtacar){
				while(getVida() >= 0){
					this.inimigo.receberDano(getDano());
					System.out.println("hp: " + this.nome + " - " + getVida() + " - " + " - hp inimigo: " + this.inimigo.getNome() + " - " + this.inimigo.getVida());
						Thread.sleep(getVelocidadeAtaque());
					if(this.inimigo.getVida() < 0){
						this.podeAtacar = false;
						break;
					}
				}
			}
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}

	private void receberDano(int dano) {
		this.pokegochi.receberDano(dano);
	}

	public void setTarget(Jogador2 inimigo) {
		this.inimigo = inimigo;
		this.podeAtacar = true;
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
