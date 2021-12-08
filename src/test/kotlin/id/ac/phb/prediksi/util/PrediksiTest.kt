package id.ac.phb.prediksi.util

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PrediksiTest {

    @Autowired
    lateinit var prediksi: Prediksi

    @Test
    fun convertDateTest() {
        val result =  prediksi.convertDate("2005-06-20")
        Assertions.assertEquals(20050620, result)
    }

}