package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a physical site or venue where events can be hosted.
 * Stores location, capacity, available hours, amenities, and a contact person.
 */
public class Site implements Serializable {

    // Ensures compatibility during serialization.

    private static final long serialVersionUID = 1L;
    // ATTRIBUTES
    private int id;
    private String name; // Site name
    private String location; // Site location
    private int maxCapacity; // Maximum capacity
    private ArrayList<String> availableHours; // Available hours
    private ArrayList<String> amenities; // Amenities
    private String contactPerson; // Contact person
    // CONSTRUCTOR

    /**
     * Creates a new Site with all required information.
     */
    public Site(String name, String location, int maxCapacity, int id,
            ArrayList<String> availableHours, ArrayList<String> amenities,
            String contactPerson) {

        this.name = name;
        this.location = location;
        this.maxCapacity = maxCapacity;
        this.availableHours = availableHours;
        this.amenities = amenities;
        this.contactPerson = contactPerson;
    }

    // secon CONSTRUCTOR
    public Site(int id, String name, String location, int capacity) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.maxCapacity = capacity;
        this.availableHours = new ArrayList<>();
        this.amenities = new ArrayList<>();
        this.contactPerson = "";
    }

    // BUSINESS LOGIC

    /**
     * Checks whether the site has available time slots.
     */
    public boolean isAvailable() {
        return !availableHours.isEmpty();
    }

    /**
     * Books a time slot (removes it from available hours).
     */
    public void bookSlot(String hour) {
        availableHours.remove(hour);
    }

    // GETTERS

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getId() {
        return this.id;
    }

    /**
     * Returns available hours (list can still be modified externally).
     */
    public List<String> getAvailableHours() {
        return availableHours;
    }

    public ArrayList<String> getAmenities() {
        return amenities;
    }

    public String getContactPerson() {
        return contactPerson;
    }
}
