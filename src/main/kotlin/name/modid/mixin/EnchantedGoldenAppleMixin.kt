package name.modid.mixin

import name.modid.item.ModItems
import net.minecraft.item.Item
import net.minecraft.item.Items
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Redirect

@Mixin(Items::class)
class EnchantedGoldenAppleMixin {

    @Redirect(method = ["<clinit>"])
    @At(value = "NEW", target = "Lnet/minecraft/item/Item;")
    private static fun redirectEnchantedGoldenApple(value: Item): Item {
        return ModItems.CUSTOM_ENCHANTED_GOLDEN_APPLE
    }
}