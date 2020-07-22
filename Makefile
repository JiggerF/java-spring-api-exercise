DOCKER_RUN = docker-compose run --service-ports

build:
	gradle clean build
	docker build -t java-app-build-artifact .
.PHONY: build

run:
	 $(DOCKER_RUN) java-app