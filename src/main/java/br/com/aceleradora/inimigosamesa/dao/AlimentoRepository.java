package br.com.aceleradora.inimigosamesa.dao;

import br.com.aceleradora.inimigosamesa.model.Alimento;
import br.com.aceleradora.inimigosamesa.model.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AlimentoRepository extends JpaRepository<Alimento, Integer> {

    @Query(Consultas.Alimento.FIND_BY_NOME)
    Page<Alimento> findByNome(@Param("nome") String nome, Pageable paginacao);

    @Query(Consultas.Alimento.FIND_BY_NOME)
    Iterable<Alimento> findByNome(@Param("nome") String nome);

    Page<Alimento> findByCategoria(Categoria categoria, Pageable paginacao);

}
