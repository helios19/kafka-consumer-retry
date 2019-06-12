package com.ing.kafka.consumer.retry.annotation

import org.springframework.core.annotation.AnnotationUtils
import org.springframework.util.ReflectionUtils
import java.lang.reflect.AnnotatedElement

internal fun Any.retryPolicies() =
        ReflectionUtils.getAllDeclaredMethods(javaClass)
                .mapNotNull { AnnotationUtils.findAnnotation(it as AnnotatedElement, RetryPolicy::class.java) }

internal fun Any.retryListeners() =
        ReflectionUtils.getAllDeclaredMethods(javaClass)
                .mapNotNull { AnnotationUtils.findAnnotation(it as AnnotatedElement, RetryKafkaListener::class.java) }