package oo.day06;
//��̬����ʾ
public class MultiTypeDemo {
	public static void main(String[] args) {
		Aoo o1 = new Boo(); //��������
		Boo o2 = (Boo)o1; //o1ָ��Ķ������Boo����
		Inter1 o3 = (Inter1)o1; //o1ָ��Ķ���ʵ����Inter1�ӿ�
		//Coo o4 = (Coo)o1; //ClassCastException����ת���쳣
		if(o1 instanceof Coo){ //false
			Coo o5 = (Coo)o1;
		}
	}
}
interface Inter1{
}
class Aoo{
}
class Boo extends Aoo implements Inter1{
}
class Coo extends Aoo{
}
















