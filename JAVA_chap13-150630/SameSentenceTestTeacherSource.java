package chap15;

import java.util.ArrayList;
import java.util.List;

class SameSentence{
	String[] compare(List<String> list1, List<String> list2){
		int size1 = list1.size();
		int size2 = list2.size();
		
		if(size1 > size2) {
			List<String> list3 = list1;
			list1 = list2;
			list2 = list3;
		}
		//===== list1 ���� ������
		
		String[] result = new String[10];
		//lisrt1, list2 �Ű����� ���� ���ڿ� ������ index�� ���Ͽ�
        //���� ������ ������ ��� index�� ���ڿ��� result �迭 ����
        //�����Ͻÿ�.
        //ArrayList �� ���� ���ڿ� -->String[] ��ȯ

		
		List<String> equallist = 
				new ArrayList<String>();
		
		for(int i = 0; i <list1.size(); i++) {
			if(list1.get(i).equals(list2.get(i))) {
				equallist.add(list1.get(i));
			}
		}
		
		result = new String[equallist.size()];//�迭���� ������
		equallist.toArray(result);// List -> �迭 ���� 
		
		//result ���� ���
		//for(String s : result) {
		//	System.out.println(s);
		//}
		return result;
	}
//	String[] compare(List<String> list1, List<String> list2){
//		int size1 = list1.size();
//		int size2 = list2.size();
//		
//		if(size1 > size2) {
//			List<String> list3 = list1;
//			list1 = list2;
//			list2 = list3;
//		}
//		//===== list1 ���� ������
//		
//		String[] result = new String[10];
//		//lisrt1, list2 �Ű����� ���� ���ڿ� ������ index�� ���Ͽ�
//        //���� ������ ������ ��� index�� ���ڿ��� result �迭 ����
//        //�����Ͻÿ�.
//        //ArrayList �� ���� ���ڿ� -->String[] ��ȯ
//
//		//�ΰ� ����Ʈ ���ؼ� ���� ���ڿ� ���� ����
//		int cnt = 0;
//		for(int i = 0; i <list1.size(); i++) {
//			if(list1.get(i).equals(list2.get(i))) {
//				cnt++;
//			}
//		}
//		
//		//result �迭 ũ�� ����
//		result = new String[cnt];
//		
//		//result �迭 ���� ���ڿ� ����
//		int index = 0;
//		for(int i = 0; i <list1.size(); i++) {
//			if(list1.get(i).equals(list2.get(i))) {
//				result[index++] = list1.get(i);
//			}
//		}
//		
//		//result ���� ���
//		//for(String s : result) {
//		//	System.out.println(s);
//		//}
//		return result;
//	}
}
public class SameSentenceTest{
public static void main(String[] args) {
	ArrayList<String> list1 = new ArrayList<String>();
	list1.add("�ڹٴ� ��ü���� ����Դϴ�");
	list1.add("�츮�� ŰƮ������ �ڹٸ� ���� ���Դϴ�");
	list1.add("������ �÷��� �����ӿ�ũ�� �����! ");
	list1.add("������ ����°� ��Ʈ��ũ�� ��� �����Դϴ� ");
	
	ArrayList<String> list2 = new ArrayList<String>();
	list2.add("�ڹٴ� ��ü���� ����Դϴ�");
	list2.add("�츮�� kitri���� �ڹٸ� ���� ���Դϴ�");
	list2.add("������ �ݷ��� �����ӿ�ũ�� �����! ");
	list2.add("������ ����°� ��Ʈ��ũ�� ��� �����Դϴ� ");
	
	ArrayList<String> list3 = new ArrayList<String>();
	list3.add("�ڹٴ� ��ü���� ����Դϴ�");
	list3.add("�츮�� kitri���� �ڹٸ� ���� ���Դϴ�");
	list3.add("������ �ݷ��� �����ӿ�ũ�� �����! ");
	
	SameSentence ss = new SameSentence();
	String[] r1 = ss.compare(list1, list2);
	System.out.println("======================");
	for(String s  : r1) {
		System.out.println(s);
	}
//list1, list2(size ����) ���� ���� ���� ����ϵ��� ���� �߰�
//2�� ���ڿ� ���	

	String[] r2 = ss.compare(list1, list3);
	System.out.println("======================");
	for(String s  : r2) {
		System.out.println(s);
	}
//list3(���� size) �� ������ŭ�� ���� ���� ����ϵ��� ���� �߰�	
//1�� ���ڿ� ���
	
}
}
