//What will be the output of following:
package assignment1Programs07072020;

public class Problem13 {

	public static void main(String[] args) {
		int i=2;
		while(makeDecision(i)){
		i=i*i;
		System.out.println(i);
		}
		}
		public static boolean makeDecision(int i)
		{
		if(i%3 != 0){
		return true;
		}else{
		return false;
		}
		}
}
//int code: 32 bits (-2,147,483,648 .. 2,147,483,647)
//long code: 64 bits (-9,223,372,036,854,775,808 .. 9,223,372,036,854,775,807)