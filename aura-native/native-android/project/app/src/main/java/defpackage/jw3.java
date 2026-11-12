package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jw3 {
    public cw3 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(cx3 cx3Var) {
        int i = cx3Var.j;
        if (!cx3Var.h() && (i & 4) == 0) {
            cx3Var.b();
        }
    }

    public abstract boolean a(cx3 cx3Var, cx3 cx3Var2, n50 n50Var, n50 n50Var2);

    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x007e, please report this as an issue */
    public final void c(cx3 cx3Var) {
        cw3 cw3Var = this.a;
        if (cw3Var != null) {
            RecyclerView recyclerView = cw3Var.a;
            boolean z = true;
            cx3Var.p(true);
            View view = cx3Var.a;
            if (cx3Var.h != null && cx3Var.i == null) {
                cx3Var.h = null;
            }
            cx3Var.i = null;
            if ((cx3Var.j & 16) != 0) {
                return;
            }
            hm2 hm2Var = recyclerView.p;
            recyclerView.n0();
            ew4 ew4Var = recyclerView.s;
            e20 e20Var = (e20) ew4Var.q;
            rm2 rm2Var = (rm2) ew4Var.p;
            int i = ew4Var.o;
            if (i != 1) {
                if (i == 2) {
                    kf2.o("Cannot call removeViewIfHidden within removeViewIfHidden");
                    return;
                }
                try {
                    ew4Var.o = 2;
                    int iIndexOfChild = ((RecyclerView) rm2Var.o).indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        ew4Var.p(view);
                    } else if (e20Var.s(iIndexOfChild)) {
                        e20Var.y(iIndexOfChild);
                        ew4Var.p(view);
                        rm2Var.i(iIndexOfChild);
                    } else {
                        ew4Var.o = 0;
                    }
                    ew4Var.o = 0;
                    if (z) {
                        cx3 cx3VarN = RecyclerView.N(view);
                        hm2Var.l(cx3VarN);
                        hm2Var.i(cx3VarN);
                        if (RecyclerView.Q0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.p0(!z);
                    if (z && cx3Var.l()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } catch (Throwable th) {
                    ew4Var.o = 0;
                    throw th;
                }
            }
            if (((View) ew4Var.s) != view) {
                kf2.o("Cannot call removeViewIfHidden within removeView(At) for a different view");
                return;
            }
            z = false;
            if (z) {
                cx3 cx3VarN2 = RecyclerView.N(view);
                hm2Var.l(cx3VarN2);
                hm2Var.i(cx3VarN2);
                if (RecyclerView.Q0) {
                    Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                }
            }
            recyclerView.p0(!z);
            if (z) {
            }
        }
    }

    public abstract void d(cx3 cx3Var);

    public abstract void e();

    public abstract boolean f();
}
