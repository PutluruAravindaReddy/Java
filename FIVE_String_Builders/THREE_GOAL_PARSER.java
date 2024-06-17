package FIVE_String_Builders;

public class THREE_GOAL_PARSER {
    public static void main(String[] args) {
        String  command = "G()(al)()";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
//            command=command.replace("()","o");
//            command = command.replace("(al)","al");
//            return command;

//                 or

        StringBuilder builder = new StringBuilder();

        for ( int i = 0 ; i < command.length() ; i++ ){
            if(command.charAt(i)=='G')
                builder.append("G");
            if(command.charAt(i)=='('){
                i=i+1;
                if(command.charAt(i)==')'){
                    builder.append("o");
                }
                if(command.charAt(i)=='a'){
                    builder.append("al");
                    i=i+3;
                }
            }
        }
        return builder.toString();
    }

}
