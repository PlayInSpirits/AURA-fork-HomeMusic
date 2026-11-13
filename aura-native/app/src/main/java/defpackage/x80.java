package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class x80 implements wa3, le0 {
    public static final i80 o = new i80(1);
    public final rg1 n;

    public x80(rg1 rg1Var) {
        this.n = rg1Var;
    }

    @Override // defpackage.ne0
    public final /* bridge */ ne0 J(ne0 ne0Var) {
        return ya4.F(this, ne0Var);
    }

    @Override // defpackage.ne0
    public final /* bridge */ le0 K(me0 me0Var) {
        return ya4.r(this, me0Var);
    }

    @Override // defpackage.wa3
    public final List c(Integer num) {
        return this.n.A();
    }

    @Override // defpackage.wa3
    public final boolean g() {
        return this.n.C;
    }

    @Override // defpackage.le0
    public final me0 getKey() {
        return o;
    }

    @Override // defpackage.ne0
    public final Object s(wf1 wf1Var, Object obj) {
        return wf1Var.invoke(obj, this);
    }

    @Override // defpackage.ne0
    public final /* bridge */ ne0 u(me0 me0Var) {
        return ya4.C(this, me0Var);
    }
}
