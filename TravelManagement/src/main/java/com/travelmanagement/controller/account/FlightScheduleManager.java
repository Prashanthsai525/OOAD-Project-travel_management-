package com.travelmanagement.controller.account;

public class FlightScheduleManager {
    private static FlightScheduleManager instance;
    private final List<FlightSchedule> schedules;

    // Private constructor to prevent instantiation from outside
    private FlightScheduleManager() {
        schedules = new ArrayList<>();
    }

    // Static method to get the instance of the class
    public static FlightScheduleManager getInstance() {
        if (instance == null) {
            synchronized (FlightScheduleManager.class) {
                if (instance == null) {
                    instance = new FlightScheduleManager();
                }
            }
        }
        return instance;
    }

    public List<FlightSchedule> getAllSchedules() {
        return schedules;
    }

    public void addSchedule(FlightSchedule schedule) {
        schedules.add(schedule);
    }

    public void deleteSchedule(FlightSchedule schedule) {
        schedules.remove(schedule);
    }
}
