package oo.day06;
//ũ��ATM��ϵͳ
public class UnionPayTest {
	public static void main(String[] args) {
		ABCATM atm = new ABCATM(); //atm������
		UnionPay card = new ABCImpl(); //������
		atm.insertCard(card); //�忨
		atm.payTelBill(); //֧���绰��
 	}
}
class ABCATM{ //ũ��ATM��
	private UnionPay card; //������
	public void insertCard(UnionPay card){ //�忨
		this.card = card;
	}
	//��ʾ���showBalance()
	//ȡ��takeMoney()
	//�˵�allMenu()
	public void payTelBill(){ //֧���绰�Ѱ�ť
		if(card instanceof ABCImpl){ //��ũ�п�
			ABCImpl abcCard = (ABCImpl)card; //ǿתΪũ�п�
			abcCard.payTelBill("12345679845", 500); 
		}else{ //����ũ�п�
			System.out.println("����ũ�п�������֧���绰��");
		}
	}
}












interface UnionPay{ //�����ӿ�
	public double getBalance(); //��ȡ���
	public boolean drawMoney(double number); //ȡ��
	public boolean checkPwd(String input); //�������
}
interface ICBC extends UnionPay{ //���нӿ�
	public void payOnline(double number); //����֧��
}
interface ABC extends UnionPay{ //ũ�нӿ�
	public boolean payTelBill(String phoneNum,double sum); //֧���绰��
}
class ICBCImpl implements ICBC{ //���п�
	public double getBalance(){return 0.0;}
	public boolean drawMoney(double number){return true;}
	public boolean checkPwd(String input){return true;}
	public void payOnline(double number){}
}
class ABCImpl implements ABC{ //ũ�п�
	public double getBalance(){return 0.0;}
	public boolean drawMoney(double number){return true;}
	public boolean checkPwd(String input){return true;}
	public boolean payTelBill(String phoneNum,double sum){
		System.out.println("֧�����ѳɹ�");
		return true;
	}
}























