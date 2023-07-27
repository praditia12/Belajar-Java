package belajar.java.data;

public record LoginRequest(String username, String password) { //Record Class

    public LoginRequest{ // Record Contructor
        System.out.println("Menampilkan Login Request");
    }

    public LoginRequest (String username){
        this(username, "");
    }

    public LoginRequest (){
        this("","");
    }
}
