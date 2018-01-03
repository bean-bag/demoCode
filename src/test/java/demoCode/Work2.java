package demoCode;
/**
 * 
 * @authors ${Chen Yang}
 * @date    2017-12-28 09:39:51
 * @version $Id$
 */
import java.util.Scanner;
public class Work2{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入宽度");
	    int a = scan.nextInt();
        int b = scan.nextInt();
        for (int i=0;i<a ;i++ ) {
        	for (int j=0;j<b ;j++ ) {
        	  if ((i+1)%2!=0){
        		if((j+1)%2!=0){
        			System.out.print("*");
        		}else{
        			System.out.print("+");
        		}
        	}
        		if ((i+1)%2==0){
        			if((j+1)%2==0) {
        			System.out.print("*");
        		}else{
        			System.out.print("+");
        		}
        	}
        	}System.out.println();
        }
	}
}
