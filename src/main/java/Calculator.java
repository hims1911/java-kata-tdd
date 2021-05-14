public class Calculator {
    public int calculate(String s) {
        if(s.isEmpty()){
            return 0;
        }
        return Integer.parseInt(s);
    }
}
