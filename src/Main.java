import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nAdjs = sc.nextInt();
		int nNouns = sc.nextInt();
		sc.nextLine();
		String[] adjs = new String[nAdjs];
		String[] nouns = new String[nNouns];
		for (int i=0; i<nAdjs;i++) {
			adjs[i] = sc.nextLine();
		}
		
		for (int i=0;i<nNouns;i++) {
			nouns[i] = sc.nextLine();
		}
		
		for (String adj:adjs) {
			for (String noun:nouns) {
				System.out.println(adj+" as "+noun);
			}
		}
	}

}
