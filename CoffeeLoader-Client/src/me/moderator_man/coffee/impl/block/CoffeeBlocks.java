package me.moderator_man.coffee.impl.block;

import net.minecraft.src.Block;

public enum CoffeeBlocks
{
	STONE(1),
	GRASS(2),
	DIRT(3),
	COBBLESTONE(4),
	PLANKS(5),
	SAPLING(6),
	BEDROCK(7),
	WATER_STILL(8),
	WATER_MOVING(9),
	LAVA_STILL(10),
	LAVAL_MOVING(11),
	SAND(12),
	GRAVEL(13),
	ORE_GOLD(14),
	ORE_IRON(15),
	ORE_COAL(16),
	WOOD(17),
	LEAVES(18),
	SPONGE(19),
	GLASS(20),
	CLOTH(35),
	PLANT_YELLOW(37),
	PLANT_RED(38),
	MUSHROOM_BROWN(39),
	MUSHROOM_RED(40),
	BLOCK_GOLD(41),
	BLOCK_STEEL(42),
	STAIR_DOUBLE(43),
	STAIR_SINGLE(44),
	BRICK(45),
	TNT(46),
	BOOK_SHELF(47),
	COBBLESTONE_MOSSY(48),
	OBSIDIAN(49),
	TORCH_WOOD(50),
	FIRE(51),
	MOB_SPAWNER(52),
	STAIR_COMPACT_PLANKS(53),
	CRATE(54),
	REDSTONE_WIRE(55),
	ORE_DIAMOND(56),
	BLOCK_DIAMOND(57),
	WORKBENCH(58),
	CROPS(59),
	TILLED_FIELD(60),
	STONE_OVEN_IDLE(61),
	STONE_OVEN_ACTIVE(62),
	SIGN_POST(63),
	DOOR_WOOD(64),
	LADDER(65),
	MINECART_TRACK(66),
	STAIR_COMPACT_COBBLESTONE(67),
	SIGN_WALL(68),
	LEVER(69),
	PRESSURE_PLATE_STONE(70),
	DOOR_STEEL(71),
	PRESSURE_PLATE_PLANKS(72),
	ORE_REDSTONE(73),
	ORE_REDSTONE_GLOWING(74),
	TORCH_REDSTONE_IDLE(75),
	TORCH_REDSTONE_ACTIVE(76),
	BUTTON(77),
	SNOW(78),
	BLOCK_ICE(79),
	BLOCK_SNOW(80),
	CACTUS(81),
	BLOCK_CLAY(82),
	REED(83),
	JUKEBOX(84),
	FENCE(85),
	PUMPKIN(86),
	BLOOD_STONE(87),
	SLOW_SAND(88),
	LIGHT_STONE(89),
	PORTAL(90),
	PUMPKIN_LANTERN(91);
	
	private CoffeeBlocks(int id)
	{
		this.blockID = id;
	}
	
	public int getBlockID()
	{
		return blockID;
	}
	
	/**
	 * INTERNAL USE ONLY.
	 * MODS SHOULD NOT BE USING THIS FUNCTION.
	 */
	@Deprecated
	public Block getBlock()
	{
		return Block.blocksList[blockID];
	}
	
	public int getBlockIndexInTexture()
	{
		return Block.blocksList[blockID].blockIndexInTexture;
	}
	
	private int blockID;
}
