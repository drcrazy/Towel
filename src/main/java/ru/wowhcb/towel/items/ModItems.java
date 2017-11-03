/**
 * 
 */
package ru.wowhcb.towel.items;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author drcrazy
 *
 */
public class ModItems {
	
    @GameRegistry.ObjectHolder("towel:towel")
    public static ItemTowel towel;
	
    @SideOnly(Side.CLIENT)
    public static void initModels() {
        towel.initModel();
    }
}
