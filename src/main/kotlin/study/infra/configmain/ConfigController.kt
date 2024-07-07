package study.infra.configmain

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ConfigController {

    @GetMapping("")
    fun showConfig(
        @Value("\${app.config.message}") appName: String,
    ): String {
        return appName
    }
}
