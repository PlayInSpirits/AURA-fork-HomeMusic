package defpackage;

import android.util.Log;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.Violation;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class he1 {
    public static final ge1 a = ge1.a;

    public static ge1 a(kc1 kc1Var) {
        while (kc1Var != null) {
            if (kc1Var.y()) {
                kc1Var.q();
            }
            kc1Var = kc1Var.I;
        }
        return a;
    }

    public static void b(Violation violation) {
        if (ld1.I(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.n.getClass().getName()), violation);
        }
    }

    public static final void c(kc1 kc1Var, String str) {
        kc1Var.getClass();
        str.getClass();
        b(new FragmentReuseViolation(kc1Var, "Attempting to reuse fragment " + kc1Var + " with previous ID " + str));
        a(kc1Var).getClass();
    }
}
