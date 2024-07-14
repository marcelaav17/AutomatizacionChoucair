package co.com.choucair.automation.models;

public class Datos {
    private String userName = "";
    private String password = "";
    private String firtsName = "";
    private String lastName = "";
    private String email = "";
    private String palabra = "";

    public Datos(String userName, String password, String firtsName, String lastName, String email, String palabra) {
        this.userName = userName;
        this.password = password;
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.email = email;
        this.palabra = palabra;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
}
