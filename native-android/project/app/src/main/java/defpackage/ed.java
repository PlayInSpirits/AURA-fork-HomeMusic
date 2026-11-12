package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ed implements le0 {
    public final /* synthetic */ int n;
    public final Object o;
    public final Object p;

    public ed(ed edVar) {
        this.n = 2;
        this.o = edVar;
        this.p = new ll(6, (byte) 0);
    }

    @Override // defpackage.ne0
    public final ne0 J(ne0 ne0Var) {
        switch (this.n) {
            case 0:
                break;
            case 1:
                break;
        }
        return ya4.F(this, ne0Var);
    }

    @Override // defpackage.ne0
    public final le0 K(me0 me0Var) {
        switch (this.n) {
            case 0:
                break;
            case 1:
                break;
        }
        return ya4.r(this, me0Var);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final Object a(if1 if1Var, wd0 wd0Var) {
        df3 df3Var;
        boolean z;
        Object objQ;
        int i = 0;
        int i2 = 1;
        switch (this.n) {
            case 0:
                bd bdVar = (bd) this.p;
                cz czVar = new cz(1, ya4.x(wd0Var));
                czVar.u();
                dd ddVar = new dd(czVar, this, if1Var);
                if (h12.c(bdVar.p, (Choreographer) this.o)) {
                    synchronized (bdVar.r) {
                        bdVar.t.add(ddVar);
                        if (!bdVar.w) {
                            bdVar.w = true;
                            bdVar.p.postFrameCallback(bdVar.x);
                        }
                        break;
                    }
                    czVar.w(new cd(i, bdVar, ddVar));
                } else {
                    ((Choreographer) this.o).postFrameCallback(ddVar);
                    czVar.w(new cd(i2, this, ddVar));
                }
                return czVar.q();
            case 1:
                cz czVar2 = new cz(1, ya4.x(wd0Var));
                czVar2.u();
                z40 z40Var = (z40) this.p;
                jv jvVar = new jv();
                jvVar.a = czVar2;
                jvVar.b = if1Var;
                czVar2.w(new kv(i, z40Var.a(jvVar, (mv3) this.o)));
                return czVar2.q();
            default:
                if (wd0Var instanceof df3) {
                    df3Var = (df3) wd0Var;
                    int i3 = df3Var.q;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        df3Var.q = i3 - Integer.MIN_VALUE;
                    } else {
                        df3Var = new df3(this, wd0Var);
                    }
                } else {
                    df3Var = new df3(this, wd0Var);
                }
                Object obj = df3Var.o;
                xe0 xe0Var = xe0.n;
                int i4 = df3Var.q;
                if (i4 == 0) {
                    kb4.X(obj);
                    ll llVar = (ll) this.p;
                    df3Var.n = if1Var;
                    df3Var.q = 1;
                    synchronized (llVar.p) {
                        z = llVar.o;
                    }
                    if (z) {
                        objQ = j15.a;
                    } else {
                        cz czVar3 = new cz(1, ya4.x(df3Var));
                        czVar3.u();
                        synchronized (llVar.p) {
                            ((ArrayList) llVar.q).add(czVar3);
                        }
                        czVar3.w(new cd(3, llVar, czVar3));
                        objQ = czVar3.q();
                        if (objQ != xe0Var) {
                            objQ = j15.a;
                        }
                    }
                    if (objQ != xe0Var) {
                    }
                    return xe0Var;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        kb4.X(obj);
                        return obj;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if1Var = df3Var.n;
                kb4.X(obj);
                ed edVar = (ed) this.o;
                df3Var.n = null;
                df3Var.q = 2;
                Object objA = edVar.a(if1Var, df3Var);
                if (objA != xe0Var) {
                    return objA;
                }
                return xe0Var;
        }
    }

    @Override // defpackage.le0
    public me0 getKey() {
        return rv2.p;
    }

    @Override // defpackage.ne0
    public final Object s(wf1 wf1Var, Object obj) {
        switch (this.n) {
            case 0:
                break;
            case 1:
                break;
        }
        return wf1Var.invoke(obj, this);
    }

    @Override // defpackage.ne0
    public final ne0 u(me0 me0Var) {
        switch (this.n) {
            case 0:
                break;
            case 1:
                break;
        }
        return ya4.C(this, me0Var);
    }

    public ed(Choreographer choreographer, bd bdVar) {
        this.n = 0;
        this.o = choreographer;
        this.p = bdVar;
    }

    public ed(mv3 mv3Var) {
        this.n = 1;
        this.o = mv3Var;
        this.p = new z40();
    }
}
