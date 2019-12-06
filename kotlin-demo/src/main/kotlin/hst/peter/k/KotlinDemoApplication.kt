package hst.peter.k

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class KotlinDemoApplication

fun main(args: Array<String>) {
    runApplication<KotlinDemoApplication>(*args)
}
