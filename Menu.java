import java.util.Scanner;
import java.io.*;

public class Menu{
	int chon;
	public static void main(String[] args) throws IOException {
		Menu menu = new Menu();
		boolean kt;
		int solanNhap = 0;
		boolean dklap = true;
		
		while (dklap) {
			while(solanNhap < 3) {
				kt = menu.authentication();
				if(kt) {
					menu.hienthi2();
					dklap = false;
					break;
				} else {
					System.out.println("\t Ban nhap sai username or password ");
					System.out.println("\t Moi nhap lai ");
					solanNhap++;
				}
			}
			if(solanNhap == 3) {
				try{
					System.out.println("Sau 1 phut");
					Thread.sleep(60 * 1000);
					
				} catch (InterruptedException ex){}
				solanNhap = 0;
				dklap = true;
			}
				
		}
	}

	boolean authentication() throws IOException {
		
		BufferedReader input = new BufferedReader(new FileReader ("Menu.txt"));
		String username;
		username = input.readLine();
		String password;
		password = input.readLine();
		System.out.print("Moi ban nhap username: ");
		Scanner nhap = new Scanner(System.in);
		String usernameNhap;
		usernameNhap = nhap.nextLine();
		System.out.print("Moi ban nhap password: ");
		String passwordNhap;
		passwordNhap = nhap.nextLine();
		if((usernameNhap.equals(username)) && (passwordNhap.equals(password))){
			return true;
		} else {
			return false;
		}
		
	}

	void hienthi2() {
		
		System.out.println("\t Menu 1 ");
		System.out.println("1. Nhap kho ");
		System.out.println("2. Xuat kho ");
		System.out.println("3. Quan ly gia ");
		System.out.println("4. In hoa don ");
		System.out.println("5. Thoat ");
		System.out.print("Ban chon so: ");
		Scanner input = new Scanner(System.in);
		chon = input.nextInt();
		switch(chon) {
			case 1: menuNhapKho(); break;
			case 2: menuXuatKho(); break;
			case 3: menuQuanlygia(); break;
			case 4: menuInhoadon(); break;
			case 5: Exit(); break;
			default : break;
		}
	}
	
	void menuNhapKho() {

		System.out.println("\t NHAP KHO ");
		System.out.println("1. Nhap kho so luong mot don vi ");
		System.out.println("2. Nhap theo thung 20 don vi ");
		System.out.println("3. Nhap theo ta 10 don vi ");
		System.out.println("4. Chinh sua so luong ");
		System.out.println("5. Quay lai menu 1 ");
		System.out.print("Ban chon so: ");
		Scanner input = new Scanner(System.in);
		chon = input.nextInt(); 
		if(chon == 5) {
			hienthi2();
		}	
	}
	
	void menuXuatKho() {
		
		System.out.println("\t XUAT KHO ");
		System.out.println("1. Xuat theo mot don vi ");
		System.out.println("2. Xuat theo thung ");
		System.out.println("3. Xuat theo ta ");
		System.out.println("4. Chinh sua so luong ");
		System.out.println("5. Kiem tra so luong ");
		System.out.println("6. Quay lai menu 1 ");
		System.out.print("Ban chon so: ");
		Scanner input = new Scanner(System.in);
		chon = input.nextInt();
		if(chon == 6){
			hienthi2();
		}
	}
	
	void menuQuanlygia() {
		
		System.out.println("\t QUAN LY GIA ");
		System.out.println("1. Hien thi gia ");
		System.out.println("2. Sua gia ");
		System.out.println("3. Tong tien hang ");
		System.out.println("4. Quay lai menu 1 ");
		System.out.print("Ban chon so: ");
		Scanner input = new Scanner(System.in);
		chon = input.nextInt();
		if(chon == 4) {
			hienthi2();
		}	
	}
	
	void menuInhoadon() {
		
		System.out.println("\t IN HOA DON ");
		System.out.println("1. In theo luong hang ");
		System.out.println("2. In theo gia ");
		System.out.println("3. In theo ca hang va gia ");
		System.out.println("4. Quay lai menu 1 ");
		System.out.print("Ban chon so: ");
		Scanner input = new Scanner(System.in);
		chon = input.nextInt();
		if(chon == 4) {
			hienthi2();
		}
	}
	
	void Exit() {
		
		System.out.print("Ban co muon thoat khong (Y/N)?: ");
		Scanner input = new Scanner(System.in);
		String answer;
		answer = input.nextLine();
		if(answer.equals("Y")) {
			System.out.println("GOOD BYE!!!");
		}
		if(answer.equals("N")) {
			hienthi2();
		}
		
	
		
	}
}