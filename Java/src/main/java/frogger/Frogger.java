package frogger;

public class Frogger {

    private final Road road;
    private int position;
    private final Records records;
    private String firstName, lastName, phoneNumber, zipCode, state, gender;

    public Frogger(Road road, int position, Records records, String firstName, String lastName, String phoneNumber,
                   String zipCode, String state, String gender) {
        this.road = road;
        this.position = position;
        this.records = records;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.state = state;
        this.gender = gender;
    }

    /**
     * Moves Frogger forward or backward.
     * 
     * @param forward true if move forward, false if move backward.
     * @return true if move is successful, false otherwise.
     */
    public boolean move(boolean forward) {
        int nextPosition = calculateNextPosition(forward);
        if (!isValidPosition(nextPosition) || isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

    /**
     * Calculates the next position of Frogger.
     * 
     * @param forward true if moving forward, false if backward.
     * @return the next position.
     */
    private int calculateNextPosition(boolean forward) {
        return this.position + (forward ? 1 : -1);
    }

    /**
     * Checks if the position is valid (within bounds).
     * 
     * @param position the position to check.
     * @return true if valid, false otherwise.
     */
    private boolean isValidPosition(int position) {
        return position >= 0 && position < road.getOccupied().length;
    }

    /**
     * Checks if the position is occupied.
     * 
     * @param position the position to check.
     * @return true if occupied, false otherwise.
     */
    private boolean isOccupied(int position) {
        return road.getOccupied()[position];
    }

    /**
     * Records Frogger's information.
     * 
     * @return true if successful, false otherwise.
     */
    public boolean recordMyself() {
        FroggerID froggerID = new FroggerID(firstName, lastName, phoneNumber, zipCode, state, gender);
        return records.addRecord(froggerID);
    }
}
