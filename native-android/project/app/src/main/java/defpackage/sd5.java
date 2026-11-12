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

    public sd5(oc2 r1, boolean r2, String r3, td5 r4) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        super(1);
    }

    @Override // defpackage.if1
    public final Object invoke(Object r6) {
        Throwable r7 = (Throwable) r6;
        if ((r7 instanceof WorkerStoppedException) == false) goto L6;
        int r8 = ((WorkerStoppedException) r7).n;
        this.n.c.compareAndSet(-256, r8);
    L6:
        if (this.o == false) goto L22;
        String r9 = this.p;
        if (r9 == null) goto L22;
        td5 r5 = this.q;
        i80 r0 = r5.e.m;
        int r10 = r5.a.hashCode();
        r0.getClass();
        if (Build.VERSION.SDK_INT < 29) goto L12;
        nv4.b(r10, xl.N(r9));
        goto L22
    L12:
        String r11 = xl.N(r9);
    L16:
        e = move-exception;
        xl.w("asyncTraceEnd", e);
        goto L22
    L14:
        if (xl.k != null) goto L18;
        xl.k = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});     // Catch: Exception -> L16
    L18:
        xl.k.invoke(null, new Object[]{Long.valueOf(xl.h), r11, Integer.valueOf(r10)});     // Catch: Exception -> L16
    L22:
        return j15.a;
    }
}
