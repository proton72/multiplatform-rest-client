package sample

import io.ktor.client.request.get
import kotlinx.serialization.Serializable

val myHttp by lazy { CommonHttpClient() }

suspend fun retrieveString() = myHttp.client.get<String>("https://api.github.com/zen")

@Serializable
data class GithubStartApi(val current_user_authorizations_html_url: String, val current_user_url: String)

suspend fun retrieveJsonData() = myHttp.client.get<GithubStartApi>("https://api.github.com/")