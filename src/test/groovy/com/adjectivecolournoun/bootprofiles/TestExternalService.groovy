package com.adjectivecolournoun.bootprofiles

import com.adjectivecolournoun.bootprofiles.external.ExternalService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(loader = SpringApplicationContextLoader, classes = [Application])
@ActiveProfiles('test')
class TestExternalService extends Specification {

    @Autowired
    ExternalService service

    void 'uses test service implementation'() {
        when:
        def message = service.request().response

        then:
        message == 'Test Answer'
    }
}