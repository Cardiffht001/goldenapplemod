package name.modid.item

import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.item.FoodComponent
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.Items
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import name.modid.CustomAppleEffect

object ModItems {
    val CUSTOM_ENCHANTED_GOLDEN_APPLE = registerItem("enchanted_golden_apple",
        Item(Item.Settings()
            .food(FoodComponent.Builder()
                .alwaysEdible()
                .hunger(4)
                .saturationModifier(1.2f)
                .statusEffect(StatusEffectInstance(StatusEffects.REGENERATION, 4980, 1), 1.0f)
                .statusEffect(StatusEffectInstance(StatusEffects.RESISTANCE, 4980, 0), 1.0f)
                .statusEffect(StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 4980, 0), 1.0f)
                .statusEffect(StatusEffectInstance(StatusEffects.ABSORPTION, 4980, 3), 1.0f)
                .build()
            )
        )
    )

    private fun registerItem(name: String, item: Item): Item {
        return Registry.register(Registries.ITEM, Identifier(CustomAppleEffect.MOD_ID, name), item)
    }

    fun registerModItems() {
        println("Registering custom Enchanted Golden Apple for ${CustomAppleEffect.MOD_ID}")
    }
}