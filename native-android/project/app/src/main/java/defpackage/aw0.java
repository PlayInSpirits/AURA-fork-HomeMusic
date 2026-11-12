package defpackage;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class aw0 {
    public static final int[] a = null;
    public static final int[] b = null;
    public static final Rect c = null;

    static {
        a = new int[]{R.attr.state_checked};
        b = new int[0];
        c = new Rect();
    }

    public static void a(Drawable r3) {
        String r0 = r3.getClass().getName();
        int r1 = Build.VERSION.SDK_INT;
        if (r1 >= 29) goto L5;
        return;
    L5:
        if (r1 < 31) goto L7;
        return;
    L7:
        if ("android.graphics.drawable.ColorStateListDrawable".equals(r0) == false) goto L19;
        int[] r2 = r3.getState();
        if (r2 != null) goto L11;
    L14:
        r3.setState(a);
    L15:
        r3.setState(r2);
        return;
    L11:
        if (r2.length == 0) goto L14;
        r3.setState(b);
        goto L15
    }

    public static Rect b(Drawable r5) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 29) goto L6;
        Insets r6 = zv0.a(r5);
        return new Rect(kz.a(r6), kz.t(r6), kz.y(r6), kz.B(r6));
    L6:
        if (r0 < 29) goto L8;
        boolean r7 = yv0.a;
    L15:
        return c;
    L8:
        if (yv0.a == false) goto L15;
        Object r8 = yv0.b.invoke(r5, null);     // Catch: Throwable -> L16
        if (r8 == null) goto L15;
        return new Rect(yv0.c.getInt(r8), yv0.d.getInt(r8), yv0.e.getInt(r8), yv0.f.getInt(r8));
    }

    public static PorterDuff.Mode c(int r1, PorterDuff.Mode r2) {
        if (r1 == 3) goto L21;
        if (r1 == 5) goto L19;
        if (r1 == 9) goto L17;
        switch(r1) {
            case 14: goto L15;
            case 15: goto L13;
            case 16: goto L11;
            default: goto L9;
        };
    L9:
        return r2;
    L11:
        return PorterDuff.Mode.ADD;
    L13:
        return PorterDuff.Mode.SCREEN;
    L15:
        return PorterDuff.Mode.MULTIPLY;
    L17:
        return PorterDuff.Mode.SRC_ATOP;
    L19:
        return PorterDuff.Mode.SRC_IN;
    L21:
        return PorterDuff.Mode.SRC_OVER;
    }
}
