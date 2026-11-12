package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface so4 extends Closeable {
    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean r1);

    we1 w();

    we1 z();
}
