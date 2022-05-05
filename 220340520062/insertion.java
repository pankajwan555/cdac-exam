import java.util.*;
class insertion{

public static void main(String... args){
     int[]arr ={2,4,6,8,3};
	 int length=arr.length;
	    
	 
	System.out.println("array before"+Arrays.toString(arr));
	 for(int i=0;i<length;i++){
	    int key=arr[i];
		int j=i-1;
		while(j>0 && arr[j]>key){
		arr[j+1]=arr[j];
		j--;
		System.out.println("array after"+Arrays.toString(arr));
		}
		arr[j+1]=key;
		
		
		
		
		System.out.println("array after"+Arrays.toString(arr));
	 }
}
 

}


