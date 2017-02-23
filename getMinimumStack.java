public class getMinimumStack {
	
	protected int cap;
	protected int [] arr;
	protected int [] minarr;
	protected int [] maxarr;
	protected int top=-1;
	protected int mintop=-1;
	protected int maxtop=-1;
	
	
	public int getsize(){
		return top;
	}
	
	public getMinimumStack(int n){
		arr = new int[n];
		minarr = new int[n];
	}
	
	public void push(int data){
		int mindata,maxdata;
	//	mindata=Integer.MAX_VALUE;
	//	maxdata=Integer.MIN_VALUE;
		arr[++top]=data;
		//push into a stack and pop the value of other stacks to see which one is lesser or greater
		if(!isMinStackEmpty()){
			
			 mindata=popMinarray();
			 if(mindata>=data){
				 pushMinarray(data);
			 }
			 else{
				 pushMinarray(mindata);
			 }
			
		}
		else{
			
			pushMinarray(data);
		}
	}
	
	public int pop(){
		int data=arr[top];
		arr[top--]=Integer.MIN_VALUE;
		if(data==minarr[mintop]){
			popMinarray();
		}
		
		return data;
	}

	private void pushMinarray(int data) {
		
		minarr[++mintop]=data;	 
	}

	private int popMinarray() {

		int data =minarr[mintop];
		minarr[mintop--]=Integer.MIN_VALUE;
		return data;
	}

	public boolean isMinStackEmpty(){
		if(mintop==-1)
		return true;
		return false;
		
		
	}
	public void dispalyMinarray(){
		
		for(int i: minarr){
			System.out.println(i);
		}
		
	}
	
	
	

}
