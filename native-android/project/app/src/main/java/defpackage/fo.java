package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fo implements ao {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public fo(int r1, int r2, int r3, int r4, int r5, int r6) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
    }

    public final int a() {
        int r2 = this.a;
        if (r2 != 1935960438) goto L5;
        return 2;
    L5:
        if (r2 != 1935963489) goto L7;
        return 1;
    L7:
        if (r2 == 1937012852) goto L10;
        l93.q0("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(r2));
        return -1;
    L10:
        return 3;
    }

    @Override // defpackage.ao
    public final int getType() {
        return 1752331379;
    }
}
