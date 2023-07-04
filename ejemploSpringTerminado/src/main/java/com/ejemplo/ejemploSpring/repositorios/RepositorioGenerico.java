package com.ejemplo.ejemploSpring.repositorios;

import com.ejemplo.ejemploSpring.entidades.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface RepositorioGenerico<T extends Base, ID extends Serializable> extends JpaRepository<T, ID> {
}
