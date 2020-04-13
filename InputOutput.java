import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nama;
		int npm;
		int jumlahSks;
		double IPK;
		
		System.out.println("Masukkan nama Anda :");
		nama = scanner.nextLine();
		
		System.out.println("Masukkan NPM Anda :");
		npm = scanner.nextInt();
		
		System.out.println("Masukkan jumlah SKS yang sudah ditempuh :");
		jumlahSks = scanner.nextInt();
		
		System.out.println("Masukkan jumlah IPK sementara :");
		IPK = scanner.nextDouble();
		
		double jumlah = IPK * jumlahSks;
		System.out.println("Hai " + nama + ", NPM kamu : " + npm);
		System.out.println("Total Nilai = " + jumlah);
	}
}