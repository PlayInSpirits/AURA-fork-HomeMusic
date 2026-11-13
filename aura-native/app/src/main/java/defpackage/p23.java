/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.os.Bundle;
import defpackage.r23;

public final class p23
implements Comparable {
    public final r23 n;
    public final Bundle o;
    public final boolean p;
    public final int q;
    public final boolean r;
    public final int s;

    public p23(r23 r232, Bundle bundle, boolean bl5, int n16, boolean bl6, int n17) {
        this.n = r232;
        this.o = bundle;
        this.p = bl5;
        this.q = n16;
        this.r = bl6;
        this.s = n17;
    }

    public final int a(p23 p232) {
        p232.getClass();
        boolean bl5 = p232.r;
        boolean bl6 = p232.p;
        Bundle bundle = p232.o;
        boolean bl7 = this.p;
        if (bl7 && !bl6) {
            return 1;
        }
        if (!bl7 && bl6) {
            return -1;
        }
        int n16 = this.q - p232.q;
        if (n16 > 0) {
            return 1;
        }
        if (n16 < 0) {
            return -1;
        }
        Bundle bundle2 = this.o;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            n16 = bundle2.size();
            bundle.getClass();
            if ((n16 -= bundle.size()) > 0) {
                return 1;
            }
            if (n16 < 0) {
                return -1;
            }
        }
        if ((bl7 = this.r) && !bl5) {
            return 1;
        }
        if (!bl7 && bl5) {
            return -1;
        }
        return this.s - p232.s;
    }

    public final int compareTo(Object object) {
        return this.a((p23)object);
    }
}

