package View;

import Service.TodoListService;
import Util.InputUtil;

public class TodolistView {

    private TodoListService todoListService;

    public TodolistView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    public void showTodoList(){
        while (true){
            todoListService.showTodoList();

            System.out.println("Menu :");
            System.out.println("1. Tambah TodoList");
            System.out.println("2. Hapus TodoList");
            System.out.println("x. Keluar");

            var pick = InputUtil.input("Silahkan Pilih");

            if (pick.equals("1")){
                addTodoList();
            } else if (pick.equals("2")) {
                removeTodoList();
            } else if (pick.equals("x")) {
                break;
            }else {
                System.out.println("Pilihan Tidak Dimengerti");
            }
        }
    }

    public void addTodoList(){
        System.out.println("Menambah TodoList");

        var todo = InputUtil.input("Todo (x Jika Batal)");

        if (todo.equals("x")){
            //batal
        }else {
            todoListService.addTodoList(todo);
        }
    }

    public void removeTodoList(){
        System.out.println("Menghapus TodoList");

        var number = InputUtil.input("Nomor yang dihapus (x Jika Batal)");

        if (number.equals("x")){
            //batal
        }else {
            todoListService.removeTodoList(Integer.valueOf(number));
        }
    }

}
