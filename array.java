package java_classes;

public class array {
	
	public static void main(String args[]){
	 array array = new array();
	 System.out.println(array.close(1, 2));
	}
	
		public boolean closeFar(int a, int b, int c) {
			  
			  if(Math.abs(a-b)<= 1 && Math.abs(b-c)>=2 && Math.abs(c-a)>=2){
			    return true;

			  }else if(Math.abs(a-b)>= 2 && Math.abs(b-c)>=2 && Math.abs(c-a)<=1){
			    return true;
			  }return false;
			}
		public int close(int a, int b){
			if(Math.abs(a-b)==1){
				return a;

			}return b;
		}
}