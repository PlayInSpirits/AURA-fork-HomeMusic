package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class m21 implements pv2 {
    public static final tb1 g;
    public static final tb1 h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        sb1 sb1Var = new sb1();
        sb1Var.m = lw2.m("application/id3");
        g = new tb1(sb1Var);
        sb1 sb1Var2 = new sb1();
        sb1Var2.m = lw2.m("application/x-scte35");
        h = new tb1(sb1Var2);
    }

    public m21(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // defpackage.pv2
    public final tb1 a() {
        switch (this.a) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    @Override // defpackage.pv2
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m21.class != obj.getClass()) {
            return false;
        }
        m21 m21Var = (m21) obj;
        return this.c == m21Var.c && this.d == m21Var.d && this.a.equals(m21Var.a) && this.b.equals(m21Var.b) && Arrays.equals(this.e, m21Var.e);
    }

    public final int hashCode() {
        if (this.f == 0) {
            int e = f34.e(this.b, f34.e(this.a, 527, 31), 31);
            long j = this.c;
            int i = (e + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.f = Arrays.hashCode(this.e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
