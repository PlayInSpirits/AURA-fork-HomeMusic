/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.graphics.Insets;
import defpackage.kz;
import defpackage.yh;
import defpackage.yj1;

public final class vz1 {
    public static final vz1 e = new vz1(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public vz1(int n16, int n17, int n18, int n19) {
        this.a = n16;
        this.b = n17;
        this.c = n18;
        this.d = n19;
    }

    public static vz1 a(vz1 vz12, vz1 vz13) {
        return vz1.b(Math.max(vz12.a, vz13.a), Math.max(vz12.b, vz13.b), Math.max(vz12.c, vz13.c), Math.max(vz12.d, vz13.d));
    }

    public static vz1 b(int n16, int n17, int n18, int n19) {
        if (n16 == 0 && n17 == 0 && n18 == 0 && n19 == 0) {
            return e;
        }
        return new vz1(n16, n17, n18, n19);
    }

    public static vz1 c(Insets insets) {
        return vz1.b(kz.a(insets), yj1.a(insets), yj1.q(insets), yj1.v(insets));
    }

    public final Insets d() {
        int n16 = this.c;
        int n17 = this.d;
        return yh.j(this.a, this.b, n16, n17);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && vz1.class == object.getClass()) {
            object = (vz1)object;
            if (this.d != ((vz1)object).d) {
                return false;
            }
            if (this.a != ((vz1)object).a) {
                return false;
            }
            if (this.c != ((vz1)object).c) {
                return false;
            }
            return this.b == ((vz1)object).b;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Insets{left=");
        stringBuilder.append(this.a);
        stringBuilder.append(", top=");
        stringBuilder.append(this.b);
        stringBuilder.append(", right=");
        stringBuilder.append(this.c);
        stringBuilder.append(", bottom=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

