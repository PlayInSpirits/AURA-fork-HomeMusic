package defpackage;

import androidx.work.impl.WorkDatabase_Impl;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class j91 implements p81 {
    public final /* synthetic */ p81 n;
    public final /* synthetic */ WorkDatabase_Impl o;
    public final /* synthetic */ x p;

    public j91(p81 p81Var, WorkDatabase_Impl workDatabase_Impl, x xVar) {
        this.n = p81Var;
        this.o = workDatabase_Impl;
        this.p = xVar;
    }

    @Override // defpackage.p81
    public final Object a(q81 q81Var, vd0 vd0Var) {
        Object a = this.n.a(new z81(q81Var, this.o, this.p), vd0Var);
        return a == xe0.n ? a : j15.a;
    }
}
