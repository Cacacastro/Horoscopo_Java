
package util;

public class Email_Senha {
    private String login,senha;

    public Email_Senha(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean isValido()
    {   // supondo que a primeira parte é igual a senha
        String user = login.split("@")[0];
        String rev = new StringBuilder(user).reverse().toString();
        
        return rev.equals(senha);
    }
    
}
