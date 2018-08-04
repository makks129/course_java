package lesson5.homework;

public class LocationTracker {

    public Location[] locations;
    public Date1[] visitedDates;
    public int count;

    public LocationTracker() {
        locations = new Location[100];
        visitedDates = new Date1[100];
    }

    public void addLocationVisited(Location location, Date1 date) {
        locations[count] = location;
        visitedDates[count] = date;
        count++;
    }

    public Location[] getLocationsByYear(Date1 date) {
        Location[] locationsByYear = new Location[100];
        int locationsByYearCount = 0;
        for (int i = 0; i < count; i++) {
            if (visitedDates[i].getYear() == date.getYear()) {
                locationsByYear[locationsByYearCount] = locations[i];
                locationsByYearCount++;
            }
        }

        Location[] locationsByYearCompressed = new Location[locationsByYearCount];
        for (int i = 0; i < locationsByYearCount; i++) {
            locationsByYearCompressed[i] = locationsByYear[i];
        }

        return locationsByYearCompressed;
    }

    public Date1 getVisitedDateByLocationName(String name) {
        for (int i = 0; i < count; i++) {
            if (locations[i].name == name) {
                return visitedDates[i];
            }
        }
        return null;
    }


}
