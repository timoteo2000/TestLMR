package net.timoteo2000.TestLMR.client.handler;

import net.timoteo2000.TestLMR.client.settings.KeyBindings;
import net.timoteo2000.TestLMR.reference.EKey;
import net.timoteo2000.TestLMR.utils.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler {
	
	private static EKey getPressedKeyBinding(){
		if(KeyBindings.charge.isPressed()){
			return EKey.CHARGE;
		}else if (KeyBindings.release.isPressed()){
			return EKey.RELEASE;
		}
		return EKey.UNKNOWN;
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event){
		LogHelper.info(getPressedKeyBinding());
	}
}
