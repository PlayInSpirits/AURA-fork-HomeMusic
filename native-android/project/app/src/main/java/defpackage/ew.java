package defpackage;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface ew extends of4, WritableByteChannel {
    ew A(yw ywVar);

    ew C(long j);

    ew Q(long j);

    tv a();

    @Override // defpackage.of4, java.io.Flushable
    void flush();

    long p(ej4 ej4Var);

    ew write(byte[] bArr);

    ew write(byte[] bArr, int i, int i2);

    ew writeByte(int i);

    ew writeInt(int i);

    ew writeShort(int i);

    ew y(String str);
}
