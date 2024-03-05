package java8.functional_interface;

interface A{
    default void SayBy(){
        System.out.print("Hello i am ParentClass");
    }

}
class B implements A {

    @Override
    public void SayBy(){
        System.out.print("Hello i am ChildClass");
    }
}


public class DefaultMethod {
    public static void main(String[] args) {

        B object = new B();
        object.SayBy();

    }
}
