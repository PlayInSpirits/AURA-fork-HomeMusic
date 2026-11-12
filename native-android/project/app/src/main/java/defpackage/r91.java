package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r91 {
    public static final int[] a = new int[2];
    public static final Rect b = new Rect();

    public static final wv3 a(View view, ra raVar) {
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        raVar.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        Rect rect = b;
        view.getFocusedRect(rect);
        float f2 = (i - i3) + rect.left;
        return new wv3(f2, rect.top + f, rect.width() + f2, f + rect.top + rect.height());
    }

    public static final Integer b(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    public static final o91 c(int i) {
        if (i == 1) {
            return new o91(2);
        }
        if (i == 2) {
            return new o91(1);
        }
        if (i == 17) {
            return new o91(3);
        }
        if (i == 33) {
            return new o91(5);
        }
        if (i == 66) {
            return new o91(4);
        }
        if (i != 130) {
            return null;
        }
        return new o91(6);
    }
}
