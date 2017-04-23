package pokegochi.controller;

import pokegochi.model.Jogador2;

public class Lutar {


	public static void inicia(Jogador2 j1, Jogador2 j2) {
		
		System.out.println("Iniciando partida...");
		
		esperar();
		
		threadT(j1, j2);
		
	}

	private static void threadT(Jogador2 j1, Jogador2 j2) {
		j1.setTarget(j2);
		j2.setTarget(j1);
		Thread t1 = new Thread(j1);
		Thread t2 = new Thread(j2);
		t1.start();
		t2.start();
	}

	private static void esperar() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	
	
}
