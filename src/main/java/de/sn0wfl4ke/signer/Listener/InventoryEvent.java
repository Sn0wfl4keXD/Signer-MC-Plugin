package de.sn0wfl4ke.signer.Listener;

import de.sn0wfl4ke.signer.Items.Items;
import de.sn0wfl4ke.signer.Main.Main;
import de.sn0wfl4ke.signer.Player.PlayerClass;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryEvent implements Listener {

    /**
     *
     * @param event -> Objekt, welches ein ClickEvent in einem Inventar Representiert
     *              Wird getriggert wenn es sich um das Inventar Namens "Farb Auswahl: Text" handelt
     */
    @EventHandler
    public void inventory_click(InventoryClickEvent event){
        String invName = event.getView().getTitle();
        if(invName.equals("Farb Auswahl: Text")){
            if(Items.ItemContainer.containsKey(event.getCurrentItem()) && event.getWhoClicked() instanceof Player){
                ItemStack clicked_item = event.getCurrentItem();
                Player player = (Player)event.getWhoClicked();
                PlayerClass playerObj = Main.PlayerContainer.get(player);
                playerObj.set_item(clicked_item);
                event.setCancelled(true);
                playerObj.set_new_item();
                player.closeInventory();

            }
        }
    }
}
