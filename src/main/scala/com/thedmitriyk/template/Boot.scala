package com.thedmitriyk.template

object Boot extends App:
    val logger = org.slf4j.LoggerFactory.getLogger(this.getClass)

    logger.info("Hello template!")
