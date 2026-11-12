package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ua5 extends bb5 {
    public static Field g;
    public static boolean h;
    public static Constructor i;
    public static boolean j;
    public WindowInsets e;
    public vz1 f;

    public ua5() {
        this.e = j();
    }

    private static WindowInsets j() {
        if (h == false) goto L33;
    L9:
        Field r0 = g;
        if (r0 == null) goto L18;
        WindowInsets r1 = (WindowInsets) r0.get(null);     // Catch: ReflectiveOperationException -> L15
        if (r1 == null) goto L18;
        return new WindowInsets(r1);
    L15:
        e = move-exception;
        Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e);
    L18:
        if (j == false) goto L31;
    L24:
        Constructor r2 = i;
        if (r2 != null) goto L35;
    L30:
        return null;
    L35:
        return (WindowInsets) r2.newInstance(new Object[]{new Rect()});
    L28:
        e = move-exception;
        Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e);
        goto L30
    L31:
        i = WindowInsets.class.getConstructor(new Class[]{Rect.class});     // Catch: ReflectiveOperationException -> L21
    L23:
        j = true;
    L21:
        e = move-exception;
        Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e);
        goto L23
    L33:
        g = WindowInsets.class.getDeclaredField("CONSUMED");     // Catch: ReflectiveOperationException -> L6
    L8:
        h = true;
    L6:
        e = move-exception;
        Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
        goto L8
    }

    @Override // defpackage.bb5
    public pb5 b() {
        a();
        pb5 r0 = pb5.g(this.e, null);
        vz1[] r2 = this.b;
        mb5 r3 = r0.a;
        r3.v(r2);
        r3.x(this.f);
        r3.u(null);
        r3.z(this.c);
        r3.A(this.d);
        return r0;
    }

    @Override // defpackage.bb5
    public void f(vz1 r1) {
        this.f = r1;
    }

    @Override // defpackage.bb5
    public void h(vz1 r5) {
        WindowInsets r0 = this.e;
        if (r0 == null) goto L6;
        this.e = r0.replaceSystemWindowInsets(r5.a, r5.b, r5.c, r5.d);
        return;
    }

    public ua5(pb5 r1) {
        super(r1);
        this.e = r1.f();
    }
}
