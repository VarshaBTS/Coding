import java.util.Scanner;
import java.util.Stack;

class balanced_bracket{
    public static boolean check_balanced(String s){

        Stack<Character> st=new Stack<>();
        char c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c==' '){
                return false;
            }
            else if(c=='('||c=='['||c=='{'){
                st.push(c);
                continue;
            }
            if(st.isEmpty()){
                return false;
            }
            char check;

                switch(c){
                    case ')':
                        check=st.pop();
                        if(check=='{'||check=='[')
                            return false;
                        break;
                    case '}':
                        check=st.pop();
                        if(check=='('||check=='[')
                            return false;
                        break;
                    case ']':
                        check=st.pop();
                        if(check=='{'||check=='(')
                            return false;
                        break;
                }
            
        
        }
        return (st.isEmpty());

    }
    public static void main(String Args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input");
        String input=sc.next();
        boolean c=check_balanced(input);
        if(c==false){
            System.out.println("Not balanced");
        }
        else{
            System.out.println("Balanced");
        }
        
    }
}