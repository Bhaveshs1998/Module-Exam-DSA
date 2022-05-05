//CDAC Module Exam 3 - ADS
//Question 1 --> Sorting 
class Sorting{
	
	void Sort(int arr[]){
		int n = arr.length;
		for(int i = 0; i < n; ++i){
			int key = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j = j - 1;
			}
		}
	}
	
	static void DisplayArray(int arr[]){
		int n = arr.length;
		for(int i = 0; i < n; ++i)
			System.out.print(arr[i]+" ");
		
		System.out.println();
	}
	
	public static void main(String args[]){
		
		int arr[] = {2,4,6,8,3};
		
		Sorting S = new Sorting();
		S.Sort(arr);
		
		DisplayArray(arr);
		
	}
}
