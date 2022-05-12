package com.amazon.ata.dynamodbquery.dao;

import com.amazon.ata.dynamodbquery.converter.ZonedDateTimeConverter;
import com.amazon.ata.dynamodbquery.dao.models.EventAnnouncement;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;

/**
 * Manages access to EventAnnouncement items.
 */
public class EventAnnouncementDao {

    private DynamoDBMapper mapper;

    // Define a constant to represent the converter for our date/time to String
    // THIS IS NOT A REQUIREMENT FOR DYNAMODB
    // This style is used to make it easier to change which converter we use.
    // By making it a constant we only need to change it here for it to be changed everywhere its used
    // Define a constant to be a ZonedDateTimeConverter object
    private static final ZonedDateTimeConverter ZONED_DATE_TIME_CONVERTER = new ZonedDateTimeConverter();

    /**
     * Creates an EventDao with the given DDB mapper.
     * @param mapper DynamoDBMapper
     */
    @Inject
    public EventAnnouncementDao(DynamoDBMapper mapper) {
        this.mapper = mapper;
    }

    /**
     * Gets all event announcements for a specific event.
     *
     * @param eventId The event to get announcements for.
     * @return the list of event announcements.
     */
    public List<EventAnnouncement> getEventAnnouncements(String eventId) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Get all event announcements posted between the given dates for the given event.
     *
     * @param eventId The event to get announcements for.
     * @param startTime The start time to get announcements for.
     * @param endTime The end time to get announcements for.
     * @return The list of event announcements.
     */
    public List<EventAnnouncement> getEventAnnouncementsBetweenDates(String eventId, ZonedDateTime startTime,
                                                                     ZonedDateTime endTime) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Creates a new event announcement.
     *
     * @param eventAnnouncement The event announcement to create.
     * @return The newly created event announcement.
     */
    public EventAnnouncement createEventAnnouncement(EventAnnouncement eventAnnouncement) {
        mapper.save(eventAnnouncement);
        return eventAnnouncement;
    }
}
