class Sorted{
	public static void main(String[] args){
		int [] arr = {4,1,5,2};
		int count = 0;
		for(int i=0 ; i<arr.length-1 ; i++){
			if(arr[i]<arr[i+1]){
				count ++;
			}
		}
		if(count != arr.length-1){
			System.out.println(" not Sorted");
		}
		else{
			System.out.println("sorted");
		}
	}
}			