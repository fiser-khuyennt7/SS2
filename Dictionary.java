import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class Dictionary {
	
	public static void main(String[] args) throws IOException{
		Dictionary tudien = new Dictionary();
        tudien.menuDictionary();
	}
	

	public void menuDictionary() throws IOException{
		System.out.println("\n\t MENU DICTIONARY");
		System.out.println(" 1. Them tu ");
		System.out.println(" 2. Tra tu ");
		System.out.println(" 3. Chinh sua ");
		System.out.println(" 4. Thoat ");
		int chon;
		System.out.print(" Ban chon so: ");
		Scanner input = new Scanner(System.in);
		chon = input.nextInt();
		switch(chon) {
			case 1: addword(); break;
			case 2: find(); break;
			case 3: Editword(); break;
			case 4: Exit(); break;
			default: break;
		}
	}
	public void addword() throws IOException {
		Scanner input = new Scanner(System.in);
		String tu;
		String nghia;
		System.out.print("Keyword: ");
		tu = input.nextLine();
		System.out.print("value: ");
		nghia = input.nextLine();
		BufferedReader doc = new BufferedReader(new FileReader("Dictionary.txt"));
		BufferedWriter output = new BufferedWriter(new FileWriter("Dictionary.txt",true));
		String s1="A", s2 = "D";
		int them = 1;
		while(s1!= null) {
			s1 = doc.readLine();
			s2 = doc.readLine();
			if(s1!= null && s2!= null) {
				if(s1.equals(tu) && s2.equals(nghia)){
					System.out.println("Tu ban them da co trong tu dien");
					them = 0;
					s1 = null;
					break;
				}
				}
		}
		if(them == 1) {
			output.newLine();
			output.write(tu);
			output.newLine();
			output.write(nghia);
		}
		output.close();
		menuDictionary();
	}
	public void find() throws IOException {
		Scanner input = new Scanner(System.in);
		String tu;
		System.out.print("Keyword: ");
		tu = input.nextLine();
		String nghia;
		BufferedReader doc = new BufferedReader(new FileReader("Dictionary.txt"));
		String temp = "A";
		while(temp != null){
			temp = doc.readLine();
			if(temp!= null) {
				if(temp.equals(tu)) {
				nghia = doc.readLine();
				System.out.print(nghia + " / ");
				}
			}
		}
		System.out.print("\nAn ENTER de quay tro lai menu");
		String tu1 = input.nextLine();
		menuDictionary();	
	}
	
	public void Editword() throws IOException{
		Scanner input = new Scanner(System.in);
		String tu;
		System.out.print("Keyword: ");
		tu = input.nextLine();
		System.out.print("Value : ");
		String nghia;
		nghia = input.nextLine();
		BufferedWriter output = new BufferedWriter(new FileWriter("Dictionary.txt",true));
		output.newLine();
		output.write(tu);
		output.newLine();
		output.write(nghia);
		output.close();
		menuDictionary();
	}
	
	public void Exit() throws IOException{
		System.out.print("Ban co muon thoat hay khong (Y/N) ?: ");
		Scanner input = new Scanner(System.in);
		String tu;
		tu = input.nextLine();
		System.out.print("Keyword: ");
		if(tu.equals("Y")){
			System.out.println("GOOD BYE!!!");
		} 
		if(tu.equals("N")){
			menuDictionary();
		}
			
	}
	
}

