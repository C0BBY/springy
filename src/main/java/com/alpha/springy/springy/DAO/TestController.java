package com.alpha.springy.springy.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @Autowired
    private CustomersRepository customersRepository;
    @Autowired
    private TesterRepository testRepository;

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/")
    public @ResponseBody String sayHello(@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping("/customers")
    public @ResponseBody Customers customers(@RequestParam int id){
        return customerService.readData(id);
    }
    @RequestMapping("/test")
    public @ResponseBody Iterable<Tester> testers(){
        return testRepository.findAll();
    }

    @RequestMapping("/test/add")
    public @ResponseBody String addtesters(@RequestParam String name){
        Tester tester = new Tester();
        tester.setName(name);
        testRepository.save(tester);
        return "Saved";
    }

}
