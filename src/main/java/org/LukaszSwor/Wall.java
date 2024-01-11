package org.LukaszSwor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Interface Structure defines the contract for structures made of blocks.
 * It provides methods to find blocks by color and material, and to count the total number of blocks.
 */
interface Structure {
    Optional<Block> findBlockByColor(String color);

    List<Block> findBlocksByMaterial(String material);

    int count();
}

/**
 * Wall class implements the Structure interface.
 * It represents a wall structure composed of a list of blocks, including composite blocks.
 */
class Wall implements Structure {
    private final List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return blocks.stream().flatMap(block -> block instanceof CompositeBlock
                        ? ((CompositeBlock) block).getBlocks().stream()
                        : Stream.of(block))
                .filter(block -> block.getColor().equals(color))
                .findFirst();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream()
                .flatMap(block -> block instanceof CompositeBlock ?
                        ((CompositeBlock) block).getBlocks().stream()
                        : Stream.of(block))
                .filter(block -> block.getMaterial().equals(material))
                .collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blocks.stream()
                .flatMapToInt(block -> block instanceof CompositeBlock
                        ? ((CompositeBlock) block).getBlocks().stream().mapToInt(b -> 1) :
                        Stream.of(1).mapToInt(i -> 1))
                .sum();
    }
}
/**
 * Interface Block defines the basic properties of a block, including color and material.
 */
interface Block {
    String getColor();
    String getMaterial();
}
/**
 * Interface CompositeBlock extends Block to represent composite blocks.
 * A composite block can contain other blocks.
 */
interface CompositeBlock extends Block {
    List<Block> getBlocks();
}