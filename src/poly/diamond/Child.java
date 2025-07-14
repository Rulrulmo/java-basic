package poly.diamond;

public class Child implements InterfaceA, InterfaceB {
    @Override
    public void MethodA() {
        System.out.println("Child MethodA");
    }

    @Override
    public void MethodB() {
        System.out.println("Child MethodB");
    }

    @Override
    public void MethodCommon() {
        System.out.println("Child MethodCommon");
    }
}
