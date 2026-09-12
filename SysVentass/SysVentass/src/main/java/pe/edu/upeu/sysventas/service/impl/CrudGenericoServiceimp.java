package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.exception.ModelNotFoundException;
import pe.edu.upeu.sysventas.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysventas.service.ICrudGenericoService;

import java.util.List;

public abstract class CrudGenericoServiceimp<T,ID> implements ICrudGenericoService<T,ID> {
    protected abstract ICrudGenericoRepository<T,ID>getRepo();
    @Override
    public T save(T t) {
        return getRepo().save(t);
    }

    @Override
    public T update(ID id, T t) {
        if (!getRepo().existsById(id))
            throw  new ModelNotFoundException("ID no existe");
        return null;
    }

    @Override
    public List<T> findAll(ID id) {
        return getRepo().findAll();
    }

    @Override
    public T findById(ID id) {
        return getRepo().findById(id).orElseThrow(()->new ModelNotFoundException("ID no existe:"+id));
    }

    @Override
    public void delete(ID id) {
        if (!getRepo().existsById(id))
            throw new ModelNotFoundException("ID no existe");
        getRepo().deleteById(id);
    }
}
