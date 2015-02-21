package com.adjectivecolournoun.bootprofiles.config

import com.adjectivecolournoun.bootprofiles.service.DevService
import com.adjectivecolournoun.bootprofiles.service.ExternalService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

//@Configuration
//@Profile('dev')
class DevConfig {

    @Bean
    ExternalService externalService() {
        new DevService()
    }
}
