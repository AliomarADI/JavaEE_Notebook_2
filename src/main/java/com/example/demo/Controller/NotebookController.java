package com.example.demo.Controller;

import com.example.demo.Service.UserServIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notebooks")
public class NotebookController {

    @Autowired
    private UserServIn userServIn;

}
