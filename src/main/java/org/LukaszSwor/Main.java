package org.LukaszSwor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a wall composed of different types of blocks
        Wall wall = createWall();

        System.out.println("Block by color (red): " + wall.findBlockByColor("red").orElse(null));
        System.out.println("Blocks by material (wood): " + wall.findBlocksByMaterial("wood"));
        System.out.println("Total number of blocks: " + wall.count());
    }

    // Method to create a wall composed of individual and composite blocks
    private static Wall createWall() {
        Block block1 = createRedWoodBlock();
        Block block2 = createBlueSteelBlock();
        CompositeBlock compositeBlock = createCompositeBlock(block1, block2);

        return new Wall(Arrays.asList(block1, compositeBlock, block2));
    }

    private static Block createRedWoodBlock() {
        return new Block() {
            @Override
            public String getColor() {
                return "red";
            }
            @Override
            public String getMaterial() {
                return "wood";
            }
            @Override
            public String toString() {
                return "Block{color='" + getColor() + "', material='" + getMaterial() + "'}";
            }
        };
    }

    private static Block createBlueSteelBlock() {
        return new Block() {
            @Override
            public String getColor() {
                return "blue";
            }
            @Override
            public String getMaterial() {
                return "steel";
            }
            @Override
            public String toString() {
                return "Block{color='" + getColor() + "', material='" + getMaterial() + "'}";
            }
        };
    }

    private static CompositeBlock createCompositeBlock(Block block1, Block block2) {
        return new CompositeBlock() {
            private final List<Block> blocks = Arrays.asList(block1, block2);

            @Override
            public List<Block> getBlocks() {
                return blocks;
            }

            @Override
            public String getColor() {
                return "black";
            }

            @Override
            public String getMaterial() {
                return "plastic";
            }

            @Override
            public String toString() {
                return "CompositeBlock{color='" + getColor() + "', material='" + getMaterial() + "', blocks=" + blocks + "}";
            }
        };
    }
}
