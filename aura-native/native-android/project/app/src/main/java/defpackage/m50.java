package defpackage;

import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m50 {
    public final short a;
    public final short b;
    public final int c;

    public m50(int i, short s, short s2) {
        this.a = s;
        this.b = s2;
        this.c = i;
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(g12.S(this.a));
        byteArrayOutputStream.write(g12.S(this.b));
        byteArrayOutputStream.write(g12.b(this.c));
    }
}
