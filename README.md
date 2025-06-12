# Spring Boot debug app

Spring Boot application for testing Argo CD deployments.
The application has web server to expose endpoints that can print information to help investigate your Kubernetes/Helm setup.

## Endpoints

* `/envs` - return list of all OS envs injected to docker image or Pod
* `/logs/info` `/logs/debug` `/logs/exception` - produce logs according to log level.