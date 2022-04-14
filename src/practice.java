public class practice {
    public String frontTimes(String str, int n) {
       StringBuilder s= new StringBuilder();
       if(str.length()>2){
       str=str.substring(0,3);
       }
        for (int i = 0; i < n; i++) {
        s.append(str);
        }
        return s.toString();
    }

    public int arrayCount9(int[] numS){
        int count =0;
        for(int i:numS){
        if(i==9)count++;
        }
        return count;
    }
    public int stringMatch(String a, String b){
        int length=Math.min(a.length(),b.length());
        int countMatch=0;
        for(int i=0;i<length-1;i++){
        if(a.substring(i,i+2).equalsIgnoreCase(b.substring(i,i+2)))countMatch++;
        }
        return countMatch;
    }
    public boolean arrayFront9(int[] numS){
        int counter=0;
        if(numS.length>0){
        for(int i=0;i<numS.length;i++){
        if(numS[i]==9)return true;
        if(i==3)break;
            }
        }
        return false;
    }
    public int countXX(String str){
        int countX=0;
        for(int i=0;i<str.length()-1;i++){
        if(str.toLowerCase().charAt(i)=='x' && str.toLowerCase().charAt(i+1)=='x' )countX++;
        }
        return countX;
    }
    public String stringSp(String str){
        StringBuilder s= new StringBuilder();
        for (int i = 0; i <= str.length()-1; i++) {
        for (int j = 0; j <=i ; j++) {
        s.append(str.charAt(j));
            }
        }
        return s.toString();
    }

}
