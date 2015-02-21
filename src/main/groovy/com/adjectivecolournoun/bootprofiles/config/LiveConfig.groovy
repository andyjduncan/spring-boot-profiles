package com.adjectivecolournoun.bootprofiles.config

import com.adjectivecolournoun.bootprofiles.service.ExternalService
import com.adjectivecolournoun.bootprofiles.service.LiveService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

//@Configuration
//@Profile('live')
class LiveConfig {

    @Bean
    ExternalService externalService() {
        new LiveService()
    }
}
