package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vy0 {
    public final Context a;
    public final int b;
    public long c = 0;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public vy0(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? qe.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(hb3 hb3Var) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        EdgeEffect a = i >= 31 ? qe.a(context) : new aj1(context);
        a.setColor(this.b);
        if (!n02.a(this.c, 0L)) {
            long j = this.c;
            if (hb3Var == hb3.n) {
                a.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return a;
            }
            a.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return a;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(hb3.n);
        this.e = a;
        return a;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(hb3.o);
        this.f = a;
        return a;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(hb3.o);
        this.g = a;
        return a;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(hb3.n);
        this.d = a;
        return a;
    }
}
