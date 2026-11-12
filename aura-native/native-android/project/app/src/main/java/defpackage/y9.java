package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y9 extends vn implements t91 {
    public final qr2 n;
    public final l94 o;
    public final ra p;
    public final yv3 q;
    public final String r;
    public final AutofillId s;
    public final j03 t;
    public boolean u;

    public y9(qr2 qr2Var, l94 l94Var, ra raVar, yv3 yv3Var, String str) {
        this.n = qr2Var;
        this.o = l94Var;
        this.p = raVar;
        this.q = yv3Var;
        this.r = str;
        new Rect();
        raVar.setImportantForAutofill(1);
        hg3 hg3VarL = bu.l(raVar);
        AutofillId autofillIdF = hg3VarL != null ? tn.f(hg3VarL.o) : null;
        if (autofillIdF == null) {
            throw xa3.l("Required value was null.");
        }
        this.s = autofillIdF;
        this.t = new j03();
    }

    @Override // defpackage.t91
    public final void a(ba1 ba1Var, ba1 ba1Var2) {
        c72 c72VarO;
        e94 e94VarV;
        c72 c72VarO2;
        e94 e94VarV2;
        ra raVar = this.p;
        qr2 qr2Var = this.n;
        if (ba1Var != null && (c72VarO2 = j51.O(ba1Var)) != null && (e94VarV2 = c72VarO2.v()) != null && jz4.c(e94VarV2)) {
            qr2Var.k().notifyViewExited(raVar, c72VarO2.o);
        }
        if (ba1Var2 == null || (c72VarO = j51.O(ba1Var2)) == null || (e94VarV = c72VarO.v()) == null || !jz4.c(e94VarV)) {
            return;
        }
        int i = c72VarO.o;
        yv3 yv3Var = this.q;
        c72 c72Var = (c72) yv3Var.a.b(i);
        if (c72Var == null || c72Var.t == -4) {
            return;
        }
        ue1 ue1Var = yv3Var.c;
        int iE = yv3Var.e(c72Var);
        long[] jArr = (long[]) ue1Var.p;
        long j = jArr[iE];
        long j2 = jArr[iE + 1];
        qr2Var.k().notifyViewEntered(raVar, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
    }
}
