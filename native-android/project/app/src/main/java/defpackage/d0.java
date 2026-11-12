package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 implements le0 {
    public final me0 n;

    public d0(me0 me0Var) {
        this.n = me0Var;
    }

    @Override // defpackage.ne0
    public final /* bridge */ ne0 J(ne0 ne0Var) {
        return ya4.F(this, ne0Var);
    }

    @Override // defpackage.ne0
    public /* bridge */ le0 K(me0 me0Var) {
        return ya4.r(this, me0Var);
    }

    @Override // defpackage.le0
    public final me0 getKey() {
        return this.n;
    }

    @Override // defpackage.ne0
    public final Object s(wf1 wf1Var, Object obj) {
        return wf1Var.invoke(obj, this);
    }

    @Override // defpackage.ne0
    public /* bridge */ ne0 u(me0 me0Var) {
        return ya4.C(this, me0Var);
    }
}
