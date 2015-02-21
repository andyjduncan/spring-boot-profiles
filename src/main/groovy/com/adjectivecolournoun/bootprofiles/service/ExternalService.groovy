package com.adjectivecolournoun.bootprofiles.service

import com.adjectivecolournoun.bootprofiles.domain.ServiceResponse

interface ExternalService {

    ServiceResponse request()
}