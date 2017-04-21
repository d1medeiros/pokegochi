package pokegochi.teste;

import pokegochi.controller.Lutar;
import pokegochi.model.Jogador2;
import pokegochi.model.MonstroGordo;
import pokegochi.model.MonstroMagro;

public class Teste3 {

	public static void main(String[] args) {
		
		Jogador2 j1 = new Jogador2();
		j1.setNome("Aulus Gordo");
		j1.setPokegochi(new MonstroGordo());
		
		
		Jogador2 j2 = new Jogador2();
		j2.setNome("Begamo Magro");
		j2.setPokegochi(new MonstroMagro());
		
		
		
		Lutar.inicia(j1, j2);
		
	}
	
}
