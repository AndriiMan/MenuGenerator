package com.example.demo;

import com.example.demo.repository.DrinkRepository;
import com.example.demo.repository.SupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class MenuCreatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenuCreatorApplication.class, args);
    }

    @Component
    class DemoCommandLineRunner implements CommandLineRunner {

        @Autowired
        private SupRepository supRepository;

        @Autowired
        private DrinkRepository drinkRepository;

        @Override
        public void run(String... args) {

            /*List<String> borshchIngredients = Arrays.asList("Buriak", "Miaso");
            List<String> iushkaIngredients = Arrays.asList("Zelen", "Miaso");
            Sup borshch = new Sup("Борщ", borshchIngredients, 100, 20, 50);
            Sup iushka = new Sup("Юшка", iushkaIngredients, 100, 20, 50);
            supRepository.save(borshch);
            supRepository.save(iushka);*/


            /*List<String> cocacolaIngredients = Arrays.asList("Кофеїн", "Вода");
            List<String> tea1Ingredients = Arrays.asList("Обліпиха", "Вода");
            List<String> tea2Ingredients = Arrays.asList("Ромашка", "Вода");

            Drink cocacola = new Drink("Кока кола Standart", cocacolaIngredients, 100, 20, 50);
            Drink tea1 = new Drink("Чай обліпиховий", tea1Ingredients, 100, 20, 57);
            Drink tea2 = new Drink("Чай ромашковий", tea2Ingredients, 100, 20, 50);

            drinkRepository.save(cocacola);
            drinkRepository.save(tea1);
            drinkRepository.save(tea2);*/
        }
    }

}
