import java.util.Scanner;

/**
 * @ClassName: SystemTest
 * @Description: TODO(������һ�仰��������������)
 * @author ��
 * @date 2014��8��15�� ����3:53:03
 *
 */
public class SystemTest {
/**
 * 
 * @Title: main
 * @Description: TODO(������һ�仰�����������������)
 * @author ��
 * @param args
 * @return void
 * @throws
 * @date 2014��8��15�� ����3:52:50
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("����һ�������ɣ�");
		String input = in.next();
		System.out.println("��������ǣ�" + input);
		in.close();
		SystemTest st = new SystemTest();
		st.testDoWhile();
		boolean t = true;
		System.out.println((t?"yes":"no"));
	}
	
	public void testDoWhile(){
		int i = 1;
		do{
			System.out.println("�����" + i);
			i++;
		}while(i < 9);
		
	}

}
