package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class k05 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final na4 b;
    public volatile int c = 0;

    public k05(na4 na4Var, int i) {
        this.b = na4Var;
        this.a = i;
    }

    public final int a(int i) {
        vv2 b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b.q;
        int i2 = a + b.n;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final vv2 b() {
        ThreadLocal threadLocal = d;
        vv2 vv2Var = (vv2) threadLocal.get();
        if (vv2Var == null) {
            vv2Var = new vv2();
            threadLocal.set(vv2Var);
        }
        wv2 wv2Var = (wv2) this.b.n;
        int a = wv2Var.a(6);
        if (a != 0) {
            int i = a + wv2Var.n;
            int i2 = (this.a * 4) + ((ByteBuffer) wv2Var.q).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) wv2Var.q).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) wv2Var.q;
            vv2Var.q = byteBuffer;
            if (byteBuffer != null) {
                vv2Var.n = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                vv2Var.o = i4;
                vv2Var.p = ((ByteBuffer) vv2Var.q).getShort(i4);
                return vv2Var;
            }
            vv2Var.n = 0;
            vv2Var.o = 0;
            vv2Var.p = 0;
        }
        return vv2Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        vv2 b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? ((ByteBuffer) b.q).getInt(a + b.n) : 0));
        sb.append(", codepoints:");
        vv2 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.n;
            i = ((ByteBuffer) b2.q).getInt(((ByteBuffer) b2.q).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
