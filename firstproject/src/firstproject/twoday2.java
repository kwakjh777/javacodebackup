package firstproject;
import java.util.Scanner;
public class twoday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//int i = a.nextInt();
		//int j = a.nextInt();
		
		//System.out.println("당신의 입력한 값의 10을 더하면 "+(i+10)+"입니다.");
		//System.out.println("당신의 입력한 값은 "+j+"입니다");
		//처음 입력받은 값과 두번째 입력받은 값의 합과 평균을 출력하시오
		//int add = i+j;
		//int average = (i+j)/2;
		//System.out.println(add);
		//System.out.println(average);
		
		
		//삼각형의 넓이를 자동으로 계산해주는 프로그램 만들기
		//int x =  input.nextInt();
		//int y =  input.nextInt();
		//int area = (x*y)/2;
		
		//System.out.println("삼각형의 넓이는"+area+"입니다");
		
		//문자열 입력 예제
		//String name = input.next();
		//int age = input.nextInt();
		//System.out.println(name+"의 나이는"+age+"입니다.");
		//System.out.println("당신의 이름을 입력해주세요"); String name = input.next();
		//System.out.println("당신의 나이을 입력해주세요"); String age = input.next();
		//System.out.println("당신의 이메일을 입력해주세요"); String email = input.next();
		//System.out.println("당신의 이름은"+name+"이고 당신의 나이는 "+age+"살 이며, 당신의 이메일은"+email+"입니다.");
		
	// 상품을 판매했을때 순수 마진 계산기 
	// 소비자 판매가격(100000원) - (물품 원가(50000원)+배송비(3500원)+수수료(10000원+세금(1000원)
		
		//int a = input.nextInt();
		//int b = 50000;
		//int c = 3500;
		//int d = 10000;
		//int e = 1000;
		//int don = a-(b+c+d+e);
		//System.out.println("상품을 판매했을때 순수 원가는"+don+"입니다.");
		
		// 상품을 판매했을때 순수 마진 계산기 
		// 소비자 판매가격(100000원) - (물품 원가(50000원)+배송비(3500원)+수수료(10000원+세금(1000원)
		
		System.out.println("희망 소비자가를 입력해주세요"); int totalprice = input.nextInt();
		int productprice = 50000;
		int delivery = 3500;
		int ssr = 10000;
		int tex = 1000;
		int margin = totalprice - (productprice+delivery+ssr+tex);
		System.out.println("예상 순수 마진은" +margin+"입니다");
		
		
		
			}
}
