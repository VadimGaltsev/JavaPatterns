package templateMethod;

import templateMethod.template_Classes.Abstract;
import templateMethod.template_Classes.ConcreteA;
import templateMethod.template_Classes.ConcreteB;

public class MainTemplate {
    public static void main(String[] args) {
        Abstract a = new ConcreteA(new ConcreteB(null));
        Abstract b = new ConcreteB(new ConcreteA(null));
        a.printF();
        b.printF();
    }

}
