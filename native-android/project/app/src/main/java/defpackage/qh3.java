package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qh3 {
    public static final qh3 d = null;
    public static final String e = null;
    public static final String f = null;
    public final float a;
    public final float b;
    public final int c;

    static {
        d = new qh3(1.0f);
        String r0 = f35.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
    }

    public qh3(float r5, float r6) {
        boolean r2 = false;
        if (r5 <= 0.0f) goto L5;
        boolean r1 = true;
    L6:
        rr2.l(r1);
        if (r6 <= 0.0f) goto L9;
        r2 = true;
    L9:
        rr2.l(r2);
        this.a = r5;
        this.b = r6;
        this.c = Math.round(r5 * 1000.0f);
        return;
    L5:
        r1 = false;
        goto L6
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (qh3.class != r5.getClass()) goto L15;
        qh3 r6 = (qh3) r5;
        if (this.a != r6.a) goto L15;
        if (this.b != r6.b) goto L15;
        return true;
    }

    public final int hashCode() {
        int r0 = (Float.floatToRawIntBits(this.a) + 527) * 31;
        return Float.floatToRawIntBits(this.b) + r0;
    }

    public final String toString() {
        Object[] r2 = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String r0 = f35.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", r2);
    }

    public qh3(float r2) {
        this(r2, 1.0f);
    }
}
