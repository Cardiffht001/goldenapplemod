package name.modid
import name.modid.item.ModItems
import net.fabricmc.api.ModInitializer

object CustomAppleEffect : ModInitializer {
    const val MOD_ID = "custom-apple-effect"

    override fun onInitialize() {
        println("Initializing Custom Apple Effect Mod")
        ModItems.registerModItems()
    }
}