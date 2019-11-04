package sample

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.promise
import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTestsJS {
    @Test
    fun testHello() {
        assertTrue("JS" in hello())
    }

    @Test
    fun retrieveStr() = GlobalScope.promise {
        val res = retrieveString()
        res
    }
        .then {
            println("Retrieved string is $it")
            assertTrue { it == "323" }
        }
        .catch {
            println("Something went wrong $it")
            assertTrue { it is Error }
        }

    //@Test
    fun retrieveJson() = GlobalScope.promise {
        retrieveJsonData()
    }
        .then {
            println("Retrieved data is $it")
        }
        .catch { println("Something went wrong $it") }
}