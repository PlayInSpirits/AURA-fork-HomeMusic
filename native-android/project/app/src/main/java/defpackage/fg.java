package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fg {
    public static final PorterDuff.Mode b = null;
    public static fg c;
    public c14 a;

    static {
        b = PorterDuff.Mode.SRC_IN;
    }

    public static synchronized fg a() {
        monitor-enter(fg.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (c != null) goto L9;
        d();     // Catch: Throwable -> L7
    L9:
        fg r1 = c;     // Catch: Throwable -> L7
        monitor-exit(fg.class);
        return r1;
    }

    public static synchronized PorterDuffColorFilter c(int r1, PorterDuff.Mode r2) {
        monitor-enter(fg.class);
        PorterDuffColorFilter r3 = c14.f(r1, r2);     // Catch: Throwable -> L7
        monitor-exit(fg.class);
        return r3;
    L7:
        th = move-exception;
        throw th;
    }

    public static synchronized void d() {
        monitor-enter(fg.class);
    L14:
        th = move-exception;
        throw th;
    L5:
        if (c != null) goto L16;
        fg r1 = new fg();     // Catch: Throwable -> L14
        c = r1;     // Catch: Throwable -> L14
        r1.a = c14.c();     // Catch: Throwable -> L14
        c14 r2 = c.a;     // Catch: Throwable -> L14
        ml3 r3 = new ml3(1);     // Catch: Throwable -> L14
        monitor-enter(r2);     // Catch: Throwable -> L14
        r2.e = r3;     // Catch: Throwable -> L11
        monitor-exit(r2);     // Catch: Throwable -> L14
        goto L16
    L11:
        th = move-exception;
        throw th;     // Catch: Throwable -> L14
    L16:
        monitor-exit(fg.class);
    }

    public static void e(Drawable r4, la0 r5, int[] r6) {
        PorterDuff.Mode r0 = c14.f;
        int[] r1 = r4.getState();
        if (r4.mutate() == r4) goto L5;
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
        return;
    L5:
        if ((r4 instanceof LayerDrawable) == true) goto L7;
    L9:
        boolean r2 = r5.o;
        if (r2 == false) goto L12;
    L16:
        PorterDuffColorFilter r3 = null;
        if (r2 == false) goto L19;
        ColorStateList r7 = (ColorStateList) r5.p;
    L21:
        if (r5.n == false) goto L23;
        PorterDuff.Mode r8 = (PorterDuff.Mode) r5.q;
    L24:
        if (r7 == null) goto L28;
        if (r8 == null) goto L28;
        r3 = c14.f(r7.getColorForState(r6, 0), r8);
    L28:
        r4.setColorFilter(r3);
        return;
    L23:
        r8 = c14.f;
        goto L24
    L19:
        r7 = null;
        goto L21
    L12:
        if (r5.n == true) goto L16;
        r4.clearColorFilter();
        return;
    L7:
        if (r4.isStateful() == false) goto L9;
        r4.setState(new int[0]);
        r4.setState(r1);
        goto L9
    }

    public final synchronized Drawable b(Context r2, int r3) {
        monitor-enter(this);
        Drawable r4 = this.a.d(r2, r3);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r4;
    L6:
        th = move-exception;
        throw th;
    }
}
