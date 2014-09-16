import java.util.Scanner;

/**
 * @ClassName: SystemTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 宇
 * @date 2014年8月15日 下午3:53:03
 *
 */
public class SystemTest {
/**
 * 
 * @Title: main
 * @Description: TODO(这里用一句话描述这个方法的作用)
 * @author 宇
 * @param args
 * @return void
 * @throws
 * @date 2014年8月15日 下午3:52:50
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("输入一个东西吧！");
		String input = in.next();
		System.out.println("你输入的是：" + input);
		in.close();
		SystemTest st = new SystemTest();
		st.testDoWhile();
		boolean t = true;
		System.out.println((t?"yes":"no"));
	}
	
	public void testDoWhile(){
		int i = 1;
		do{
			System.out.println("输出：" + i);
			i++;
		}while(i < 9);
		
	}

}
