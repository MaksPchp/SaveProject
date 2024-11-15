#!/bin/bash
mvn "-Dtest=tests.$1.*Test" clean test && allure serve -p 80 /app/target/allure-results
