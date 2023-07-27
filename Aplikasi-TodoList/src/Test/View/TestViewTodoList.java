package Test.View;

import Repository.TodoListRepository;
import Repository.TodoListRepositoryImpl;
import Service.TodoListService;
import Service.TodoListServiceImpl;
import View.TodolistView;

public class TestViewTodoList {
    public static void main(String[] args) {
        testRemoveTodoListView();
    }

    public static void testShowTodoListView(){

        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodolistView todolistView = new TodolistView(todoListService);

        todoListService.addTodoList("Jakarta");
        todoListService.addTodoList("Subang");
        todoListService.addTodoList("Bandung");

        todolistView.showTodoList();

    }

    public static void testAddTodoListView(){

        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodolistView todolistView = new TodolistView(todoListService);

        todolistView.addTodoList();
        todoListService.showTodoList();
        todolistView.addTodoList();
        todoListService.showTodoList();
        todolistView.addTodoList();

    }

    public static void testRemoveTodoListView(){

        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodolistView todolistView = new TodolistView(todoListService);

        todoListService.addTodoList("Jakarta");
        todoListService.addTodoList("Subang");
        todoListService.addTodoList("Bandung");

        todoListService.showTodoList();
        todolistView.removeTodoList();
        todoListService.showTodoList();


    }

}
