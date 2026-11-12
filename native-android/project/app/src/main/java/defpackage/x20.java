package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x20 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public x20(int i) {
        this.a = i;
    }

    public void a(sa0 sa0Var) {
        Object[] objArr = (Object[]) this.d;
        int i = this.b;
        objArr[i] = sa0Var;
        int i2 = this.c & (i + 1);
        this.b = i2;
        int i3 = this.a;
        if (i2 == i3) {
            int length = objArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 < 0) {
                tb4.e("Max array capacity exceeded");
                return;
            }
            Object[] objArr2 = new Object[i5];
            ti.Z(0, i3, length, objArr, objArr2);
            ti.Z(i4, 0, this.a, (Object[]) this.d, objArr2);
            this.d = objArr2;
            this.a = 0;
            this.b = length;
            this.c = i5 - 1;
        }
    }

    public hp0 b() {
        rr2.l(this.b <= this.c);
        return new hp0(this);
    }

    public int c(int i) {
        return ((ya3) this.d).f[this.b + i];
    }

    public Object d(int i) {
        return ((ya3) this.d).h[this.c + i];
    }
}
