package com.eddyizm.tempus.homemusic;

import defpackage.h12;
import defpackage.qm4;
import defpackage.vr1;
import defpackage.xm4;
import defpackage.ya4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class SmartContexts {
    public static final int $stable = 0;
    public static final SmartContexts INSTANCE = null;
    public static final String LIKED = "liked";

    static {
        INSTANCE = new SmartContexts();
    }

    private SmartContexts() {
    }

    public final String dominant(List<String> r6) {
        r6.getClass();
        Object r0 = null;
        if (r6.isEmpty() == true) goto L25;
        final ArrayList r5 = new ArrayList();
        Iterator<T> r1 = r6.iterator();
    L7:
        if (r1.hasNext() == false) goto L11;
        Object r2 = r1.next();
        if (r2 == null) goto L7;
        r5.add(r2);
        goto L7
    L11:
        Iterator r7 = vr1.m(new SmartContexts$dominant$$inlined$groupingBy$1(r5)).entrySet().iterator();
        if (r7.hasNext() == true) goto L14;
        Object r3 = null;
    L23:
        Map.Entry r4 = (Map.Entry) r3;
        if (r4 == null) goto L25;
        Object r8 = r4.getKey();
        String r9 = (String) r8;
        if ((((Number) r4.getValue()).intValue() * 2) <= r6.size()) goto L32;
        if (INSTANCE.offered(r9) == false) goto L32;
        r0 = r8;
    L32:
        return (String) r0;
    L14:
        r3 = r7.next();
        if (r7.hasNext() == false) goto L23;
        int r10 = ((Number) ((Map.Entry) r3).getValue()).intValue();
    L18:
        Object r11 = r7.next();
        int r12 = ((Number) ((Map.Entry) r11).getValue()).intValue();
        if (r10 >= r12) goto L22;
        r3 = r11;
        r10 = r12;
    L22:
        if (r7.hasNext() == true) goto L18;
    L25:
        return null;
    }

    public final String hubId(String r1) {
        r1.getClass();
        return qm4.z0(r1, "hub:");
    }

    public final String mediaId(String r1) {
        r1.getClass();
        if (qm4.n0(r1, ':') == true) goto L5;
        return r1;
    L5:
        return "hub:".concat(r1);
    }

    public final boolean offered(String r3) {
        if (h12.c(r3, LIKED) == false) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
    L19:
        return false;
    L7:
        if (xm4.k0(r3, "playlist:", false) == false) goto L19;
        int r0 = r3.length();
        if (10 > r0) goto L19;
        if (r0 >= 74) goto L19;
        int r1 = 0;
    L14:
        if (r1 >= r3.length()) goto L24;
        if (ya4.y(r3.charAt(r1)) == true) goto L19;
        r1 = r1 + 1;
        goto L14
    L24:
        return true;
    }

    public final String recommendation(String r1) {
        r1.getClass();
        return "smart:".concat(r1);
    }
}
