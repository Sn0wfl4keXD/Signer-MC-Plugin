package de.sn0wfl4ke.signer.Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;

public class Items {

    /**
     * Der Container als Hashmap in dem die jeweiligen Farben mit den dafürstehenden
     * Items verknüpft werden.
     */
    public static HashMap<ItemStack, ChatColor> ItemContainer = new HashMap<>();

    /**
     * Array welches nochmal die Items wie im oberen Container beinhalten
     */
    public static ItemStack[] invItems = new ItemStack[16];

    /**
     * Konstruktor
     */
    public Items(){}

    /**
     * Hier werden die Items in die Hashmap sowie in das Array gespeichert
     */
    public void create_items(){
        ItemContainer.put(color_yellow(), ChatColor.YELLOW);
        ItemContainer.put(color_white(), ChatColor.WHITE);
        ItemContainer.put(color_dark_red(), ChatColor.DARK_RED);
        ItemContainer.put(color_red(), ChatColor.RED);
        ItemContainer.put(color_light_purple(), ChatColor.LIGHT_PURPLE);
        ItemContainer.put(color_green(), ChatColor.GREEN);
        ItemContainer.put(color_gray(), ChatColor.GRAY);
        ItemContainer.put(color_gold(), ChatColor.GOLD);
        ItemContainer.put(color_dark_purple(), ChatColor.DARK_PURPLE);
        ItemContainer.put(color_dark_green(), ChatColor.DARK_GREEN);
        ItemContainer.put(color_dark_gray(), ChatColor.DARK_GRAY);
        ItemContainer.put(color_dark_blue(), ChatColor.DARK_BLUE);
        ItemContainer.put(color_dark_aqua(), ChatColor.DARK_AQUA);
        ItemContainer.put(color_blue(), ChatColor.BLUE);
        ItemContainer.put(color_black(), ChatColor.BLACK);
        ItemContainer.put(color_aqua(), ChatColor.AQUA);

        int i = 0;

        for(ItemStack item : ItemContainer.keySet()){
            invItems[i] = item;
            i++;
        }
    }


    /**
     * Alle darunter folgenden Methoden sind dazu da, die Items richtig zu beschriften
     * @return -> Gibt einen neuen Itemstack zurück
     */
    private ItemStack color_white(){
        ItemStack wool = new ItemStack((Material.WHITE_WOOL));
        ItemMeta wool_meta = wool.getItemMeta();
        assert wool_meta != null;
        wool_meta.setDisplayName(ChatColor.WHITE + "Weiß");
        wool.setItemMeta(wool_meta);
        return wool;
    }

    private ItemStack color_gold(){
        ItemStack wool = new ItemStack((Material.GOLD_BLOCK));
        ItemMeta wool_meta = wool.getItemMeta();
        assert wool_meta != null;
        wool_meta.setDisplayName(ChatColor.GOLD + "Gold");
        wool.setItemMeta(wool_meta);
        return wool;
    }

    private ItemStack color_red(){
        ItemStack wool = new ItemStack((Material.RED_WOOL));
        ItemMeta wool_meta = wool.getItemMeta();
        assert wool_meta != null;
        wool_meta.setDisplayName(ChatColor.RED + "Rot");
        wool.setItemMeta(wool_meta);
        return wool;
    }

    private ItemStack color_aqua(){
        ItemStack wool = new ItemStack((Material.LIGHT_BLUE_WOOL));
        ItemMeta wool_meta = wool.getItemMeta();
        assert wool_meta != null;
        wool_meta.setDisplayName(ChatColor.AQUA + "Aqua");
        wool.setItemMeta(wool_meta);
        return wool;
    }

    private ItemStack color_yellow(){
        ItemStack wool = new ItemStack((Material.YELLOW_WOOL));
        ItemMeta wool_meta = wool.getItemMeta();
        assert wool_meta != null;
        wool_meta.setDisplayName(ChatColor.YELLOW + "Gelb");
        wool.setItemMeta(wool_meta);
        return wool;
    }

