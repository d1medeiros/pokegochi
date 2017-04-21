package pokegochi.controller;

import pokegochi.model.Jogador2;

public class Lutar {


	public static void inicia(Jogador2 j1, Jogador2 j2) {
		j1.setTarget(j2);
		j2.setTarget(j1);
		new Thread(j1).start();
		new Thread(j2).start();
	}

	
	
	
}
