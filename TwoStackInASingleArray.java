//CDAC Module Exam 3 - ADS
//Question 3 --> Two stacks in a single array

class Stacks{
	int arr[];
	int size;
	int T1;
	int T2;
	
	Stacks(int size){
		this.size = size;
		arr = new int[size];
		T1 = size/2+1;
		T2 = size/2;
	}
	
	void Push1(int a){
		if(T1 > 0){
			T1--;
			arr[T1] = a;
		}
		else{
			System.out.println("Stack is Overflow");
		    return;
		}
	}
	
	void Push2(int a){
		if(T2 < size-1){
			T2++;
			arr[T2] = a;
		}
		else{
			System.out.println("Stack is Overflow");
		return;
		}
	}
	
	int Pop1(){
		if(T1 <= size/2){
			int a = arr[T1];
			T1++;
			return a;
		}
		else{
			System.out.println("Stack Underflow");
		   System.exit(1);
		}
		return 0;
	}
	
	int Pop2(){
		if(T2 >= size/2+1){
			int a = arr[T2];
			T2--;
			return a;
		}
		else{
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return 1;
	}	
}

class TwoStackInASingleArray{
	
	public static void main(String args[]){
		
		Stacks S = new Stacks(10);
		
		S.Push1(5);
		S.Push2(10);
		S.Push2(15);
		S.Push1(11);
		S.Push2(7);
		S.Push2(40);
		
		System.out.println("Popped element from Stack1 is "+S.Pop1());
		System.out.println("Popped element from Stack2 is "+S.Pop2());
	}
}