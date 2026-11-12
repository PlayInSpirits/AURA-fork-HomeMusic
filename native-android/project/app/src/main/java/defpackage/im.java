package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface im {
    public static final ByteBuffer a = null;

    static {
        a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
    }

    boolean b();

    boolean c();

    ByteBuffer d();

    void e(ByteBuffer r1);

    gm f(gm r1);

    void flush();

    void g();

    default long h(long r1) {
        return r1;
    }

    void reset();
}
