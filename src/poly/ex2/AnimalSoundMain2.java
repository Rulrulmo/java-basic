package poly.ex2;

public class AnimalSoundMain2 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    public static void soundAnimal(Animal a) {
        System.out.println("동물 소리 테스트 시작");
        a.sound();
        System.out.println("돔물 소리 테스트 종료");
    }
}
