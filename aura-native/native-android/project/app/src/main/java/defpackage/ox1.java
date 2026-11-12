package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ox1 implements th4 {
    public static final ox1 p;
    public static final ox1 q;
    public final /* synthetic */ int n;
    public final boolean o;

    static {
        int i = 0;
        p = new ox1(i, true);
        q = new ox1(i, false);
    }

    public ox1(kb4 kb4Var, f83 f83Var) throws e83 {
        this.n = 1;
        int i = f83Var.a;
        ByteBuffer byteBuffer = f83Var.b;
        rr2.l(i == 6 || i == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        h00 h00Var = new h00(iMin, bArr);
        kb4Var.getClass();
        if (h00Var.h()) {
            this.o = false;
            return;
        }
        int i2 = h00Var.i(2);
        if (!h00Var.h()) {
            this.o = true;
            return;
        }
        if (i2 != 3 && i2 != 0) {
            h00Var.h();
        }
        h00Var.s();
        throw new e83();
    }

    public String toString() {
        switch (this.n) {
            case 0:
                StringBuilder sb = new StringBuilder("IncorrectFragmentation{expected=");
                sb.append(!this.o);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ox1(int i, boolean z) {
        this.n = i;
        this.o = z;
    }
}
