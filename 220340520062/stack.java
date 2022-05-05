class stack{
    int size;
	int top1,top2;
	int arr[];
	stack(int n){
	 arr=new int[n];
	 size=n;
	 top1=-1;
	 top2=size;
	}
    public void push1(int x){
	  if(top1<top2-1){
	  top1++;
	  arr[top1]=x;
	  }
	  else{
	     System.out.println("stack overflow");
		 System.exit(1);
	  }
	}
	public void push2(int x){
	    if(top1<top2-1){
		   top2--;
		   arr[top2]=x;
		}
		else{
		   System.out.println("stack is overflow");
		   System.exit(1);
		   
		}
	
	}
	
	int pop1(){
	  if(top1>=0){
	    int x=arr[top1];
		top1--;
		return x;
	  }
	  else{
	      System.out.println("stack is underflow");
		  System.exit(1);
	  }
	  return 0;
	  
	}
	
	int pop2(){
	  if(top2>=0){
	     int x=arr[top2];
		 top2++;
		 return x;
	  }
	  else{
	  System.out.println("stack is underflow");
		  System.exit(1);
	  }
	  return 0;
	}
	
	public static void main(String... args){

      stack s=new stack(10);
	  s.push1(5);
	  s.push2(10);
	  s.push2(15);
	  s.push1(11);
	  s.push2(7);
	  s.push2(40);
	  System.out.print("Popped element from stack1 is   "+s.pop1());
	  System.out.println("");
	  System.out.print("Popped element from stack2 is  "+s.pop2());
	}
	
	

}