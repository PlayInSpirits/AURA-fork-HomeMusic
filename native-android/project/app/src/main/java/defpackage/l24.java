package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l24 {
    public static final int[] a = null;
    public static final int[] b = null;
    public static final int[] c = null;
    public static final int[] d = null;
    public static final int[] e = null;
    public static final String f = null;

    static {
        a = new int[]{R.attr.state_pressed};
        b = new int[]{R.attr.state_focused};
        c = new int[]{R.attr.state_selected, R.attr.state_pressed};
        d = new int[]{R.attr.state_selected};
        e = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        f = l24.class.getSimpleName();
    }

    public static ColorStateList a(ColorStateList r4) {
        int[] r3 = b;
        return new ColorStateList(new int[][]{d, r3, StateSet.NOTHING}, new int[]{b(r4, c), b(r4, r3), b(r4, a)});
    }

    public static int b(ColorStateList r1, int[] r2) {
        if (r1 == null) goto L4;
        int r3 = r1.getColorForState(r2, r1.getDefaultColor());
    L6:
        return v50.i(r3, Math.min(Color.alpha(r3) * 2, 255));
    L4:
        r3 = 0;
        goto L6
    }

    public static ColorStateList c(ColorStateList r3) {
        if (r3 == null) goto L13;
        if (Build.VERSION.SDK_INT <= 27) goto L7;
    L11:
        return r3;
    L7:
        if (Color.alpha(r3.getDefaultColor()) != 0) goto L11;
        if (Color.alpha(r3.getColorForState(e, 0)) == 0) goto L11;
        Log.w(f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        goto L11
    L13:
        return ColorStateList.valueOf(0);
    }

    public static boolean d(int[] r8) {
        int r0 = r8.length;
        int r2 = 0;
        boolean r3 = false;
        boolean r4 = false;
    L4:
        if (r2 >= r0) goto L18;
        int r6 = r8[r2];
        if (r6 != 16842910) goto L9;
        r3 = true;
    L17:
        r2 = r2 + 1;
        goto L4
    L9:
        if (r6 != 16842908) goto L12;
    L10:
        r4 = true;
        goto L17
    L12:
        if (r6 == 16842919) goto L10;
        if (r6 != 16843623) goto L17;
    L18:
        if (r3 == false) goto L21;
        if (r4 == false) goto L21;
        return true;
    L21:
        return false;
    }
}
