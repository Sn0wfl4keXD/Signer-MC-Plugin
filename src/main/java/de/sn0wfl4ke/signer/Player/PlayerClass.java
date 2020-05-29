package de.sn0wfl4ke.signer.Player;

import de.sn0wfl4ke.signer.Items.Items;
import org.bukkit.ChatColor;;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class PlayerClass {

    /**
     * Das Spieler Onjekt
     */
    Player player;

    /**
     * Das im Menü gewählte Item
     */
    ItemStack picked = Items.invItems[0];

    /**
     *
     * @param player -> siehe "Player player"
     */
    public PlayerClass(Player player){
        this.player = player;
    }

    /**
     *
     * @param inventory -> Representiert das Inventar namens "Farb Auswahl: Text"
     *                  Hier werden die Items für die Farbauswahl zugewiesen
     */
    public void build_inv(Inventory inventory){
        for(int i = 0; i < Items.invItems.length; i++)
            create_slot(inventory, Items.invItems[i], i);
    }

    /**
     * Hier wird das Item welches der Spieler in seiner Haupthand hat signiert
     */
    public void set_new_item(){
        ItemStack item_held = player.getInventory().getItemInMainHand();
        player.getInventory().setItemInMainHand(set_new_itemLore(item_held, Items.ItemContainer.get(picked)));
    }

    /**
     *
     * @param item_held -> das Item in der Haupthand des Spielers
     * @param color -> die Im "Farb Auswahl: Text" Menü gewälte Farbe
     * @return -> wird bei set_new_item zurückgegeben
     */
    private ItemStack set_new_itemLore(ItemStack item_held, ChatColor color){
        Locale local = new Locale("de", "DE");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, local);
        String date = dateFormat.format(new Date());
        ItemStack new_item = new ItemStack(item_held.getType());
        ItemMeta new_itemMeta = new_item.getItemMeta();
        ArrayList<String> Lore = new ArrayList();
        Lore.add(ChatColor.RESET + "Signiert von " + color + player.getName() + ChatColor.RESET
                 + " am " + color + date);
        assert new_itemMeta != null;
        new_itemMeta.setLore(Lore);
        new_item.setItemMeta(new_itemMeta);

        return new_item;
    }

    /**
     *
     * @param item -> das Gewählte item im "Farb Auswahl: Text" Menü wird
     *             der picked Variable zugewiesen
     */
    public void set_item(ItemStack item){
        this.picked = item;
    }

    /**
     *
     * @param inventory -> "Farb Auswahl: Text" Menü
     * @param item -> Die Items die die Farben Representieren
     * @param slot -> Der Slot in dem das Item sein wird
     *
     * @see #build_inv(Inventory)
     */
    private void create_slot(Inventory inventory, ItemStack item, int slot){
        inventory.setItem(slot, item);
    }

}
