public class ForEach {
    public static void main(String[] args) {

        String[] names = {
                "Adit","Praditia","Rigan","Fauzi","Rifqi","Ikhsan"
        };

        //Tanpa ForEach
        for (var i = 0; i < names.length;i++ ){
            System.out.println(names[i]);
        }

        System.out.println("==============");

        // Menggunakan ForEach
        for (var name : names){
            System.out.println(name);
        }

    }
}
