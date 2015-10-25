import java.io.*;
import java.util.*;
public class SoPhuc {
	
	double phanThuc;
	double phanAo;
	
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader ("So_Phuc.txt"));
		String s;
		s = input.readLine();
		double phanThuc = Double.parseDouble(s);
		s = input.readLine();
		double phanAo = Double.parseDouble(s);

		SoPhuc A = new SoPhuc(phanThuc, phanAo);
		SoPhuc C = new SoPhuc();
		
		
		A.InSoPhuc(A);
		C = C.congSP(A,A);
		C.InSoPhuc(C);
		C = C.truSP(A,A);
		C.InSoPhuc(C);
		C = C.nhanSP(A,A);
		C.InSoPhuc(C);
		double z;
		z = C.modun(A);
		System.out.format(z +"\n");
		C = C.lienhop(A);
		C.InSoPhuc(C);
		input.close();
	}
	
	SoPhuc(){
	}
	SoPhuc(double pt, double pa) {
		phanThuc = pt;
		phanAo = pa;
	}
	void InSoPhuc (SoPhuc A) {
		if(A.phanAo>= 0) {	
			System.out.print(A.phanThuc + " + " + A.phanAo + " * i\n");
		} else {
			System.out.print(A.phanThuc + " - " + Math.abs(A.phanAo) + " * i\n");
		}
			
	}
	SoPhuc congSP(SoPhuc A, SoPhuc B) {
		SoPhuc C = new SoPhuc();
		C.phanThuc = A.phanThuc + B.phanThuc;
		C.phanAo = A.phanAo + B.phanAo;
		return C;
	}
	SoPhuc truSP(SoPhuc A, SoPhuc B) {
		SoPhuc C = new SoPhuc();
		C.phanThuc = A.phanThuc - B.phanThuc;
		C.phanAo = A.phanAo - B.phanAo;
		return C;
	}
	 SoPhuc nhanSP(SoPhuc A, SoPhuc B) {
		SoPhuc C = new SoPhuc();
		C.phanThuc = A.phanThuc * B.phanThuc - A.phanAo * B.phanAo;
		C.phanAo = A.phanThuc * B.phanAo + A.phanAo * B.phanThuc;
		return C;
	}
	double modun(SoPhuc A) {
		double z;
		z = (double) Math.sqrt(A.phanThuc * A.phanThuc + A.phanAo * A.phanAo);
		return z;	
	}
	SoPhuc lienhop(SoPhuc A) {
		SoPhuc B = new SoPhuc();
		B.phanThuc = A.phanThuc;
		B.phanAo = - A.phanAo;
		return B;
	}
}