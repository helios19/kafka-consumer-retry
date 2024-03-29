package com.ing.kafka.consumer.retry.annotation

annotation class RetryPolicy(
        val id: String,
        val topic: String,
        val retries: Int,
        val dlqTopic: String,
        val retryInterval: Long = 1L,
        val backoffStrategy: BackOffStrategy = BackOffStrategy.EXPONENTIAL
)