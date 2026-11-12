package defpackage;

import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m50 {
    public final short a;
    public final short b;
    public final int c;

    public m50(int r1, short r2, short r3) {
        this.a = r2;
        this.b = r3;
        this.c = r1;
    }

    public final void a(ByteArrayOutputStream r2) {
        r2.write(g12.S(this.a));
        r2.write(g12.S(this.b));
        r2.write(g12.b(this.c));
    }
}
