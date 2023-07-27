public class Main {
    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodoList();
    }

    // Menampilkan Aplikasi Todo List
    public static void showTodoList(){
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++ ){
            var todo = model[i];
            var no = i + 1;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList(){
        model [0] = "Belajar Java Dasar";
        model [1] = "Studi Kasus";
        showTodoList();
    }

    // Menambah Todo Ke list
    public static void addTodoList(String todo){
        // mengecek data array penuh?
        var isFull = true;
        for (int i  = 0; i < model.length; i++ ){
            if (model[i] == null){
                isFull = false;
                break;
            }
        }

        // jika data array [model] penuh
        if (isFull){
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++ ){
                model[i] = temp[i];
            }
        }

        // menambah data array ke posisi Null
        for (var i = 0; i < model.length; i++){
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }

    }

    public static void testAddTodoList(){
        for (int i = 0; i < 25; i++){
            addTodoList("Contoh todo ke. " + i);
        }

        showTodoList();
    }

    // Meremove Todo dari list
    public static boolean removeTodoList(Integer number){
        if ((number - 1) >= model.length){
            return false;
        } else if ( model[number -1] == null) {
            return false;
        }else {
            for (int i = (number -1); i < model.length ; i++) {
                if (i == (model.length - 1)){
                    model[i] = null;
                }else {
                    model[i] = model[i + 1];
                }
            }
        }
        return true;
    }

    public static void testRemoveTodoList(){
        addTodoList("B Indo");
        addTodoList("B Inggris");
        addTodoList("B Sunda");
        addTodoList("B Melayu");
        addTodoList("B Jawa");

        var result = removeTodoList(20);
        System.out.println(result);
        result = removeTodoList(6);
        System.out.println(result);
        result = removeTodoList(2);
        System.out.println(result);
        result = removeTodoList(3);
        System.out.println(result);

        showTodoList();
    }

    public static String input (String info){
        System.out.print(info + " : ");
        var data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var nama =input("Nama");
        System.out.println("Halo " + nama);
    }

    // view menu Todo List
    public static void viewShowTodoList(){
        while (true){
            showTodoList();

            System.out.println("Menu :");
            System.out.println("1. Tambah TodoList");
            System.out.println("2. Hapus TodoList");
            System.out.println("x. Keluar");

            var pick = input("Silahkan Pilih");

            if (pick.equals("1")){
                viewAddTodoList();
            } else if (pick.equals("2")) {
                viewRemoveTodoList();
            } else if (pick.equals("x")) {
                break;
            }else {
                System.out.println("Pilihan Tidak Dimengerti");
            }
        }

    }

    public static void testViewTodoList(){
        addTodoList("B Indo");
        addTodoList("B Inggris");
        addTodoList("B Sunda");
        addTodoList("B Melayu");
        addTodoList("B Jawa");

        viewShowTodoList();
    }

    // view menambah Todo List
    public static void viewAddTodoList(){
        System.out.println("Menambah TodoList");

        var todo = input("Todo (x Jika Batal)");

        if (todo.equals("x")){
            //batal
        }else {
            addTodoList(todo);
        }

    }
    public static void testViewAddTodoList(){
        addTodoList("B Melayu");
        addTodoList("B Jawa");

        viewAddTodoList();

        showTodoList();
    }


    // view remove Todo List
    public static void viewRemoveTodoList(){
        System.out.println("Menghapus TodoList");

        var number = input("Nomor yang dihapus (x Jika Batal)");

        if (number.equals("x")){
            //batal
        }else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if (!success){
                System.out.println("Gagal menghapus TodoList : " + number);
            }
        }

    }

    public static void testViewRemoveTodoList(){
        addTodoList("B Indo");
        addTodoList("B Inggris");
        addTodoList("B Sunda");
        addTodoList("B Melayu");
        addTodoList("B Jawa");

        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }

}