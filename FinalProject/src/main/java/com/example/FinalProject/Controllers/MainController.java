package com.example.FinalProject.Controllers;


import com.example.FinalProject.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    EmployeeRepository employeeRepo;

    @Autowired
    CustomerRepository customerRepo;

    @Autowired
    ProductRepository productRepo;

    @Autowired
    OrderRepository orderRepo;

    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
//Employees
    @RequestMapping("/employeeView")
    public ModelAndView employee(){
        ModelAndView mv = new ModelAndView("employeeView");
        mv.addObject("list", employeeRepo.findAll());
        return mv;
    }

    @RequestMapping("/addEmployee")
    public ModelAndView addEmployee(){
        ModelAndView mv = new ModelAndView("addEmployee");
        return mv;
    }

    @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
    public ModelAndView saveEmployee(@RequestParam("employeeid") String employeeID, @RequestParam("firstname") String firstName, @RequestParam("lastname") String lastname, @RequestParam("employeestatus") String employeeStatus){
        ModelAndView mv = new ModelAndView("redirect:/employeeView");
        Employee savedEmployee;
        if(!employeeID.isEmpty())
        {
            Optional<Employee> employee = employeeRepo.findById(Integer.parseInt(employeeID));
            savedEmployee = employee.get();
        }
        else
        {
            savedEmployee = new Employee();
        }
        savedEmployee.setFirstName(firstName);
        savedEmployee.setLastName(lastname);
        savedEmployee.setEmployeeStatus(employeeStatus);
        employeeRepo.save(savedEmployee);
        mv.addObject("list", employeeRepo.findAll());
        return mv;
    }

    @RequestMapping( value = "/deleteEmployee/{employeeid}", method = RequestMethod.GET)
    public ModelAndView deleteEmployee(@PathVariable("employeeid") int id){
        ModelAndView mv = new ModelAndView("redirect:/employeeView");
        employeeRepo.deleteById(id);
        return mv;
    }

    @RequestMapping( value = "/editEmployee/{employeeid}", method = RequestMethod.GET)
    public ModelAndView editEmployee(@PathVariable("employeeid") int id){
        ModelAndView mv = new ModelAndView("editEmployee");
        Optional<Employee> person = employeeRepo.findById(id);
        Employee personToMap = person.get();
        mv.addObject("selectedItem", personToMap);
        return mv;
    }
