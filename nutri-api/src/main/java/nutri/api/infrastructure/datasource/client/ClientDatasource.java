package nutri.api.infrastructure.datasource.client;

import nutri.api.domain.model.Client;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDatasource implements ClientRepository {

    private ClientMapper clientMapper;

    @Override
    public Client getClientById(int id) {
        return clientMapper.getClientById(id);
    }
}