/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.dz1;

public final class oa2 {
    public static final float b;
    public static final float c;
    public static final float d;
    public final float a;

    static {
        oa2.a(0.0f);
        oa2.a(0.5f);
        b = 0.5f;
        oa2.a(-1.0f);
        c = -1.0f;
        oa2.a(1.0f);
        d = 1.0f;
    }

    public oa2(float f16) {
        this.a = f16;
    }

    public static void a(float f16) {
        if (0.0f <= f16 && f16 <= 1.0f || f16 == -1.0f) {
            return;
        }
        dz1.b("topRatio should be in [0..1] range or -1");
    }

    public static String b(float f16) {
        if (f16 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f16 == b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f16 == c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f16 == d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        StringBuilder stringBuilder = new StringBuilder("LineHeightStyle.Alignment(topPercentage = ");
        stringBuilder.append(f16);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final boolean equals(Object object) {
        float f16;
        return object instanceof oa2 && Float.compare(this.a, f16 = ((oa2)object).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return oa2.b(this.a);
    }
}

