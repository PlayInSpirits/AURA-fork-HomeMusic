package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pb5 {
    public static final pb5 b = null;
    public final mb5 a;

    static {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 34) goto L7;
        b = kb5.w;
        return;
    L7:
        if (r0 < 30) goto L10;
        b = ib5.v;
        return;
    L10:
        b = mb5.b;
    }

    public pb5(WindowInsets r3) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 35) goto L7;
        this.a = new lb5(this, r3);
        return;
    L7:
        if (r0 < 34) goto L11;
        this.a = new kb5(this, r3);
        return;
    L11:
        if (r0 < 31) goto L15;
        this.a = new jb5(this, r3);
        return;
    L15:
        if (r0 < 30) goto L19;
        this.a = new ib5(this, r3);
        return;
    L19:
        if (r0 < 29) goto L23;
        this.a = new gb5(this, r3);
        return;
    L23:
        if (r0 < 28) goto L26;
        this.a = new eb5(this, r3);
        return;
    L26:
        this.a = new db5(this, r3);
    }

    public static vz1 e(vz1 r5, int r6, int r7, int r8, int r9) {
        int r0 = Math.max(0, r5.a - r6);
        int r2 = Math.max(0, r5.b - r7);
        int r3 = Math.max(0, r5.c - r8);
        int r1 = Math.max(0, r5.d - r9);
        if (r0 != r6) goto L9;
        if (r2 != r7) goto L9;
        if (r3 != r8) goto L9;
        if (r1 != r9) goto L9;
        return r5;
    L9:
        return vz1.b(r0, r2, r3, r1);
    }

    public static pb5 g(WindowInsets r2, View r3) {
        r2.getClass();
        pb5 r0 = new pb5(r2);
        if (r3 != null) goto L5;
    L7:
        return r0;
    L5:
        if (r3.isAttachedToWindow() == false) goto L7;
        WeakHashMap r4 = j65.a;
        pb5 r5 = b65.a(r3);
        mb5 r1 = r0.a;
        r1.w(r5);
        View r6 = r3.getRootView();
        r1.d(r6);
        r1.o(r6);
        r1.p();
        r1.y(r3.getWindowSystemUiVisibility());
        goto L7
    }

    public final int a() {
        return this.a.m().d;
    }

    public final int b() {
        return this.a.m().a;
    }

    public final int c() {
        return this.a.m().c;
    }

    public final int d() {
        return this.a.m().b;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof pb5) == true) goto L10;
        return false;
    L10:
        return Objects.equals(this.a, ((pb5) r2).a);
    }

    public final WindowInsets f() {
        mb5 r1 = this.a;
        if ((r1 instanceof cb5) == true) goto L5;
        return null;
    L5:
        return ((cb5) r1).c;
    }

    public final int hashCode() {
        mb5 r0 = this.a;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    public pb5() {
        this.a = new mb5(this);
    }
}
