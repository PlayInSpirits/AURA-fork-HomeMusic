package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ri1 extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ ui1 c;

    public ri1(ui1 ui1Var) {
        this.c = ui1Var;
    }

    public static void a(sq2 sq2Var, int i, Object obj) {
        wq2 wq2Var;
        yq2 yq2Var = sq2Var.a;
        uo uoVar = sq2Var.b;
        int i2 = 65280 & i;
        if (i2 != 256) {
            if (i2 != 512) {
                if (i2 == 768 && i == 769) {
                    if (obj == null) {
                        uoVar.M();
                    } else {
                        kf2.k();
                        return;
                    }
                }
                return;
            }
            switch (i) {
                case 513:
                    uoVar.D();
                    break;
                case 514:
                    uoVar.F();
                    break;
                case 515:
                    uoVar.E();
                    break;
            }
        }
        if (i == 264 || i == 262) {
            wq2Var = ((ti1) obj).a;
        } else {
            if (i == 265 || i == 266) {
                obj.getClass();
                kf2.k();
                return;
            }
            wq2Var = (wq2) obj;
        }
        if (wq2Var != null) {
            if ((sq2Var.d & 2) == 0 && !wq2Var.h(sq2Var.c)) {
                yq2.c().getClass();
                return;
            }
            switch (i) {
                case 257:
                    uoVar.G();
                    break;
                case 258:
                    uoVar.I();
                    break;
                case 259:
                    uoVar.H(wq2Var);
                    break;
                case 260:
                    uoVar.L(wq2Var);
                    break;
                case 261:
                    uoVar.getClass();
                    break;
                case 262:
                    uoVar.J(wq2Var);
                    break;
                case 263:
                    uoVar.K();
                    break;
                case 264:
                    uoVar.J(wq2Var);
                    break;
                case 265:
                    uoVar.getClass();
                    break;
                case 266:
                    uoVar.getClass();
                    break;
            }
        }
    }

    public final void b(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int k;
        ArrayList arrayList = this.a;
        ui1 ui1Var = this.c;
        ArrayList arrayList2 = ui1Var.g;
        vg3 vg3Var = ui1Var.r;
        int i = message.what;
        Object obj = message.obj;
        if (i == 259 && ui1Var.g().c.equals(((wq2) obj).c)) {
            ui1Var.o(true);
        }
        int i2 = 0;
        ArrayList arrayList3 = this.b;
        if (i == 262) {
            ti1 ti1Var = (ti1) obj;
            wq2 wq2Var = ti1Var.a;
            if (ti1Var.b) {
                vg3Var.p(wq2Var);
            }
            if (ui1Var.t != null && wq2Var.d()) {
                int size = arrayList3.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList3.get(i3);
                    i3++;
                    vg3Var.o((wq2) obj2);
                }
                arrayList3.clear();
            }
        } else if (i != 264) {
            switch (i) {
                case 257:
                    vg3Var.n((wq2) obj);
                    break;
                case 258:
                    vg3Var.o((wq2) obj);
                    break;
                case 259:
                    wq2 wq2Var2 = (wq2) obj;
                    vg3Var.getClass();
                    if (wq2Var2.c() != vg3Var && (k = vg3Var.k(wq2Var2)) >= 0) {
                        vg3.t((yg3) vg3Var.E.get(k));
                        break;
                    }
                    break;
            }
        } else {
            ti1 ti1Var2 = (ti1) obj;
            wq2 wq2Var3 = ti1Var2.a;
            arrayList3.add(wq2Var3);
            vg3Var.n(wq2Var3);
            if (ti1Var2.b) {
                vg3Var.p(wq2Var3);
            }
        }
        try {
            int size2 = arrayList2.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    int size3 = arrayList.size();
                    while (i2 < size3) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        a((sq2) obj3, i, obj);
                    }
                    arrayList.clear();
                    return;
                }
                yq2 yq2Var = (yq2) ((WeakReference) arrayList2.get(size2)).get();
                if (yq2Var == null) {
                    arrayList2.remove(size2);
                } else {
                    arrayList.addAll(yq2Var.b);
                }
            }
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }
}
