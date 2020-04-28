package io.github.weavemc.weft.world;

public class SetBlockStateFlags
{
    //Docs from https://github.com/FabricMC/yarn/blob/659b0da1ddf00613787861b36ec82afd844474f7/mappings/net/minecraft/world/ModifiableWorld.mapping#L23
    /**Propagates a change event to surrounding blocks.**/
	public static final int PROPAGATE_CHANGE = 1;
    /**Notifies listeners and clients who need to react when the block changes.**/
    public static final int NOTIFY_LISTENERS = 2;
    /**Used in conjunction with NOTIFY_LISTENERS to suppress the render pass on clients.**/
    public static final int NO_REDRAW = 4;
    /**Forces a synchronous redraw on clients.**/
    public static final int REDRAW_ON_MAIN_THREAD = 8;
    /**Bypass virtual blockstate changes and forces the passed state to be stored as-is.**/
    public static final int FORCE_STATE = 16;
    /**Prevents the previous block (container) from dropping items when destroyed.**/
    public static final int SKIP_DROPS = 32;
    /**Signals that the current block is being moved to a different location, usually because of a piston.**/
    public static final int MOVED = 64;
}
