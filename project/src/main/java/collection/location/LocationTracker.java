package collection.location;

import collection.time.Date;
import lesson5.homework.Date1;

public class LocationTracker {

    private static final int TRACKER_SIZE = 1000;

    private Location[] locations;
    private Date[] visitedDates;
    private int count;

    public LocationTracker() {
        locations = new Location[TRACKER_SIZE];
        visitedDates = new Date[TRACKER_SIZE];
    }

    public void addLocationVisited(Location location, Date date) {
        locations[count] = location;
        visitedDates[count] = date;
        count++;
    }

    public Location[] getLocationsByYear(Date date) {
        Location[] locationsByPeriod = new Location[TRACKER_SIZE];
        int locationsByPeriodCount = 0;
        for (int i = 0; i < count; i++) {
            if (visitedDates[i].getYear() == date.getYear()) {
                locationsByPeriod[locationsByPeriodCount] = locations[i];
                locationsByPeriodCount++;
            }
        }
        return getArrayCopy(locationsByPeriod, locationsByPeriodCount);
    }

    public Location[] getLocationsByMonth(Date date) {
        Location[] locationsByPeriod = new Location[TRACKER_SIZE];
        int locationsByPeriodCount = 0;
        for (int i = 0; i < count; i++) {
            if (visitedDates[i].getMonth() == date.getMonth()) {
                locationsByPeriod[locationsByPeriodCount] = locations[i];
                locationsByPeriodCount++;
            }
        }
        return getArrayCopy(locationsByPeriod, locationsByPeriodCount);
    }

    public Location[] getLocationsByDay(Date date) {
        Location[] locationsByPeriod = new Location[TRACKER_SIZE];
        int locationsByPeriodCount = 0;
        for (int i = 0; i < count; i++) {
            if (visitedDates[i].getDay() == date.getDay()) {
                locationsByPeriod[locationsByPeriodCount] = locations[i];
                locationsByPeriodCount++;
            }
        }
        return getArrayCopy(locationsByPeriod, locationsByPeriodCount);
    }


    /**
     * Copies a number of elements to another array and returns it.
     */
    private Location[] getArrayCopy(Location[] initialArray, int numberOfElementsToCopy) {
        Location[] resultArray = new Location[numberOfElementsToCopy];
        for (int i = 0; i < numberOfElementsToCopy; i++) {
            resultArray[i] = initialArray[i];
        }
        return resultArray;
    }

    public Date getVisitedDateByLocationName(String name) {
        for (int i = 0; i < count; i++) {
            if (locations[i].getName().equals(name)) {
                return visitedDates[i];
            }
        }
        return null;
    }


}
