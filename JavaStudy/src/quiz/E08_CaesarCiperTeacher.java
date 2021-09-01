package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class E08_CaesarCiperTeacher {

        /*
                 # ��ȣȭ
                 
                   - ���� �˾ƺ� �� ���� ����(��ȣ��)�� ��ȯ�ϴ� ��
                   - ���� �������� ������ ���� ���İ����� �˾ƺ� �� ���� �ϴ� ���� �����̴�                 
                 
                 # ��ȣȭ
                                  
                   - ��ȣȭ �� ��ȣ���� �ٽ� ������ �ǵ����� ��
                   
                 # Ű
                 
                   - ��ȣȭ �Ǵ� ��ȣȭ�� ���Ǵ� ��
                 
                 
                 # ���� ��ȣ
                         
                         "Hello, world!" ---- key:5 ----> "Mjqqt, btwqi!"                  
                 
                         ABCDEFGHIJKLMNOPQRSTUVWXYZ
                         
                         ��ȣȭ: key��ŭ ���������� ���ڸ� �̵� ��Ŵ
                         ��ȣȭ: key��ŭ �������� ���ڸ� �̵� ��Ŵ
                         
                 # "frankenstein.txt"�� ��ü ������ 1 ~ 25 ������ ���� Ű�� ��ȣȭ��  
                   "frankenstein.encrypted.txt"�� �����غ�����                  
                   (��, ���ĺ��� ��ȣȭ �� ��)                 
        */
        final static String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final static String LOWER = "abcdefghijklmnopqrstuvwxyz";

        public static char encrypt_upper(char ch, int key) {
                return UPPER.charAt((UPPER.indexOf(ch) + key) % UPPER.length());
        }
        
        public static char encrypt_lower(char ch, int key) {
                return LOWER.charAt((LOWER.indexOf(ch) + key) % LOWER.length());
        }
        
        public static char decrypt_upper(char ch, int key) {
            return UPPER.charAt((UPPER.indexOf(ch) + (26 - key)) % UPPER.length());
        }
        
        public static char decrypt_lower(char ch, int key) {
            return LOWER.charAt((LOWER.indexOf(ch) + (26 - key)) % LOWER.length());
        }
        
        public static void main(String[] args) {
                File frankenstein = new File("./data/text/frankenstein.txt");
                File frankenstein_encrypted = new File("./data/text/frakenstein2.encrypted.txt");
                int key = new Random().nextInt(25) + 1;
                
                try (
                        FileReader fin = new FileReader(frankenstein);
                        BufferedReader bin = new BufferedReader(fin);
                        FileWriter fout = new FileWriter(frankenstein_encrypted);
                        BufferedWriter bout = new BufferedWriter(fout);
                ) {
                        String line = null;                        
                        while ((line = bin.readLine()) != null) {                                
                                for (int i = 0, len = line.length(); i < len; ++i) {
                                        
                                        char ch = line.charAt(i);

                                        // System.out.printf("Is '%c' Alphabetic? %b\n", ch, Character.isAlphabetic(ch));
                                        
                                        switch (Character.getType(ch)) {
                                        case Character.UPPERCASE_LETTER:                                        
                                                ch = encrypt_upper(ch, key);
                                                break;
                                        case Character.LOWERCASE_LETTER:
                                                ch = encrypt_lower(ch, key);
                                                break;
                                        }

                                        fout.append(ch);                                        
                                }                
                                fout.append('\n');
                        }                        
                } catch (FileNotFoundException e) {                        
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                }
                
                // ��ȣȭ�� ������ �ص��ϴ� decryption(file, key) �޼��带 ��������
               
                decryption(frankenstein_encrypted, key);
        }
        static void decryption(File file, int key) {
            File frankenstein_decrypted = new File("./data/text/frakensteinDecrypt.encrypted.txt");
            try (
                    FileReader fin = new FileReader(file);
                    BufferedReader bin = new BufferedReader(fin);
                    FileWriter fout = new FileWriter(frankenstein_decrypted);
                    BufferedWriter bout = new BufferedWriter(fout);
            ) {
                    String line = null;                        
                    while ((line = bin.readLine()) != null) {                                
                            for (int i = 0, len = line.length(); i < len; ++i) {
                                    
                                    char ch = line.charAt(i);

                                    // System.out.printf("Is '%c' Alphabetic? %b\n", ch, Character.isAlphabetic(ch));
                                    
                                    switch (Character.getType(ch)) {
                                    case Character.UPPERCASE_LETTER:                                        
                                            ch = decrypt_upper(ch, key);
                                            break;
                                    case Character.LOWERCASE_LETTER:
                                            ch = decrypt_lower(ch, key);
                                            break;
                                    }

                                    fout.append(ch);                                        
                            }                
                            fout.append('\n');
                    }                        
            } catch (FileNotFoundException e) {                        
                    e.printStackTrace();
            } catch (IOException e) {
                    e.printStackTrace();
            }
        }
}
























