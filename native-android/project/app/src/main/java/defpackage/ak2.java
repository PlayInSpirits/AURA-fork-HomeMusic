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

    void c(Bundle bundle);

    void e(int i, fg0 fg0Var, long j, int i2);

    void f(int i, int i2, int i3, long j);

    void flush();

    void g(int i);

    MediaFormat h();

    void i();

    default void k(ws1 ws1Var) {
        ws1Var.run();
    }

    void l(int i, long j);

    int m();

    int n(MediaCodec.BufferInfo bufferInfo);

    void p(int i);

    ByteBuffer q(int i);

    void r(Surface surface);

    ByteBuffer t(int i);

    void u(ArrayList arrayList);

    void v(nk2 nk2Var, Handler handler);

    default boolean w(om1 om1Var) {
        return false;
    }

    void x(ArrayList arrayList);
}
