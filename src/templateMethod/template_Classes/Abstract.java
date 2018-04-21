package templateMethod.template_Classes;

public abstract class Abstract {
    Abstract _Abstract;

    public Abstract(Abstract a) {
        _Abstract = a;
    }

    public void printF() {
        System.out.println("Abstract method");
        _Abstract.printF();
    }
}
