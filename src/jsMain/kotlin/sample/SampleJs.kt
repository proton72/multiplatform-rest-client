package sample

import io.ktor.client.request.get

actual class Sample {
    actual fun checkMe() = 12
}

actual object Platform {
    actual val name: String = "JS"
}


suspend fun retrieveData() = CommonHttpClient().client
    .get<String>("https://api.github.com/zen")