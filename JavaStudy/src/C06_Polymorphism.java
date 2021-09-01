
import java.util.Scanner;

public class C06_Polymorphism {

        /*
                  # ��ü�� ������                   
                   - ��ü�� ������ ���¸� ���� �� �ִ� 
                   - ����� ����̱⵵ �ϰ� �����̱⵵ �ϴ�
                   - ������ ���������� ����� �ƴϴ� 
          
                  # �ڽ� Ŭ������ �θ� Ŭ������ �� �� �ִ�(��ĳ����)
                   - �ڽ� Ŭ���� Ÿ���� �θ� Ŭ���� Ÿ���� �Ǵ� ���� ��ĳ�����̶�� �Ѵ�
                   - ��ĳ���õ� ��ü�� �ڽ� Ŭ�������� �����ϴ� �޼������ ��� �ؾ������
                   - �������̵�� �޼���� �ڽ�Ŭ������ �޼��带 �״�� �����ȴ�
                   
                  # �θ� Ŭ������ �ڽ� Ŭ������ �� �� ����(�ٿ�ĳ����)
                   - ������ ��ĳ���� �Ǿ��� �ν��Ͻ��� �ٽ� ����Ÿ�������� �ٿ�ĳ������ �����ϴ�
        */        
        public static void main(String[] args) {
                new Food(new PigMeat(), new Vege(), new Balsamic());
                
                Scanner sc = new Scanner(System.in);
                StringBuilder sb = new StringBuilder();
                String str1 = new String();
                
                MainMaterial main_mat = new MainMaterial();                                
                MainMaterial main_mat2 = new Tuna();
                
                                                
                doSomethingWithMainMaterial(new MainMaterial());
                doSomethingWithMainMaterial(new Meat());
                doSomethingWithMainMaterial(new Fish());
                doSomethingWithMainMaterial(new PigMeat());
                
                
                new Car(new Tire()); //Tire�� car�ȿ� ��ӹ��� Ŭ������ ������ ����
                new Car(new TireVer1()); //Tire�� ��ӹ��� Ŭ�����̱� ������ ����
                new Car(new TireVer2());
                
                Police p1 = new Police();
                p1.sayHi();
                p1.arrest("�谭��");
                
                //Person���� ��ĳ���� �� police�� ü���� �� �� ����
                Person person = p1;    
                Person person2 = new Person("����ġ", 24, 30);
//              person.arrest();
                person.sayHi(); //��ĳ���� �Ǿ �������̵�� �״�� �����ȴ�            
                ((Police)person).arrest("��Ҹ�");  //���� police���� ������ police�� �ٿ�ĳ������ ����
              //((Police)person2).arrest("�赵��"); //��������person�̿��⶧���� police�� �ٿ�ĳ���úҰ�
        }
        
        public static void doSomethingWithMainMaterial(MainMaterial mat) {
                
        }
}

class Car {
        Tire tire;
        
        public Car(Tire tire) {
                this.tire = tire;
        }
}

class Tire {}
class Tire2 {}

class TireVer1 extends Tire {}
class TireVer2 extends Tire {}

class Food {

        MainMaterial mainMat;
        SubMaterial subMat;
        Sauce sauce;
        
        public Food(MainMaterial mainMat, SubMaterial subMat, Sauce sauce) {
                this.mainMat = mainMat;
                this.subMat = subMat;
                this.sauce = sauce;
        }
        
}

class PorkCutlet {
        
        public PorkCutlet(PigMeat pig, SubMaterial subMat, Sauce sauce) {
                
        }
        
}

// ���� ���� �θ� Ŭ���� (�����, �����, �ҽ�)
class MainMaterial {}
class SubMaterial {}
class Sauce {}

// ����Ḧ ��ӹ��� Ŭ������ 
class Fish extends MainMaterial {}
class Meat extends MainMaterial {}

// ����Ḧ ��ӹ��� Ŭ������ ��ӹ��� Ŭ����
class PigMeat extends Meat {}
class Tuna extends Fish {}

// ����Ḧ ��ӹ��� Ŭ������
class Vege extends SubMaterial {}
class Fruit extends SubMaterial {}

// �ҽ��� ��ӹ��� Ŭ������
class Salsa extends Sauce {}
class Balsamic extends Sauce {}

















