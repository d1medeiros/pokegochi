package pokegochi.controller;

import java.time.LocalTime;

import pokegochi.model.Jogador2;
import pokegochi.model.Refeicao;
import pokegochi.model.TipoFisico;

public class Alimentar {
	
	private LocalTime horaAlimentoCorreto;
	
	public void alimentar(Jogador2 jogador, Refeicao refeicao) {
		
		horaAlimentoCorreto = jogador.getUltimaHoraAlimento().plusHours(3);
		
		if(LocalTime.now().isAfter(horaAlimentoCorreto) && jogador.getRefeicoes().size() <= 6){
			System.out.println("pode comer");
			fazRefeicao(jogador, refeicao);
		}else{
			System.out.println("nao pode comer");
		}
		
		
	}
	public void alimentar(Jogador2 jogador, Refeicao refeicao, int a) {
		
			fazRefeicao(jogador, refeicao);
		
	}
	
	private void fazRefeicao(Jogador2 jogador, Refeicao refeicao) {
		
		jogador.setRefeicoes(refeicao);
		if(jogador.getRefeicoesDia() == 6){
			int temp = 0;
			for (Refeicao r : jogador.getRefeicoes()) {
				temp += r.getCalorias();
			}
			temp = temp / jogador.getRefeicoesDia();
			
			if(temp == TipoFisico.ALIMENTO_GORDO){
				jogador.aumentaTipoFisico();
			}else if(temp == TipoFisico.ALIMENTO_MAGRO){
				jogador.reduzTipoFisico();
			}
			System.out.println("Tipo Fisico: " + jogador.mostraTipoFisico());
			jogador.zeraRefeicoesDia();
		}
		
	}

	

}
