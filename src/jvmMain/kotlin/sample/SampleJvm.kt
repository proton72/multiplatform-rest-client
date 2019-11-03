package sample

import io.ktor.client.request.get

actual class Sample {
    actual fun checkMe() = 42
}

actual object Platform {
    actual val name: String = "JVM"
}

suspend fun retrieveData() = CommonHttpClient().client.get<String>("https://api.github.com/zen")