package com.temperature.triptempBackend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/temp")
@CrossOrigin(origins = "http://localhost:3000")
public class tempController {


}
