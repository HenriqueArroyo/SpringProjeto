package com.webapp.escola_xyz_b.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class VerificaCadastroAluno implements Serializable {
    //atributos
    @Id
    private String aluno;
    
}
