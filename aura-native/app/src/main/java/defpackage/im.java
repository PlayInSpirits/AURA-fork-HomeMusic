package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public interface im {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean b();

    boolean c();

    ByteBuffer d();

    void e(ByteBuffer byteBuffer);

    gm f(gm gmVar);

    void flush();

    void g();

    void reset();

    default long h(long j) {
        return j;
    }
}
