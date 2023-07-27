public class TipeDataNumber {

    public static void main(String[] args) {

        //Bilangan Bulat
        byte iniByte = 100; // >-128 < 127 | 1 byte
        short iniShort = 1000; // >-32,768 < 32,767 | 2 byte
        int iniInt = 1000000; // >-2,147,***,*** < 2,147,***,*** | 4 byte
        long iniLong = 1000000000; // >-9,***,***,***,***,***,*** < 9,***,***,***,***,***,*** | 8 byte
        long iniLong2 = 1000000000L;// >-9,***,***,***,***,***,*** < 9,***,***,***,***,***,*** | 8 byte

        //Bilangan Decimal
        float iniFloat = 10.10f; // 4 byte
        double iniDouble = 10.10; // 8 byte

        //Kode Literals
        int DecimalInt = 33;
        int HexaDecimal = 0xffffff; // 0x*****
        int BinaryDesimal = 0b000111; //0b*****

        //Kode Underscore
        int amount = 1_000_000_000; //memudahkan membaca jumlah angka

        //Kode Konversi Type Data Number
        // Otomatis
        byte konversibyte = 20;
        short konversisbyteshort = konversibyte;
        int konversishorttoint = konversisbyteshort;
        //Manual
        byte konversimanbytetoint = (byte) konversishorttoint;
    }

}
