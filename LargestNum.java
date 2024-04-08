
public class LargestNum {

	public static void main(String[] args) {

		int arr[] = {23,43,52,99,2};
		int largest = arr[0];
		int secondLarge = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					arr[i] = arr[j];
					arr[j] = largest;
					largest = arr[i];
				}
			}
		}
		System.out.println("Largest Num: "+largest);


		

//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr.length; j++) {
//				if(arr[i] < arr[j]) {
//					arr[i] = arr[j];
//					arr[j] = largest;
//					largest = arr[i];
//				}
//			}
		}
	}


