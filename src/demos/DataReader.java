package demos;

import java.util.List;

public class DataReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		readCSV();
	}

	public static void readCSV() {
		String filename = "C:\\Users\\483226\\Desktop\\file1.csv";
		List <String[]> records = utilities.CSVRead.get(filename);
		
		for (String[] record : records) {
			for (String field :record) {
				System.out.println(field);
			}
		}
	}
}
