package vb.$basiccommands;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.block.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.*;
import org.bukkit.plugin.java.*;
import org.bukkit.util.*;

public class PluginMain extends JavaPlugin implements Listener {

	private static PluginMain instance;
	private static Object localVariableScope = new Object();

	public void onEnable() {
		instance = this;
		getDataFolder().mkdir();
		getServer().getPluginManager().registerEvents(this, this);
		Object localVariableScope = new Object();
		try {
			Bukkit.getConsoleSender()
					.sendMessage(PluginMain.color("&eBasic&3Commands &7| &aPlugin enable successfully!"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onDisable() {
		try {
			Bukkit.getConsoleSender().sendMessage(PluginMain.color("&eBasic&3Commands &7| &aPlugin disable"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] commandArgs) {
		if (command.getName().equalsIgnoreCase("heal")) {
			try {
				Object localVariableScope = new Object();
				((org.bukkit.entity.Damageable) commandSender).setHealth(20d);
				commandSender
						.sendMessage(PluginMain.color("&e&lBasic&3&lCommands &7| &aYou successfully heal yourself"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (command.getName().equalsIgnoreCase("spawn")) {
			try {
				Object localVariableScope = new Object();
				((org.bukkit.entity.Entity) commandSender)
						.teleport(((org.bukkit.entity.Entity) commandSender).getWorld().getSpawnLocation());
				commandSender
						.sendMessage(PluginMain.color("&e&lBasic&3&lCommands &7| &aSuccessfully teleported to spawn"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (command.getName().equalsIgnoreCase("basiccommands")) {
			try {
				Object localVariableScope = new Object();
				commandSender.sendMessage(PluginMain.color("&e&lBasic&3&lCommands"));
				commandSender.sendMessage(PluginMain.color("&eAuthor: &aaledlb8"));
				commandSender.sendMessage(PluginMain.color("&eVersion: &a1.0"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (command.getName().equalsIgnoreCase("clear")) {
			try {
				Object localVariableScope = new Object();
				((org.bukkit.entity.Player) commandSender).getInventory().clear();
				commandSender
						.sendMessage(PluginMain.color("&e&lBasic&3&lCommands &7| &aYour inventory has been clear"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (command.getName().equalsIgnoreCase("unfly")) {
			try {
				Object localVariableScope = new Object();
				((org.bukkit.entity.Player) commandSender).setAllowFlight(false);
				commandSender.sendMessage(PluginMain.color("&e&lBasic&3&lCommands &7| &aFly Of!"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (command.getName().equalsIgnoreCase("fly")) {
			try {
				Object localVariableScope = new Object();
				((org.bukkit.entity.Player) commandSender).setAllowFlight(true);
				commandSender.sendMessage(PluginMain.color("&e&lBasic&3&lCommands &7| &aFly On!"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (command.getName().equalsIgnoreCase("gmsp")) {
			try {
				Object localVariableScope = new Object();
				((org.bukkit.entity.Player) commandSender).setGameMode(org.bukkit.GameMode.SPECTATOR);
				commandSender.sendMessage(PluginMain
						.color("&e&lBasic&3&lCommands &7| &aYour gamemode successfully change to &eSPECTATOR"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (command.getName().equalsIgnoreCase("gma")) {
			try {
				Object localVariableScope = new Object();
				((org.bukkit.entity.Player) commandSender).setGameMode(org.bukkit.GameMode.ADVENTURE);
				commandSender.sendMessage(PluginMain
						.color("&e&lBasic&3&lCommands &7| &aYour gamemode successfully change to &eADVENTURE"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (command.getName().equalsIgnoreCase("gms")) {
			try {
				Object localVariableScope = new Object();
				((org.bukkit.entity.Player) commandSender).setGameMode(org.bukkit.GameMode.SURVIVAL);
				commandSender.sendMessage(PluginMain
						.color("&e&lBasic&3&lCommands &7| &aYour gamemode successfully change to &eSURVIVAL"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (command.getName().equalsIgnoreCase("gmc")) {
			try {
				Object localVariableScope = new Object();
				((org.bukkit.entity.Player) commandSender).setGameMode(org.bukkit.GameMode.CREATIVE);
				commandSender.sendMessage(PluginMain
						.color("&e&lBasic&3&lCommands &7| &aYour gamemode successfully change to &eCREATIVE"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (command.getName().equalsIgnoreCase("basiccommands-help")) {
			try {
				Object localVariableScope = new Object();
				commandSender.sendMessage(PluginMain.color("&e&lBasic&3&lCommands"));
				commandSender.sendMessage(PluginMain.color("&e/gmc &8<---- Change your gamemode to creative"));
				commandSender.sendMessage(PluginMain.color("&e/gms &8<---- Change your gamemode to survival"));
				commandSender.sendMessage(PluginMain.color("&e/gma &8<---- Change your gamemode to adventure"));
				commandSender.sendMessage(PluginMain.color("&e/gmsp &8<---- Change your gamemode to spectator"));
				commandSender.sendMessage(PluginMain.color("&e/fly &8<---- Get the ability to fly"));
				commandSender.sendMessage(PluginMain.color("&e/ci &8<---- Clear your inventory"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	public static void procedure(String procedure, List<?> procedureArgs) throws Exception {
	}

	public static Object function(String function, List<?> functionArgs) throws Exception {
		return null;
	}

	public static List<Object> createList(Object obj) {
		List<Object> list = new ArrayList<>();
		if (obj.getClass().isArray()) {
			int length = java.lang.reflect.Array.getLength(obj);
			for (int i = 0; i < length; i++) {
				list.add(java.lang.reflect.Array.get(obj, i));
			}
		} else if (obj instanceof Collection<?>) {
			list.addAll((Collection<?>) obj);
		} else {
			list.add(obj);
		}
		return list;
	}

	public static String color(String string) {
		return string != null ? ChatColor.translateAlternateColorCodes('&', string) : null;
	}

	public static PluginMain getInstance() {
		return instance;
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerJoinEvent1(org.bukkit.event.player.PlayerJoinEvent event) throws Exception {
		Bukkit.broadcastMessage(PluginMain.color("&7[&a+&7] [player]"));
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerQuitEvent2(org.bukkit.event.player.PlayerQuitEvent event) throws Exception {
		Bukkit.broadcastMessage(PluginMain.color("&7[&c-&7] {player}"));
	}
}
