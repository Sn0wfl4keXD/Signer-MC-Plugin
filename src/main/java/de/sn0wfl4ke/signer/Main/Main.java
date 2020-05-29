package de.sn0wfl4ke.signer.Main;

import de.sn0wfl4ke.signer.Commands.Commands;
import de.sn0wfl4ke.signer.Items.Items;
import de.sn0wfl4ke.signer.Listener.InventoryEvent;
import de.sn0wfl4ke.signer.Listener.JoinQuit;
import de.sn0wfl4ke.signer.Player.PlayerClass;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class Main extends JavaPlugin {

    /**
     * Hashmap in welcher die SpielerInstanz gespeichert ist
     */
    public static HashMap<Player, PlayerClass> PlayerContainer = new HashMap<>();

    /**
     * Hier started das Plugin wenn man server startet oder /reload
     */
    @Override
    public void onEnable() {
        on_start();

    }

    /**
     * Methoden welche beim Laden des Plugins ausgeführt werden
     * -> Registrieren der Listener
     * -> Registrieren des Commands
     * -> Erstellen der Items
     */
    private void on_start(){
        getServer().getPluginManager().registerEvents(new InventoryEvent(), this);
        getServer().getPluginManager().registerEvents(new JoinQuit(), this);
        this.getCommand("sign").setExecutor(new Commands());
        Items items = new Items();
        items.create_items();
    }
}
