package com.ryunen344.demo.config

import org.h2.tools.Server
import org.slf4j.Logger
import org.springframework.context.annotation.Configuration
import org.springframework.context.event.ContextClosedEvent
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.context.event.EventListener
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories
import org.springframework.stereotype.Component

@Component
@Configuration
@EnableR2dbcRepositories
class H2Config(private val log: Logger) {

    lateinit var webServer: Server
    lateinit var server: Server

    @EventListener(ContextRefreshedEvent::class)
    fun start() {
        log.debug("start")
        webServer = Server.createWebServer("-webPort", "8082", "-tcpAllowOthers").start()
        server = Server.createTcpServer("-tcpPort", "9092", "-tcpAllowOthers").start()
        log.debug("web server status {} ", webServer.status)
        log.debug("server status {} ", server.status)
    }

    @EventListener(ContextClosedEvent::class)
    fun end() {
        log.debug("end")
        log.debug("web server status {} ", webServer.status)
        log.debug("server status {} ", server.status)
        webServer.stop()
        server.stop()
    }
}