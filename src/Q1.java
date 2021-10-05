import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void Ler(String arq, String s) throws IOException{
        InputStream is = new FileInputStream(arq);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String l = br.readLine();
        while (l!=null){
            if(l.contains(s)){
                System.out.println(l);
            }
            l = br.readLine();

        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o nome do arquivo?");
        String arq = scan.nextLine();

        System.out.println("Qual a substring?");
        String s = scan.nextLine();

        Ler(arq, s);
    }
}