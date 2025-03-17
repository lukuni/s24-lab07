package frogger;

import java.util.HashSet;
import java.util.Set;

public class Records {

    private final Set<FroggerID> records;

    public Records() {
        this.records = new HashSet<>();
    }

    /**
     * Adds a frogger's record.
     * 
     * @param froggerID the frogger's information to add.
     * @return true if the record was added, false if it already exists.
     */
    public boolean addRecord(FroggerID froggerID) {
        return records.add(froggerID);
    }
}
