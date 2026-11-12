package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ko3 extends jo3 {
    public final Object p;

    public ko3(int i) {
        super(i);
        this.p = new Object();
    }

    @Override // defpackage.jo3, defpackage.io3
    public final boolean a(Object obj) {
        boolean zA;
        obj.getClass();
        synchronized (this.p) {
            zA = super.a(obj);
        }
        return zA;
    }

    @Override // defpackage.jo3, defpackage.io3
    public final Object b() {
        Object objB;
        synchronized (this.p) {
            objB = super.b();
        }
        return objB;
    }
}
