package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class gm1 extends s20 {
    public gm1(defpackage.ci0 a0, defpackage.ii0 a1, int a2, defpackage.tb1 a3, int a4, java.lang.Object a5, long a6, long a7) {
        super(a0, a1, a2, a3, a4, a5, a6, a7);
    }

    public byte[] j;
    public volatile boolean k;
    public byte[] l;

    @Override // defpackage.jd2
    public final void a() {
        try {
            this.i.b(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                byte[] bArr = this.j;
                if (bArr.length < i2 + 16384) {
                    this.j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.i.read(this.j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                this.l = Arrays.copyOf(this.j, i2);
            }
            fu.k(this.i);
        } catch (Throwable th) {
            fu.k(this.i);
            throw th;
        }
    }

    @Override // defpackage.jd2
    public final void b() {
        this.k = true;
    }
}
