package com.webapp.escola_xyz_b.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aluno {
  //atributos
  @Id
  private String cpf;
  private String nome;
  private String dataNascimento;
  private String disciplina1;
  private String disciplina2;
  private String disciplina3;
  private String email;
  private String senha;
  //métodos
  public String getCpf() {
      return cpf;
  }
  public void setCpf(String cpf) {
      this.cpf = cpf;
  }
  public String getNome() {
      return nome;
  }
  public void setNome(String nome) {
      this.nome = nome;
  }
  public String getEmail() {
      return email;
  }
  public void setEmail(String email) {
      this.email = email;
  }
  public String getSenha() {
      return senha;
  }
  public void setSenha(String senha) {
      this.senha = senha;
  }
public String getDataNascimento() {
    return dataNascimento;
}
public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
}
public String getDisciplina1() {
    return disciplina1;
}
public void setDisciplina1(String disciplina1) {
    this.disciplina1 = disciplina1;
}
public String getDisciplina2() {
    return disciplina2;
}
public void setDisciplina2(String disciplina2) {
    this.disciplina2 = disciplina2;
}
public String getDisciplina3() {
    return disciplina3;
}
public void setDisciplina3(String disciplina3) {
    this.disciplina3 = disciplina3;
}
    


}
