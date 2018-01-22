import java.io.FileNotFoundException;
import java.util.Scanner;

public class BankRunner {
	public static void main(String args[]) throws FileNotFoundException, InterruptedException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter File Name: ");
		String fileToRead = sc.next();

		System.out.println("Enter Number of Workers: ");
		int numOfWorkers = sc.nextInt();

		Bank bank = new Bank(numOfWorkers);

		MainWorker mainWorker = new MainWorker(bank, numOfWorkers, fileToRead);

		bank.runParallel(numOfWorkers);
		Thread mainThread = new Thread(mainWorker);

		mainThread.start();

		bank.printValues();
	}
}
