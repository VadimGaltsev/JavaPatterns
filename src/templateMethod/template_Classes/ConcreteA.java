package templateMethod.template_Classes;

public class ConcreteA extends Abstract {

    public ConcreteA(Abstract a) {
        super(a);
    }

    @Override
    public void printF() {
        super.printF();
        System.out.println("ConcreteA here");
    }
}
