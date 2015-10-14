import java.io.*;
import java.util.*;

public class FileSum {

	public static void main(String[] args) throws IOException{
		
		Scanner scan = new Scanner(System.in);
		File f = new File("TestSum.txt");
		PrintWriter p = new PrintWriter(f);
		int input = 0;
		int sum = 0;
		
		System.out.println("Input numbers, end with -1");
		
		while(input != -1){
			input = scan.nextInt();
			if(input != -1){
				p.print(input);
				p.print(" ");
			}
			if(input == -1){
				break;
			}
		}
		
		p.close();
		scan.close();
		
		Scanner inputfile = new Scanner(f);
		
		while(inputfile.hasNext()){
			sum = sum + inputfile.nextInt();
		}
		
		inputfile.close();
		
		System.out.println("Sum is " + sum);

	}

}
