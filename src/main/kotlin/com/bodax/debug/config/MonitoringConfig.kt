package com.luafanti.debug.config

import io.micrometer.core.instrument.MeterRegistry
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class MonitoringConfig {

    @Value("\${spring.application.name}")
    private val appName: String? = null

    @Bean
    fun commonTags(): MeterRegistryCustomizer<MeterRegistry>? {
        return MeterRegistryCustomizer { registry: MeterRegistry ->
            registry.config().commonTags("application", appName)
        }
    }
}
