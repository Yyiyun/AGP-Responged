package agp.andwhat5.config.structs;

import com.google.gson.annotations.Expose;

import java.util.*;

public class GymStruc {
	
	/**
	 * The name of the gym. If you change this, there may be issues with your players saved data.
	 */
    @Expose
    public String Name = "";

    /**
     * The item ID of the badge associated with the gym. For example: pixelmon:boulder_badge.
     */
    @Expose
    public String Badge = "";

    /**
     * The name of the gym that is required before you can battle this one.
     */
    @Expose
    public String Requirement = "";

    /**
     * The level cap of the gym.
     */
    @Expose
    public int LevelCap = 0;

    /**
     * How much money is rewarded for defeating the gym.
     */
    @Expose
    public int Money = 0;

    /**
     * A {@link Vec3dStruc} of the location of the lobby for the gym.
     */
    @Expose
    public Vec3dStruc Lobby;//TODO this is retarded and needs to be moved to a world specific var, otherwise people in multiworld are going to have a GREAAATTTTT time.

    //Only here for legacy reasons. Remove later.
    @SuppressWarnings("DeprecatedIsStillUsed")
    @Expose
    @Deprecated
    public List<String> Leaders = new ArrayList<>();

    /**
     * A list of the gyms leaders.
     */
    @Expose
    public List<UUID> PlayerLeaders = new ArrayList<>();

    @Expose
    public int NPCAmount = 0;
    
    /**
     * A {@link List} of commands to be executed when the player earns a badge.
     */
    @Expose
    public List<String> Commands = new ArrayList<>();

    /**
     * A {@link List} of arenas that this gym has.
     */
    @Expose
    public List<ArenaStruc> Arenas = new ArrayList<>();

    /**
     * The rules of the gym that is called via the GymRules command.
     */
    @Expose
    public String Rules = "";

    // 0 = open
    // 1 = closed
    // 2 = npc leader
    public enum EnumStatus {
        OPEN,
        CLOSED,
        NPC
    }
    public EnumStatus Status = EnumStatus.CLOSED;
    public Queue<UUID> Queue = new LinkedList<>();
    public List<UUID> OnlineLeaders = new ArrayList<>();

    public GymStruc() {
    }

    public GymStruc(String name, String requirement, String badge, int levelCap, int money, List<String> commands) {
        Name = name;
        Requirement = requirement;
        Badge = badge;
        LevelCap = levelCap;
        Money = money;
        Commands = commands;
    }
}
