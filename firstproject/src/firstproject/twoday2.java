package firstproject;
import java.util.Scanner;
public class twoday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//int i = a.nextInt();
		//int j = a.nextInt();
		
		//System.out.println("����� �Է��� ���� 10�� ���ϸ� "+(i+10)+"�Դϴ�.");
		//System.out.println("����� �Է��� ���� "+j+"�Դϴ�");
		//ó�� �Է¹��� ���� �ι�° �Է¹��� ���� �հ� ����� ����Ͻÿ�
		//int add = i+j;
		//int average = (i+j)/2;
		//System.out.println(add);
		//System.out.println(average);
		
		
		//�ﰢ���� ���̸� �ڵ����� ������ִ� ���α׷� �����
		//int x =  input.nextInt();
		//int y =  input.nextInt();
		//int area = (x*y)/2;
		
		//System.out.println("�ﰢ���� ���̴�"+area+"�Դϴ�");
		
		//���ڿ� �Է� ����
		//String name = input.next();
		//int age = input.nextInt();
		//System.out.println(name+"�� ���̴�"+age+"�Դϴ�.");
		//System.out.println("����� �̸��� �Է����ּ���"); String name = input.next();
		//System.out.println("����� ������ �Է����ּ���"); String age = input.next();
		//System.out.println("����� �̸����� �Է����ּ���"); String email = input.next();
		//System.out.println("����� �̸���"+name+"�̰� ����� ���̴� "+age+"�� �̸�, ����� �̸�����"+email+"�Դϴ�.");
		
	// ��ǰ�� �Ǹ������� ���� ���� ���� 
	// �Һ��� �ǸŰ���(100000��) - (��ǰ ����(50000��)+��ۺ�(3500��)+������(10000��+����(1000��)
		
		//int a = input.nextInt();
		//int b = 50000;
		//int c = 3500;
		//int d = 10000;
		//int e = 1000;
		//int don = a-(b+c+d+e);
		//System.out.println("��ǰ�� �Ǹ������� ���� ������"+don+"�Դϴ�.");
		
		// ��ǰ�� �Ǹ������� ���� ���� ���� 
		// �Һ��� �ǸŰ���(100000��) - (��ǰ ����(50000��)+��ۺ�(3500��)+������(10000��+����(1000��)
		
		System.out.println("��� �Һ��ڰ��� �Է����ּ���"); int totalprice = input.nextInt();
		int productprice = 50000;
		int delivery = 3500;
		int ssr = 10000;
		int tex = 1000;
		int margin = totalprice - (productprice+delivery+ssr+tex);
		System.out.println("���� ���� ������" +margin+"�Դϴ�");
		
		
		
			}
}
