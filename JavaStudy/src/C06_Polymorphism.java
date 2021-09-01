
import java.util.Scanner;

public class C06_Polymorphism {

        /*
                  # 객체의 다형성                   
                   - 객체는 다향한 형태를 지닐 수 있다 
                   - 사과는 사과이기도 하고 과일이기도 하다
                   - 과일은 과일이지만 사과는 아니다 
          
                  # 자식 클래스는 부모 클래스가 될 수 있다(업캐스팅)
                   - 자식 클래스 타입이 부모 클래스 타입이 되는 것을 업캐스팅이라고 한다
                   - 업캐스팅된 객체는 자식 클래스에만 존재하던 메서드들을 모두 잊어버린다
                   - 오버라이드된 메서드는 자식클래스의 메서드를 그대로 유지된다
                   
                  # 부모 클래스는 자식 클래스가 될 수 없다(다운캐스팅)
                   - 하지만 업캐스팅 되었던 인스턴스는 다시 원래타입으로의 다운캐스팅이 가능하다
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
                
                
                new Car(new Tire()); //Tire는 car안에 상속받은 클래스기 때문에 가능
                new Car(new TireVer1()); //Tire을 상속받은 클래스이기 때문에 가능
                new Car(new TireVer2());
                
                Police p1 = new Police();
                p1.sayHi();
                p1.arrest("김강도");
                
                //Person으로 업캐스팅 된 police는 체포를 할 수 없다
                Person person = p1;    
                Person person2 = new Person("전우치", 24, 30);
//              person.arrest();
                person.sayHi(); //업캐스팅 되어도 오버라이드는 그대로 유지된다            
                ((Police)person).arrest("김소매");  //원래 police였기 때문에 police로 다운캐스팅이 가능
              //((Police)person2).arrest("김도적"); //원래부터person이였기때문에 police로 다운캐스팅불가
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

// 제일 높은 부모 클래스 (주재료, 부재료, 소스)
class MainMaterial {}
class SubMaterial {}
class Sauce {}

// 주재료를 상속받은 클래스들 
class Fish extends MainMaterial {}
class Meat extends MainMaterial {}

// 주재료를 상속받은 클래스를 상속받은 클래스
class PigMeat extends Meat {}
class Tuna extends Fish {}

// 부재료를 상속받은 클래스들
class Vege extends SubMaterial {}
class Fruit extends SubMaterial {}

// 소스를 상속받은 클래스들
class Salsa extends Sauce {}
class Balsamic extends Sauce {}

















