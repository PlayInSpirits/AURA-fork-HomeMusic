package defpackage;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uq2 {
    public final oq2 a;
    public final int b;
    public final boolean c;
    public final wq2 d;
    public final wq2 e;
    public final wq2 f;
    public final ArrayList g;
    public final WeakReference h;
    public boolean i = false;
    public boolean j = false;

    public uq2(ui1 ui1Var, wq2 wq2Var, oq2 oq2Var, int i, boolean z, wq2 wq2Var2, Collection collection) {
        this.h = new WeakReference(ui1Var);
        this.e = wq2Var;
        this.a = oq2Var;
        this.b = i;
        this.c = z;
        this.d = ui1Var.c;
        this.f = wq2Var2;
        this.g = collection == null ? null : new ArrayList(collection);
        ui1Var.a.postDelayed(new qa1(20, this), 15000L);
    }

    public final void a() {
        if (this.i || this.j) {
            return;
        }
        this.j = true;
        oq2 oq2Var = this.a;
        if (oq2Var != null) {
            oq2Var.h(0);
            oq2Var.d();
        }
    }

    public final void b() {
        tq2 tq2VarA;
        yq2.b();
        if (this.i || this.j) {
            return;
        }
        WeakReference weakReference = this.h;
        ui1 ui1Var = (ui1) weakReference.get();
        if (ui1Var == null || ui1Var.e != this) {
            a();
            return;
        }
        this.i = true;
        ui1Var.e = null;
        ui1 ui1Var2 = (ui1) weakReference.get();
        wq2 wq2Var = this.d;
        int i = this.b;
        if (ui1Var2 != null) {
            HashMap map = ui1Var2.b;
            if (ui1Var2.c == wq2Var) {
                Message messageObtainMessage = ui1Var2.a.obtainMessage(263, wq2Var);
                messageObtainMessage.arg1 = i;
                messageObtainMessage.sendToTarget();
                oq2 oq2Var = ui1Var2.d;
                if (oq2Var != null) {
                    oq2Var.h(i);
                    ui1Var2.d.d();
                }
                if (!map.isEmpty()) {
                    for (oq2 oq2Var2 : map.values()) {
                        oq2Var2.h(i);
                        oq2Var2.d();
                    }
                    map.clear();
                }
                ui1Var2.d = null;
            }
        }
        ui1 ui1Var3 = (ui1) weakReference.get();
        if (ui1Var3 == null) {
            return;
        }
        wq2 wq2Var2 = this.e;
        ui1Var3.c = wq2Var2;
        ui1Var3.d = this.a;
        ri1 ri1Var = ui1Var3.a;
        boolean z = this.c;
        wq2 wq2Var3 = this.f;
        if (wq2Var3 == null) {
            ri1Var.getClass();
            Message messageObtainMessage2 = ri1Var.obtainMessage(262, new ti1(wq2Var, wq2Var2, z));
            messageObtainMessage2.arg1 = i;
            messageObtainMessage2.sendToTarget();
        } else {
            ri1Var.getClass();
            Message messageObtainMessage3 = ri1Var.obtainMessage(264, new ti1(wq2Var3, wq2Var2, z));
            messageObtainMessage3.arg1 = i;
            messageObtainMessage3.sendToTarget();
        }
        ui1Var3.b.clear();
        ui1Var3.h();
        ui1Var3.l();
        ArrayList arrayList = this.g;
        if (arrayList == null || (tq2VarA = ui1Var3.c.a()) == null) {
            return;
        }
        tq2VarA.o(arrayList);
    }
}
