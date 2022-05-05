package io.stocker.center

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import reactor.core.publisher.Mono


/**
 * @author Jay
 */
@SpringBootApplication
class StockerApplication {
}

fun main(args: Array<String>) {
    runApplication<StockerApplication>(*args)
}

@RestController
class HelloController {
    @GetMapping("/hello")
    fun hello() = Mono.just("hello stocker")
}