package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    private Calculadora calc;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("o resultado é "+ calc.somar(1,8));
    }
}
