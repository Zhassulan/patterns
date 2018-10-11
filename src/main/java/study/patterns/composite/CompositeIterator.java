package study.patterns.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator); //вставляем сверху в стек
    }

    @Override
    public Object next() {
        if (hasNext())  {
            Iterator iterator = (Iterator) stack.peek(); //возвращает объект без удаления его из стека
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu)  {
                stack.push(component.createIterator());
            }
            return component;
        }   else    {
            return  null;
        }
    }

    @Override
    public boolean hasNext() {
        if (stack.empty())  {
            return false;
        }   else    {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext())    {
                stack.pop(); //удаляем из стека
                return hasNext();
            }   else    {
                return true;
            }
        }
    }

    public void remove()    {
        throw new UnsupportedOperationException();
    }

}
