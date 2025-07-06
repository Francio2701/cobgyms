package net.gensir.cobgyms.cache.legendary;

import net.gensir.cobgyms.cache.Cache;

public class LegendaryCache {

    public static Cache prepCache() {
        String[] cachePokemon = {
                "mewtwo"
        };
        return new Cache(cachePokemon);
    }
}
