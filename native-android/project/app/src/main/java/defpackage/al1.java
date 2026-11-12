package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class al1 {
    public final wv4 a;
    public final boolean b;
    public final boolean c;
    public final h00 f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public long l;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public zk1 m = new zk1();
    public zk1 n = new zk1();
    public boolean k = false;
    public boolean o = false;

    public al1(wv4 wv4Var, boolean z, boolean z2) {
        this.a = wv4Var;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[128];
        this.g = bArr;
        this.f = new h00(bArr, 0, 0);
        zk1 zk1Var = this.n;
        zk1Var.b = false;
        zk1Var.a = false;
    }
}
