package de.sn0wfl4ke.signer.Listener;

import de.sn0wfl4ke.signer.Main.Main;
import de.sn0wfl4ke.signer.Player.PlayerClass;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinQuit implements Listener {

    /**
     *
     * @param event -> Wird getriggert wenn ein Spieler den Server betritt
     *
     * Erstellt eine neue SpielerInstanz und speichert diese in einer Hashmap,
     * verknüpft mit dem Spieler ab
     */
    @EventHandler
    public void join_event(PlayerJoinEvent event){
        Player player = event.getPlayer();
        PlayerClass newPlayer = new PlayerClass(player);
        Main.PlayerContainer.put(player, newPlayer);
    }

    /**
     *
     * @param event Wird getriggert wenn ein Spieler den Server verlässt
     * Löscht die gespeicherte SpielerInstanz des Spielers aus der Hashmap
     *
     */
    @EventHandler
    public void quit_event(PlayerQuitEvent event){
        Player player = event.getPlayer();
        Main.PlayerContainer.remove(player);
    }
}
