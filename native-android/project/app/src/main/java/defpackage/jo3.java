package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class jo3 implements io3 {
    public final Object[] n;
    public int o;

    public jo3(int i) {
        if (i > 0) {
            this.n = new Object[i];
        } else {
            kf2.n("The max pool size must be > 0");
            throw null;
        }
    }

    @Override // defpackage.io3
    public boolean a(Object obj) {
        obj.getClass();
        int i = this.o;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.n;
            if (i2 >= i) {
                int i3 = this.o;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.o = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                kf2.o("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    @Override // defpackage.io3
    public Object b() {
        int i = this.o;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.n;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.o--;
        return obj;
    }

    public void c(pi piVar) {
        int i = this.o;
        Object[] objArr = this.n;
        if (i < objArr.length) {
            objArr[i] = piVar;
            this.o = i + 1;
        }
    }

    public jo3() {
        this.n = new Object[256];
    }
}
