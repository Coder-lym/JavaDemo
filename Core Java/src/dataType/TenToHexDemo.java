package dataType;

public class TenToHexDemo {
    
    public static void main(String[] args) {
         //����һ��ʮ����ֵ
        int valueTen = 25;
        //����ת��Ϊʮ�����Ʋ����
        String strHex = Integer.toHexString(valueTen);
        System.out.println(strHex);

        //����һ��ʮ������ֵ
        String strHex3 = "00ce03";
        //��ʮ������ת����ʮ����
        int valueTen2 = Integer.parseInt(strHex3,16);
        System.out.println(valueTen2);
    }
}