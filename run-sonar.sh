#!/usr/bin/env bash
./gradlew sonarqube \
  -Dsonar.projectKey=andreshincapier_clean-architecture \
  -Dsonar.organization=andreshincapier-key \
  -Dsonar.host.url=https://sonarcloud.io \
  -Dsonar.login=b4484cd317e09b13223ed7d81535ee097f4fd9fd