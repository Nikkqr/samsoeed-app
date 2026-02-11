package com.samsoeed.entities

import org.springframework.context.support.BeanDefinitionDsl

class User (id : UInt,
            name : String,
            surname : String,
            role : Role,
            email : String,
            password : String)