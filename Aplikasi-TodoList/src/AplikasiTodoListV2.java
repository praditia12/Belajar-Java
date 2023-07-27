import Repository.TodoListRepository;
import Repository.TodoListRepositoryImpl;
import Service.TodoListService;
import Service.TodoListServiceImpl;
import View.TodolistView;

public class AplikasiTodoListV2 {
    public static void main(String[] args) {

        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodolistView todolistView = new TodolistView(todoListService);

        todolistView.showTodoList();

    }
}
