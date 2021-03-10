package shiyan2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class q0 {
static ArrayList<province> sy = new ArrayList<province>();
	
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("D:\\yq_in.txt")); //���ļ�
            System.setOut(new PrintStream(new BufferedOutputStream(
    				new FileOutputStream("D:\\out.txt")),true));
 
            while (in.hasNextLine()) {
                String str = in.nextLine();
                String[] strArr = str.split("	");//�ָ��
                sy.add(new province(strArr));
            }
            in.close();
        } catch (FileNotFoundException e) {  //try catch
            e.printStackTrace();
        }
        int len = sy.size(); //������ݵĳ���
        province temp = sy.get(0), last = sy.get(0); //��һ��
        System.out.println(temp.getPro() + "\n" + temp.city + " " + temp.id);
        for(int i = 1; i < len; i++) {
        	temp = sy.get(i);//ʡ��һ��������кͱ��
        	if(temp.getPro().equals(last.getPro())) {
        		System.out.println(temp.city + " " + temp.id);
        	}
        	else { //���ȫ��
        		System.out.println("\n" + temp.getPro() + "\n" + temp.city + " " + temp.id);
        	}
        	last = temp;
        }
    }
}
