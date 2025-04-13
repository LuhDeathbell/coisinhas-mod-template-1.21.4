package com.luna.coisinhasmod.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.item.consume.UseAction;
import net.minecraft.sound.SoundEvents;
import net.minecraft.entity.effect.StatusEffects;

public class ModConsumableComponents {
    public static final ConsumableComponent GREEN_ENERGY_DRINK = drink()
            .consumeSeconds(3.0F)
            .sound(SoundEvents.ENTITY_GENERIC_DRINK)
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 0)))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 600, 0)))
            .build();
    public static final ConsumableComponent BLUE_ENERGY_DRINK = drink()
            .consumeSeconds(3.0F)
            .sound(SoundEvents.ENTITY_GENERIC_DRINK)
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 900, 1)))
            .build();
    public static ConsumableComponent.Builder drink() {
        return ConsumableComponent.builder().consumeSeconds(1.6F).useAction(UseAction.DRINK).sound(SoundEvents.ENTITY_GENERIC_DRINK).consumeParticles(false);
    }
}
