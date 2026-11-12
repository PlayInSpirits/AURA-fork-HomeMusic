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

    public bi1(a r5, vk4 r6, int r7, int r8, Bitmap r9) {
        zs r0 = r5.n;
        ii1 r10 = r5.p;
        c04 r1 = a.c(r10.getBaseContext());
        vz3 r11 = a.c(r10.getBaseContext()).g().G(((g04) ((g04) ((g04) new g04().e(xq0.c)).E()).y(true)).q(r7, r8));
        this.c = new ArrayList();
        this.d = r1;
        Handler r12 = new Handler(Looper.getMainLooper(), new ai1(0, this));
        this.e = r0;
        this.b = r12;
        this.h = r11;
        this.a = r6;
        c(m15.b, r9);
    }

    public final void a() {
        if (this.f == true) goto L5;
        return;
    L5:
        if (this.g == true) goto L24;
        zh1 r0 = this.m;
        if (r0 == null) goto L11;
        this.m = null;
        b(r0);
        return;
    L11:
        this.g = true;
        vk4 r2 = this.a;
        ci1 r3 = r2.l;
        int r4 = r3.c;
        if (r4 <= 0) goto L20;
        int r5 = r2.k;
        if (r5 < 0) goto L20;
        if (r5 < 0) goto L19;
        if (r5 >= r4) goto L19;
        int r6 = ((yh1) r3.e.get(r5)).i;
    L21:
        long r7 = SystemClock.uptimeMillis() + ((long) r6);
        int r8 = (r2.k + 1) % r2.l.c;
        r2.k = r8;
        this.k = new zh1(this.b, r8, r7);
        vz3 r1 = this.h;
        s73 r9 = new s73(Double.valueOf(Math.random()));
        vz3 r10 = r1.G((g04) new g04().w(r9)).M(r2);
        r10.J(this.k, null, r10, fh0.g);
        return;
    L19:
        r6 = -1;
    L20:
        r6 = 0;
        goto L21
    }

    public final void b(zh1 r9) {
        this.g = false;
        boolean r0 = this.j;
        Handler r2 = this.b;
        if (r0 == false) goto L7;
        r2.obtainMessage(2, r9).sendToTarget();
        return;
    L7:
        if (this.f == true) goto L11;
        this.m = r9;
        return;
    L11:
        if (r9.t == null) goto L38;
        Bitmap r1 = this.l;
        if (r1 == null) goto L15;
        this.e.d(r1);
        this.l = null;
    L15:
        zh1 r3 = this.i;
        this.i = r9;
        ArrayList r10 = this.c;
        int r4 = r10.size() - 1;
    L16:
        if (r4 < 0) goto L36;
        vh1 r5 = (vh1) r10.get(r4);
        Object r6 = r5.getCallback();
    L19:
        if ((r6 instanceof Drawable) == false) goto L21;
        r6 = ((Drawable) r6).getCallback();
        goto L19
    L21:
        if (r6 != null) goto L23;
        r5.stop();
        r5.invalidateSelf();
    L35:
        r4 = r4 - 1;
        goto L16
    L23:
        r5.invalidateSelf();
        bi1 r7 = (bi1) r5.n.b;
        zh1 r8 = r7.i;
        if (r8 == null) goto L26;
        int r11 = r8.r;
    L28:
        if (r11 != (r7.a.l.c - 1)) goto L30;
        r5.s++;
    L30:
        int r12 = r5.t;
        if (r12 == (-1)) goto L35;
        if (r5.s < r12) goto L35;
        r5.stop();
        goto L35
    L26:
        r11 = -1;
        goto L28
    L36:
        if (r3 == null) goto L38;
        r2.obtainMessage(2, r3).sendToTarget();
    L38:
        a();
    }

    public final void c(uw4 r4, Bitmap r5) {
        h12.f(r4, "Argument must not be null");
        h12.f(r5, "Argument must not be null");
        this.l = r5;
        this.h = this.h.G(new g04().B(r4, true));
        this.n = e35.v(r5);
        this.o = r5.getWidth();
        this.p = r5.getHeight();
    }
}
