package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface ak2 {
    void a();

    void c(Bundle r1);

    void e(int r1, fg0 r2, long r3, int r5);

    void f(int r1, int r2, int r3, long r4);

    void flush();

    void g(int r1);

    MediaFormat h();

    void i();

    default void k(ws1 r1) {
        r1.run();
    }

    void l(int r1, long r2);

    int m();

    int n(MediaCodec.BufferInfo r1);

    void p(int r1);

    ByteBuffer q(int r1);

    void r(Surface r1);

    ByteBuffer t(int r1);

    void u(ArrayList r1);

    void v(nk2 r1, Handler r2);

    default boolean w(om1 r1) {
        return false;
    }

    void x(ArrayList r1);
}
