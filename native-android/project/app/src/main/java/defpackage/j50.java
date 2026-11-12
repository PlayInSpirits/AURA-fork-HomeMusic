package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j50 {
    public final byte a;
    public final byte b;
    public final short c;
    public final String d;
    public final int e;

    public j50(String r1, int r2, int r3) {
        this.d = r1;
        this.e = r3;
        this.c = (short) (65535 & r2);
        this.b = (byte) ((r2 >> 16) & 255);
        this.a = (byte) ((r2 >> 24) & 255);
    }
}
