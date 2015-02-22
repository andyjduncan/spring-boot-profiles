package com.adjectivecolournoun.bootprofiles.external

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile('test')
class TestService implements ExternalService {

    @Override
    ServiceResponse request() {
        new ServiceResponse(response: 'Test Answer')
    }
}
