package com.adjectivecolournoun.bootprofiles

import com.adjectivecolournoun.bootprofiles.external.ExternalService
import com.adjectivecolournoun.bootprofiles.message.MessageService
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application {

    // Run this in the root of the project
    static void main(String... args) {
        def context = SpringApplication.run(Application)

        def service = context.getBean(ExternalService)

        assert service.request().response == 'Live Answer'

        def messageService = context.getBean(MessageService)

        assert messageService.message() == 'Live Message'

        SpringApplication.exit(context)
    }
}
