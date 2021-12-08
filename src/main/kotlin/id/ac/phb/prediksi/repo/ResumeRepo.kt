package id.ac.phb.prediksi.repo

import id.ac.phb.prediksi.model.Resume
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ResumeRepo: JpaRepository<Resume, Int> {

    fun findByTglBetween(tglAwal: Int, tglAkhir: Int): List<Resume>

}