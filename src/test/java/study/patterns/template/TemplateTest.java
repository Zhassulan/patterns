package study.patterns.template;

import org.junit.Test;

public class TemplateTest {

    @Test
    public void templateTest()  {
        Tea myTea = new Tea();
        myTea.prepareRecipe();
    }

}
