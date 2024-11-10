# Dependency Injection Project

This project demonstrates dependency injection principles using a service-based structure for handling email and SMS functionalities. The application allows for sending, receiving, and forwarding emails and SMS messages, with support for multiple implementations to illustrate the flexibility of dependency injection.

**This work was completed as a part of my undergraduate degree in Applied Software Engineering at Swansea, which CGI Inc. sponsored.**

## Project Structure

The project is organised with service interfaces and implementations that handle messaging tasks, split between email and SMS services.

### Key Components

- **Interfaces**:
    - `IEmailService.java`: Defines the methods for email-related services.
    - `ISmsService.java`: Defines the methods for SMS-related services.
    - `ISendMessage.java` and `IReceiveMessage.java`: Abstract the functionalities for sending and receiving messages.

- **Email Services**:
    - `EmailService.java`: Implements core email functionality.
    - `SendEmail.java`, `ReceiveEmail.java`, `ForwardEmail.java`: Specific classes for sending, receiving, and forwarding emails.
    - `ReceiveJunkEmail.java`: Handles the filtering or processing of junk emails.

- **SMS Services**:
    - `SmsService.java`: Implements core SMS functionality.
    - `SendDomesticSms.java`, `SendInternationalSms.java`: Classes for sending domestic and international SMS.
    - `ReceiveDomesticSms.java`, `ReceiveInternationalSms.java`: Classes for receiving domestic and international SMS.

- **Utility Services**:
    - `MessageService.java`: A general messaging service that can handle email and SMS based on dependency injection.
    - `Main.java`: The main entry point, demonstrating dependency injection by configuring and running various message services.

## Features

- **Dependency Injection**: Allows for flexible swapping of service implementations without modifying the core application logic.
- **Modular Messaging Services**: Separates email and SMS functionalities, supporting domestic and international communication.
- **Interfaces for Flexibility**: Utilises interfaces for message sending and receiving, enabling the implementation of different communication protocols or services.

## Getting Started

### Prerequisites

- Java 8 or later
- Maven for dependency management and building

### Setup

1. Clone the repository to your local machine.
2. Navigate to the project directory and build the project with Maven:
   ```bash
   mvn clean install
    ```
3. Run the application.

### Usage

- **Email Messaging:** Use implementations of IEmailService for sending, receiving, and forwarding emails. Inject different classes, such as SendEmail or ReceiveJunkEmail, based on the application’s needs.
- **SMS Messaging:** Implement ISmsService to handle SMS communications and support domestic and international messages.
- **Dependency Injection Demonstration:** The Main class demonstrates dependency injection by selecting specific implementations for message services at runtime.
