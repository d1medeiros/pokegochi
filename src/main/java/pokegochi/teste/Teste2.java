package pokegochi.teste;

import pokegochi.model.Alimento;
import pokegochi.model.Jogador2;
import pokegochi.model.MonstroGordo;
import pokegochi.model.MonstroMagro;
import pokegochi.model.Ninjutsu;
import pokegochi.model.Sumo;
import pokegochi.model.Treinar;

public class Teste2 {

	public static void main(String[] args) {

		//iniciando jogadores
		Jogador2 j1 = new Jogador2();
		j1.setNome("Magro");
		j1.setPokegochi(new MonstroMagro());
		
		Jogador2 j2 = new Jogador2();
		j2.setNome("Gordo");
		j2.setPokegochi(new MonstroGordo());
		

		//alimentando
		
		j1.alimenta(Alimento.SALADA);
		
		
		//treinando
		Sumo sumo = new Sumo();
		sumo.iniciarTreino(j2, 4);
		
		Ninjutsu ninjutsu = new Ninjutsu();
		ninjutsu.iniciarTreino(j1);
		
		//lutando
		j1.setTarget(j2);
		j2.setTarget(j1);
		new Thread(j1).start();
		new Thread(j2).start();
		
		
		System.out.println("fimmmmm");
		
	}

}
