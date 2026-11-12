package defpackage;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kk4 {
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public kk4(String r1, int r2, Integer r3, Integer r4, float r5, boolean r6, boolean r7, boolean r8, boolean r9, int r10) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
        this.j = r10;
    }

    public static int a(String r2) {
        int r0 = Integer.parseInt(r2.trim());     // Catch: NumberFormatException -> L10
        switch(r0) {
            case 1: goto L5;
            case 2: goto L5;
            case 3: goto L5;
            case 4: goto L5;
            case 5: goto L5;
            case 6: goto L5;
            case 7: goto L5;
            case 8: goto L5;
            case 9: goto L5;
            default: goto L4;
        };
    L4:
        boolean r1 = false;
    L6:
        if (r1 == false) goto L8;
        return r0;
    L5:
        r1 = true;
    L8:
        xa3.s("Ignoring unknown alignment: ", r2, "SsaStyle");
        return -1;
    }

    public static boolean b(String r4) {
        int r5 = Integer.parseInt(r4);     // Catch: NumberFormatException -> L11
        if (r5 != 1) goto L7;
    L10:
        return true;
    L7:
        if (r5 == (-1)) goto L10;
        return false;
    L11:
        e = move-exception;
        l93.r0("SsaStyle", "Failed to parse boolean value: '" + r4 + "'", e);
        return false;
    }

    public static Integer c(String r8) {
    L5:
        e = move-exception;
        l93.r0("SsaStyle", "Failed to parse color expression: '" + r8 + "'", e);
        return null;
    L3:
        if (r8.startsWith("&H") == false) goto L7;
        long r2 = Long.parseLong(r8.substring(2), 16);     // Catch: IllegalArgumentException -> L5
    L9:
        if (r2 > 4294967295L) goto L11;
        boolean r0 = true;
    L12:
        rr2.l(r0);     // Catch: IllegalArgumentException -> L5
        int r9 = jz4.m(((r2 >> 24) & 255) ^ 255);
        int r1 = jz4.m((r2 >> 16) & 255);
        return Integer.valueOf(Color.argb(r9, jz4.m(r2 & 255), jz4.m((r2 >> 8) & 255), r1));
    L11:
        r0 = false;
        goto L12
    L7:
        r2 = Long.parseLong(r8);     // Catch: IllegalArgumentException -> L5
        goto L9
    }
}
