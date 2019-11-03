package sample

import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTestsJVM {
    @Test
    fun testHello() {
        assertTrue("JVM" in hello())
    }

    @Test
    fun testApi() {
        runBlocking {
            println(retrieveString())
        }
    }

    @Test
    fun testApiSerialization() {
        runBlocking {
            println(retrieveJsonData())
        }
    }
}