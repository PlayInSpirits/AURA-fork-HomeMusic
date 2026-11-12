package defpackage;

import android.util.Log;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.Violation;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class he1 {
    public static final ge1 a = null;

    static {
        a = ge1.a;
    }

    public static ge1 a(kc1 r1) {
    L2:
        if (r1 == null) goto L8;
        if (r1.y() == false) goto L6;
        r1.q();
    L6:
        r1 = r1.I;
        goto L2
    L8:
        return a;
    }

    public static void b(Violation r2) {
        if (ld1.I(3) == false) goto L6;
        Log.d("FragmentManager", "StrictMode violation in ".concat(r2.n.getClass().getName()), r2);
        return;
    }

    public static final void c(kc1 r3, String r4) {
        r3.getClass();
        r4.getClass();
        b(new FragmentReuseViolation(r3, "Attempting to reuse fragment " + r3 + " with previous ID " + r4));
        a(r3).getClass();
    }
}
