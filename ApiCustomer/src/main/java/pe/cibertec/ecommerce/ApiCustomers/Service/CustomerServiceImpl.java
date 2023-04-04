package pe.cibertec.ecommerce.ApiCustomers.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiCustomers.Dao.CustomerRespository;
import pe.cibertec.ecommerce.ApiCustomers.Entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
    
    @Autowired
    private CustomerRespository customerRepository;
   
    
    @Override
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }
    
}
