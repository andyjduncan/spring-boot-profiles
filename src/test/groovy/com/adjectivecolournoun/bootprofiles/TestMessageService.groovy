package com.adjectivecolournoun.bootprofiles

import com.adjectivecolournoun.bootprofiles.message.MessageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(loader = SpringApplicationContextLoader, classes = [Application])
class TestMessageService extends Specification {

    @Autowired
    MessageService service

    void 'uses test application properties'() {
        when:
        def message = service.message()

        then:
        message == 'Test Message'
    }
}