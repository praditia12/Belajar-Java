public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        // Tipe Data Bukan Primitif default value nya null

        Integer iniInteger = null;
        System.out.println(iniInteger);

        iniInteger = 200;
        System.out.println(iniInteger);

        // sedangkan tipe data primitif default value nya 0
        Integer iniInt = 0 ;
        System.out.println(iniInt);

        //konversi primitif > bukan primitif
        byte inibyte = 80;
        Byte iniByte = inibyte;

        System.out.println(iniByte);

        //konversi bukan primitif > primitif
        int iniint = 60;
        Integer iniObject = iniint;

        short iniShort = iniObject.shortValue();
        // short iniShort = iniObject; - penulisan yang salah
        byte iniByte2 = iniObject.byteValue();
    }

}
