package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wh1 implements q04, xy1 {
    public final Drawable n;
    public final /* synthetic */ int o;

    public wh1(Drawable r1, int r2) {
        this.o = r2;
        h12.f(r1, "Argument must not be null");
        this.n = r1;
    }

    private final void c() {
    }

    @Override // defpackage.xy1
    public void a() {
        int r0 = this.o;
        Drawable r1 = this.n;
        switch(r0) {
            case 0: goto L11;
            default: goto L5;
        };
    L11:
        ((bi1) ((vh1) r1).n.b).l.prepareToDraw();
        return;
    L5:
        if ((r1 instanceof BitmapDrawable) == false) goto L8;
        ((BitmapDrawable) r1).getBitmap().prepareToDraw();
        return;
    L8:
        if ((r1 instanceof vh1) == false) goto L14;
        ((bi1) ((vh1) r1).n.b).l.prepareToDraw();
        return;
    }

    @Override // defpackage.q04
    public final void b() {
        switch(this.o) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        vh1 r6 = (vh1) this.n;
        r6.stop();
        r6.q = true;
        bi1 r7 = (bi1) r6.n.b;
        c04 r1 = r7.d;
        r7.c.clear();
        Bitmap r2 = r7.l;
        if (r2 == null) goto L8;
        r7.e.d(r2);
        r7.l = null;
    L8:
        r7.f = false;
        zh1 r3 = r7.i;
        if (r3 == null) goto L11;
        r1.q(r3);
        r7.i = null;
    L11:
        zh1 r4 = r7.k;
        if (r4 == null) goto L14;
        r1.q(r4);
        r7.k = null;
    L14:
        zh1 r5 = r7.m;
        if (r5 == null) goto L17;
        r1.q(r5);
        r7.m = null;
    L17:
        vk4 r8 = r7.a;
        rm3 r9 = r8.c;
        r8.l = null;
        byte[] r10 = r8.i;
        if (r10 == null) goto L23;
        qj0 r11 = (qj0) r9.o;
        if (r11 == null) goto L23;
        r11.h(r10);
    L23:
        int[] r12 = r8.j;
        if (r12 == null) goto L29;
        qj0 r13 = (qj0) r9.o;
        if (r13 == null) goto L29;
        r13.h(r12);
    L29:
        Bitmap r14 = r8.m;
        if (r14 == null) goto L32;
        ((zs) r9.n).d(r14);
    L32:
        r8.m = null;
        r8.d = null;
        r8.s = null;
        byte[] r15 = r8.e;
        if (r15 == null) goto L38;
        qj0 r16 = (qj0) r9.o;
        if (r16 == null) goto L38;
        r16.h(r15);
    L38:
        r7.j = true;
    }

    @Override // defpackage.q04
    public final int d() {
        int r0 = this.o;
        Drawable r3 = this.n;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        int r1 = r3.getIntrinsicWidth();
        return Math.max(1, (r3.getIntrinsicHeight() * r1) * 4);
    L6:
        bi1 r4 = (bi1) ((vh1) r3).n.b;
        vk4 r2 = r4.a;
        int r5 = r2.d.limit() + r2.i.length;
        return ((r2.j.length * 4) + r5) + r4.n;
    }

    @Override // defpackage.q04
    public final Class e() {
        switch(this.o) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return vh1.class;
    L5:
        return this.n.getClass();
    }

    @Override // defpackage.q04
    public final Object get() {
        Drawable r1 = this.n;
        Drawable.ConstantState r0 = r1.getConstantState();
        if (r0 != null) goto L6;
        return r1;
    L6:
        return r0.newDrawable();
    }
}
