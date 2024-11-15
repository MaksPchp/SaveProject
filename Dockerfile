FROM maven:3-openjdk-11-slim

ARG ALLURE_VERSION=2.17.2
ARG REPO_BASE=https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/

RUN set -x && tar=allure-commandline-$ALLURE_VERSION.tgz \
	&& url=$REPO_BASE$ALLURE_VERSION/$tar \
	&& curl -O $url \
	&& mkdir -p /opt/allure \
	&& tar xvf $tar -C /opt/allure --strip-components=1 \
	&& rm *.tgz \
	&& ln -s /opt/allure/bin/allure /usr/bin

RUN apt update && apt install -y --no-install-recommends curl xvfb chromium

WORKDIR /app
COPY . .
RUN ln -s /app/xvfb-chromium /usr/bin/google-chrome

ENTRYPOINT ["/app/run.sh"]