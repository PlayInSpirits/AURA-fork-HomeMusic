package defpackage;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface ew extends of4, WritableByteChannel {
    ew A(yw r1);

    ew C(long r1);

    ew Q(long r1);

    tv a();

    @Override // defpackage.of4, java.io.Flushable
    void flush();

    long p(ej4 r1);

    ew write(byte[] r1);

    ew write(byte[] r1, int r2, int r3);

    ew writeByte(int r1);

    ew writeInt(int r1);

    ew writeShort(int r1);

    ew y(String r1);
}
