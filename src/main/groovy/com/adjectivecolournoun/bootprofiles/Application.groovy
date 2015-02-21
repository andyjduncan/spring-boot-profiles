package com.adjectivecolournoun.bootprofiles

import com.adjectivecolournoun.bootprofiles.service.ExternalService
import com.adjectivecolournoun.bootprofiles.service.MessageService
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application {

    static void main(String... args) {
        def application = new SpringApplication(Application)

        application.setAdditionalProfiles('live')
        def context = application.run(args)

        def service = context.getBean(ExternalService)

        assert service.request().response == 'Live Answer'

        def messageService = context.getBean(MessageService)

        assert messageService.message() == 'Live Message'

        SpringApplication.exit(context)
    }
}
