package com.eddyizm.tempus.homemusic;

import defpackage.qm4;
import defpackage.xm4;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class WaveSeeds {
    public static final int $stable = 0;
    public static final WaveSeeds INSTANCE = new WaveSeeds();

    private WaveSeeds() {
    }

    public final Map<String, String> artist(String str, String str2) {
        String obj;
        str.getClass();
        Map<String, String> track = track(str);
        if (track == null) {
            return null;
        }
        if (!xm4.k0(str, "hub:", false) && str2 != null && (obj = qm4.K0(str2).toString()) != null) {
            String str3 = obj.length() > 0 ? obj : null;
            if (str3 != null) {
                Map<String, String> singletonMap = Collections.singletonMap("nd_artist_id", str3);
                singletonMap.getClass();
                return singletonMap;
            }
        }
        if (track.isEmpty()) {
            Map<String, String> singletonMap2 = Collections.singletonMap("by_artist", "true");
            singletonMap2.getClass();
            return singletonMap2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(track);
        linkedHashMap.put("by_artist", "true");
        return linkedHashMap;
    }

    public final Map<String, String> track(String str) {
        str.getClass();
        String obj = qm4.K0(str).toString();
        if (!xm4.k0(obj, "hub:", false)) {
            if (obj.length() <= 0 || qm4.o0(obj, ":")) {
                return null;
            }
            Map<String, String> singletonMap = Collections.singletonMap("nd_song_id", obj);
            singletonMap.getClass();
            return singletonMap;
        }
        String z0 = qm4.z0(obj, "hub:");
        if ((!xm4.k0(z0, "dz:", false) && !xm4.k0(z0, "nd:", false)) || z0.length() <= 3) {
            return null;
        }
        Map<String, String> singletonMap2 = Collections.singletonMap("ref", z0);
        singletonMap2.getClass();
        return singletonMap2;
    }
}
