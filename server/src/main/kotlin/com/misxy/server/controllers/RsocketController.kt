package com.misxy.server.controllers

import com.misxy.server.models.Notification
import org.slf4j.LoggerFactory
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller

@Controller
class RsocketController {
    val logger = LoggerFactory.getLogger(RsocketController::class.java)

    @MessageMapping("request-response")
    fun requestResponse(notification: Notification): Notification{
        logger.info("Received notification for my-request-response:  $notification")
        return Notification(notification.destination, notification.source, "In response to: ${notification.text}")
    }
}
