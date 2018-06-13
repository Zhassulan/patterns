package study.patterns.singletone;

import org.junit.Test;


public class SingletoneTest {

    @Test
    public void singletoneTest()    {
        Printer.getInstance().print();
    }
}
