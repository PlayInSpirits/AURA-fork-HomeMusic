package defpackage;

import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v71 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final rm3 k;
    public final qv2 l;

    public v71(int i, byte[] bArr) {
        h00 h00Var = new h00(bArr.length, bArr);
        h00Var.q(i * 8);
        this.a = h00Var.i(16);
        this.b = h00Var.i(16);
        this.c = h00Var.i(24);
        this.d = h00Var.i(24);
        int i2 = h00Var.i(20);
        this.e = i2;
        this.f = d(i2);
        this.g = h00Var.i(3) + 1;
        int i3 = h00Var.i(5) + 1;
        this.h = i3;
        this.i = a(i3);
        this.j = h00Var.k(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public final tb1 c(byte[] bArr, qv2 qv2Var) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        qv2 qv2Var2 = this.l;
        if (qv2Var2 != null) {
            qv2Var = qv2Var2.b(qv2Var);
        }
        sb1 sb1Var = new sb1();
        sb1Var.m = lw2.m("audio/flac");
        sb1Var.n = i;
        sb1Var.E = this.g;
        sb1Var.F = this.e;
        String str = f35.a;
        sb1Var.G = f35.C(this.h, ByteOrder.LITTLE_ENDIAN);
        sb1Var.p = Collections.singletonList(bArr);
        sb1Var.k = qv2Var;
        return new tb1(sb1Var);
    }

    public v71(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, rm3 rm3Var, qv2 qv2Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = rm3Var;
        this.l = qv2Var;
    }
}
