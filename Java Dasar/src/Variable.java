public class Variable {
    public static void main(String[] args) {

        String namaToko;
        namaToko = "Warung Oman";

        int berdiriTahun = 2010;
        String beralamat = "Kp.Sadang, Parung, Subang";

        System.out.println(namaToko);
        System.out.println(berdiriTahun);
        System.out.println(beralamat);

        // ganti value variable
        namaToko = "Indomaret";

        System.out.println(namaToko);

        // Kata Kunci var
        //var jalan; - contoh penggunaan var yang salah
        //jalan = "Jl Pancoran Barat IV";

        // contoh penggunaan var yang benar
        var jalan = "Jl Pancoran Barat IV";
        var noRumah = 10;
        var alamatRumah = jalan + " " + noRumah;

        // note : var harus diisi value nya secara langsung

        // fix value : final
        final var nama = "Adit Praditia";
        // nama = "Alian"; - akan erorr

        System.out.println(nama);
        System.out.println(alamatRumah);



    }
}
