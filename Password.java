package App_password;

public class Password {

    public String message;

    public Password() {
        this.message = "Insira sua senha:";
    }

    public String verifyPassword(int password) {
        if (password == 1234) {
            this.message = "Acesso liberado!";
        } else {
            this.message = "Acesso negado.";
        }
        return this.message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Password{" +
                "message='" + message + '\'' +
                '}';
    }
}
