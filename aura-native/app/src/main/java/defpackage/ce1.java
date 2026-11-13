package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ce1 extends fw3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ce1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fw3
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((de1) obj).b(true);
                break;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.k(null);
                recyclerView.u0.f = true;
                recyclerView.a0(true);
                if (!recyclerView.r.m()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
            default:
                ((jw) obj).r();
                break;
        }
    }

    @Override // defpackage.fw3
    public final void b(int i, int i2, Object obj) {
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                a();
                break;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj2;
                recyclerView.k(null);
                c6 c6Var = recyclerView.r;
                ArrayList arrayList = (ArrayList) c6Var.c;
                if (i2 >= 1) {
                    arrayList.add(c6Var.o(obj, 4, i, i2));
                    c6Var.a |= 4;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            default:
                ((jw) obj2).r();
                break;
        }
    }

    @Override // defpackage.fw3
    public final void c(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                a();
                break;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.k(null);
                c6 c6Var = recyclerView.r;
                ArrayList arrayList = (ArrayList) c6Var.c;
                if (i2 >= 1) {
                    arrayList.add(c6Var.o(null, 1, i, i2));
                    c6Var.a |= 1;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            default:
                ((jw) obj).r();
                break;
        }
    }

    @Override // defpackage.fw3
    public final void d(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                a();
                break;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.k(null);
                c6 c6Var = recyclerView.r;
                ArrayList arrayList = (ArrayList) c6Var.c;
                if (i != i2) {
                    arrayList.add(c6Var.o(null, 8, i, i2));
                    c6Var.a |= 8;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            default:
                ((jw) obj).r();
                break;
        }
    }

    @Override // defpackage.fw3
    public final void e(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                a();
                break;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.k(null);
                c6 c6Var = recyclerView.r;
                ArrayList arrayList = (ArrayList) c6Var.c;
                if (i2 >= 1) {
                    arrayList.add(c6Var.o(null, 2, i, i2));
                    c6Var.a |= 2;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            default:
                ((jw) obj).r();
                break;
        }
    }

    @Override // defpackage.fw3
    public void f() {
        dw3 dw3Var;
        switch (this.a) {
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.q != null && (dw3Var = recyclerView.z) != null) {
                    int w = xa3.w(dw3Var.p);
                    if (w != 1) {
                        if (w == 2) {
                        }
                    } else if (dw3Var.a() <= 0) {
                    }
                    recyclerView.requestLayout();
                    break;
                }
                break;
        }
    }

    public void g() {
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!recyclerView.G || !recyclerView.F) {
            recyclerView.N = true;
            recyclerView.requestLayout();
        } else {
            bw3 bw3Var = recyclerView.v;
            WeakHashMap weakHashMap = j65.a;
            recyclerView.postOnAnimation(bw3Var);
        }
    }
}
