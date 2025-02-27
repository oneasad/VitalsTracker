package com.oneasad.vitalstracker.data.repository

import com.oneasad.vitalstracker.data.local.VitalsDao
import com.oneasad.vitalstracker.data.model.Vital
import kotlinx.coroutines.flow.Flow

class VitalsRepository(private val dao: VitalsDao) {
    val vitalsList: Flow<List<Vital>> = dao.getAllVitals()
    suspend fun insertVital(vital: Vital) = dao.insertVital(vital)
    suspend fun updateVital(vital: Vital) = dao.update(vital)
    suspend fun deleteVital(vital: Vital) = dao.delete(vital)
    suspend fun deleteAll() = dao.deleteAll()
}
