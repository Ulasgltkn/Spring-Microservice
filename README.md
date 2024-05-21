# Spring Microservices Project
## Overview
This project is a microservices architecture built using Spring technologies. The following components and technologies are used:

API Gateway: Spring Cloud Gateway
Service Discovery: Eureka Server
Configuration Management: Spring Cloud Config Server
Distributed Tracing: Zipkin
Inter-service Communication: Spring WebClient with HttpExchange
Components
## 1. API Gateway
Technology: Spring Cloud Gateway

Description: The API Gateway acts as a single entry point for all clients. It routes requests to the appropriate microservices and provides functionalities such as rate limiting, security, and monitoring.

Key Features:

Routing
Load Balancing
Path Rewriting
Filters (Global and Per-route)

## 2. Eureka Server
Technology: Spring Cloud Netflix Eureka

Description: Eureka Server is used for service discovery. Microservices register themselves with Eureka Server, which allows them to discover each other and communicate without hardcoding service locations.

Key Features:

Service Registration
Service Discovery
Health Checks

## 3. Config Server
Technology: Spring Cloud Config Server

Description: The Config Server provides centralized configuration management. It allows microservices to retrieve their configuration properties from a centralized location, usually a Git repository.

Key Features:

Centralized Configuration
Environment-Specific Properties
Dynamic Configuration Updates

## 4. Zipkin
Technology: Spring Cloud Sleuth and Zipkin

Description: Zipkin is used for distributed tracing. It helps in tracking the flow of requests across microservices, which is useful for debugging and performance monitoring.

Key Features:

Distributed Tracing
Latency Analysis
Visualization of Request Flow

## 5. HttpExchange
Technology: Spring WebClient

Description: Spring WebClient with HttpExchange is used for inter-service communication. It is a non-blocking, reactive client for making HTTP requests.

Key Features:

Reactive Programming
Non-Blocking I/O
Fluent API

## Running the Project

Start Eureka Server: Launch the Eureka Server for service discovery.
Start Config Server: Run the Config Server application to provide configuration to other services.
Start Zipkin Server: Start the Zipkin server for distributed tracing.
Start Microservices: Launch individual microservices which will register themselves with Eureka Server.
Start API Gateway: Run the API Gateway application to route requests to microservices.