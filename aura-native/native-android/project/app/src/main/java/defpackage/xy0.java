package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xy0 {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);
    public static ez0 c;

    public static void a(df dfVar) {
        int i = 16;
        int i2 = 0;
        up4 up4Var = new up4(0, 0, new o54(i));
        up4 up4Var2 = new up4(a, b, new o54(i));
        View decorView = dfVar.getWindow().getDecorView();
        decorView.getClass();
        ez0 zy0Var = c;
        if (zy0Var == null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 35) {
                zy0Var = new dz0();
            } else if (i3 >= 30) {
                zy0Var = new cz0();
            } else if (i3 >= 29) {
                zy0Var = new bz0();
            } else if (i3 >= 28) {
                zy0Var = new az0();
            } else {
                zy0Var = i3 >= 26 ? new zy0() : new yy0();
            }
            c = zy0Var;
        }
        ez0 ez0Var = zy0Var;
        mr mrVar = new mr(ez0Var, up4Var, up4Var2, dfVar, decorView, 2);
        ViewGroup viewGroup = (ViewGroup) decorView;
        while (i2 < viewGroup.getChildCount()) {
            int i4 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof ez0) {
                mrVar.run();
                Window window = dfVar.getWindow();
                window.getClass();
                ez0Var.a(window);
            }
            i2 = i4;
        }
        wy0 wy0Var = new wy0(mrVar, viewGroup.getContext());
        wy0Var.setTag(ez0Var);
        wy0Var.setVisibility(8);
        wy0Var.setWillNotDraw(true);
        viewGroup.addView(wy0Var);
        mrVar.run();
        Window window2 = dfVar.getWindow();
        window2.getClass();
        ez0Var.a(window2);
    }
}
