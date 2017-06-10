package com.fannie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class MyThesaurus {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		// String inputWord = "bye";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Your Option a-ShowSynonym b-Add Synonym: ");
		String userOpt = br.readLine();
		System.out.println("User Option is:" + userOpt);

		if (userOpt.equals("a")) {
			System.out.println("Enter the word to find the Synonyms: ");

			String inputWord = br.readLine();
			Properties props = new Properties();
			props.load(new FileReader("C:\\aa\\MyThesaurus.txt"));
			String value = props.getProperty(inputWord);

			if (value != null) {

				System.out.println("Read the value from File: " + value);
				String valSplitted[] = value.split(",");
				int i = 0;
				System.out.println("Splitted values....");
				// create map to store
				Map<String, List<String>> map = new HashMap<String, List<String>>();

				// create list for synonym and store values
				List<String> valSynonym = new ArrayList<String>();

				while (i < valSplitted.length) {
					// System.out.println("Spitted values: "+ valSplitted[0] + "
					// " + valSplitted[1] + " " + valSplitted[2]);
					valSynonym.add(valSplitted[i]);
					System.out.println(valSplitted[i]);
					i++;
				}
				map.put(inputWord, valSynonym);
				// iterate and display values
				System.out.println("Fetching Input Word(Key) and corresponding Synonyms (Values) ");
				for (Map.Entry<String, List<String>> entry : map.entrySet()) {
					String key = entry.getKey();
					List<String> values = entry.getValue();
					System.out.println("Input Word = " + key);
					System.out.println("Synonyms = " + values);
					// System.out.println("First value:" + values.get(0)+" 2nd
					// value:" + values.get(1));
				}

				props.clear();

			} // end of User's Initial Input/Option --if a
			else {
				System.out.println("WORD NOT FOUND");
				System.exit(0);
			}
		} // end of if loop to check whether there's valid word/key in the .txt
			// file "
		else if (userOpt.equals("b")) {
			System.out.println("Add Synonym");
		} else {
			System.out.println("Invalid Opiton");
			System.exit(0);
		}

	}

}