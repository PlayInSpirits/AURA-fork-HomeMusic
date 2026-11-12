package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class on4 extends cd4 implements ll4 {
    @Override // defpackage.ll4
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.u;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.v + ((long) ((int) ((o() + ((long) this.x)) - this.v)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void w(int i) {
        synchronized (this) {
            Object[] objArr = this.u;
            objArr.getClass();
            q(Integer.valueOf(((Number) objArr[((int) ((this.v + ((long) ((int) ((o() + ((long) this.x)) - this.v)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
