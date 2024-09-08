package org.example.k8sdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sDeployApplication {

    @GetMapping("/welcome")
    public String helloWorld(){
        return "Application successfully deployed on Kubernetes";
    }

    public static void main(String[] args) {
        SpringApplication.run(K8sDeployApplication.class, args);
    }

}
