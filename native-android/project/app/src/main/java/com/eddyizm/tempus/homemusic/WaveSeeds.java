package com.eddyizm.tempus.homemusic;

import defpackage.qm4;
import defpackage.xm4;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class WaveSeeds {
    public static final int $stable = 0;
    public static final WaveSeeds INSTANCE = new WaveSeeds();

    private WaveSeeds() {
    }

    public final Map<String, String> artist(String str, String str2) {
        String string;
        str.getClass();
        Map<String, String> mapTrack = track(str);
        if (mapTrack == null) {
            return null;
        }
        if (!xm4.k0(str, "hub:", false) && str2 != null && (string = qm4.K0(str2).toString()) != null) {
            String str3 = string.length() > 0 ? string : null;
            if (str3 != null) {
                Map<String, String> mapSingletonMap = Collections.singletonMap("nd_artist_id", str3);
                mapSingletonMap.getClass();
                return mapSingletonMap;
            }
        }
        if (mapTrack.isEmpty()) {
            Map<String, String> mapSingletonMap2 = Collections.singletonMap("by_artist", "true");
            mapSingletonMap2.getClass();
            return mapSingletonMap2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapTrack);
        linkedHashMap.put("by_artist", "true");
        return linkedHashMap;
    }

    public final Map<String, String> track(String str) {
        str.getClass();
        String string = qm4.K0(str).toString();
        if (!xm4.k0(string, "hub:", false)) {
            if (string.length() <= 0 || qm4.o0(string, ":")) {
                return null;
            }
            Map<String, String> mapSingletonMap = Collections.singletonMap("nd_song_id", string);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        String strZ0 = qm4.z0(string, "hub:");
        if ((!xm4.k0(strZ0, "dz:", false) && !xm4.k0(strZ0, "nd:", false)) || strZ0.length() <= 3) {
            return null;
        }
        Map<String, String> mapSingletonMap2 = Collections.singletonMap("ref", strZ0);
        mapSingletonMap2.getClass();
        return mapSingletonMap2;
    }
}
