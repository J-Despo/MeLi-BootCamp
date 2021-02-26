import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class RadixSortEjerc
{
	public static void main(String[] args) {
		//StringUtil.testStringUtils();
		int[] a = { 123,453,55409,765860,765861,2,80,4,1234,54 };
		radixSort(a);
		for( int i : a )
		{
			System.out.println(i);
		}
	}

	public static void radixSort(int []array)
	{
		// Create a new variable to store a string version of the array
		String[] sArray = StringUtil.toStringArray(array);
		// Normalize all string sizes
		StringUtil.lNormalize(sArray,'0');
		// Get the longest number digits
		int max = StringUtil.maxLength(sArray);
		for( int j = max - 1; j >= 0; j-- )
		{
			// Create a structure to process the algorithm
			HashMap<Character,ArrayList<String>> struct = new HashMap<>();
			for(int i = 0; i < 10; i++ )
			{
				struct.put(String.valueOf(i).charAt(0), new ArrayList<>());
			}
			// Load the structure
			for( int i = 0; i < array.length; i++ )
			{
				struct.get(sArray[i].charAt(j)).add(sArray[i]);
			}
			// Clean the sArray to store new semi-ordered values
			sArray = new String[sArray.length];
			int index = 0;
			// Load the array with semi-ordered values
			for( int i = 0; i < 10; i++ )
			{
				ArrayList<String> tmp = struct.get(String.valueOf(i).charAt(0));
				for( String a : tmp )
				{
					sArray[index] = a;
					index++;
				}
			}
		}
		// Once finished, store ordered array in the original pointer.
		for(int i = 0; i < array.length; i++)
		{
			array[i] = StringUtil.toIntArray(sArray)[i];
		}
	}


}
