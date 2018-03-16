import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Task {
	/*
	 * Task List file stores the data in a file
	 */
	static String fileName = "Task_List.txt";
	
void showList() {
	System.out.println("\nHere is your To-do Task List\n");
	try {
		Scanner inFile= new Scanner(new FileReader(fileName));
		String line;
		int number = 1;
		while (inFile.hasNextLine()) {
			line = inFile.nextLine();
			System.out.print(number +": ");
			System.out.println(line);
			++number;
			}
		System.out.println();
		inFile.close();
	}
	catch (IOException ioe) {
	System.out.print("Can't acess file.\n");
}
}

 void addTask() {
	 System.out.println("\nAdd Task\n");
	 try {
			Scanner input = new Scanner(System.in);
			PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
			System.out.print("Enter a Task: \n");
			String task = input.nextLine();
			outFile.println(task);
			outFile.close();
	 }
		catch (IOException ioe) {
		System.out.print("Can't acess file.\n");
	}
	 }
	
void removeTask(Object choice) {
	int choice1;
	showList();
	Scanner input= new Scanner(System.in);
	System.out.print("Which Task you want to Remove?");
	choice1=input.nextInt();
	ArrayList<String> tasks = new ArrayList<>();
	int number =1;
	try {
		Scanner inFile = new Scanner(new FileReader(fileName));
		String task;
		while (inFile.hasNextLine()) {
			task = inFile.nextLine();
			if (number != choice1)
				tasks.add(task);
			++ number;
		}
		PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
		for (int i = 0; i<tasks.size(); ++i)
			outFile.println(tasks.get(i));
		outFile.close();
	}
	catch (IOException ioe) {
		System.out.print("Can't acess file.\n");
	}
}
	

 

}
