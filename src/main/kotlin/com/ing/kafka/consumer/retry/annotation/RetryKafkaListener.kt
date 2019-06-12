package com.ing.kafka.consumer.retry.annotation

annotation class RetryKafkaListener(
        val retryPolicyId: String
)