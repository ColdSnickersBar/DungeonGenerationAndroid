package com.coldsnickersbar.dungeongenerationtests;

import com.coldsnickersbar.dungeongeneration.DungeonGenerator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class DungeonGeneratorTests {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void canInstantiate() throws Exception {

        DungeonGenerator generator = new DungeonGenerator();
    }
    
    @Test
    public void stampsRoomIntoGrid() throws Exception {

    }
}