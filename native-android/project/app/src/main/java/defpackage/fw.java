package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface fw extends ej4, ReadableByteChannel {
    String B(Charset r1);

    yw E();

    boolean G(long r1);

    String I();

    long N(tv r1);

    void P(long r1);

    long S();

    InputStream V();

    tv a();

    yw g(long r1);

    byte[] i();

    boolean l();

    int m(cb3 r1);

    String o();

    byte readByte();

    int readInt();

    short readShort();

    void skip(long r1);

    String t(long r1);
}
