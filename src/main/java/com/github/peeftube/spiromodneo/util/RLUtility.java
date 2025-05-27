package com.github.peeftube.spiromodneo.util;

import com.github.peeftube.spiromodneo.SpiroModNeo;
import net.minecraft.resources.ResourceLocation;

public class RLUtility
{
    public static ResourceLocation makeRL(String ns, String path)
    { return ResourceLocation.fromNamespaceAndPath(ns, path); }

    public static ResourceLocation makeRL(String path)
    { return makeRL(SpiroModNeo.ID, path); }
}
