package dataType;

public class TenToHexDemo {
    
    public static void main(String[] args) {
         //定义一个十进制值
        int valueTen = 25;
        //将其转换为十六进制并输出
        String strHex = Integer.toHexString(valueTen);
        System.out.println(strHex);

        //定义一个十六进制值
        String strHex3 = "00ce03";
        //将十六进制转化成十进制
        int valueTen2 = Integer.parseInt(strHex3,16);
        System.out.println(valueTen2);
    }
}