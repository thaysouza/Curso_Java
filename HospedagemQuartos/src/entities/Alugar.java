package entities;
public class Alugar {
private String nome;
private String email;
public Alugar(String nome, String email) {
this.nome = nome;
this.email = email;
}
public String getName() {
return nome;
}
public void setName(String name) {
this.nome = name;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public String toString() {
return nome + ", " + email;
}
}