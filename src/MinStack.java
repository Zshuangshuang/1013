import java.util.Stack;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-13
 * Time:17:43
 **/
public class MinStack {

    private static Stack<Integer> A = new Stack<>();
    private static Stack<Integer> B = new Stack<>();
    public static void push(int x){
        if (B.isEmpty()){
            B.push(x);
            return;
        }
        int min = B.peek();
        if (x < min){
            min = x;
            }
        B.push(min);
    }
    public static Integer pop(){
        if (A.isEmpty()){
            return null;
        }
        B.pop();
        return A.pop();
    }
    public static Integer peek(){
        if (A.isEmpty()){
            return null;
        }
        return A.peek();
    }
    public static Integer min(){
        if (B.isEmpty()){
            return null;
        }
        return B.peek();
    }
}
