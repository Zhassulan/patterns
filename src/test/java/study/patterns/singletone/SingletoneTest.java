package study.patterns.singletone;

import org.junit.Test;
import study.patterns.singletone.singletone.Printer;


public class SingletoneTest {

    @Test
    public void singletoneTest()    {
        Printer.getInstance().print();
    }
}
