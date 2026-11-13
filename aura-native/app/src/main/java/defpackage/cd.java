package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class cd implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ cd(int i, Object obj, Object obj2) {
        this.n = i;
        this.p = obj;
        this.o = obj2;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        long j;
        switch (this.n) {
            case 0:
                bd bdVar = (bd) this.p;
                dd ddVar = (dd) this.o;
                synchronized (bdVar.r) {
                    bdVar.t.remove(ddVar);
                }
                return j15.a;
            case 1:
                ((Choreographer) ((ed) this.p).o).removeFrameCallback((dd) this.o);
                return j15.a;
            case 2:
                gh4 gh4Var = (gh4) obj;
                synchronized (jh4.c) {
                    j = jh4.e;
                    jh4.e = 1 + j;
                }
                return new a13(j, gh4Var, (if1) this.p, (if1) this.o);
            default:
                ll llVar = (ll) this.p;
                Object obj2 = llVar.p;
                cz czVar = (cz) this.o;
                synchronized (obj2) {
                    ((ArrayList) llVar.q).remove(czVar);
                }
                return j15.a;
        }
    }
}
