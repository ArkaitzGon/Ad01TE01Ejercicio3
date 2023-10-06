package principal;

/***
 * Ejercicio 3
 * Lee la cabecera de un fichero y nos dice si es un .zip o no
 */
import java.io.*;

public class flujosBinarios {

	public static void main(String[] args) {
		File ficZip = new File("prueba.zip");
		
		try {
			FileInputStream filein = new FileInputStream(ficZip);
			
			int[] secuencia = {80, 75, 3, 4};
			int[] cabeceraArch = new int[4];
		
			int j = 0;
			
			while(j < secuencia.length) {
				int i = filein.read();
				cabeceraArch[j] = i;
				j++;
			}
			
			boolean esIgual = false;
			
			for(int l = 0; l < secuencia.length; l++) {
				if(secuencia[l] == cabeceraArch[l]) {
					esIgual = true;
				}else {
					esIgual = false;
				}
			}
			
			if(esIgual) {
				System.out.println("Este archivo es un ZIP");
			}else {
				System.out.println("Este archivo no es un ZIP");
			}
			
			filein.close();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
