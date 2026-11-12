package defpackage;

import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkerStoppedException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sd5 extends q42 implements if1 {
    public final /* synthetic */ oc2 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ String p;
    public final /* synthetic */ td5 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd5(oc2 oc2Var, boolean z, String str, td5 td5Var) {
        super(1);
        this.n = oc2Var;
        this.o = z;
        this.p = str;
        this.q = td5Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        if (th instanceof WorkerStoppedException) {
            this.n.c.compareAndSet(-256, ((WorkerStoppedException) th).n);
        }
        if (this.o && (str = this.p) != null) {
            td5 td5Var = this.q;
            i80 i80Var = td5Var.e.m;
            int iHashCode = td5Var.a.hashCode();
            i80Var.getClass();
            if (Build.VERSION.SDK_INT >= 29) {
                nv4.b(iHashCode, xl.N(str));
            } else {
                String strN = xl.N(str);
                try {
                    if (xl.k == null) {
                        xl.k = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                    }
                    xl.k.invoke(null, Long.valueOf(xl.h), strN, Integer.valueOf(iHashCode));
                } catch (Exception e) {
                    xl.w("asyncTraceEnd", e);
                }
            }
        }
        return j15.a;
    }
}
