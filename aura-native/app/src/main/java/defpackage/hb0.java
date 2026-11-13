package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class hb0 {
    public int b;
    public boolean c;
    public final jc0 d;
    public final int e;
    public hb0 f;
    public ai4 i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public hb0(jc0 jc0Var, int i) {
        this.d = jc0Var;
        this.e = i;
    }

    public final void a(hb0 hb0Var, int i, int i2) {
        if (hb0Var == null) {
            g();
            return;
        }
        this.f = hb0Var;
        if (hb0Var.a == null) {
            hb0Var.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
    }

    public final void b(int i, aa5 aa5Var, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                gi1.n(((hb0) it.next()).d, i, arrayList, aa5Var);
            }
        }
    }

    public final int c() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int d() {
        hb0 hb0Var;
        if (this.d.f0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (hb0Var = this.f) == null || hb0Var.d.f0 != 8) ? this.g : i;
    }

    public final boolean e() {
        hb0 hb0Var;
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            hb0 hb0Var2 = (hb0) it.next();
            jc0 jc0Var = hb0Var2.d;
            int i = hb0Var2.e;
            switch (xa3.w(i)) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    hb0Var = null;
                    break;
                case 1:
                    hb0Var = jc0Var.J;
                    break;
                case 2:
                    hb0Var = jc0Var.K;
                    break;
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    hb0Var = jc0Var.H;
                    break;
                case 4:
                    hb0Var = jc0Var.I;
                    break;
                default:
                    throw new AssertionError(xa3.v(i));
            }
            if (hb0Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f != null;
    }

    public final void g() {
        HashSet hashSet;
        hb0 hb0Var = this.f;
        if (hb0Var != null && (hashSet = hb0Var.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void h() {
        ai4 ai4Var = this.i;
        if (ai4Var == null) {
            this.i = new ai4(1);
        } else {
            ai4Var.c();
        }
    }

    public final void i(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.g0 + ":" + xa3.v(this.e);
    }
}
