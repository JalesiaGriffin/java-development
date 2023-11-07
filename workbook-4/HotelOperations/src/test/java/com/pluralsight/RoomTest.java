package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RoomTest {
    @Test
    public void CheckIn_RoomIsOccupied_RoomIsDirty() {
        //arrange
        Room room = new Room(1, 2);

        //act
        room.checkIn();

        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void CheckOut_RoomIsOccupied_RoomIsNotOccupied() {
        //arrange
        Room room = new Room(1, 2);
        room.checkIn();

        //act
        room.checkout();

        //assert
        assertFalse(room.isOccupied());
    }
    @Test
    public void CleanRoom_RoomIsOccupied_RoomRemainsDirty() {
        //arrange
        Room room = new Room(1, 2);
        room.checkIn();

        //act
        room.cleanRoom();

        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }
}