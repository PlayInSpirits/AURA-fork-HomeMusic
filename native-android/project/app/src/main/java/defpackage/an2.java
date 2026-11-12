package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class an2 {
    public static final an2 f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        f = new an2(new zm2());
        String r0 = f35.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public an2(zm2 r8) {
        long r0 = r8.a;
        long r2 = r8.b;
        long r4 = r8.c;
        float r6 = r8.d;
        float r9 = r8.e;
        this.a = r0;
        this.b = r2;
        this.c = r4;
        this.d = r6;
        this.e = r9;
    }

    public static an2 b(Bundle r5) {
        zm2 r0 = new zm2();
        an2 r1 = f;
        long r2 = r1.a;
        r0.a = r5.getLong(g, r2);
        r0.b = r5.getLong(h, r1.b);
        r0.c = r5.getLong(i, r1.c);
        r0.d = r5.getFloat(j, r1.d);
        r0.e = r5.getFloat(k, r1.e);
        return new an2(r0);
    }

    public final zm2 a() {
        zm2 r0 = new zm2();
        r0.a = this.a;
        r0.b = this.b;
        r0.c = this.c;
        r0.d = this.d;
        r0.e = this.e;
        return r0;
    }

    public final Bundle c() {
        Bundle r0 = new Bundle();
        an2 r1 = f;
        long r2 = r1.a;
        long r4 = this.a;
        if (r4 == r2) goto L5;
        r0.putLong(g, r4);
    L5:
        long r3 = r1.b;
        long r5 = this.b;
        if (r5 == r3) goto L8;
        r0.putLong(h, r5);
    L8:
        long r6 = r1.c;
        long r7 = this.c;
        if (r7 == r6) goto L11;
        r0.putLong(i, r7);
    L11:
        float r8 = r1.d;
        float r9 = this.d;
        if (r9 == r8) goto L14;
        r0.putFloat(j, r9);
    L14:
        float r10 = r1.e;
        float r11 = this.e;
        if (r11 == r10) goto L17;
        r0.putFloat(k, r11);
    L17:
        return r0;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof an2) == true) goto L8;
        return false;
    L8:
        an2 r9 = (an2) r8;
        if (this.a == r9.a) goto L11;
    L19:
        return false;
    L11:
        if (this.b != r9.b) goto L19;
        if (this.c != r9.c) goto L19;
        if (this.d != r9.d) goto L19;
        if (this.e != r9.e) goto L19;
        return true;
    }

    public final int hashCode() {
        long r0 = this.a;
        long r3 = this.b;
        int r1 = ((((int) (r0 ^ (r0 >>> 32))) * 31) + ((int) (r3 ^ (r3 >>> 32)))) * 31;
        long r4 = this.c;
        int r2 = (r1 + ((int) ((r4 >>> 32) ^ r4))) * 31;
        float r5 = this.d;
        int r6 = 0;
        if (r5 == 0.0f) goto L5;
        int r7 = Float.floatToIntBits(r5);
    L6:
        int r8 = (r2 + r7) * 31;
        float r9 = this.e;
        if (r9 == 0.0f) goto L10;
        r6 = Float.floatToIntBits(r9);
    L10:
        return r8 + r6;
    L5:
        r7 = 0;
        goto L6
    }
}
