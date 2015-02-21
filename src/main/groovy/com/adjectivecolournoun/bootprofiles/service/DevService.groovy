package com.adjectivecolournoun.bootprofiles.service

import com.adjectivecolournoun.bootprofiles.domain.ServiceResponse
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile('dev')
class DevService implements ExternalService {

    @Override
    ServiceResponse request() {
        new ServiceResponse(response: 'Dev Answer')
    }
}
