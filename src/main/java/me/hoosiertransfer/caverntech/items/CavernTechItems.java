package me.hoosiertransfer.caverntech.items;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;

public class CavernTechItems {
    // Materials
    public static final SlimefunItemStack BORON_INGOT = new SlimefunItemStack("BORON_INGOT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTlmMjMzMGFkMjg0NmVjNmM4ZTFjZTAyNTg5ZjA3ZjJmNzU5N2I1YTk3NzU5OWI2ZGI3YzM0NGNhNDRhMTI3NiJ9fX0", "Boron Ingot", "&9&oCaverntech");
    public static final SlimefunItemStack FERROBORON_INGOT = new SlimefunItemStack("FERROBORON_INGOT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzllMzMzYTc2NGY4NzJjMDc4NmVkZTU3NTE4NDk1ODMzZGY0Y2EzZjdkNmQyZWJlYTdiMzIzZWY0OWFiNzg5YSJ9fX0", "Ferroboron Ingot", "&9&oCaverntech");
    public static final SlimefunItemStack HARD_CARBON_ALLOY = new SlimefunItemStack("HARD_CARBON_ALLOY", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjg0OWM4NTYzYjQ5YzVjZDY1MDY2Yjg2N2U5OWVkYjI4NWRhOTVmMGZkMjEwZTIzZmEzNWI1YzVjNTg5MjEwNyJ9fX0", "Hard Carbon Alloy", "&9&oCaverntech");
    public static final SlimefunItemStack ELECTROLYTE_INGOT = new SlimefunItemStack("ELECTROLYTE_INGOT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWRkNzAxZDkyYjBjMjMwMmZkOTQwNWY0MzIyODliYzJlMGI0NDYxMDc0M2JjN2QyNTkxZGJhNzdiZjYzZDBmNCJ9fX0", "Electrolyte Ingot", "", "&9&oCaverntech");
    public static final SlimefunItemStack TOUGH_ALLOY = new SlimefunItemStack("TOUGH_ALLOY", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTg3MjVmMzQ5ZDAwY2Q2YjY5ZDYzYjU4YjRlYTNiZmY1Y2RlNWYxNDM1NjAyM2Q3MTUxYTNhNGEzMmRlNGI0YiJ9fX0", "Tough Alloy", "", "&9&oCaverntech");
    public static final SlimefunItemStack EXTREME_ALLOY = new SlimefunItemStack("EXTREME_ALLOY", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDk4NmI5OGRlZDVmNjgzMjM1NDg5M2JiZWI0NzI1NjMzNWQzMmY0ZjZhZTE0OGY1MTQwY2IwOWUyYjI2YWM4MiJ9fX0", "Extreme Alloy", "", "&9&oCaverntech");
    public static final SlimefunItemStack THERMOCONDUCTING_ALLOY = new SlimefunItemStack("THERMOCONDUCTING_ALLOY", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWQyOTMwYzhiMGU2M2QxY2E2YTBhMDU4YTgzNjdmNGY2MDg4MTlmOTY4YmJhYWI0ZjAzY2YwMTNlNjJmZmMwMSJ9fX0", "Themoconducting Alloy", "", "&9&oCaverntech");
    public static final SlimefunItemStack BISMUTH = new SlimefunItemStack("BISMUTH", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGRjN2FiNGU3ZTRlZjI4ZmNiZTUxMzI3MTliNGEzNmY0ZjA1NmRkNzk0MWJjZTQwMGRmMzBjODU2NmI1ZGRlZCJ9fX0", "Bismuth Ingot", "", "&9&oCaverntech");
    public static final SlimefunItemStack PLATINUM = new SlimefunItemStack("PLATINUM", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTAyZjRhOWQxODJjYzYyNTkyNWU1ZGVhN2UyOWQxM2E5NDhhZDY0ZmY0Mjg3MTc4YWYyM2EwNDI4ZTFmYTU0ZSJ9fX0", "Platinum Ingot", "", "&9&oCaverntech");
    public static final SlimefunItemStack SOULARIUM = new SlimefunItemStack("SOULARIUM", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzBlMWRhNTg2OTU0MjFkNDU1OGI3NzIyYmQ5OWU4ZjU3MGFmNDcyYWIxMDdmNTQxOTM4ZGI1MDRkNjQ3MmQwYiJ9fX0", "Soularium", "", "&9&oCaverntech");
    public static final SlimefunItemStack BERYLLIUM_INGOT = new SlimefunItemStack("BERYLLIUM_INGOT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTAyZjNkNTVhMjI0NWZkODMyOTJlZGU3MTA2NmFhOTYwMDJiNWU4N2VkZGU0ZTkzYjFhOTYwYTJkODE1ZTA0ZCJ9fX0", "Beryllium Ingot", "", "&9&oCaverntech");
    public static final SlimefunItemStack FLEXIUM_INGOT = new SlimefunItemStack("FLEXIUM_INGOT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTQ4NjE3OTUyM2RjZWY2OWY1MTc1NmYxOGJjMGVlNWYzNGIyMTVlNDVlODMxM2I5YTNjOWNiYTdlZWI5MTRlMSJ9fX0", "Flexium Ingot", "", "&9&oCaverntech");
    public static final SlimefunItemStack RADIUM = new SlimefunItemStack("RADIUM", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDIwN2M1ZTc2NGM2MWMxNWNiOTdhYmI2MjA0Y2Q2ZjVmYzk2M2UwNzI2NGIxNDA0MzBkMzk3MmEyNzFhN2RhIn19fQ", "&aRadium", "", LoreBuilder.radioactive(Radioactivity.HIGH), LoreBuilder.HAZMAT_SUIT_REQUIRED, "&9&oCaverntech");
    public static final SlimefunItemStack EMPTY_RESERVOIR = new SlimefunItemStack("EMPTY_RESERVOIR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWYzOGY2OGI5MmUzYzU5YTgwMmFjMjNlM2IyY2U0ZTkyYjEzOGMxMTE4ZjI3OWI2ZTQwMDY2OTU4ZThmNzRmNyJ9fX0", "&bEmpty Reservoir", "", "&7Liquid: &fEmpty", "", "&9&oCaverntech");
    public static final SlimefunItemStack WATER_RESERVOIR = new SlimefunItemStack("WATER_RESERVOIR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2MyMmY2MTYwNjgzMjY1YjhmZWYxMTMzMTdjMThjZjQ0ZWRmMmEwNjZiNTZhOGM4ZmQzMjVmNmI5MjBhNWY4In19fQ", "&bReservoir", "", "&7Liquid: &fWater", "", "&9&oCaverntech");
    public static final SlimefunItemStack LAVA_RESERVOIR = new SlimefunItemStack("LAVA_RESERVOIR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTNlOTY4NTE1ODllMWZhODU0ZjA0ODRjMzBkNjM0ZmE0Njc0MDk2NmE2NmMwOTllMWM2NDIxOWMxMWNiYTdhNSJ9fX0", "&bReservoir", "", "&7Liquid: &cLava", "", "&9&oCaverntech");
    public static final SlimefunItemStack BISMUTHPLATES = new SlimefunItemStack("BISMUTHPLATES", Material.NETHERITE_SCRAP, "&lBismuth Plates", "", "&9&oCaverntech");
    public static final SlimefunItemStack MACHINE_MOTOR = new SlimefunItemStack("MACHINE_MOTOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2IwNDMzZjFjMjI3OTYwOGY3YmQyY2VjZWI5OGNkMTc1Y2JhYWRjM2Y2Mjk5YWUzY2NhZTI1N2RjMjJhNTViMiJ9fX0", "&cMachine Motor", "&7Machine Component", "", "&9&oCaverntech");
    public static final SlimefunItemStack MACHINEPLATING = new SlimefunItemStack("MACHINEPLATING", Material.PAPER, "&bMachine Plate", "&7Machine Component", "", "&9&oCaverntech");
    public static final SlimefunItemStack MACHINE_FRAME = new SlimefunItemStack("MACHINE_FRAME", Material.IRON_BLOCK, "&bMachine Frame", "&7Machine Component", "", "&9&oCaverntech");
    public static final SlimefunItemStack SOUL_FRAGMENT = new SlimefunItemStack("SOUL_FRAGMENT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjIwMWFlMWE4YTA0ZGY1MjY1NmY1ZTQ4MTNlMWZiY2Y5Nzg3N2RiYmZiYzQyNjhkMDQzMTZkNmY5Zjc1MyJ9fX0", "Soul Fragment", "", "&9&oCaverntech");
    public static final SlimefunItemStack REFINED_SOUL = new SlimefunItemStack("REFINED_SOUL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhjZWI4NjMxYWRkN2NiYjU2NWRjYjcwNWYxMjEyMzQ5Y2NjZDc1NTk2NWM0NmE5MjI4NTJjOWZkOTQ4YjRiYiJ9fX0", "Refined Soul", "", "&9&oCaverntech");
    // Machines
    public static final SlimefunItemStack PRESSURIZED_CARBON_PRESS = new SlimefunItemStack("PRESSURIZED_CARBON_PRESS", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjA5MTQyZjNhMGFiY2Y5YWZkYjkzYmNjZDdmNGQ3MzNjYzZlZTM0N2Y3NjBiNGE3Y2IzM2ZiZDljZjk5YWJiMCJ9fX0", "&ePressurized Carbon Press", "", "&7Turns logs into Carbon", "", LoreBuilder.power(200, "/t"), LoreBuilder.power(600, " Buffer"));
    public static final SlimefunItemStack SALT_PRODUCER = new SlimefunItemStack("SALT_PRODUCER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTk0Y2M3MjVlM2VjNDJkOTc0NjQwNDMxODBiNmEyYTZiNmYwZGU4OGNkZjY0NmM2NDk0NTIwODM2YTQ4YThiNyJ9fX0", "&fSalt Shaker", "",  LoreBuilder.power(32, "/t"), LoreBuilder.power(96, " Buffer"));
    public static final SlimefunItemStack CORRUPTER = new SlimefunItemStack("CORRUPTER", Material.GILDED_BLACKSTONE, "&cCorrupter", "",  "&7 Corrupts blocks into a different state.", "", LoreBuilder.power(60, "/t"), LoreBuilder.power(180, " Buffer"));

    public static final SlimefunItemStack SOUL_HARVESTER = new SlimefunItemStack("SOUL_HARVESTER", Material.BLACK_TERRACOTTA, "&5Soul Harvester", "", "&7Generates 1 Soul Fragment", "&5&oevery 666 seconds.");
}
