# Elevator System Design

## Class Diagram

### 1. ElevatorSystem
- **Attributes**:
    - `List<Elevator> elevators`: A list of elevators managed by the system.
    - `Queue<Request> requestQueue`: Queue of pending elevator requests.
- **Methods**:
    - `handleRequest(Request request)`: Adds a request to the system and initiates processing.
    - `assignElevator(Request request)`: Assigns an available elevator based on the request.
    - `manageQueue()`: Manages and processes the request queue.

### 2. Elevator
- **Attributes**:
    - `int id`: Unique identifier for each elevator.
    - `int currentFloor`: The floor where the elevator is currently located.
    - `ElevatorStatus status`: Current status of the elevator (e.g., IDLE, MOVING).
    - `Direction direction`: Current direction of the elevator (UP, DOWN).
    - `int capacity`: Maximum capacity of the elevator.
- **Methods**:
    - `moveUp()`: Moves the elevator up by one floor.
    - `moveDown()`: Moves the elevator down by one floor.
    - `openDoor()`: Opens the elevator doors.
    - `closeDoor()`: Closes the elevator doors.
    - `goToFloor(int floor)`: Directs the elevator to a specified floor.

### 3. Request
- **Attributes**:
    - `int floorNumber`: The floor where the request is made.
    - `Direction direction`: Requested direction (applicable for external requests).
    - `RequestType type`: Indicates if the request is INTERNAL or EXTERNAL.
- **Methods**:
    - `validateRequest()`: Checks if the request is within valid parameters (e.g., floor range).

### 4. FloorPanel
- **Attributes**:
    - `int floorNumber`: Identifies the floor where the panel is located.
- **Methods**:
    - `requestElevator(Direction direction)`: Initiates a request to call an elevator up or down.

### 5. ElevatorPanel
- **Attributes**:
    - `int elevatorId`: Identifies the elevator to which the panel belongs.
- **Methods**:
    - `selectFloor(int floorNumber)`: Allows a passenger to choose a destination floor.
