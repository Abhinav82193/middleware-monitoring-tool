# Middleware Monitoring Tool 🚀

**Production-Grade Spring Boot Monitoring Tool built with Actuator**  
Live thread dump, heap dump, deadlock detection, JVM metrics – sab browser se!

Built by an ex-Middleware Engineer (Tomcat/JBoss/WebSphere/EKS) jo raat 3 baje outages se tang aa gaya tha 😭

## 🚀 Features
- `/monitor` endpoint ek baar hit karo aur mil jaayega:
- Deadlock detection (agar hai toh alert!)
- Heap memory used / max
- Total threads count
- Application health
- Thread dump, heap dump, metrics sab Actuator se

## 🛠 Tech Stack
- **Java 21** (Virtual Threads ready)
- Spring Boot 3.5.7
- Spring Boot Actuator
- Maven

## ⚡ Quick Start (10 seconds mein chal jaayega)

```bash
git clone https://github.com/Abhinav82193/middleware-monitoring-tool.git
cd middleware-monitoring-tool
./mvnw spring-boot:run