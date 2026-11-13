package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class on4 extends cd4 implements ll4 {
    public on4(int a0, int a1, defpackage.wv a2) {
        super(a0, a1, a2);
    }

    @Override // defpackage.ll4
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.u;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.v + ((int) ((o() + this.x) - this.v))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void w(int i) {
        synchronized (this) {
            Object[] objArr = this.u;
            objArr.getClass();
            q(Integer.valueOf(((Number) objArr[((int) ((this.v + ((int) ((o() + this.x) - this.v))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
