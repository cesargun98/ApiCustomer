package pe.cibertec.ecommerce.ApiCustomers.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiCustomers.Entity.Customer;
import pe.cibertec.ecommerce.ApiCustomers.Service.CustomerService;

@RestController
    @RequestMapping("/api/customer")
public class CustomerController {
    
    @Autowired
    CustomerService customerService;
    
    @GetMapping("/findAll")
    public List<Customer> findAll () {
        
        return customerService.findAll();
        
    }
    
    @GetMapping("/findById/{id}")
    public Customer findById (@PathVariable Long id) {
        
        return customerService.findById(id);
        
    }
    
}
