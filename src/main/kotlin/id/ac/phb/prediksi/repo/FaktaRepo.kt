package id.ac.phb.prediksi.repo

import id.ac.phb.prediksi.model.Fakta
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FaktaRepo: JpaRepository<Fakta, Int> {
}