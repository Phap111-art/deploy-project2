package com.example.deployproject2;

import com.example.deployproject2.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {
    @Autowired
    private CartRepository cartRepository;
    @ResponseBody
    @GetMapping("/index")
    public String index(){
        return cartRepository.findAll().toString();
    }
}
