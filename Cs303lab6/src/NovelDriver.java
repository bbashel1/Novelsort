import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class NovelDriver {
	
	public static void main(String[] args) throws IOException{
		FileReader in = new FileReader("NovelSortInput.txt.txt"); 
		BufferedReader a = new BufferedReader(in);
	
		String aString;
		
		List<String> list = new ArrayList<String>();
		while((aString = a.readLine()) != null){
			list.add(aString);
		
			
		}
		in.close();
		String[] finalstring = list.toArray(new String[0]);
		NovelSort.novelSort(finalstring);
		System.out.print(Arrays.toString(finalstring));
		//in.close();
	}

}
