package com.webapp.escola_xyz_b.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.webapp.escola_xyz_b.Model.Aluno;

import java.util.List;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
    @Query("SELECT a FROM Aluno a")
    List<Aluno> findByIdList();

    Aluno findByRegistro(String registro);
    boolean existsByRegistro(String registro);
  
    List<Aluno> findByNomeContaining(String nome);
}
