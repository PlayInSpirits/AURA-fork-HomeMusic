package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cb5 extends mb5 {
    public static boolean m;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public vz1[] d;
    public vz1 e;
    public pb5 f;
    public vz1 g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public cb5(pb5 r2, WindowInsets r3) {
        super(r2);
        this.e = null;
        this.k = new Rect[10][];
        this.l = new Rect[10][];
        this.c = r3;
    }

    private vr0 B(View r12) {
        if (r12 != null) goto L5;
        return null;
    L5:
        Display r13 = r12.getDisplay();
        if (r13 != null) goto L8;
        return null;
    L8:
        Point r0 = new Point();
        r13.getRealSize(r0);
        if (this.a.a.s() == true) goto L11;
        int r11 = 0;
        j34 r1 = zz1.t(r13, 0);
        j34 r2 = zz1.t(r13, 1);
        j34 r3 = zz1.t(r13, 2);
        j34 r14 = zz1.t(r13, 3);
        int r4 = r0.x;
        int r5 = r0.y;
        if (r1 == null) goto L15;
        int r7 = r1.b;
    L16:
        if (r2 == null) goto L18;
        int r8 = r2.b;
    L19:
        if (r3 == null) goto L21;
        int r9 = r3.b;
    L22:
        if (r14 == null) goto L25;
        r11 = r14.b;
    L25:
        return vr0.a(r4, r5, false, r7, r8, r9, r11);
    L21:
        r9 = 0;
        goto L22
    L18:
        r8 = 0;
        goto L19
    L15:
        r7 = 0;
        goto L16
    L11:
        return vr0.a(r0.x, r0.y, true, 0, 0, 0, 0);
    }

    private static List<Rect> C(Rect[][] r6, int r7) {
        Rect[] r0 = null;
        int r1 = 1;
    L4:
        if (r1 > 512) goto L15;
        if ((r7 & r1) == 0) goto L14;
        Rect[] r2 = r6[ud3.N(r1)];
        if (r2 == null) goto L14;
        if (r0 != null) goto L13;
        r0 = r2;
        goto L14
    L13:
        Rect[] r3 = new Rect[r0.length + r2.length];
        System.arraycopy(r0, 0, r3, 0, r0.length);
        System.arraycopy(r2, 0, r3, r0.length, r2.length);
        r0 = r3;
    L14:
        r1 = r1 << 1;
        goto L4
    L15:
        if (r0 != null) goto L19;
        return Collections.EMPTY_LIST;
    L19:
        return Arrays.asList(r0);
    }

    private Rect[] D(vz1 r8) {
        ArrayList r0 = new ArrayList();
        int r1 = r8.a;
        int r2 = r8.d;
        int r3 = r8.c;
        int r4 = r8.b;
        if (r1 == 0) goto L5;
        r0.add(new Rect(0, 0, r8.a, this.i));
    L5:
        if (r4 == 0) goto L7;
        r0.add(new Rect(0, 0, this.j, r4));
    L7:
        if (r3 == 0) goto L9;
        int r5 = this.j;
        r0.add(new Rect(r5 - r3, 0, r5, this.i));
    L9:
        if (r2 == 0) goto L12;
        int r6 = this.i;
        r0.add(new Rect(0, r6 - r2, this.j, r6));
    L12:
        return (Rect[]) r0.toArray(new Rect[r0.size()]);
    }

    private vz1 E(int r4, boolean r5) {
        vz1 r0 = vz1.e;
        int r1 = 1;
    L4:
        if (r1 > 512) goto L10;
        if ((r4 & r1) == 0) goto L9;
        r0 = vz1.a(r0, F(r1, r5));
    L9:
        r1 = r1 << 1;
        goto L4
    L10:
        return r0;
    }

    private vz1 G() {
        pb5 r0 = this.f;
        if (r0 == null) goto L7;
        return r0.a.k();
    L7:
        return vz1.e;
    }

    private vz1 H(View r5) {
        if (Build.VERSION.SDK_INT < 30) goto L5;
        er1.l("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        return null;
    L5:
        if (m == true) goto L7;
        J();
    L7:
        Method r0 = n;
        if (r0 != null) goto L10;
    L26:
        return null;
    L10:
        if (o == null) goto L26;
        if (p == null) goto L26;
        Object r6 = r0.invoke(r5, null);     // Catch: ReflectiveOperationException -> L18
        if (r6 != null) goto L20;
        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());     // Catch: ReflectiveOperationException -> L18
        return null;
    L20:
        Rect r7 = (Rect) p.get(q.get(r6));     // Catch: ReflectiveOperationException -> L18
        if (r7 != null) goto L23;
        return null;
    L23:
        return vz1.b(r7.left, r7.top, r7.right, r7.bottom);
    L18:
        e = move-exception;
        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        goto L26
    }

    private static void J() {
        n = View.class.getDeclaredMethod("getViewRootImpl", null);     // Catch: ReflectiveOperationException -> L5
        Class<?> r1 = Class.forName("android.view.View$AttachInfo");     // Catch: ReflectiveOperationException -> L5
        o = r1;     // Catch: ReflectiveOperationException -> L5
        p = r1.getDeclaredField("mVisibleInsets");     // Catch: ReflectiveOperationException -> L5
        q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");     // Catch: ReflectiveOperationException -> L5
        p.setAccessible(true);     // Catch: ReflectiveOperationException -> L5
        q.setAccessible(true);     // Catch: ReflectiveOperationException -> L5
    L7:
        m = true;
        return;
    L5:
        e = move-exception;
        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        goto L7
    }

    public static boolean L(int r0, int r1) {
        if ((r0 & 6) != (r1 & 6)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.mb5
    public void A(Rect[][] r1) {
        Objects.requireNonNull(r1);
        this.l = (Rect[][]) r1.clone();
    }

    public vz1 F(int r5, boolean r6) {
        vz1 r1 = vz1.e;
        int r2 = 0;
        if (r5 == 1) goto L73;
        vz1 r0 = null;
        if (r5 != 2) goto L7;
        if (r6 == false) goto L63;
        vz1 r7 = G();
        vz1 r4 = k();
        return vz1.b(Math.max(r7.a, r4.a), 0, Math.max(r7.c, r4.c), Math.max(r7.d, r4.d));
    L63:
        if ((this.h & 2) != 0) goto L78;
        vz1 r8 = m();
        pb5 r9 = this.f;
        if (r9 == null) goto L68;
        r0 = r9.a.k();
    L68:
        int r10 = r8.d;
        if (r0 == null) goto L72;
        r10 = Math.min(r10, r0.d);
    L72:
        return vz1.b(r8.a, 0, r8.c, r10);
    L78:
        return r1;
    L7:
        if (r5 != 8) goto L9;
        vz1[] r11 = this.d;
        if (r11 == null) goto L45;
        r0 = r11[ud3.N(8)];
    L45:
        if (r0 == null) goto L47;
        return r0;
    L47:
        vz1 r12 = m();
        vz1 r13 = G();
        int r14 = r12.d;
        if (r14 > r13.d) goto L50;
        vz1 r15 = this.g;
        if (r15 == null) goto L78;
        if (r15.equals(r1) == true) goto L78;
        int r16 = this.g.d;
        if (r16 <= r13.d) goto L78;
        return vz1.b(0, 0, 0, r16);
    L50:
        return vz1.b(0, 0, 0, r14);
    L9:
        if (r5 == 16) goto L41;
        if (r5 == 32) goto L39;
        if (r5 == 64) goto L37;
        if (r5 != 128) goto L78;
        pb5 r17 = this.f;
        if (r17 == null) goto L20;
        tr0 r18 = r17.a.g();
    L21:
        if (r18 == null) goto L78;
        int r19 = Build.VERSION.SDK_INT;
        if (r19 < 28) goto L25;
        int r3 = ne.k(r18.a);
    L26:
        if (r19 < 28) goto L28;
        int r20 = ne.m(r18.a);
    L29:
        if (r19 < 28) goto L31;
        int r21 = ne.l(r18.a);
    L32:
        if (r19 < 28) goto L35;
        r2 = ne.j(r18.a);
    L35:
        return vz1.b(r3, r20, r21, r2);
    L31:
        r21 = 0;
        goto L32
    L28:
        r20 = 0;
        goto L29
    L25:
        r3 = 0;
        goto L26
    L20:
        r18 = g();
        goto L21
    L37:
        return n();
    L39:
        return j();
    L41:
        return l();
    L73:
        if (r6 == false) goto L77;
        return vz1.b(0, Math.max(G().b, m().b), 0, 0);
    L77:
        if ((this.h & 4) != 0) goto L78;
        return vz1.b(0, m().b, 0, 0);
    }

    public boolean I(int r4) {
        if (r4 == 1) goto L15;
        if (r4 == 2) goto L15;
        if (r4 != 4) goto L9;
        return false;
    L9:
        if (r4 == 8) goto L15;
        if (r4 == 128) goto L15;
        return true;
    L15:
        return !F(r4, false).equals(vz1.e);
    }

    public void K(vz1 r1) {
        this.g = r1;
    }

    @Override // defpackage.mb5
    public void d(View r2) {
        this.j = r2.getWidth();
        this.i = r2.getHeight();
        vz1 r3 = H(r2);
        if (r3 != null) goto L5;
        r3 = vz1.e;
    L5:
        K(r3);
    }

    @Override // defpackage.mb5
    public List<Rect> e(int r1) {
        return C(this.k, r1);
    }

    @Override // defpackage.mb5
    public boolean equals(Object r4) {
        if (super.equals(r4) == true) goto L5;
        return false;
    L5:
        cb5 r5 = (cb5) r4;
        if (Objects.equals(this.g, r5.g) == true) goto L8;
    L11:
        return false;
    L8:
        if (L(this.h, r5.h) == false) goto L11;
        return true;
    }

    @Override // defpackage.mb5
    public List<Rect> f(int r1) {
        return C(this.l, r1);
    }

    @Override // defpackage.mb5
    public vz1 h(int r2) {
        return E(r2, false);
    }

    @Override // defpackage.mb5
    public vz1 i(int r2) {
        return E(r2, true);
    }

    @Override // defpackage.mb5
    public final vz1 m() {
        if (this.e != null) goto L6;
        WindowInsets r0 = this.c;
        this.e = vz1.b(r0.getSystemWindowInsetLeft(), r0.getSystemWindowInsetTop(), r0.getSystemWindowInsetRight(), r0.getSystemWindowInsetBottom());
    L6:
        return this.e;
    }

    @Override // defpackage.mb5
    public void o(View r1) {
        B(r1);
    }

    @Override // defpackage.mb5
    public void p() {
        int r0 = 1;
    L4:
        if (r0 > 512) goto L9;
        int r1 = ud3.N(r0);
        this.k[r1] = D(h(r0));
        if (r0 == 8) goto L8;
        this.l[r1] = D(i(r0));
    L8:
        r0 = r0 << 1;
        goto L4
    }

    @Override // defpackage.mb5
    public pb5 q(int r4, int r5, int r6, int r7) {
        pb5 r0 = pb5.g(this.c, null);
        int r1 = Build.VERSION.SDK_INT;
        if (r1 < 36) goto L6;
        bb5 r2 = new ab5(r0);
    L21:
        r2.h(pb5.e(m(), r4, r5, r6, r7));
        r2.f(pb5.e(k(), r4, r5, r6, r7));
        return r2.b();
    L6:
        if (r1 < 35) goto L9;
        r2 = new za5(r0);
        goto L21
    L9:
        if (r1 < 34) goto L12;
        r2 = new ya5(r0);
        goto L21
    L12:
        if (r1 < 31) goto L15;
        r2 = new xa5(r0);
        goto L21
    L15:
        if (r1 < 30) goto L18;
        r2 = new wa5(r0);
        goto L21
    L18:
        if (r1 < 29) goto L20;
        r2 = new va5(r0);
        goto L21
    L20:
        r2 = new ua5(r0);
        goto L21
    }

    @Override // defpackage.mb5
    public boolean s() {
        return this.c.isRound();
    }

    @Override // defpackage.mb5
    public boolean t(int r4) {
        int r1 = 1;
    L4:
        if (r1 > 512) goto L13;
        if ((r4 & r1) == 0) goto L12;
        if (I(r1) == true) goto L12;
        return false;
    L12:
        r1 = r1 << 1;
        goto L4
    L13:
        return true;
    }

    @Override // defpackage.mb5
    public void u(vr0 r1) {
    }

    @Override // defpackage.mb5
    public void v(vz1[] r1) {
        this.d = r1;
    }

    @Override // defpackage.mb5
    public void w(pb5 r1) {
        this.f = r1;
    }

    @Override // defpackage.mb5
    public void y(int r1) {
        this.h = r1;
    }

    @Override // defpackage.mb5
    public void z(Rect[][] r1) {
        Objects.requireNonNull(r1);
        this.k = (Rect[][]) r1.clone();
    }
}
