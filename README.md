
# JWT Authentication

## Additional Note
 - The code can be found in the **master branch**.

## Overview
This project uses **JWT (JSON Web Token)** for securing API endpoints. JWT is a compact and self-contained way of transmitting information between two parties (client and server) as a JSON object. It allows stateless, secure authentication, removing the need to store session data on the server.

## How JWT Authentication Works
1. **User Authentication**: The user sends their credentials (like username and password) to a login endpoint.
2. **Token Generation**: If the credentials are valid, the server generates a JWT. This token contains user information (such as ID, roles, etc.) and is signed using a secret key.
3. **Token Storage**: The client stores this token (usually in local storage or cookies).
4. **Token Usage**: For protected endpoints, the client sends the JWT in the `Authorization` header with the following format:
    ```
    Authorization: Bearer <token>
    ```
5. **Token Verification**: The server verifies the token on each request. If the token is valid, the server processes the request; otherwise, it responds with an error (e.g., `401 Unauthorized`).

## JWT Structure
A JWT consists of three parts, separated by dots (`.`):
- **Header**: Contains metadata about the token (e.g., algorithm used for signing).
- **Payload**: Contains claims about the user (e.g., user ID, roles, and expiration time).
- **Signature**: Ensures that the token has not been tampered with, using the header, payload, and a secret key.

### Example JWT
eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c

### Header
The header typically consists of two parts:
- The type of token (JWT).
- The signing algorithm (e.g., HS256).

### Payload
The payload contains claims. Claims are statements about an entity (typically, the user) and additional metadata. Standard claims include:
- `iss` (issuer)
- `sub` (subject, i.e., user)
- `exp` (expiration time)


