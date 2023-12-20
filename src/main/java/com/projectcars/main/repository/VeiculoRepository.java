package com.projectcars.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projectcars.main.models.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository <Veiculo, Integer>{
}
