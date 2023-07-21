package br.com.car

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.ComponentScan

@EnableCaching
@SpringBootApplication
@ComponentScan("br.com.car")
class CarServiceApplication

fun main(args: Array<String>) {
    //val ds = circuitBreakerConfiguration.getCircuitBreaker().decorateSupplier { listTest() }
    //Acima está a configuração caso não utilzar o retrofit

    runApplication<CarServiceApplication>(*args)
}
