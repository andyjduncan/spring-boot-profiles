package com.adjectivecolournoun.bootprofiles.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class MessageService {

    @Value('${bootprofiles.message}')
    private String message

    String message() {
        message
    }
}
