/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomers.Dao;

import org.springframework.data.repository.CrudRepository;
import pe.cibertec.ecommerce.ApiCustomers.Entity.Customer;


public interface CustomerRespository extends CrudRepository<Customer, Long>{
    
}
