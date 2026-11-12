package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xy0 {
    public static final int a = 0;
    public static final int b = 0;
    public static ez0 c;

    static {
        a = Color.argb(230, 255, 255, 255);
        b = Color.argb(128, 27, 27, 27);
    }

    public static void a(df r10) {
        int r1 = 16;
        int r9 = 0;
        up4 r4 = new up4(0, 0, new o54(r1));
        o54 r0 = new o54(r1);
        up4 r5 = new up4(a, b, r0);
        View r7 = r10.getWindow().getDecorView();
        r7.getClass();
        ez0 r2 = c;
        if (r2 != null) goto L21;
        int r3 = Build.VERSION.SDK_INT;
        if (r3 < 35) goto L8;
        r2 = new dz0();
    L20:
        c = r2;
        goto L21
    L8:
        if (r3 < 30) goto L11;
        r2 = new cz0();
        goto L20
    L11:
        if (r3 < 29) goto L14;
        r2 = new bz0();
        goto L20
    L14:
        if (r3 < 28) goto L17;
        r2 = new az0();
        goto L20
    L17:
        if (r3 < 26) goto L19;
        r2 = new zy0();
        goto L20
    L19:
        r2 = new yy0();
    L21:
        ez0 r6 = r2;
        mr r8 = new mr(r6, r4, r5, r10, r7, 2);
        ViewGroup r11 = (ViewGroup) r7;
    L23:
        if (r9 >= r11.getChildCount()) goto L32;
        int r12 = r9 + 1;
        View r13 = r11.getChildAt(r9);
        if (r13 == null) goto L31;
        if ((r13.getTag() instanceof ez0) == true) goto L33;
        r9 = r12;
    L33:
        r8.run();
        Window r14 = r10.getWindow();
        r14.getClass();
        r6.a(r14);
        return;
    L31:
        throw new IndexOutOfBoundsException();
    L32:
        wy0 r15 = new wy0(r8, r11.getContext());
        r15.setTag(r6);
        r15.setVisibility(8);
        r15.setWillNotDraw(true);
        r11.addView(r15);
        goto L33
    }
}
