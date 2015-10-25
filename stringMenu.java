import java.util.*;
import java.lang.*;
class  stringMenu{
	Scanner input = new Scanner(System.in);
	public static void main (String[] args) {
		stringMenu chuoi = new stringMenu();
		chuoi.menu();
		
		
	}
	public void menu() {
		System.out.println("\n1. Nhap vao 1 chuoi in ra chuoi nghich dao");
        System.out.println("2. Nhap vao 1 chuoi in ra chuoi co chu cai dau la chu hoa");
        System.out.println("3. Nhap vao 1 chuoi in ra chuoi co chu cai dau tung tu la chu hoa");
        System.out.println("4. Nhap vao 1 chuoi in ra chuoi la chu hoa trong chuoi");
        System.out.println("5. Nhap vao 1 chuoi in ra chuoi ma hoa lech 1 ki tu");
		System.out.println("6. Thoat");
		System.out.print("Ban chon so: ");
		int chon = input.nextInt();
		switch(chon) {
			case 1: NghichDao(); break;
			case 2: InHoaDau(); break;
			case 3: InHoaKyTuDau(); break;
			case 4: InChuHoa(); break;
			case 5: maHoa(); break;
			case 6: Exit(); break;
			default: break;	
		}	
	}
	
	public void NghichDao() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		String chuoi;
		chuoi = input.nextLine();
		int do_dai = chuoi.length();
		char xauNguoc[] = new char[do_dai];
		for(int i = 0; i < do_dai; i++) {
			int kytuso = do_dai - 1 - i;
			xauNguoc[i] = chuoi.charAt(kytuso);
			System.out.print(xauNguoc[i]);
		}
		menu();
	}
	
	public void InHoaDau() {
		Scanner input = new Scanner(System.in);
		String chuoi;
		System.out.print("Nhap chuoi: ");
		chuoi = input.nextLine();
		System.out.print(chuoi.substring(0, 1).toUpperCase() + chuoi.substring(1, chuoi.length()));
		menu();
	}
	
	public void InHoaKyTuDau() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		String chuoi;
		chuoi = input.nextLine();
		if(!(chuoi.substring(0, 1)).equals(" ")) {
			chuoi = (chuoi.substring(0, 1).toUpperCase()).concat(chuoi.substring(1, chuoi.length()));
		}
		char[] tempXau = chuoi.toCharArray();
		for(int i = 0; i < tempXau.length; i++) {
			if(tempXau[i] == 32 && tempXau[i+1] >= 97 && tempXau[i+1] <= 122) {
				tempXau[i+1] = (char) ((int) tempXau[i+1] -32);
			}
		}
		String chuoiIn = new String(tempXau);
		System.out.print(chuoiIn);
		menu();
    }
	
	public void InChuHoa() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		String chuoi;
		chuoi = input.nextLine();
		int j = 0;
		char[] tempXau = chuoi.toCharArray();
		char[] xauInHoa = new char[chuoi.length()];
		for(int i = 0; i < tempXau.length; i++) {	
			if(tempXau[i] >= 65 && tempXau[i] <= 90) {
				xauInHoa[j] = tempXau[i];
				j++;
			}
		}
		String chuoiInHoa = new String(xauInHoa);
		System.out.print(chuoiInHoa);
		menu();
	}
	
	public void maHoa() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		String chuoi;
		chuoi = input.nextLine();
		char[] tempXau = chuoi.toCharArray();
		for(int i = 0; i < tempXau.length; i++) {
			if(i == tempXau.length - 1) {
				tempXau[i] = (char) ((int) tempXau[i] + 1);
			} else {
				tempXau[i] = tempXau[i + 1];
			}	
		}
		String chuoimaHoa = new String(tempXau);
		System.out.print(chuoimaHoa);
		menu();
	}

	public void Exit(){
		System.out.print("Ban co muon thoat khong (Y/N) ? :" );
		Scanner input = new Scanner(System.in);
		String chon;
		chon = input.nextLine();
		if(chon.equals("Y")) {
			System.out.print("GOOD BYE!!!");
		} else {
			menu();
		}
		
	}
 }