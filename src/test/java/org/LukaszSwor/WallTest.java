package org.LukaszSwor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

public class WallTest {

    private Wall wall;

    @BeforeEach
    void setUp() {
        Block redWoodBlock = new Block() {
            @Override
            public String getColor() {
                return "red";
            }

            @Override
            public String getMaterial() {
                return "wood";
            }
        };
        Block blueSteelBlock = new Block() {
            @Override
            public String getColor() {
                return "blue";
            }

            @Override
            public String getMaterial() {
                return "steel";
            }
        };
        wall = new Wall(Arrays.asList(redWoodBlock, blueSteelBlock));
    }

    @Test
    void testFindBlockByColor() {
        Optional<Block> foundBlock = wall.findBlockByColor("red");
        assertTrue(foundBlock.isPresent(), "Block of color 'red' should be found");
        assertEquals("red", foundBlock.get().getColor(), "Found block should be red");
    }

    @Test
    void testFindBlocksByMaterial() {
        List<Block> blocksByMaterial = wall.findBlocksByMaterial("wood");
        assertNotNull(blocksByMaterial, "List of blocks should not be null");
        assertEquals(1, blocksByMaterial.size(), "There should be one wood block");
        assertTrue(blocksByMaterial.stream().allMatch(block -> "wood".equals(block.getMaterial())), "All found blocks should be made of wood");
    }

    @Test
    void testCount() {
        int blockCount = wall.count();
        assertEquals(2, blockCount, "Count should return the number of blocks in the wall");
    }
}
