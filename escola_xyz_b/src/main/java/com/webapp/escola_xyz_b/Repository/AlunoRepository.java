package com.webapp.escola_xyz_b.Repository;

import com.webapp.escola_xyz_b.Model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, String> {
}
