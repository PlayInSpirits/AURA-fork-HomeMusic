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
    public static final WaveSeeds INSTANCE = null;

    static {
        INSTANCE = new WaveSeeds();
    }

    private WaveSeeds() {
    }

    public final Map<String, String> artist(String r4, String r5) {
        r4.getClass();
        Map<String, String> r3 = track(r4);
        String r0 = null;
        if (r3 != null) goto L6;
        return null;
    L6:
        if (xm4.k0(r4, "hub:", false) == true) goto L17;
        if (r5 == null) goto L17;
        String r6 = qm4.K0(r5).toString();
        if (r6 == null) goto L17;
        if (r6.length() <= 0) goto L13;
        r0 = r6;
    L13:
        if (r0 == null) goto L17;
        Map<String, String> r7 = Collections.singletonMap("nd_artist_id", r0);
        r7.getClass();
        return r7;
    L17:
        if (r3.isEmpty() == false) goto L20;
        Map<String, String> r8 = Collections.singletonMap("by_artist", "true");
        r8.getClass();
        return r8;
    L20:
        LinkedHashMap r9 = new LinkedHashMap(r3);
        r9.put("by_artist", "true");
        return r9;
    }

    public final Map<String, String> track(String r3) {
        r3.getClass();
        String r2 = qm4.K0(r3).toString();
        if (xm4.k0(r2, "hub:", false) == false) goto L13;
        String r4 = qm4.z0(r2, "hub:");
        if (xm4.k0(r4, "dz:", false) == true) goto L9;
        if (xm4.k0(r4, "nd:", false) == true) goto L9;
        return null;
    L9:
        if (r4.length() <= 3) goto L20;
        Map<String, String> r5 = Collections.singletonMap("ref", r4);
        r5.getClass();
        return r5;
    L20:
        return null;
    L13:
        if (r2.length() > 0) goto L15;
        return null;
    L15:
        if (qm4.o0(r2, ":") == true) goto L22;
        Map<String, String> r6 = Collections.singletonMap("nd_song_id", r2);
        r6.getClass();
        return r6;
    L22:
        return null;
    }
}
