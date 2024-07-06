package study.infra.configmain

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConfigMainApplication

fun main(args: Array<String>) {
    runApplication<ConfigMainApplication>(*args)
}
