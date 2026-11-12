package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tu {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public tu(int i, int i2, float[] fArr, float[] fArr2) {
        this.a = i;
        rr2.l(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.c = fArr;
        this.d = fArr2;
        this.b = i2;
    }

    public synchronized void a(long j, Object obj) {
        int i = this.b;
        if (i > 0) {
            if (j <= ((long[]) this.c)[((this.a + i) - 1) % ((Object[]) this.d).length]) {
                b();
            }
        }
        c();
        int i2 = this.a;
        int i3 = this.b;
        Object[] objArr = (Object[]) this.d;
        int length = (i2 + i3) % objArr.length;
        ((long[]) this.c)[length] = j;
        objArr[length] = obj;
        this.b = i3 + 1;
    }

    public synchronized void b() {
        this.a = 0;
        this.b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public void c() {
        int length = ((Object[]) this.d).length;
        if (this.b < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.a;
        int i3 = length - i2;
        System.arraycopy((long[]) this.c, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.d, this.a, objArr, 0, i3);
        int i4 = this.a;
        if (i4 > 0) {
            System.arraycopy((long[]) this.c, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.d, 0, objArr, i3, this.a);
        }
        this.c = jArr;
        this.d = objArr;
        this.a = 0;
    }

    public Object d(boolean z, long j) {
        Object objG = null;
        long j2 = Long.MAX_VALUE;
        while (this.b > 0) {
            long j3 = j - ((long[]) this.c)[this.a];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objG = g();
            j2 = j3;
        }
        return objG;
    }

    public synchronized Object e() {
        return this.b == 0 ? null : g();
    }

    public synchronized Object f(long j) {
        return d(true, j);
    }

    public Object g() {
        rr2.w(this.b > 0);
        Object[] objArr = (Object[]) this.d;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = (i + 1) % objArr.length;
        this.b--;
        return obj;
    }

    public synchronized int h() {
        return this.b;
    }

    public tu() {
        this.c = new long[10];
        this.d = new Object[10];
    }

    public tu(int i, int i2) {
        switch (i2) {
            case 2:
                this.b = -1;
                this.a = i;
                break;
            default:
                this.c = new qv4[i];
                this.b = 0;
                break;
        }
    }
}
