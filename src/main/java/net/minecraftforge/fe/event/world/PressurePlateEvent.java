package net.minecraftforge.fe.event.world;

import net.minecraft.entity.Entity;
import net.minecraftforge.event.entity.EntityEvent;
import cpw.mods.fml.common.eventhandler.Cancelable;

@Cancelable
public class PressurePlateEvent extends EntityEvent
{

    public PressurePlateEvent(Entity entity)
    {
        super(entity);
    }

}