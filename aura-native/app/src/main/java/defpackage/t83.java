package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class t83 implements OnBackAnimationCallback {
    public final /* synthetic */ s83 a;

    public t83(s83 s83Var) {
        this.a = s83Var;
    }

    public final void onBackCancelled() {
        s83 s83Var = this.a;
        bq4 bq4Var = s83Var.a;
        if (bq4Var == null) {
            kf2.o("This input is not added to any dispatcher.");
            return;
        }
        if (!s83Var.b) {
            bq4Var.g(s83Var, null);
        }
        w33 w33Var = (w33) bq4Var.o;
        w33Var.getClass();
        if (s83Var.equals(w33Var.h) && -1 == w33Var.g) {
            u83 u83Var = w33Var.f;
            if (u83Var == null) {
                u83Var = w33Var.c(-1);
            }
            w33Var.f = null;
            w33Var.g = 0;
            w33Var.h = null;
            if (u83Var != null) {
                u83Var.d.getClass();
            }
            nl4 nl4Var = w33Var.a;
            x33 x33Var = x33.p;
            nl4Var.getClass();
            nl4Var.j(null, x33Var);
        }
        s83Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        t33 a = xl.a(backEvent);
        s83 s83Var = this.a;
        bq4 bq4Var = s83Var.a;
        if (bq4Var == null) {
            kf2.o("This input is not added to any dispatcher.");
            return;
        }
        if (s83Var.b) {
            w33 w33Var = (w33) bq4Var.o;
            w33Var.getClass();
            if (s83Var.equals(w33Var.h) && -1 == w33Var.g) {
                u83 u83Var = w33Var.f;
                if (u83Var == null) {
                    u83Var = w33Var.c(-1);
                }
                if (u83Var != null) {
                    u83Var.d.getClass();
                }
                nl4 nl4Var = w33Var.a;
                y33 y33Var = new y33(a);
                nl4Var.getClass();
                nl4Var.j(null, y33Var);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        t33 a = xl.a(backEvent);
        s83 s83Var = this.a;
        bq4 bq4Var = s83Var.a;
        if (bq4Var == null) {
            kf2.o("This input is not added to any dispatcher.");
        } else {
            if (s83Var.b) {
                return;
            }
            bq4Var.g(s83Var, a);
            s83Var.b = true;
        }
    }
}
