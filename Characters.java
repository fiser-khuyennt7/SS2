import java.io.*;
public class Characters{
	public static void main(String[] args) throws IOException{
		String s;
		BufferedReader input = new BufferedReader(new FileReader("Characters.txt"));
		s = input.readLine();
		int do_dai = s.length();
		char c[] = new char[do_dai];
		for(int i = 0; i < do_dai; i++) {
			c[i] = s.charAt(i);
		}
		int dem[] = new int[95];
		for(int i = 0; i < 95; i++) {
			dem[i] = 0;
		}
		int maasc[] = new int[95];
		for(int i = 0; i < 95; i++){
			maasc[i] = 32 + i;
		}
		for(int i = 0; i < 95; i++) {
			for(int j = 0; j < do_dai; j++) {
				if(maasc[i] == c[j]){
					dem[i]++;
				}
			}
			
		}
		for(int i = 0; i < 95; i++) {
			if(dem[i] > 0) {
				System.out.print( (char)maasc[i] +"   " +dem[i]);
				System.out.println();
			}
			
		}
	}
}