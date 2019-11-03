package sample

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.promise
import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTestsJS {
    @Test
    fun testHello() {
        assertTrue("JS" in hello())
    }

    @Test
    fun retrieveStr() {
        CoroutineScope(Dispatchers.Default).promise {
            retrieveString()
        }
            .then { println("Retrieved string is $it") }
            .catch { println("Something went wrong $it") }
    }

    @Test
    fun retrieveJson() {
        CoroutineScope(Dispatchers.Default).promise {
            retrieveJsonData()
        }
            .then { println("Retrieved data is $it") }
            .catch { println("Something went wrong $it") }
    }
}