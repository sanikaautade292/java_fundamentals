class Mid{
	public static void main(String[] args){
		int [] arr = {10,20,30,40,50};
		if(arr.length % 2 != 0){
			int mid1 = arr.length / 2;
			System.out.println("mid = "+arr[mid1]);
		}
		else{
			int mid2 = arr.length / 2;
			System.out.println(" mid = "+arr[mid2 - 1]);
			System.out.println(arr[mid2]);
		}
	}
}
			