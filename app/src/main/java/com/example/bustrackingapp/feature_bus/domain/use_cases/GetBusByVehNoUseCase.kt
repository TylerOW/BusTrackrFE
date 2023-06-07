package com.example.bustrackingapp.feature_bus.domain.use_cases

import com.example.bustrackingapp.core.util.ApiHandler
import com.example.bustrackingapp.core.util.Resource
import com.example.bustrackingapp.feature_bus.domain.models.BusWithRouteAndStops
import com.example.bustrackingapp.feature_bus.domain.repository.BusRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetBusByVehNoUseCase @Inject constructor(
    private val busRepository: BusRepository
) : ApiHandler(){
    operator fun invoke(vehNo : String) : Flow<Resource<BusWithRouteAndStops>> = makeRequest(
        apiCall = {
            busRepository.getBusByVehNo(vehNo)
        }
    )
}