package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Caw caw = new Caw();
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");

    }
}
