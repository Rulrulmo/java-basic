package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("data1");
        System.out.println("data1: " + Data3.count);

        Data3 data2 = new Data3("data2");
        System.out.println("data2: " + Data3.count);

        Data3 data3 = new Data3("data3");
        System.out.println("data3: " + Data3.count);
    }
}
