package com.testeadmissao.testeadmissao.application.useCases.clientUseCases;
import java.util.List;
import org.springframework.stereotype.Service;
import com.testeadmissao.testeadmissao.domain.interfaces.useCases.IGenericDAO;
import com.testeadmissao.testeadmissao.infrastructure.model.ClientEntity;


@Service
public class ClientUseCase implements IGenericDAO<ClientEntity, Long> {

    private final IGenericDAO<ClientEntity, Long> clientDAO;
   
    public ClientUseCase(IGenericDAO<ClientEntity, Long> clientDAO) {
        this.clientDAO = clientDAO;
    }

    @Override
    public ClientEntity findById(Long id) {
        return clientDAO.findById(id);
    }

    @Override
    public List<ClientEntity> findAll() {
        return clientDAO.findAll();
    }

    @Override
    public ClientEntity save(ClientEntity clientEntity) {
        return clientDAO.save(clientEntity);
    }

    @Override
    public void update(ClientEntity clientEntity) {
        clientDAO.update(clientEntity);
    }
    

    @Override
    public void delete(Long id) {
        clientDAO.delete(id);
    }
}