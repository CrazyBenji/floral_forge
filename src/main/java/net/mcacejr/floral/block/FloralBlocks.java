package net.mcacejr.floral.block;

import net.mcacejr.floral.FloralForge;
import net.mcacejr.floral.block.custom.*;
import net.mcacejr.floral.effect.FloralMobEffects;
import net.mcacejr.floral.item.FloralItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class FloralBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FloralForge.MOD_ID);

    public static final RegistryObject<Block> BLACK_PETUNIA;
    public static final RegistryObject<Block> POTTED_BLACK_PETUNIA;
    public static final RegistryObject<Block> RED_PETUNIA;
    public static final RegistryObject<Block> POTTED_RED_PETUNIA;
    public static final RegistryObject<Block> PURPLE_BELLFLOWER;
    public static final RegistryObject<Block> POTTED_PURPLE_BELLFLOWER;
    public static final RegistryObject<Block> GREEN_CONEFLOWER;
    public static final RegistryObject<Block> POTTED_GREEN_CONEFLOWER;
    public static final RegistryObject<Block> PURPLE_CHIMNEY_BELLFLOWER;
    public static final RegistryObject<Block> BLUE_AUBRIETAS;
    public static final RegistryObject<Block> LIGHT_GRAY_TULIP;
    public static final RegistryObject<Block> POTTED_LIGHT_GRAY_TULIP;
    public static final RegistryObject<Block> GRAY_TULIP;
    public static final RegistryObject<Block> POTTED_GRAY_TULIP;
    public static final RegistryObject<Block> BLACK_TULIP;
    public static final RegistryObject<Block> POTTED_BLACK_TULIP;
    public static final RegistryObject<Block> BROWN_TULIP;
    public static final RegistryObject<Block> POTTED_BROWN_TULIP;
    public static final RegistryObject<Block> YELLOW_TULIP;
    public static final RegistryObject<Block> POTTED_YELLOW_TULIP;
    public static final RegistryObject<Block> LIME_TULIP;
    public static final RegistryObject<Block> POTTED_LIME_TULIP;
    public static final RegistryObject<Block> GREEN_TULIP;
    public static final RegistryObject<Block> POTTED_GREEN_TULIP;
    public static final RegistryObject<Block> CYAN_TULIP;
    public static final RegistryObject<Block> POTTED_CYAN_TULIP;
    public static final RegistryObject<Block> LIGHT_BLUE_TULIP;
    public static final RegistryObject<Block> POTTED_LIGHT_BLUE_TULIP;
    public static final RegistryObject<Block> BLUE_TULIP;
    public static final RegistryObject<Block> POTTED_BLUE_TULIP;
    public static final RegistryObject<Block> PURPLE_TULIP;
    public static final RegistryObject<Block> POTTED_PURPLE_TULIP;
    public static final RegistryObject<Block> MAGENTA_TULIP;
    public static final RegistryObject<Block> POTTED_MAGENTA_TULIP;
    public static final RegistryObject<Block> GREEN_DAHLIA;
    public static final RegistryObject<Block> POTTED_GREEN_DAHLIA;
    public static final RegistryObject<Block> MAGENTA_CABARET;
    public static final RegistryObject<Block> POTTED_MAGENTA_CABARET;
    public static final RegistryObject<Block> LIME_BELLFLOWER;
    public static final RegistryObject<Block> POTTED_LIME_BELLFLOWER;
    public static final RegistryObject<Block> LIME_CHIMNEY_BELLFLOWER;
    public static final RegistryObject<Block> FLORAL_STONE;
    public static final RegistryObject<Block> FLORAL_STONE_BRICKS;
    public static final RegistryObject<Block> COBBLED_FLORAL_STONE;
    public static final RegistryObject<Block> FLORAL_STONE_STAIRS;
    public static final RegistryObject<Block> FLORAL_STONE_SLAB;
    public static final RegistryObject<Block> FLORAL_STONE_WALL;
    public static final RegistryObject<Block> FLORAL_STONE_BRICK_STAIRS;
    public static final RegistryObject<Block> FLORAL_STONE_BRICK_SLAB;
    public static final RegistryObject<Block> FLORAL_STONE_BRICK_WALL;
    public static final RegistryObject<Block> COBBLED_FLORAL_STONE_STAIRS;
    public static final RegistryObject<Block> COBBLED_FLORAL_STONE_SLAB;
    public static final RegistryObject<Block> COBBLED_FLORAL_STONE_WALL;
    public static final RegistryObject<Block> STEM_LOG;
    public static final RegistryObject<Block> STEM_WOOD;
    public static final RegistryObject<Block> STRIPPED_STEM_LOG;
    public static final RegistryObject<Block> STRIPPED_STEM_WOOD;
    public static final RegistryObject<Block> STEM_PLANKS;
    public static final RegistryObject<Block> STEM_STAIRS;
    public static final RegistryObject<Block> STEM_SLAB;
    public static final RegistryObject<Block> STEM_FENCE;
    public static final RegistryObject<Block> STEM_FENCE_GATE;
    public static final RegistryObject<Block> STEM_TRAPDOOR;
    public static final RegistryObject<Block> STEM_DOOR;
    public static final RegistryObject<Block> STEM_BUTTON;
    public static final RegistryObject<Block> STEM_PRESSURE_PLATE;
    public static final RegistryObject<Block> PURPLE_WOLFSBANE;
    public static final RegistryObject<Block> POTTED_PURPLE_WOLFSBANE;
    public static final RegistryObject<Block> ROCKY_SEDUM;
    public static final RegistryObject<Block> STEM_LILY;
    public static final RegistryObject<Block> TWISTING_ROOTS;
    public static final RegistryObject<Block> BONES_BANE;
    public static final RegistryObject<Block> WEEPING_ROOTS;
    public static final RegistryObject<Block> WARDEN_PRIMROSE;
    public static final RegistryObject<Block> CHORUS_TULIP;
    public static final RegistryObject<Block> WHITE_OVERFLOWING_BELLFLOWER;

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        FloralItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void registerFloralBlocks(IEventBus modEventBus) {
        FloralForge.LOGGER.info("Registering ModBlocks for " + FloralForge.MOD_ID);
        FloralPlantHeadBlocks.register();
        FloralPlantBodyBlocks.register();
        BLOCKS.register(modEventBus);
    }

    static {
        BLACK_PETUNIA = registerBlock("black_petunia",
                () -> new FlowerBlock(() -> MobEffects.WEAKNESS, 10, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
        POTTED_BLACK_PETUNIA = registerBlock("potted_black_petunia",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, BLACK_PETUNIA, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

        RED_PETUNIA = registerBlock("red_petunia",
                () -> new FlowerBlock(() -> MobEffects.HEAL, 1, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
        POTTED_RED_PETUNIA = registerBlock("potted_red_petunia",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, RED_PETUNIA, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

        PURPLE_BELLFLOWER = registerBlock("purple_bellflower",
                () -> new FlowerBlock(() -> MobEffects.LEVITATION, 7, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
        POTTED_PURPLE_BELLFLOWER = registerBlock("potted_purple_bellflower",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, PURPLE_BELLFLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

        GREEN_CONEFLOWER = registerBlock("green_coneflower",
                () -> new FlowerBlock(() -> MobEffects.LUCK, 10, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
        POTTED_GREEN_CONEFLOWER = registerBlock("potted_green_coneflower",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, GREEN_CONEFLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

        PURPLE_CHIMNEY_BELLFLOWER = registerBlock("purple_chimney_bellflower",
                () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion().noCollission()));

        BLUE_AUBRIETAS = registerBlock("blue_aubrietas",
                () -> new PinkPetalsBlock(BlockBehaviour.Properties.copy(Blocks.PINK_PETALS).noOcclusion().noCollission()));

        LIGHT_GRAY_TULIP = registerBlock("light_gray_tulip",
                () -> new FlowerBlock(() -> MobEffects.WEAKNESS, 7, BlockBehaviour.Properties.copy(Blocks.WHITE_TULIP).noOcclusion().noCollission()));
        POTTED_LIGHT_GRAY_TULIP = registerBlock("potted_light_gray_tulip",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, LIGHT_GRAY_TULIP, BlockBehaviour.Properties.copy(Blocks.POTTED_WHITE_TULIP).noOcclusion()));

        GRAY_TULIP = registerBlock("gray_tulip",
                () -> new FlowerBlock(() -> MobEffects.WEAKNESS, 7, BlockBehaviour.Properties.copy(Blocks.WHITE_TULIP).noOcclusion().noCollission()));
        POTTED_GRAY_TULIP = registerBlock("potted_gray_tulip",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, GRAY_TULIP, BlockBehaviour.Properties.copy(Blocks.POTTED_WHITE_TULIP).noOcclusion()));

        BLACK_TULIP = registerBlock("black_tulip",
                () -> new FlowerBlock(() -> MobEffects.WEAKNESS, 7, BlockBehaviour.Properties.copy(Blocks.WHITE_TULIP).noOcclusion().noCollission()));
        POTTED_BLACK_TULIP = registerBlock("potted_black_tulip",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, BLACK_TULIP, BlockBehaviour.Properties.copy(Blocks.POTTED_WHITE_TULIP).noOcclusion()));

        BROWN_TULIP = registerBlock("brown_tulip",
                () -> new FlowerBlock(() -> MobEffects.WEAKNESS, 7, BlockBehaviour.Properties.copy(Blocks.WHITE_TULIP).noOcclusion().noCollission()));
        POTTED_BROWN_TULIP = registerBlock("potted_brown_tulip",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, BROWN_TULIP, BlockBehaviour.Properties.copy(Blocks.POTTED_WHITE_TULIP).noOcclusion()));

        YELLOW_TULIP = registerBlock("yellow_tulip",
                () -> new FlowerBlock(() -> MobEffects.WEAKNESS, 7, BlockBehaviour.Properties.copy(Blocks.WHITE_TULIP).noOcclusion().noCollission()));
        POTTED_YELLOW_TULIP = registerBlock("potted_yellow_tulip",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, YELLOW_TULIP, BlockBehaviour.Properties.copy(Blocks.POTTED_WHITE_TULIP).noOcclusion()));

        LIME_TULIP = registerBlock("lime_tulip",
                () -> new FlowerBlock(() -> MobEffects.WEAKNESS, 7, BlockBehaviour.Properties.copy(Blocks.WHITE_TULIP).noOcclusion().noCollission()));
        POTTED_LIME_TULIP = registerBlock("potted_lime_tulip",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, LIME_TULIP, BlockBehaviour.Properties.copy(Blocks.POTTED_WHITE_TULIP).noOcclusion()));

        GREEN_TULIP = registerBlock("green_tulip",
                () -> new FlowerBlock(() -> MobEffects.WEAKNESS, 7, BlockBehaviour.Properties.copy(Blocks.WHITE_TULIP).noOcclusion().noCollission()));
        POTTED_GREEN_TULIP = registerBlock("potted_green_tulip",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, GREEN_TULIP, BlockBehaviour.Properties.copy(Blocks.POTTED_WHITE_TULIP).noOcclusion()));

        CYAN_TULIP = registerBlock("cyan_tulip",
                () -> new FlowerBlock(() -> MobEffects.WEAKNESS, 7, BlockBehaviour.Properties.copy(Blocks.WHITE_TULIP).noOcclusion().noCollission()));
        POTTED_CYAN_TULIP = registerBlock("potted_cyan_tulip",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, CYAN_TULIP, BlockBehaviour.Properties.copy(Blocks.POTTED_WHITE_TULIP).noOcclusion()));

        LIGHT_BLUE_TULIP = registerBlock("light_blue_tulip",
                () -> new FlowerBlock(() -> MobEffects.WEAKNESS, 7, BlockBehaviour.Properties.copy(Blocks.WHITE_TULIP).noOcclusion().noCollission()));
        POTTED_LIGHT_BLUE_TULIP = registerBlock("potted_light_blue_tulip",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, LIGHT_BLUE_TULIP, BlockBehaviour.Properties.copy(Blocks.POTTED_WHITE_TULIP).noOcclusion()));

        BLUE_TULIP = registerBlock("blue_tulip",
                () -> new FlowerBlock(() -> MobEffects.WEAKNESS, 7, BlockBehaviour.Properties.copy(Blocks.WHITE_TULIP).noOcclusion().noCollission()));
        POTTED_BLUE_TULIP = registerBlock("potted_blue_tulip",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, BLUE_TULIP, BlockBehaviour.Properties.copy(Blocks.POTTED_WHITE_TULIP).noOcclusion()));

        PURPLE_TULIP = registerBlock("purple_tulip",
                () -> new FlowerBlock(() -> MobEffects.WEAKNESS, 7, BlockBehaviour.Properties.copy(Blocks.WHITE_TULIP).noOcclusion().noCollission()));
        POTTED_PURPLE_TULIP = registerBlock("potted_purple_tulip",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, PURPLE_TULIP, BlockBehaviour.Properties.copy(Blocks.POTTED_WHITE_TULIP).noOcclusion()));

        MAGENTA_TULIP = registerBlock("magenta_tulip",
                () -> new FlowerBlock(() -> MobEffects.WEAKNESS, 7, BlockBehaviour.Properties.copy(Blocks.WHITE_TULIP).noOcclusion().noCollission()));
        POTTED_MAGENTA_TULIP = registerBlock("potted_magenta_tulip",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, MAGENTA_TULIP, BlockBehaviour.Properties.copy(Blocks.POTTED_WHITE_TULIP).noOcclusion()));

        GREEN_DAHLIA = registerBlock("green_dahlia",
                () -> new FlowerBlock(() -> MobEffects.SATURATION, 7, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
        POTTED_GREEN_DAHLIA = registerBlock("potted_green_dahlia",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, GREEN_DAHLIA, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

        MAGENTA_CABARET = registerBlock("magenta_cabaret",
                () -> new FlowerBlock(() -> MobEffects.SATURATION, 7, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
        POTTED_MAGENTA_CABARET = registerBlock("potted_magenta_cabaret",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, MAGENTA_CABARET, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

        LIME_BELLFLOWER = registerBlock("lime_bellflower",
                () -> new FlowerBlock(() -> MobEffects.SATURATION, 7, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
        POTTED_LIME_BELLFLOWER = registerBlock("potted_lime_bellflower",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, LIME_BELLFLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

        LIME_CHIMNEY_BELLFLOWER = registerBlock("lime_chimney_bellflower",
                () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));

        FLORAL_STONE = registerBlock("floral_stone",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
        FLORAL_STONE_BRICKS = registerBlock("floral_stone_bricks",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
        COBBLED_FLORAL_STONE = registerBlock("cobbled_floral_stone",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

        FLORAL_STONE_STAIRS = registerBlock("floral_stone_stairs",
                () -> new StairBlock(() -> FloralBlocks.FLORAL_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));
        FLORAL_STONE_SLAB = registerBlock("floral_stone_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
        FLORAL_STONE_WALL = registerBlock("floral_stone_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));

        FLORAL_STONE_BRICK_STAIRS = registerBlock("floral_stone_brick_stairs",
                () -> new StairBlock(() -> FloralBlocks.FLORAL_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
        FLORAL_STONE_BRICK_SLAB = registerBlock("floral_stone_brick_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
        FLORAL_STONE_BRICK_WALL = registerBlock("floral_stone_brick_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));

        COBBLED_FLORAL_STONE_STAIRS = registerBlock("cobbled_floral_stone_stairs",
                () -> new StairBlock(() -> FloralBlocks.COBBLED_FLORAL_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_STAIRS)));
        COBBLED_FLORAL_STONE_SLAB = registerBlock("cobbled_floral_stone_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_SLAB)));
        COBBLED_FLORAL_STONE_WALL = registerBlock("cobbled_floral_stone_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL)));

        STEM_LOG = registerBlock("stem_log",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG)));
        STEM_WOOD = registerBlock("stem_wood",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WOOD)));
        STRIPPED_STEM_LOG = registerBlock("stripped_stem_log",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_LOG)));
        STRIPPED_STEM_WOOD = registerBlock("stripped_stem_wood",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_WOOD)));
        STEM_PLANKS = registerBlock("stem_planks",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
        STEM_STAIRS = registerBlock("stem_stairs",
                () -> new StairBlock(() -> FloralBlocks.STEM_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHERRY_STAIRS)));
        STEM_SLAB = registerBlock("stem_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_SLAB)));
        STEM_FENCE = registerBlock("stem_fence",
                () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_FENCE)));
        STEM_FENCE_GATE = registerBlock("stem_fence_gate",
                () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_FENCE_GATE), WoodType.CHERRY));
        STEM_TRAPDOOR = registerBlock("stem_trapdoor",
                () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_TRAPDOOR), BlockSetType.CHERRY));
        STEM_DOOR = registerBlock("stem_door",
                () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
        STEM_BUTTON = registerBlock("stem_button",
                () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_BUTTON),
                        BlockSetType.CHERRY, 10, true));
        STEM_PRESSURE_PLATE = registerBlock("stem_pressure_plate",
                () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                        BlockBehaviour.Properties.copy(Blocks.CHERRY_PRESSURE_PLATE), BlockSetType.CHERRY));

        PURPLE_WOLFSBANE = registerBlock("purple_wolfsbane",
                () -> new FlowerBlock(FloralMobEffects.DEATH_PRICK, 100, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
        POTTED_PURPLE_WOLFSBANE = registerBlock("potted_purple_wolfsbane",
                () -> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, PURPLE_WOLFSBANE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

        ROCKY_SEDUM = registerBlock("rocky_sedum",
                () -> new FloralHarvestableBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH), () -> COBBLED_FLORAL_STONE.get().asItem()));
        STEM_LILY = registerBlock("stem_lily",
                () -> new FloralHarvestableBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH), () -> STEM_LOG.get().asItem()));
        TWISTING_ROOTS = registerBlock("twisting_roots",
                () -> new FloralHarvestableBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH), FloralItems.TWISTED_WART));
        BONES_BANE = registerBlock("bones_bane",
                () -> new FloralHarvestableBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH), FloralItems.BONES_BANE_PETAL));
        WEEPING_ROOTS = registerBlock("weeping_roots",
                () -> new FloralHarvestableBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH), () -> Items.NETHER_WART));
        WARDEN_PRIMROSE = registerBlock("warden_primrose",
                () -> new FloralHarvestableBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH), () -> Items.ECHO_SHARD));
        CHORUS_TULIP = registerBlock("chorus_tulip",
                () -> new FloralHarvestableBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH), () -> Items.CHORUS_FRUIT));
        WHITE_OVERFLOWING_BELLFLOWER = registerBlock("white_overflowing_bellflower",
                () -> new FloralHarvestableBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH), () -> Items.BONE_MEAL));
    }

}
