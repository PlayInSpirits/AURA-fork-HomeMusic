package defpackage;

import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fm2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ fm2(ls2 ls2Var, va4 va4Var, int i, ms2 ms2Var, ks2 ks2Var) {
        this.n = 1;
        this.p = ls2Var;
        this.q = va4Var;
        this.o = i;
        this.r = ms2Var;
        this.s = ks2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        int i = this.n;
        int i2 = this.o;
        Object obj = this.s;
        Object obj2 = this.r;
        Object obj3 = this.q;
        Object obj4 = this.p;
        switch (i) {
            case 0:
                im2 im2Var = (im2) obj4;
                List list = (List) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (((AtomicInteger) obj3).incrementAndGet() == list.size()) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        ic2 ic2Var = (ic2) arrayList.get(i3);
                        if (ic2Var != null) {
                            try {
                                bitmap = (Bitmap) hw.j(ic2Var);
                            } catch (CancellationException | ExecutionException e) {
                                l93.B("MCImplLegacy", "Failed to get bitmap", e);
                                bitmap = null;
                            }
                        } else {
                            bitmap = null;
                        }
                        im2Var.i.a(f92.i((gn2) list.get(i3), bitmap), i2 + i3);
                    }
                }
                break;
            case 1:
                ls2 ls2Var = (ls2) obj4;
                va4 va4Var = (va4) obj3;
                ms2 ms2Var = (ms2) obj2;
                ks2 ks2Var = (ks2) obj;
                if (!ls2Var.g.l()) {
                    if (!((kr2) ls2Var.m.o).a.isActive()) {
                        StringBuilder sb = new StringBuilder("Ignore incoming session command before initialization. command=");
                        sb.append(va4Var == null ? Integer.valueOf(i2) : va4Var.b);
                        sb.append(", pid=");
                        sb.append(ms2Var.a.b);
                        l93.q0("MediaSessionLegacyStub", sb.toString());
                    } else {
                        fr2 fr2VarM = ls2Var.M(ms2Var);
                        na4 na4Var = ls2Var.f;
                        if (va4Var != null) {
                            if (!na4Var.J(fr2VarM, va4Var)) {
                            }
                        } else if (!na4Var.I(fr2VarM, i2)) {
                        }
                        try {
                            ks2Var.b(fr2VarM);
                        } catch (RemoteException e2) {
                            l93.r0("MediaSessionLegacyStub", "Exception in " + fr2VarM, e2);
                            return;
                        }
                    }
                    break;
                }
                break;
            default:
                Pair pair = (Pair) obj3;
                ((nj0) ((zt2) obj4).o.i).U(((Integer) pair.first).intValue(), (mt2) pair.second, (ed2) obj2, (un2) obj, this.o);
                break;
        }
    }

    public /* synthetic */ fm2(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.n = i2;
        this.p = obj;
        this.q = obj2;
        this.r = obj3;
        this.s = obj4;
        this.o = i;
    }
}
