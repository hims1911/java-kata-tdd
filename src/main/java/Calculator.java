public class Calculator {
    public int calculate(String s) {
        if(s.isEmpty()){
            return 0;
        }
        else{
            String delimiter = ",";
            if(s.matches("//(.*)\n(.*)")){
                delimiter = Character.toString(s.charAt(2));
                s = s.substring(4);
            }

            String NewDelimiter = delimiter + "|\n";
            String[] Numbers = s.split(NewDelimiter);

            if(Numbers.length == 1){
                return Integer.parseInt(Numbers[0]);
            }
            else{
                return GetSum(Numbers);
            }
        }
    }

    private static int GetSum(String[] numbers){
        int total = 0;
        String negString = "";

        for(String number : numbers){
            if(Integer.parseInt(number) < 0){
                if(negString.equals("")){
                    negString = number;
                }
                else {
                    negString += ("," + number);
                }
            }

            if(Integer.parseInt(number) < 1000) {
                total = total + Integer.parseInt(number);
            }
        }

        if(!negString.equals("")){
            throw new IllegalArgumentException("Negatives not allowed: " + negString);
        }

        return total;
    }
}
