package fr.zom.csmm.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;

@Mixin(TitleScreen.class)
public class CSMMMixin
{
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info)
    {
    }
}
