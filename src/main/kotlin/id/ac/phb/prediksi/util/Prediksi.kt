package id.ac.phb.prediksi.util

import id.ac.phb.prediksi.model.Resume
import id.ac.phb.prediksi.repo.ResumeRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class Prediksi {

    @Autowired
    lateinit var resumeRepo: ResumeRepo

    fun getLeastSquare(tglAwal: String, tglAkhir: String): Double {
        val awal = convertDate(tglAwal)
        val akhir = convertDate(tglAkhir)

        val data = resumeRepo.findByTglBetween(awal, akhir)

        val a = calculateA(data)


        return 1.75
    }

    fun calculateB(data: List<Resume>): Double {

        return 0.0
    }

    /**
     * param i : jumlah cacah data
     */
    fun generateX(i: Int): List<Int> {
        var result = mutableListOf<Int>()
        if(i % 2 == 0) {
            var j = i - 1
            j -= (j*2)
            var n = 0
            for(n in 1..i) {
                result.add(j)
                j+=2
            }
        } else {
            var j = Integer(i / 2) - i + 1
            var n = 0
            for(n in 1..i) {
                result.add(j)
                j++
            }
        }
        return result
    }

    fun calculateA(data: List<Resume>): Double {
        var nilai = 0.0;
        data.forEach {
            nilai += it.nilai
        }
        return nilai / data.size
    }

    fun convertDate(tgl: String): Int {
        val tanggal = tgl.substring(0,4) + tgl.substring(5,7) +
                tgl.substring(8,10)
        return Integer.parseInt(tanggal)
    }

}