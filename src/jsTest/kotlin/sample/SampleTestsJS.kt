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
    fun retrieveString() {
        CoroutineScope(Dispatchers.Default).promise {
            val zenExample = retrieveData()
            println("Retrieved string is $zenExample")
        }
    }
}