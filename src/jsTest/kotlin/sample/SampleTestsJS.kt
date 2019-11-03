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
            val zenExample = retrieveString()
            println("Retrieved string is $zenExample")
        }
    }
}