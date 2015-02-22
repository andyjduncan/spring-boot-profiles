package com.adjectivecolournoun.bootprofiles.external

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile('live')
class LiveService implements ExternalService {

    @Override
    ServiceResponse request() {
        new ServiceResponse(response: 'Live Answer')
    }
}
