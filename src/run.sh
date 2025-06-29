#!/bin/bash

APPLICATION_JAR="/app/scheduler-cep-consumers-0.0.1.jar"

NEWRELIC_OPTS="-Dnewrelic.config.licennse_key=${newrelic_license_key} \"
              -Dnewrelic.config.attributes.service=scheduler-cep-consumer "


exec  java \ ${NEWRELIC_OPTS} \
      -jar "${APPLICATION_JAR}"