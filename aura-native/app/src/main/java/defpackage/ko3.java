package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ko3 extends jo3 {
    public final Object p;

    public ko3(int i) {
        super(i);
        this.p = new Object();
    }

    @Override // defpackage.jo3, defpackage.io3
    public final boolean a(Object obj) {
        boolean a;
        obj.getClass();
        synchronized (this.p) {
            a = super.a(obj);
        }
        return a;
    }

    @Override // defpackage.jo3, defpackage.io3
    public final Object b() {
        Object b;
        synchronized (this.p) {
            b = super.b();
        }
        return b;
    }
}
