package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class kx4 extends dx4 {
    public int M;
    public ArrayList K = new ArrayList();
    public boolean L = true;
    public boolean N = false;
    public int O = 0;

    @Override // defpackage.dx4
    public final void A(xi4 xi4Var) {
        super.A(xi4Var);
        this.O |= 4;
        if (this.K != null) {
            for (int i = 0; i < this.K.size(); i++) {
                ((dx4) this.K.get(i)).A(xi4Var);
            }
        }
    }

    @Override // defpackage.dx4
    public final void B(cx cxVar) {
        this.F = cxVar;
        this.O |= 2;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            ((dx4) this.K.get(i)).B(cxVar);
        }
    }

    @Override // defpackage.dx4
    public final void C(long j) {
        this.o = j;
    }

    @Override // defpackage.dx4
    public final String E(String str) {
        String strE = super.E(str);
        for (int i = 0; i < this.K.size(); i++) {
            StringBuilder sbS = b11.s(strE, "\n");
            sbS.append(((dx4) this.K.get(i)).E(str.concat("  ")));
            strE = sbS.toString();
        }
        return strE;
    }

    public final void F(dx4 dx4Var) {
        this.K.add(dx4Var);
        dx4Var.v = this;
        long j = this.p;
        if (j >= 0) {
            dx4Var.x(j);
        }
        if ((this.O & 1) != 0) {
            dx4Var.z(this.q);
        }
        if ((this.O & 2) != 0) {
            dx4Var.B(this.F);
        }
        if ((this.O & 4) != 0) {
            dx4Var.A(this.G);
        }
        if ((this.O & 8) != 0) {
            dx4Var.y(null);
        }
    }

    @Override // defpackage.dx4
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final void x(long j) {
        ArrayList arrayList;
        this.p = j;
        if (j < 0 || (arrayList = this.K) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dx4) this.K.get(i)).x(j);
        }
    }

    @Override // defpackage.dx4
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void z(TimeInterpolator timeInterpolator) {
        this.O |= 1;
        ArrayList arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((dx4) this.K.get(i)).z(timeInterpolator);
            }
        }
        this.q = timeInterpolator;
    }

    public final void I(int i) {
        if (i == 0) {
            this.L = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(f34.f(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.L = false;
        }
    }

    @Override // defpackage.dx4
    public final void c(mx4 mx4Var) {
        View view = mx4Var.b;
        if (r(view)) {
            ArrayList arrayList = this.K;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                dx4 dx4Var = (dx4) obj;
                if (dx4Var.r(view)) {
                    dx4Var.c(mx4Var);
                    mx4Var.c.add(dx4Var);
                }
            }
        }
    }

    @Override // defpackage.dx4
    public final void cancel() {
        super.cancel();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            ((dx4) this.K.get(i)).cancel();
        }
    }

    @Override // defpackage.dx4
    public final void e(mx4 mx4Var) {
        super.e(mx4Var);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            ((dx4) this.K.get(i)).e(mx4Var);
        }
    }

    @Override // defpackage.dx4
    public final void f(mx4 mx4Var) {
        View view = mx4Var.b;
        if (r(view)) {
            ArrayList arrayList = this.K;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                dx4 dx4Var = (dx4) obj;
                if (dx4Var.r(view)) {
                    dx4Var.f(mx4Var);
                    mx4Var.c.add(dx4Var);
                }
            }
        }
    }

    @Override // defpackage.dx4
    /* JADX INFO: renamed from: i */
    public final dx4 clone() {
        kx4 kx4Var = (kx4) super.clone();
        kx4Var.K = new ArrayList();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            dx4 dx4VarClone = ((dx4) this.K.get(i)).clone();
            kx4Var.K.add(dx4VarClone);
            dx4VarClone.v = kx4Var;
        }
        return kx4Var;
    }

    @Override // defpackage.dx4
    public final void k(ViewGroup viewGroup, bq4 bq4Var, bq4 bq4Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.o;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            dx4 dx4Var = (dx4) this.K.get(i);
            if (j > 0 && (this.L || i == 0)) {
                long j2 = dx4Var.o;
                if (j2 > 0) {
                    dx4Var.C(j2 + j);
                } else {
                    dx4Var.C(j);
                }
            }
            dx4Var.k(viewGroup, bq4Var, bq4Var2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.dx4
    public final void t(View view) {
        super.t(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            ((dx4) this.K.get(i)).t(view);
        }
    }

    @Override // defpackage.dx4
    public final void v(View view) {
        super.v(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            ((dx4) this.K.get(i)).v(view);
        }
    }

    @Override // defpackage.dx4
    public final void w() {
        ArrayList arrayList;
        if (this.K.isEmpty()) {
            D();
            l();
            return;
        }
        t51 t51Var = new t51();
        t51Var.b = this;
        ArrayList arrayList2 = this.K;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((dx4) obj).a(t51Var);
        }
        this.M = this.K.size();
        if (this.L) {
            ArrayList arrayList3 = this.K;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj2 = arrayList3.get(i);
                i++;
                ((dx4) obj2).w();
            }
            return;
        }
        int i3 = 1;
        int i4 = 1;
        while (true) {
            int size3 = this.K.size();
            arrayList = this.K;
            if (i4 >= size3) {
                break;
            }
            ((dx4) arrayList.get(i4 - 1)).a(new t51(i3, (dx4) this.K.get(i4)));
            i4++;
        }
        dx4 dx4Var = (dx4) arrayList.get(0);
        if (dx4Var != null) {
            dx4Var.w();
        }
    }

    @Override // defpackage.dx4
    public final void y(hw hwVar) {
        this.O |= 8;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            ((dx4) this.K.get(i)).y(hwVar);
        }
    }
}
