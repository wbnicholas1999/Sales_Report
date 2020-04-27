/**
 * 
 * @author William Nicholas
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	
	public TwoDimRaggedArrayUtility() {
		// lol, what's the point of this method?
	}
	
	// Returns the average of elements in the two dimensional array
	public static double getAverage(double[][] data) {
		int count = 0;
		double total = 0;
		
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				total += data[row][col];
				count++;
			}
		}
		
		return total/count;
	}
	
	// Returns the total of the selected column in the two dimensional array index 0 refers to the first column
	public static double getColumnTotal(double[][] data, int col) {
		double total = 0;
		
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				total += data[row][col];
			}
		}
		
		return total;
	}
	
	// Returns the largest element in the two dimensional array
	public static double getHighestInArray(double[][] data) {
		double highest = data[0][0];
		
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (highest < data[row][col]) {
					highest = data[row][col];
				}
			}
		}
		
		return highest;
	}
	
	// Returns the largest element of the selected column in the two dimensional array index 0 refers to the first column
	public static double getHighestInColumn(double[][] data, int col) {
		int rowCheck = 0;
		double highest = data[0][0];
		
		while (rowCheck < data.length) {
			if (col < data[rowCheck].length) {
				highest = data[rowCheck][col];
				break;
			} else {
				rowCheck++;
			}
		}
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				if (highest < data[row][col]) {
					highest = data[row][col];
				}
			}
		}
		
		return highest;
	}
	
	// Returns the index of the largest element of the selected column in the two dimensional array index 0 refers to the first column
	public static double getHighestInColumnIndex(double[][] data, int col) {
		int highest = 0;
		int rowCheck = 0;
		double highestElement = data[0][0];
		
		while (rowCheck < data.length) {
			if (col < data[rowCheck].length) {
				highestElement = data[rowCheck][col];
				break;
			} else {
				rowCheck++;
			}
		}
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				if (highestElement < data[row][col]) {
					highestElement = data[row][col];
					highest = row;
				}
			}
		}
		
		return highest;
	}
	
	// Returns the largest element of the selected row in the two dimensional array index 0 refers to the first row
	public static double getHighestInRow(double[][] data, int row) {
		int colCheck = 0;
		double highest = data[0][0];
		
		while (colCheck < data.length) {
			if (colCheck < data[row].length) {
				highest = data[row][colCheck];
				break;
			} else {
				colCheck++;
			}
		}
		for (int col = 0; col < data[row].length; col++) {
			if (highest < data[row][col]) {
				highest = data[row][col];
			}
		}
		
		return highest;
	}
	
	// Returns the index of the largest element of the selected row in the two dimensional array index 0 refers to the first row
	public static double getHighestInRowIndex(double[][] data, int row) {
		int highest = 0;
		int colCheck = 0;
		double highestElement = data[0][0];
		
		while (colCheck < data.length) {
			if (colCheck < data[row].length) {
				highestElement = data[row][colCheck];
				break;
			} else {
				colCheck++;
			}
		}
		for (int col = 0; col < data[row].length; col++) {
			if (col < data[row].length) {
				if (highestElement < data[row][col]) {
					highestElement = data[row][col];
					highest = col;
				}
			}
		}
		
		return highest;
	}
	
	// Returns the smallest element in the two dimensional array
	public static double getLowestInArray(double[][] data) {
		double lowest = data[0][0];
		
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (lowest > data[row][col]) {
					lowest = data[row][col];
				}
			}
		}
		
		return lowest;
	}
	
	// Returns the smallest element of the selected column in the two dimensional array index 0 refers to the first column
	public static double getLowestInColumn(double[][] data, int col) {
		int rowCheck = 0;
		double lowest = data[0][0];
		
		while (rowCheck < data.length) {
			if (col < data[rowCheck].length) {
				lowest = data[rowCheck][col];
				break;
			} else {
				rowCheck++;
			}
		}
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				if (lowest > data[row][col]) {
					lowest = data[row][col];
				}
			}
		}
		
		return lowest;
	}
	
	// Returns the index of the smallest element of the selected column in the two dimensional array index 0 refers to the first column
	public static double getLowestInColumnIndex(double[][] data, int col) {
		int lowest = 0;
		int rowCheck = 0;
		double lowestElement = data[0][0];
		
		while (rowCheck < data.length) {
			if (col < data[rowCheck].length) {
				lowestElement = data[rowCheck][col];
				break;
			} else {
				rowCheck++;
			}
		}
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				if (lowestElement > data[row][col]) {
					lowestElement = data[row][col];
					lowest = row;
				}
			}
		}
		
		return lowest;
	}
	
	// Returns the smallest element of the selected row in the two dimensional array index 0 refers to the first row
	public static double getLowestInRow(double[][] data, int row) {
		int colCheck = 0;
		double lowest = data[0][0];
		
		while (colCheck < data.length) {
			if (colCheck < data[row].length) {
				lowest = data[row][colCheck];
				break;
			} else {
				colCheck++;
			}
		}
		for (int col = 0; col < data[row].length; col++) {
			if (lowest > data[row][col]) {
				lowest = data[row][col];
			}
		}
		
		return lowest;
	}
	
	// Returns the index of the smallest element of the selected row in the two dimensional array index 0 refers to the first row
	public static double getLowestInRowIndex(double[][] data, int row) {
		int lowest = 0;
		int colCheck = 0;
		double lowestElement = data[0][0];
		
		while (colCheck < data.length) {
			if (colCheck < data[row].length) {
				lowestElement = data[row][colCheck];
				break;
			} else {
				colCheck++;
			}
		}
		for (int col = 0; col < data[row].length; col++) {
			if (col < data[row].length) {
				if (lowestElement > data[row][col]) {
					lowestElement = data[row][col];
					lowest = col;
				}
			}
		}
		
		return lowest;
	}
	
	// Returns the total of the selected row in the two dimensional array index 0 refers to the first row
	public static double getRowTotal(double[][] data, int row) {
		double total = 0;
		
		for (int col = 0; col < data[row].length; col++) {
			total += data[row][col];
		}
		
		return total;
	}
	
	// Returns the total of every element in the two dimensional array index 0 refers to the first column or row
	public static double getTotal(double[][] data) {
		double total = 0;
		
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				total += data[row][col];
			}
		}
		
		return total;
	}
	
	// Reads from a file and returns a ragged array of doubles
	public static double[][] readFile(java.io.File file) throws FileNotFoundException {
		String[][] input = new String[10][10];
		Scanner sc = new Scanner(file);
		int row = 0, col = 0;
		
		while (sc.hasNextLine()) {
			String[] currentRow = sc.nextLine().split(" ");
			for (col = 0; col < currentRow.length; col++) {
				input[row][col] = currentRow[col];
			}
			row++;
		}
		sc.close();
		
		double[][] sales = new double[row][];
		
		for (row = 0; row < sales.length; row++) {
			for (col = 0; input[row][col] != null; col++) { }
			sales[row] = new double[col];
			for (col = 0; col < sales[row].length; col++) {
				sales[row][col] = Double.parseDouble(input[row][col]);
			}
		}
		
		return sales;
	}
	
	// Writes the ragged array of doubles into the file
	public static void writeToFile(double[][] data, java.io.File outputFile) throws FileNotFoundException {
		PrintWriter file = new PrintWriter(outputFile);
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				file.print((col != 0) ? " " + data[row][col] : data[row][col]);
			}
			file.println();
		}
		file.close();
	}
}