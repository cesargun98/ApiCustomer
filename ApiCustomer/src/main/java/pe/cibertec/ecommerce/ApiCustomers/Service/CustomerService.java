/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomers.Service;

import java.util.List;
import pe.cibertec.ecommerce.ApiCustomers.Entity.Customer;


public interface CustomerService {
    public List<Customer> findAll();
    public Customer findById(Long id );
}
