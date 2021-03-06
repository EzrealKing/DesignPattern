package visitor_pattern;

import visitor_pattern.impl.Computer;
import visitor_pattern.impl.Keyboard;
import visitor_pattern.impl.Monitor;
import visitor_pattern.impl.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Display Computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Display Mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Display Keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Display Monitor");
    }
}