//Customer
    @RequestMapping("/customerView")
    public ModelAndView customer(){
        ModelAndView mv = new ModelAndView("customerView");
        mv.addObject("customerList", customerRepo.findAll());
        return mv;
    }

    @RequestMapping("/addCustomer")
    public ModelAndView addCustomer(){
        ModelAndView mv = new ModelAndView("addCustomer");
        return mv;
    }

    @RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
    public ModelAndView saveCustomer(@RequestParam("customerid") String customerID,
                                     @RequestParam("firstname") String firstName, @RequestParam("lastname") String lastname,
                                     @RequestParam("street") String street, @RequestParam("city") String city, @RequestParam("state") String state,
                                     @RequestParam("zipcode")int zip, @RequestParam("email")String email,@RequestParam("phone") String phone){
        ModelAndView mv = new ModelAndView("redirect:/customerView");
        Customer savedCustomer;
        if(!customerID.isEmpty())
        {
            Optional<Customer> customer = customerRepo.findById(Integer.parseInt(customerID));
            savedCustomer = customer.get();
        }
        else
        {
            savedCustomer = new Customer();
        }
        savedCustomer.setFirstName(firstName);
        savedCustomer.setLastName(lastname);
        savedCustomer.setStreet(street);
        savedCustomer.setCity(city);
        savedCustomer.setState(state);
        savedCustomer.setZip(zip);
        savedCustomer.setEmail(email);
        savedCustomer.setPhone(phone);
        customerRepo.save(savedCustomer);
        mv.addObject("customerList", customerRepo.findAll());
        return mv;
    }

    @RequestMapping( value = "/deleteCustomer/{customerid}", method = RequestMethod.GET)
    public ModelAndView deleteCustomer(@PathVariable("customerid") int id){
        ModelAndView mv = new ModelAndView("redirect:/customerView");
        customerRepo.deleteById(id);
        return mv;
    }

    @RequestMapping( value = "/editCustomer/{customerid}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("customerid") int id){
        ModelAndView mv = new ModelAndView("editCustomer");
        Optional<Customer> person = customerRepo.findById(id);
        Customer personToMap = person.get();
        mv.addObject("selectedItem", personToMap);
        return mv;
    }

    //Product

    @RequestMapping("/productView")
    public ModelAndView product(){
        ModelAndView mv = new ModelAndView("productView");
        mv.addObject("productList", productRepo.findAll());
        return mv;
    }

    @RequestMapping("/addProduct")
    public ModelAndView addProduct(){
        ModelAndView mv = new ModelAndView("addProduct");
        return mv;
    }

    @RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
    public ModelAndView savedProduct(@RequestParam("productid") String productID, @RequestParam("productname") String productName, @RequestParam("price") String price){
        ModelAndView mv = new ModelAndView("redirect:/productView");
        Product savedProduct;
        if(!productID.isEmpty())
        {
            Optional<Product> product = productRepo.findById(Integer.parseInt(productID));
            savedProduct = product.get();
        }
        else
        {
            savedProduct = new Product();
        }
        savedProduct.setProductName(productName);
        savedProduct.setPrice(Double.parseDouble(price));

        productRepo.save(savedProduct);
        mv.addObject("productList", productRepo.findAll());
        return mv;
    }

    @RequestMapping( value = "/deleteProduct/{productid}", method = RequestMethod.GET)
    public ModelAndView deletePayment(@PathVariable("productid") int id){
        ModelAndView mv = new ModelAndView("redirect:/productView");
        productRepo.deleteById(id);
        return mv;
    }

    @RequestMapping( value = "/editProduct/{productid}", method = RequestMethod.GET)
    public ModelAndView editPayment(@PathVariable("productid") int id){
        ModelAndView mv = new ModelAndView("editProduct");
        Optional<Product> payment = productRepo.findById(id);
        Product productToMap = payment.get();
        mv.addObject("selectedItem", productToMap);
        return mv;
    }

    //Order

    @RequestMapping("/orderView")
    public ModelAndView order(){
        ModelAndView mv = new ModelAndView("orderView");
        mv.addObject("orderList", orderRepo.findAll());
        return mv;
    }

    @RequestMapping("/addOrder")
    public ModelAndView addOrder(){
        ModelAndView mv = new ModelAndView("addOrder");
        return mv;
    }

    @RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
    public ModelAndView savedOrder(@RequestParam("orderid") String orderID, @RequestParam("customerid")String customerID, @RequestParam("productid") String productID,
                                   @RequestParam("orderdate") String orderDate, @RequestParam("orderstatus") String orderStatus,
                                   @RequestParam("paymentid") String paymentID, @RequestParam("employeeid") String employeeID)
    {
        ModelAndView mv = new ModelAndView("redirect:/orderView");
        Order savedOrder;
        if(!orderID.isEmpty())
        {
            Optional<Order> order = orderRepo.findById(Integer.parseInt(orderID));
            savedOrder = order.get();
        }
        else
        {
            savedOrder = new Order();
        }
        savedOrder.setCustomerID(Integer.parseInt(customerID));
        savedOrder.setProductID(Integer.parseInt(productID));
        savedOrder.setOrderDate(orderDate);
        savedOrder.setOrderStatus(orderStatus);
        savedOrder.setPaymentID(Integer.parseInt(paymentID));
        savedOrder.setEmployeeID(Integer.parseInt(employeeID));
        orderRepo.save(savedOrder);
        mv.addObject("orderList", orderRepo.findAll());
        return mv;
    }

    @RequestMapping( value = "/deleteOrder/{orderid}", method = RequestMethod.GET)
    public ModelAndView deleteOrder(@PathVariable("orderid") int id){
        ModelAndView mv = new ModelAndView("redirect:/orderView");
        orderRepo.deleteById(id);
        return mv;
    }

    @RequestMapping( value = "/editOrder/{orderid}", method = RequestMethod.GET)
    public ModelAndView editOrder(@PathVariable("orderid") int id){
        ModelAndView mv = new ModelAndView("editOrder");
        Optional<Order> order = orderRepo.findById(id);
        Order orderToMap = order.get();
        mv.addObject("selectedItem", orderToMap);
        return mv;
    }
}
