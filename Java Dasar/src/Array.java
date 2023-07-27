public class Array {
    public static void main(String[] args) {

        String [] namaTeman;
        namaTeman = new String[4];

        namaTeman[0] = "Adit";
        namaTeman[1] = "Heiwa";
        namaTeman[2] = "Rifqi";
        namaTeman[3] = "Rigan";

        System.out.println(namaTeman[3]);

        //penulisan array
        String[] NamaNama = {
          "Adit","Rio","Dimas","Indra"
        };

        NamaNama[1] = null; //mengosongkan data

        System.out.println(NamaNama[1]);

        int[] arrayInt = new int[] {
          1,2,3,4,5,6,7,8,9,10
        };

        System.out.println(arrayInt[5]);
        System.out.println(arrayInt.length);

        //array di dalam array
        String[][] User = {
                {"Adit", "Praditia"},
                {"Nindya", "Dwi"}
        };

        System.out.println(User[1][1]);
        System.out.println(User[0][1]);

    }

}
