package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface of4 extends Closeable, Flushable {
    void L(tv r1, long r2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    fu4 timeout();
}
