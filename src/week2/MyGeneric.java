package week2;

public class MyGeneric <T>{
    private T e;

    public MyGeneric(T e) {
        this.e = e;
    }

    public void setE(T e) {
        this.e = e;
    }

    public T getE() {
        return e;
    }
}

class tester2{
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>("uwu");
        MyGeneric<Integer> intObj = new MyGeneric<>(123);
        System.out.println("strObj: "+strObj.getE()+"\nintObj: "+intObj.getE());
    }
}
