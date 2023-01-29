package programming.test;

public class sequence {

	public static void main(String[] args) {
		 int answer = 0;
//		 int[] common1 = {4,3,2};
		 int[] common1 = {2,4,8};
		 int finish =0;
		 String how=null;
		 int what=0;
		 for(int i=1;i<common1.length-1;i++) {
			 if(common1[i]-common1[i-1]==common1[i+1]-common1[i]) {
				 what = common1[i+1]-common1[i];
				 how="등차";
			 }else {
				 what = common1[i+1]/common1[i];
				 how="등비";
			 }
			 finish = common1[i+1];
		 }
		 System.out.println(finish);
		 System.out.println(what);
		 System.out.println(how);
		 
		 if(how.equals("등차")) {
			 answer = finish+what;
		 }else{
			 answer = finish*what;
		 }
		 System.out.println("answer : "+answer);
	}
	

}
