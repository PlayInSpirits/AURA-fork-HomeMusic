/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.Context;
import android.graphics.Color;
import defpackage.g12;
import defpackage.v50;
import defpackage.zz1;

public final class nz0 {
    public static final int f = (int)Math.round(5.1000000000000005);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public nz0(Context context) {
        boolean bl5 = zz1.E(context, 2130969037, false);
        int n16 = g12.s(context, 2130969036, 0);
        int n17 = g12.s(context, 2130969035, 0);
        int n18 = g12.s(context, 2130968891, 0);
        float f16 = context.getResources().getDisplayMetrics().density;
        this.a = bl5;
        this.b = n16;
        this.c = n17;
        this.d = n18;
        this.e = f16;
    }

    public final int a(int n16, float f16) {
        int n17;
        float f17 = this.e;
        f16 = !(f17 <= 0.0f) && !(f16 <= 0.0f) ? Math.min(((float)Math.log1p(f16 / f17) * 4.5f + 2.0f) / 100.0f, 1.0f) : 0.0f;
        int n18 = Color.alpha(n16);
        n16 = n17 = g12.H(v50.i(n16, 255), f16, this.b);
        if (f16 > 0.0f) {
            int n19 = this.c;
            n16 = n17;
            if (n19 != 0) {
                n16 = v50.g(v50.i(n19, f), n17);
            }
        }
        return v50.i(n16, n18);
    }

    public final int b(int n16, float f16) {
        if (this.a && v50.i(n16, 255) == this.d) {
            return this.a(n16, f16);
        }
        return n16;
    }
}

