# README

Rock-paper-scissors game where one player always plays Rock and the other plays a random move, as a backend developer I focused on build a good backend service.

## Backend
Application is built over Spring Boot and runs in port 8080,
run 'mvn spring-boot:run' on root folder to start.

### Endpoints

- /game/play : Play a basic Rock-Paper-Scissors game
- /scores/totalGames: Show total games played
- /scores/totalP1Wins: Shows total games won by player 1
- /scores/totalP2Wins: Shows total games won by player 2
- /scores/totalDraws: Shows total games with draw result

## Frontend
Built with Thymeleaf template engine, used javascript to manage client-side data and to do calls to the backend endpoinds providing the required services.

### Views
- / : Main view to play a game and show recent game results
- /statistics: Shows statistics of the game