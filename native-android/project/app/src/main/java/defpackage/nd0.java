package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface nd0 {
    static long a(nd0 r2) {
        byte[] r3 = (byte[]) ((yj0) r2).b.get("exo_len");
        if (r3 != null) goto L5;
        return -1;
    L5:
        return ByteBuffer.wrap(r3).getLong();
    }
}
