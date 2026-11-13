package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class u22 extends zd2 implements as0, mx1 {
    public a32 t;

    @Override // defpackage.as0
    public final void a() {
        q().b0(this);
    }

    @Override // defpackage.mx1
    public final boolean b() {
        return true;
    }

    @Override // defpackage.mx1
    public final h63 d() {
        return null;
    }

    public s22 getParent() {
        return q();
    }

    public final a32 q() {
        a32 a32Var = this.t;
        if (a32Var != null) {
            return a32Var;
        }
        h12.Q("job");
        throw null;
    }

    public abstract boolean r();

    public abstract void s(Throwable th);

    @Override // defpackage.zd2
    public final String toString() {
        return getClass().getSimpleName() + '@' + si0.x(this) + "[job@" + si0.x(q()) + ']';
    }
}
