package de.sn0wfl4ke.signer.Commands;

import de.sn0wfl4ke.signer.Main.Main;
import de.sn0wfl4ke.signer.Player.PlayerClass;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;


public class Commands implements CommandExecutor {

    /**
     *
     * @param sender -> Der der den Command eingegeben hat -> Der Spieler
     * @param command -> Das Command selbst
     * @param label -> Der Alias des Benutzen Commands   also das Command
     * @param args -> weitere Argumente, können ignoriert werden
     * @return
     *
     * Wenn ein spieler /sign eingiebt wird diese Methode ausgeführt
     */
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = ((Player) sender).getPlayer();
            PlayerClass playerObj = Main.PlayerContainer.get(player);
            if(label.equalsIgnoreCase("sign")){
                if(args.length == 0){
                    assert player != null;
                    if(!player.getInventory().getItemInMainHand().getType().equals(Material.AIR)) {
                        Inventory color_picker = Bukkit.createInventory(null, 9*2, "Farb Auswahl: Text");
                        playerObj.build_inv(color_picker);
                        player.openInventory(color_picker);
                    }
                    else
                        player.sendMessage(ChatColor.RED + "Kein Item in der Haupthand");
                }
            }
        }
        return false;
    }
}
