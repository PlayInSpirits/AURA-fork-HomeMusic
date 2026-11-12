package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m21 implements pv2 {
    public static final tb1 g = null;
    public static final tb1 h = null;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        sb1 r0 = new sb1();
        r0.m = lw2.m("application/id3");
        g = new tb1(r0);
        sb1 r1 = new sb1();
        r1.m = lw2.m("application/x-scte35");
        h = new tb1(r1);
    }

    public m21(String r1, String r2, long r3, long r5, byte[] r7) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r5;
        this.e = r7;
    }

    @Override // defpackage.pv2
    public final tb1 a() {
        String r2 = this.a;
        byte r1 = -1;
        switch(r2.hashCode()) {
            case -1468477611: goto L14;
            case -795945609: goto L10;
            case 1303648457: goto L6;
            default: goto L17;
        };
    L17:
        switch(r1) {
            case 0: goto L23;
            case 1: goto L21;
            case 2: goto L21;
            default: goto L18;
        };
    L18:
        return null;
    L21:
        return g;
    L23:
        return h;
    L6:
        if (r2.equals("https://developer.apple.com/streaming/emsg-id3") == false) goto L17;
        r1 = 2;
        goto L17
    L10:
        if (r2.equals("https://aomedia.org/emsg/ID3") == false) goto L17;
        r1 = 1;
        goto L17
    L14:
        if (r2.equals("urn:scte:scte35:2014:bin") == false) goto L17;
        r1 = 0;
        goto L17
    }

    @Override // defpackage.pv2
    public final byte[] c() {
        if (a() != null) goto L5;
        return null;
    L5:
        return this.e;
    }

    public final boolean equals(Object r5) {
        if (this == r5) goto L22;
        if (r5 != null) goto L6;
        return false;
    L6:
        if (m21.class != r5.getClass()) goto L28;
        m21 r6 = (m21) r5;
        if (this.c == r6.c) goto L11;
        return false;
    L11:
        if (this.d == r6.d) goto L13;
        return false;
    L13:
        if (this.a.equals(r6.a) == true) goto L15;
        return false;
    L15:
        if (this.b.equals(r6.b) == true) goto L17;
        return false;
    L17:
        if (Arrays.equals(this.e, r6.e) == false) goto L27;
        return true;
    L27:
        return false;
    L28:
        return false;
    L22:
        return true;
    }

    public final int hashCode() {
        if (this.f != 0) goto L6;
        int r0 = f34.e(this.a, 527, 31);
        int r1 = f34.e(this.b, r0, 31);
        long r3 = this.c;
        int r2 = (r1 + ((int) (r3 ^ (r3 >>> 32)))) * 31;
        long r4 = this.d;
        int r5 = (r2 + ((int) (r4 ^ (r4 >>> 32)))) * 31;
        this.f = Arrays.hashCode(this.e) + r5;
    L6:
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
