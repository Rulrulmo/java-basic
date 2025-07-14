package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.MethodA();
        a.MethodCommon();

        InterfaceB b = new Child();
        b.MethodB();
        b.MethodCommon();
    }
}
