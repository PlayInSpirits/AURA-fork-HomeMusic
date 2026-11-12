package defpackage;

import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v71 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final rm3 k;
    public final qv2 l;

    public v71(int r3, byte[] r4) {
        h00 r0 = new h00(r4.length, r4);
        r0.q(r3 * 8);
        this.a = r0.i(16);
        this.b = r0.i(16);
        this.c = r0.i(24);
        this.d = r0.i(24);
        int r5 = r0.i(20);
        this.e = r5;
        this.f = d(r5);
        this.g = r0.i(3) + 1;
        int r6 = r0.i(5) + 1;
        this.h = r6;
        this.i = a(r6);
        this.j = r0.k(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int r1) {
        if (r1 != 8) goto L5;
        return 1;
    L5:
        if (r1 != 12) goto L7;
        return 2;
    L7:
        if (r1 != 16) goto L9;
        return 4;
    L9:
        if (r1 != 20) goto L11;
        return 5;
    L11:
        if (r1 != 24) goto L13;
        return 6;
    L13:
        if (r1 == 32) goto L16;
        return -1;
    L16:
        return 7;
    }

    public static int d(int r0) {
        switch(r0) {
            case 8000: goto L25;
            case 16000: goto L23;
            case 22050: goto L21;
            case 24000: goto L19;
            case 32000: goto L17;
            case 44100: goto L15;
            case 48000: goto L13;
            case 88200: goto L11;
            case 96000: goto L9;
            case 176400: goto L7;
            case 192000: goto L5;
            default: goto L3;
        };
    L3:
        return -1;
    L5:
        return 3;
    L7:
        return 2;
    L9:
        return 11;
    L11:
        return 1;
    L13:
        return 10;
    L15:
        return 9;
    L17:
        return 8;
    L19:
        return 7;
    L21:
        return 6;
    L23:
        return 5;
    L25:
        return 4;
    }

    public final long b() {
        long r2 = this.j;
        if (r2 != 0) goto L7;
        return -9223372036854775807L;
    L7:
        return (r2 * 1000000) / ((long) this.e);
    }

    public final tb1 c(byte[] r4, qv2 r5) {
        r4[4] = -128;
        int r0 = this.d;
        if (r0 > 0) goto L6;
        r0 = -1;
    L6:
        qv2 r1 = this.l;
        if (r1 == null) goto L10;
        r5 = r1.b(r5);
    L10:
        sb1 r2 = new sb1();
        r2.m = lw2.m("audio/flac");
        r2.n = r0;
        r2.E = this.g;
        r2.F = this.e;
        String r3 = f35.a;
        ByteOrder r6 = ByteOrder.LITTLE_ENDIAN;
        r2.G = f35.C(this.h, r6);
        r2.p = Collections.singletonList(r4);
        r2.k = r5;
        return new tb1(r2);
    }

    public v71(int r1, int r2, int r3, int r4, int r5, int r6, int r7, long r8, rm3 r10, qv2 r11) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = d(r5);
        this.g = r6;
        this.h = r7;
        this.i = a(r7);
        this.j = r8;
        this.k = r10;
        this.l = r11;
    }
}
