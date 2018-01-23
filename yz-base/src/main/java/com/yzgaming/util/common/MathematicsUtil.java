package com.yzgaming.util.common;

public class MathematicsUtil {

    public static Double getScore(Integer KillNum,Double KDA,String timeLong){
        String replace = KDA.toString().replace(".", "");
        int length = replace.length();
        String s="0";
        if(length<=NumberConstant.TWO){
            s += replace.toString();
        }else {
            s=replace.toString();
        }
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(KillNum.toString());
        stringBuffer.append(s);
        stringBuffer.append(".");
        stringBuffer.append(timeLong);
        return Double.valueOf(stringBuffer.toString());
    }

    public static void main(String[] args) {
        Double score = getScore(28, 10.8, "30");
        Double score2 = getScore(28, 8.8, "30");
       boolean o=score>score2?true:false;
       System.out.println(o);

    }
}
