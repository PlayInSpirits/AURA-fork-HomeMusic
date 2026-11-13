/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

public final class ku0
implements Comparable {
    public final float n;

    public ku0(float f16) {
        this.n = f16;
    }

    public static int a(float f16, float f17) {
        if (!Float.isNaN(f16) && !Float.isNaN(f17)) {
            return Float.compare(f16, f17);
        }
        return 0;
    }

    public static final boolean b(float f16, float f17) {
        return Float.compare(f16, f17) == 0;
    }

    public static String c(float f16) {
        if (Float.isNaN(f16)) {
            return "Dp.Unspecified";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f16);
        stringBuilder.append(".dp");
        return stringBuilder.toString();
    }

    public final int compareTo(Object object) {
        float f16 = ((ku0)object).n;
        return ku0.a(this.n, f16);
    }

    public final boolean equals(Object object) {
        float f16;
        return object instanceof ku0 && Float.compare(this.n, f16 = ((ku0)object).n) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.n);
    }

    public final String toString() {
        return ku0.c(this.n);
    }
}

