package com.daviepatriots.secretlyprivate.client.handler;


import com.daviepatriots.secretlyprivate.client.settings.Keybindings;
import com.daviepatriots.secretlyprivate.reference.Key;
import com.daviepatriots.secretlyprivate.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;


public class KeyInputEventHandler
{
    private static Key getPressedKeybinding()
    {
        if (Keybindings.charge.isPressed())
        {
            return Key.CHARGE;
        }
        else if (Keybindings.release.isPressed())
        {
            return Key.RELEASE;
        }

        return Key.UNKNOWN;
    }

}