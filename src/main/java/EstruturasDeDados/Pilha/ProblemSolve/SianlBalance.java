package EstruturasDeDados.Pilha.ProblemSolve;

import java.util.Set;
import java.util.Stack;

public class SianlBalance {


    public static boolean solve(String exp) {
        Set<Character> openSymbols = Set.of('(','{','[');
        Set<Character> closeSymbols = Set.of(')','}',']');
        Stack<Character> stack = new Stack<>();

        for( char c: exp.toCharArray()){
            if(openSymbols.contains(c)) {
                stack.push(c);
            }
            if(closeSymbols.contains(c)) {
                if(stack.isEmpty()) return false;
                var open = stack.pop();
                if ( open == '(' && c != ')')return false;
                if ( open == '[' && c != ']')return false;
                if ( open == '{' && c != '}')return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(solve("2*(3+4+5*[2+3)]"));
        System.out.println(solve("2*(3+4+5*[2+3])"));
        System.out.println(solve("{2*(3+4+5*[2+3])}"));
        System.out.println(solve("{2}*(3+4+5*[2+3])}"));
        System.out.println(solve("[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)*[5+8]+17)+2]"));
        System.out.println(solve("[2*(3+4+5*[2+3}/(2+(3+(7+5)*9)*6)*[5+8]+17)+2]"));



    }

}
