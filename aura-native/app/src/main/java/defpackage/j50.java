package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class j50 {
    public final byte a;
    public final byte b;
    public final short c;
    public final String d;
    public final int e;

    public j50(String str, int i, int i2) {
        this.d = str;
        this.e = i2;
        this.c = (short) (65535 & i);
        this.b = (byte) ((i >> 16) & 255);
        this.a = (byte) ((i >> 24) & 255);
    }
}
