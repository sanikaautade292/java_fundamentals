class Add{
	public static void main(String [] args){
		int[] arr = { 10,47,6};
		int sum = 0;
		for(int i=0 ; i<arr.length-1 ; i++){
			if(i == 0){
				sum = arr[i]+ arr[arr.length-1];
				System.out.println(sum);
			}
		}
	}
}