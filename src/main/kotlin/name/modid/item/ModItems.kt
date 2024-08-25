package name.modid.item

import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.item.FoodComponent
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModItems {
    val CUSTOM_ENCHANTED_GOLDEN_APPLE = registerItem("enchanted_golden_apple", 
        Item(Item.Settings()
            .food(FoodComponent.Builder()
                .alwaysEdible()
                .hunger(4)
                .saturationModifier(1.2f)
                .statusEffect(StatusEffectInstance(StatusEffects.REGENERATION, 5020, 1), 1.0f)
                .statusEffect(StatusEffectInstance(StatusEffects.RESISTANCE, 5020, 0), 1.0f)
                .statusEffect(StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 5020, 0), 1.0f)
                .statusEffect(StatusEffectInstance(StatusEffects.ABSORPTION, 5020, 3), 1.0f)
                .build())
            ))

    private fun registerItem(name: String, item: Item): Item {
        return Registry.register(Registries.ITEM, Identifier("minecraft", name), item)
    }

    fun registerModItems() {
        println("Registering Mod Items for Custom Apple Effect Mod")
    }
}