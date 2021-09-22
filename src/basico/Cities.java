package basico;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String [] cities = {"New York","San Francisco", "Miami", "Dallas"};
		// 0 é New York 
		//temos 4 elementos que sao matriz, mas o indice vai de 0 a 3
		//Esta é uma maneira de declarar e definir a matriz tudo em um, obter tudo em uma linha.
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[0]);
		
		//Assim que declaramos e definimos (somente tamanho)
		// Declare the array (quando declarado direto, tem que dar um tamanho imediatamente)
		//abaixo definimos o tamanho 
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
	
		//Declara o Array
		String[] countries;
		
		//Define o Array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
        System.out.println(countries[1]);
        
		System.out.println("*********");
        
        String[] states1 = new String[5];
		states1[0] = "California";
		states1[1] = "Ohio";
		states1[2] = "New Jersey";
		states1[3] = "Texas";
		states1[4] = "Utah";
		int i = 0;
		
		//DO Loop: enters the loop THEN tests conditions
		do {
            System.out.println("STATE:" + states1[i]);
		    i = i + 1;
		} while (i <= 4);
		
		// While Loop: tests condition first then enters loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("STATE FOUND");
			    stateFound = true;
			}
		    n++;
		}
		System.out.println("\nPRINTING WITH FOR LOOP");
		//For Loop: best structure for iterating trhough an array
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
				
	}
	
}
