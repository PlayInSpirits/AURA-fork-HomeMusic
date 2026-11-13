package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qh3 {
    public static final qh3 d = new qh3(1.0f);
    public static final String e;
    public static final String f;
    public final float a;
    public final float b;
    public final int c;

    static {
        String str = f35.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
    }

    public qh3(float f2, float f3) {
        rr2.l(f2 > 0.0f);
        rr2.l(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qh3.class == obj.getClass()) {
            qh3 qh3Var = (qh3) obj;
            if (this.a == qh3Var.a && this.b == qh3Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String str = f35.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public qh3(float f2) {
        this(f2, 1.0f);
    }
}
