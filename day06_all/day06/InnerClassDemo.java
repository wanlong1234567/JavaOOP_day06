package oo.day06;
//��Ա�ڲ������ʾ
public class InnerClassDemo {
	public static void main(String[] args) {
		Mama m = new Mama();
		//Baby b = new Baby(); //��������ڲ�����ⲻ�߱��ɼ���
	}
}

class Mama{
	private String name;
	Baby createBaby(){
		return new Baby();
	}
	class Baby{
		void show(){
			System.out.println(name);
			System.out.println(Mama.this.name);
			//System.out.println(this.name); //�������
		}
	}
}














