package Test.Service;

import Entity.Todolist;
import Repository.TodoListRepository;
import Repository.TodoListRepositoryImpl;
import Service.TodoListService;
import Service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {

        testRemoveTodoList();

    }

    public static void testShowTodoList(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new Todolist("Belajar Java");
        todoListRepository.data[1] = new Todolist("Belajar PHP");
        todoListRepository.data[2] = new Todolist("Belajar Phyton");

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Beli HandPhone");
        todoListService.addTodoList("Beli Laptop");
        todoListService.addTodoList("Beli PC");

        todoListService.showTodoList();

    }

    public static void testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Beli HandPhone");
        todoListService.addTodoList("Beli Laptop");
        todoListService.addTodoList("Beli PC");

        todoListService.showTodoList();
        todoListService.removeTodoList(8);
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(5);
        todoListService.showTodoList();
        todoListService.removeTodoList(1);
        todoListService.showTodoList();
    }

}
