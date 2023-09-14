import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;



public class LeerFichero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File fichero = new File("fichero/kaixo.txt");
		FileReader reader = new FileReader(fichero);
		BufferedReader br = new BufferedReader(reader);
		int linea = 0;
		String palabra = "kaixo";
		int kaixos = 0;
		String[] palabras;
		
		try {
			String word;
			while((word = br.readLine())!=null) {
				palabras = word.split(" ");
				System.out.println("word " + word);
				if(word.toLowerCase().contains("kaixo")) {
					linea++;
					System.out.println("Lerroa: " + linea + " " + word);
				}
				
				for(String Fpalabra : palabras) {
					if(Fpalabra.equalsIgnoreCase(palabra)) {
						kaixos++;
					}
				}
				
			}
			System.out.println("Kaixos: " + kaixos);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
