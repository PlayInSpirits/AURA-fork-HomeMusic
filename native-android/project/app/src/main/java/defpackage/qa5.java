package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qa5 extends WindowInsetsAnimation$Callback {
    public final ma5 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public qa5(ma5 ma5Var) {
        super(ma5Var.o);
        this.d = new HashMap();
        this.a = ma5Var;
    }

    public final ta5 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        ta5 ta5Var = (ta5) map.get(windowInsetsAnimation);
        if (ta5Var != null) {
            return ta5Var;
        }
        ta5 ta5Var2 = new ta5(0, null, 0L);
        ta5Var2.a = new ra5(windowInsetsAnimation);
        map.put(windowInsetsAnimation, ta5Var2);
        return ta5Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.a(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationL = xq2.l(list.get(size));
            ta5 ta5VarA = a(windowInsetsAnimationL);
            ta5VarA.a.e(windowInsetsAnimationL.getFraction());
            this.c.add(ta5VarA);
        }
        return this.a.c(pb5.g(windowInsets, null), this.b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        qr2 qr2VarD = this.a.d(a(windowInsetsAnimation), new qr2(bounds));
        qr2VarD.getClass();
        xq2.o();
        return xq2.j(((vz1) qr2VarD.o).d(), ((vz1) qr2VarD.p).d());
    }
}
