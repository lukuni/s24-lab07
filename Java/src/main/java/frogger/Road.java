package frogger;

public class Road {

    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    /**
     * Returns the array of occupied positions.
     * 
     * @return the array of occupied positions.
     */
    public boolean[] getOccupied() {
        return this.occupied;
    }

    /**
     * Marks a position as occupied or unoccupied.
     * 
     * @param position the position to mark.
     * @param isOccupied true if the position is occupied, false otherwise.
     */
    public void setOccupied(int position, boolean isOccupied) {
        if (position >= 0 && position < occupied.length) {
            occupied[position] = isOccupied;
        }
    }
}
