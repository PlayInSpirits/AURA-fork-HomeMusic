package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class te2 {
    public final /* synthetic */ int a = 1;
    public int b;
    public long[] c;

    public te2(int i) {
        this.c = new long[i];
    }

    public final void a(long j) {
        switch (this.a) {
            case 0:
                int i = this.b;
                long[] jArr = this.c;
                if (i == jArr.length) {
                    this.c = Arrays.copyOf(jArr, i * 2);
                }
                long[] jArr2 = this.c;
                int i2 = this.b;
                this.b = i2 + 1;
                jArr2[i2] = j;
                break;
            default:
                if (!c(j)) {
                    int i3 = this.b;
                    long[] jArrCopyOf = this.c;
                    if (i3 >= jArrCopyOf.length) {
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i3 + 1, jArrCopyOf.length * 2));
                        this.c = jArrCopyOf;
                    }
                    jArrCopyOf[i3] = j;
                    if (i3 >= this.b) {
                        this.b = i3 + 1;
                    }
                }
                break;
        }
    }

    public void b(long[] jArr) {
        int length = this.b + jArr.length;
        long[] jArr2 = this.c;
        if (length > jArr2.length) {
            this.c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.c, this.b, jArr.length);
        this.b = length;
    }

    public boolean c(long j) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public long d(int i) {
        if (i >= 0 && i < this.b) {
            return this.c[i];
        }
        StringBuilder sbJ = f34.j(i, "Invalid index ", ", size is ");
        sbJ.append(this.b);
        throw new IndexOutOfBoundsException(sbJ.toString());
    }

    public void e(long j) {
        int i = this.b;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.c[i2]) {
                int i3 = this.b - 1;
                while (i2 < i3) {
                    long[] jArr = this.c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.b--;
                return;
            }
            i2++;
        }
    }

    public /* synthetic */ te2() {
    }
}
