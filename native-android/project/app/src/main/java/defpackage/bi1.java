package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.a;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bi1 {
    public final vk4 a;
    public final Handler b;
    public final ArrayList c;
    public final c04 d;
    public final zs e;
    public boolean f;
    public boolean g;
    public vz3 h;
    public zh1 i;
    public boolean j;
    public zh1 k;
    public Bitmap l;
    public zh1 m;
    public int n;
    public int o;
    public int p;

    public bi1(a aVar, vk4 vk4Var, int i, int i2, Bitmap bitmap) {
        zs zsVar = aVar.n;
        ii1 ii1Var = aVar.p;
        c04 c04VarC = a.c(ii1Var.getBaseContext());
        vz3 vz3VarA = a.c(ii1Var.getBaseContext()).g().a(((g04) ((g04) ((g04) new g04().e(xq0.c)).E()).y(true)).q(i, i2));
        this.c = new ArrayList();
        this.d = c04VarC;
        Handler handler = new Handler(Looper.getMainLooper(), new ai1(0, this));
        this.e = zsVar;
        this.b = handler;
        this.h = vz3VarA;
        this.a = vk4Var;
        c(m15.b, bitmap);
    }

    public final void a() {
        int i;
        int i2;
        if (!this.f || this.g) {
            return;
        }
        zh1 zh1Var = this.m;
        if (zh1Var != null) {
            this.m = null;
            b(zh1Var);
            return;
        }
        this.g = true;
        vk4 vk4Var = this.a;
        ci1 ci1Var = vk4Var.l;
        int i3 = ci1Var.c;
        if (i3 <= 0 || (i2 = vk4Var.k) < 0) {
            i = 0;
        } else {
            i = (i2 < 0 || i2 >= i3) ? -1 : ((yh1) ci1Var.e.get(i2)).i;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i);
        int i4 = (vk4Var.k + 1) % vk4Var.l.c;
        vk4Var.k = i4;
        this.k = new zh1(this.b, i4, jUptimeMillis);
        vz3 vz3VarM = this.h.a((g04) new g04().w(new s73(Double.valueOf(Math.random())))).M(vk4Var);
        vz3VarM.J(this.k, null, vz3VarM, fh0.g);
    }

    public final void b(zh1 zh1Var) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, zh1Var).sendToTarget();
            return;
        }
        if (!this.f) {
            this.m = zh1Var;
            return;
        }
        if (zh1Var.t != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.d(bitmap);
                this.l = null;
            }
            zh1 zh1Var2 = this.i;
            this.i = zh1Var;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                vh1 vh1Var = (vh1) arrayList.get(size);
                Object callback = vh1Var.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    vh1Var.stop();
                    vh1Var.invalidateSelf();
                } else {
                    vh1Var.invalidateSelf();
                    bi1 bi1Var = (bi1) vh1Var.n.b;
                    zh1 zh1Var3 = bi1Var.i;
                    if ((zh1Var3 != null ? zh1Var3.r : -1) == bi1Var.a.l.c - 1) {
                        vh1Var.s++;
                    }
                    int i = vh1Var.t;
                    if (i != -1 && vh1Var.s >= i) {
                        vh1Var.stop();
                    }
                }
            }
            if (zh1Var2 != null) {
                handler.obtainMessage(2, zh1Var2).sendToTarget();
            }
        }
        a();
    }

    public final void c(uw4 uw4Var, Bitmap bitmap) {
        h12.f(uw4Var, "Argument must not be null");
        h12.f(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.h = this.h.a(new g04().B(uw4Var, true));
        this.n = e35.v(bitmap);
        this.o = bitmap.getWidth();
        this.p = bitmap.getHeight();
    }
}
