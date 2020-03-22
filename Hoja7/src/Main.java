import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws Exception{
		
		File archivoTrad = new File("traducir.txt");
		File archivoDicc = new File ("diccionario.txt");
		boolean toExit = false;
		FileReader fileRe = new FileReader(archivoDicc);
		BufferedReader buffRea = new BufferedReader(fileRe);
		BinaryTree binaryTree = new BinaryTree("I", "yo");
		
		System.out.println("------------------");
		System.out.println("|   Bienvenido   |");
		System.out.println("------------------");
		System.out.println("Desea traducir la siguiente oracion: ");
		
		if(archivoDicc.exists()) {
			Scanner diccionary = new Scanner(archivoDicc);
			Scanner read = new Scanner(System.in);
			String words = "";
			int count = 0;
			while ((words = buffRea.readLine()) != null) {
				String[] eachLine = words.split(" ");
				eachLine[1].toLowerCase();
				eachLine[2].toLowerCase();
				binaryTree.put(eachLine[1], eachLine[2]);
				count++;
			}
		}
		
		if (archivoTrad.exists()) {
			Scanner translate = new Scanner(archivoTrad);
			String sentence = translate.nextLine().toLowerCase();
			System.out.println(sentence);
			String[] palabras = sentence.split(" ");
			String finalSentence = "";
			int howManyW = palabras.length;
			
			for(int i = 0; i<howManyW;i++) {
				
				String got = (String) binaryTree.get(palabras[i]);
				String traduced = "";
				if (got == null) {
					traduced = ("*")+palabras[i]+("*");
				}
				else {
					traduced = got;
				}
				finalSentence = finalSentence + (" ") + traduced;
			}
			System.out.println("Su oracion traducida es: "+finalSentence);
		}
	}
}
