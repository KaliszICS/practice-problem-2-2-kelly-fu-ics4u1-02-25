public class PracticeProblem {

	public static void main(String args[]) {


	}
	//1
	public static int[] compareSearch(int[] array, int number){
		int output[] = {0,0};
		//SequentialSearch
		int count = 0;
		for (int i = 0; i<array.length; i++){
			count++;
			if (array[i]==number){
				
				output[0] = count;
				i = array.length;
			}
			else if (i == array.length-1) {
				output[0] = count;
			}
		}
		//BinarySearch
		int loop = 0;
		int begin = 0;
		int end = array.length - 1;
		
		while (begin<=end){
			loop++;
			int mid = (begin+end)/2;
			if (array[mid]==number){
				output[1] = loop;
				begin = end+1;
			}
			else if (number<array[mid]){
				end = mid - 1;
			}
			else{
				begin = mid + 1;
			}
			if (begin==end){
				output[1] = loop+1;
			}
		}
			return output;
	}
		
	

	//2
	public static int[] compareStringSearch(String[] array, String word){
		int output[]={0,0};
		//SequentialSearch
		int count = 0;
		for (int i = 0; i < array.length; i++){
			count ++;
			if (array[i].equals(word)){
				output[0]=count;
				i = array.length;
			}
			else if (i == array.length -1){
				output[0]=count;
			}
	}
		//BinarySearch
		int loop = 0;
		int begin = 0;
		int end = array.length -1;
		while(begin<=end){
			loop++;
			int mid = (begin+end)/2;

			if (array[mid].equals(word)){
				output[1]=loop;
				begin = end + 1;
			}
			else if((word.compareTo(array[mid]))<0){
				end = mid - 1;
			}
			else{
				begin = mid + 1;
			}

			if(begin==end){
				output[1]=loop+1;
			}
		}
		return output;
}					

	}
