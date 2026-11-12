package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class jo3 implements io3 {
    public final Object[] n;
    public int o;

    public jo3(int r1) {
        if (r1 <= 0) goto L6;
        this.n = new Object[r1];
        return;
    L6:
        kf2.n("The max pool size must be > 0");
        throw null;
    }

    @Override // defpackage.io3
    public boolean a(Object r5) {
        r5.getClass();
        int r0 = this.o;
        int r2 = 0;
    L3:
        Object[] r3 = this.n;
        if (r2 >= r0) goto L10;
        if (r3[r2] == r5) goto L8;
        r2 = r2 + 1;
        goto L3
    L8:
        kf2.o("Already in the pool!");
        return false;
    L10:
        int r1 = this.o;
        if (r1 >= r3.length) goto L14;
        r3[r1] = r5;
        this.o = r1 + 1;
        return true;
    L14:
        return false;
    }

    @Override // defpackage.io3
    public Object b() {
        int r0 = this.o;
        if (r0 <= 0) goto L6;
        int r1 = r0 - 1;
        Object[] r2 = this.n;
        Object r3 = r2[r1];
        r3.getClass();
        r2[r1] = null;
        this.o--;
        return r3;
    L6:
        return null;
    }

    public void c(pi r4) {
        int r0 = this.o;
        Object[] r1 = this.n;
        if (r0 >= r1.length) goto L6;
        r1[r0] = r4;
        this.o = r0 + 1;
        return;
    }

    public jo3() {
        this.n = new Object[256];
    }
}
