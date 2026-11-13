package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public interface fw extends ej4, ReadableByteChannel {
    String B(Charset charset);

    yw E();

    boolean G(long j);

    String I();

    long N(tv tvVar);

    void P(long j);

    long S();

    InputStream V();

    tv a();

    yw g(long j);

    byte[] i();

    boolean l();

    int m(cb3 cb3Var);

    String o();

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);

    String t(long j);
}
