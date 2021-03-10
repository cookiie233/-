package shiyan2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class q1 {
	public static void main(String[] args) throws IOException {
        File file = new File("D:\\yq_in.txt");
        String[] province = new String[1000];
        String[] city = new String[1000];
        String[] num = new String[1000];
        Scanner cin = new Scanner(file);
        int flag = 0;
        int len;
        for(len = 0; cin.hasNext();len++) { 
            province[len] = cin.next();
            city[len] = cin.next();
            num[len] = cin.next();
            flag++;
        }
        len = province.length;
        for(int i = 0; i < flag; i++) {
            System.out.println(province[i] + "\t" + city[i] + "\t" + num[i]);
        }

        FileOutputStream fp = new FileOutputStream("D:\\out.txt");
        PrintStream fpp = new PrintStream(fp);
        String temp = "0";

        for(int i = 0; i < flag; i++) { //ºÍq0Ò»Ñù
            if (!temp.equals(province[i])) {
            	if (i != 0)	fpp.println();
                fpp.println(province[i] + "\t");
                temp = province[i];
            }
            fpp.println(city[i] + "\t" + num[i]);
            
        }
        fp.close();
        cin.close();
    }
}
