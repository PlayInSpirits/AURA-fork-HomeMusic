package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ff4 implements jd2 {
    public final ii0 a;
    public final yl4 b;
    public byte[] c;

    public ff4(ci0 ci0Var, ii0 ii0Var) {
        ed2.g.getAndIncrement();
        this.a = ii0Var;
        this.b = new yl4(ci0Var);
    }

    @Override // defpackage.jd2
    public final void a() {
        yl4 yl4Var = this.b;
        yl4Var.o = 0L;
        try {
            yl4Var.b(this.a);
            int i = 0;
            while (i != -1) {
                int i2 = (int) yl4Var.o;
                byte[] bArr = this.c;
                if (bArr == null) {
                    this.c = new byte[1024];
                } else if (i2 == bArr.length) {
                    this.c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.c;
                i = yl4Var.read(bArr2, i2, bArr2.length - i2);
            }
        } finally {
            fu.k(yl4Var);
        }
    }

    @Override // defpackage.jd2
    public final void b() {
    }
}
