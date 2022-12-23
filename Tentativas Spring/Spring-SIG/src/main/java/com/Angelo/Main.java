package com.Angelo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

/**
*    Configuração automatica:
// * @SpringBootApplication
   *              =
     Configuração Manual:
// * @ComponentScan(basePackages = "com.Angelo")
// * @EnableAutoConfiguration
// * @Configuration
 */
@SpringBootApplication

@RestController
public class Main
{
    public static void main(String[] args)
    {
        //pagina principal
        SpringApplication.run(Main.class, args);
    }
    //pagina greet
    @GetMapping("/greet")
    public GreetResponse greet()
    {
        GreetResponse response = new GreetResponse
            (
                "HELLO",
                List.of("java","Golang","Javascript"),
                new Person("NERO",30,999)
            );
        return response;

    }


    /**
     * record GreetResponse(String greet){}
     *                  =
     *  class GreetResponse
     *     {
     *         private final String greet;
     *
     *         GreetResponse(String greet)
     *         {
     *             this.greet = greet;
     *         }
     *
     *         public String getGreet() {
     *             return greet;
     *         }
     *
     *         @Override
     *         public String toString() {
     *             return "GreetResponse{" +
     *                     "greet='" + greet + '\'' +
     *                     '}';
     *         }
     *
     *         @Override
     *         public boolean equals(Object o) {
     *             if (this == o) return true;
     *             if (o == null || getClass() != o.getClass()) return false;
     *             GreetResponse that = (GreetResponse) o;
     *             return Objects.equals(greet, that.greet);
     *         }
     *
     *         @Override
     *         public int hashCode() {
     *             return Objects.hash(greet);
     *         }
     *     }
     *
     *
     */
    record Person(String name, int age, double cash)
    {

    }
    record GreetResponse
        (
            String greet,
            List<String> favProgramingLanguages,
            Person person
        ){}

//    class GreetResponse
//    {
//        private final String greet;
//
//        GreetResponse(String greet)
//        {
//            this.greet = greet;
//        }
//
//        public String getGreet() {
//            return greet;
//        }
//
//        @Override
//        public String toString() {
//            return "GreetResponse{" +
//                    "greet='" + greet + '\'' +
//                    '}';
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            GreetResponse that = (GreetResponse) o;
//            return Objects.equals(greet, that.greet);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(greet);
//        }
//    }
}
