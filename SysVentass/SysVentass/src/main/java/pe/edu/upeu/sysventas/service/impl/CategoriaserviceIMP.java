package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.model.Categoria;
import pe.edu.upeu.sysventas.repository.CategoriaRepository;
import pe.edu.upeu.sysventas.repository.ICrudGenericoRepository;

public class CategoriaserviceIMP extends CrudGenericoServiceimp<Categoria,Long> implements ICategoriaService{

    private final CategoriaRepository categoriaRepository;

    public CategoriaserviceIMP(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    protected ICrudGenericoRepository<Categoria, Long> getRepo(){
        return categoriaRepository;
    }
}

