package JavaCode;

import java.util.Iterator;
import java.util.Stack;
import java.util.stream.Stream;

/*
Stack> Last in, first out
1. add, push: all both functions are used to add element into the head of the queue
2. add: always return trues
3. push: return object we are pushing
4. pop(): remove and return the top element of the stack;
5. peek(): return the top elemennt fromt the stack without remove it
 */
public class StackExample {
    public void stack_push(Stack stack){
        for(int i = 0; i < 10; i++)
            stack.push(i);

        Iterator iterator = stack.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next() + " ");


        Stream<Integer> stream = stack.stream();
        stream.forEach((x) -> {
            System.out.println(" x = "+x);
        });
        while(!stack.isEmpty()){
            System.out.println(" pop "+stack.pop());
        }

    }
    public void stack_pop(Stack stack){
        for(int i = 0; i < stack.size(); i++)
            System.out.print(stack.pop());
    }

    public void printStack(){
/*        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < 10; i++)
            stack.push(i);
        System.out.println("stack size = "+stack.size());
        for(int i = 0; i < stack.size(); i++)
            System.out.print((Integer)stack.peek());*/
        Stack stack = new Stack<>();
        stack_push(stack);
      //  stack_pop(stack);
/*        Stack mStack = new Stack<>();
        mStack.push("hhihi");
        mStack.push("hehe");
        mStack.push("fsjfkd");
        mStack.push("ifjdsjf");
        mStack.push("fsdfjllolkdsdjodsoj");
        System.out.println(mStack.peek());
        while(!mStack.isEmpty())
            System.out.println(mStack.pop());

        Stack stack = new Stack<>();
        int x = (int)stack.push(22);
        System.out.println(" x = "+x);
        stack.push(343);
        stack.push(34934);
        boolean y = stack.add(2434);
        System.out.println("y = "+y);
        stack.push("efffdjfk");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }*/
    }
}
