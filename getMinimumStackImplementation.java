
public class getMinimumStackImplementation {

	/**
	 * @param args
	 */
	//This is a comment just to see stacking
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getMinimumStack st= new getMinimumStack(5);
		st.push(5);
		st.push(4);
		st.push(-1);
		st.push(3);
		st.push(2);
		st.pop();
		st.push(1);
		st.dispalyMinarray();

	}

}
