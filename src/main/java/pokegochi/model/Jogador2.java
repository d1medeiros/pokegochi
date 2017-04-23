package pokegochi.model;

import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.ArrayList;

public class Jogador2 implements Runnable {

	private String nome = "";
	private Pokegochi pokegochi;
	private Jogador2 inimigo;
	private boolean podeAtacar = false;
	private boolean acabouTreino = false;
	private int refeicoesDia = 0;
	private LocalTime ultimaHoraAlimento = LocalTime.of(6, 20, 26, 237);
	private ArrayList<Refeicao> refeicoes = new ArrayList<Refeicao>(); 
	private int tresDiasRefeicao = 0;
	private int tipoFisico = TipoFisico.MAGRO;

	
	


	public LocalTime getUltimaHoraAlimento() {
		return ultimaHoraAlimento;
	}

	public void setUltimaHoraAlimento(LocalTime ultimaHoraAlimento) {
		this.ultimaHoraAlimento = ultimaHoraAlimento;
	}

	public ArrayList<Refeicao> getRefeicoes() {
		return refeicoes;
	}

	public void setRefeicoes(Refeicao refeicao) {
		this.refeicoes.add(refeicao);
		this.refeicoesDia++;
	}

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
	public void setAcabouTreino(boolean b) {
		this.acabouTreino = b;
	}

	public boolean getAcabouTreino() {
		return this.acabouTreino;
	}

	public int getRefeicoesDia() {
		return refeicoesDia;
	}

	public void run() {
		try {
			
			if(this.podeAtacar){
				while(this.inimigo.getVida() >= 0){
					Thread.sleep(getVelocidadeAtaque());
					//se ainda pode continuar atacando
					if(getVida() >= 0){
						this.inimigo.receberDano(getDano());
						System.out.println(" ");
						System.out.println("Ataque: " + this.nome + " - HP: " + getVida() + "  " 
								+ new Timestamp(System.currentTimeMillis()));
						System.out.println("HP inimigo " + this.inimigo.getNome() + " : " + this.inimigo.getVida());
						System.out.println(" ");
					}else{
						this.podeAtacar = false;
						System.out.println(this.nome + " PERDEU a batalha");
						break;
					}
				}
				if(getVida() >= 0)
					System.out.println(this.nome + " GANHOU a batalha");
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getTipoFisico() {
		return tipoFisico;
	}
	public String mostraTipoFisico() {
		String temp = "";
		switch(this.tipoFisico){
		case 0: temp = "Magro";
			break;
		case 1: temp = "Pouco-Magro";
			break;
		case 2: temp = "Normal";
			break;
		case 3: temp = "Pouco-Gordo";
			break;
		case 4: temp = "Gordo";
			break;
		default:
			break;
		}
		return temp;
	}

	public void aumentaTipoFisico() {
		this.tresDiasRefeicao++;
		System.out.println("tres dias refeicao " + this.tresDiasRefeicao);
		if(this.tresDiasRefeicao == 3){
			System.out.println("aumentando de tipo fisico");
			if(this.tipoFisico < 4)
				this.tipoFisico ++;
			this.tresDiasRefeicao = 0;
		}
	}
	public void reduzTipoFisico() {
		this.tresDiasRefeicao--;
		System.out.println("tres dias refeicao " + this.tresDiasRefeicao);
		if(this.tresDiasRefeicao == 0){
			System.out.println("aumentando de tipo fisico");
			if(this.tipoFisico > 1)
				this.tipoFisico --;
		}
	}

	public void zeraRefeicoesDia() {
		this.refeicoesDia = 0;
		refeicoes = new ArrayList<Refeicao>(); 
	}




}
