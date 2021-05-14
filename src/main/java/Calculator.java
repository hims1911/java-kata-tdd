public class Calculator {
    public int calculate(String s) {
        if(s.isEmpty()){
            return 0;
        }
        else{
            String[] Numbers = s.split(",|\n");
            if(Numbers.length == 1){
                return Integer.parseInt(Numbers[0]);
            }
            else{
                return GetSum(Numbers);
            }
        }
    }

    public int GetSum(String[] Numbers){
        int sum = 0;
        for(String Cur: Numbers){
            sum = sum + Integer.parseInt(Cur);
        }
        return sum;
    }
}