    private ItemStack color_green(){
        ItemStack wool = new ItemStack((Material.LIME_WOOL));
        ItemMeta wool_meta = wool.getItemMeta();
        assert wool_meta != null;
        wool_meta.setDisplayName(ChatColor.GREEN + "Grün");
        wool.setItemMeta(wool_meta);
        return wool;
    }

    private ItemStack color_light_purple(){
        ItemStack wool = new ItemStack((Material.PINK_WOOL));
        ItemMeta wool_meta = wool.getItemMeta();
        assert wool_meta != null;
        wool_meta.setDisplayName(ChatColor.LIGHT_PURPLE + "helles Lila");
        wool.setItemMeta(wool_meta);
        return wool;
    }

    private ItemStack color_gray(){
        ItemStack wool = new ItemStack((Material.CLAY));
        ItemMeta wool_meta = wool.getItemMeta();
        assert wool_meta != null;
        wool_meta.setDisplayName(ChatColor.GRAY + "Grau");
        wool.setItemMeta(wool_meta);
        return wool;
    }

    private ItemStack color_dark_gray(){
        ItemStack wool = new ItemStack((Material.GRAY_WOOL));
        ItemMeta wool_meta = wool.getItemMeta();
        assert wool_meta != null;
        wool_meta.setDisplayName(ChatColor.DARK_GRAY + "Dunkelgrau");
        wool.setItemMeta(wool_meta);
        return wool;
    }

    private ItemStack color_dark_aqua(){
        ItemStack wool = new ItemStack((Material.CYAN_WOOL));
        ItemMeta wool_meta = wool.getItemMeta();
        assert wool_meta != null;
        wool_meta.setDisplayName(ChatColor.DARK_AQUA + "Dunkelaqua");
        wool.setItemMeta(wool_meta);
        return wool;
    }

    private ItemStack color_dark_purple(){
        ItemStack wool = new ItemStack((Material.PURPLE_WOOL));
        ItemMeta wool_meta = wool.getItemMeta();
        assert wool_meta != null;
        wool_meta.setDisplayName(ChatColor.DARK_PURPLE + "Dunkelviolett");
        wool.setItemMeta(wool_meta);
        return wool;
    }

    private ItemStack color_dark_blue(){
        ItemStack wool = new ItemStack((Material.BLUE_WOOL));
        ItemMeta wool_meta = wool.getItemMeta();
        assert wool_meta != null;
        wool_meta.setDisplayName(ChatColor.DARK_BLUE + "Dunkelblau");
        wool.setItemMeta(wool_meta);
        return wool;
    }

    private ItemStack color_blue(){
        ItemStack wool = new ItemStack((Material.LAPIS_BLOCK));
        ItemMeta wool_meta = wool.getItemMeta();
        assert wool_meta != null;
        wool_meta.setDisplayName(ChatColor.BLUE + "Blau");
        wool.setItemMeta(wool_meta);
        return wool;
    }

    private ItemStack color_dark_green(){
        ItemStack wool = new ItemStack((Material.GREEN_WOOL));
        ItemMeta wool_meta = wool.getItemMeta();
        assert wool_meta != null;
        wool_meta.setDisplayName(ChatColor.DARK_GREEN + "Dunkelgrün");
        wool.setItemMeta(wool_meta);
        return wool;
    }

    private ItemStack color_dark_red(){
        ItemStack wool = new ItemStack((Material.REDSTONE_BLOCK));
        ItemMeta wool_meta = wool.getItemMeta();
        assert wool_meta != null;
        wool_meta.setDisplayName(ChatColor.DARK_RED + "Dunkelrot");
        wool.setItemMeta(wool_meta);
        return wool;
    }

    private ItemStack color_black(){
        ItemStack wool = new ItemStack((Material.BLACK_WOOL));
        ItemMeta wool_meta = wool.getItemMeta();
        assert wool_meta != null;
        wool_meta.setDisplayName(ChatColor.BLACK + "Schwarz");
        wool.setItemMeta(wool_meta);
        return wool;
    }



}
