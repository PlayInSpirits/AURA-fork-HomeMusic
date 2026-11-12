package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.SortedMap;
import org.apache.commons.compress.compressors.CompressorException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k90 {
    public static final k90 b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public SortedMap a;

    static {
        b = new k90();
        c = d("Google Brotli Dec", "https://github.com/google/brotli/");
        d = d("XZ for Java", "https://tukaani.org/xz/java.html");
        e = d("Zstd JNI", "https://github.com/luben/zstd-jni");
    }

    public static HashSet c() {
        HashSet r1 = new HashSet(14);
        Collections.addAll(r1, new String[]{"gz", "br", "bzip2", "xz", "lzma", "pack200", "deflate", "snappy-raw", "snappy-framed", "z", "lz4-block", "lz4-framed", "zstd", "deflate64"});
        return r1;
    }

    public static String d(String r2, String r3) {
        return " In addition to Apache Commons Compress you need the " + r2 + " library - see " + r3;
    }

    public final i90 a(ByteArrayInputStream r11) {
        if (r11.markSupported() == false) goto L105;
        byte[] r1 = new byte[12];
        r11.mark(12);
        int r2 = 0;
        int r0 = vr1.D(r11, r1, 0, 12);     // Catch: IOException -> L102
        r11.reset();     // Catch: IOException -> L102
        int r3 = mo.J;
        if (r0 >= 3) goto L9;
    L15:
        int r6 = rk1.w;
        if (r0 >= 2) goto L18;
    L22:
        int r4 = xb3.r;
        if (r0 < r4) goto L29;
        int r7 = 0;
    L26:
        if (r7 >= r4) goto L99;
        if (r1[r7] != xb3.q[r7]) goto L29;
        r7 = r7 + 1;
        goto L26
    L99:
        String r5 = "pack200";
    L101:
        return b(r5, r11);
    L29:
        byte[] r8 = re1.z;
        if (r0 >= 10) goto L32;
        boolean r9 = false;
    L33:
        if (r9 == false) goto L35;
        r5 = "snappy-framed";
        goto L101
    L35:
        int r10 = me5.C;
        if (r0 > 3) goto L38;
    L42:
        int r12 = yn0.q;
        if (r0 <= 3) goto L56;
        if (r1[0] != 120) goto L56;
        byte r13 = r1[1];
        if (r13 != 1) goto L49;
    L54:
        r5 = "deflate";
        goto L101
    L49:
        if (r13 == 94) goto L54;
        if (r13 == (-100)) goto L54;
        if (r13 == (-38)) goto L54;
    L56:
        if (r0 >= 6) goto L58;
        byte[] r14 = fe5.a;
    L63:
        if (r0 >= 3) goto L65;
        byte[] r15 = m42.a;
    L70:
        byte[] r16 = qe1.B;
        if (r0 >= 4) goto L73;
        boolean r17 = false;
    L74:
        if (r17 == false) goto L76;
        r5 = "lz4-framed";
        goto L101
    L76:
        if (r0 < 4) goto L91;
        int r18 = 0;
    L78:
        byte[] r19 = se5.a;
        if (r18 >= 4) goto L90;
        if (r1[r18] != r19[r18]) goto L83;
        r18 = r18 + 1;
        goto L78
    L83:
        if (80 != (r1[0] & 240)) goto L93;
    L84:
        byte[] r20 = se5.b;
        if (r2 >= 3) goto L90;
        int r21 = r2 + 1;
        if (r1[r21] != r20[r2]) goto L93;
        r2 = r21;
    L93:
        throw new CompressorException("No Compressor found for the stream signature.");
    L90:
        r5 = "zstd";
        goto L101
    L91:
        byte[] r110 = se5.a;
        goto L93
    L73:
        byte[] r22 = new byte[4];
        System.arraycopy(r1, 0, r22, 0, 4);
        r17 = Arrays.equals(r22, r16);
        goto L74
    L65:
        int r23 = 0;
    L66:
        byte[] r24 = m42.a;
        if (r23 >= 3) goto L95;
        if (r1[r23] != r24[r23]) goto L70;
        r23 = r23 + 1;
        goto L66
    L95:
        r5 = "lzma";
        goto L101
    L58:
        int r25 = 0;
    L59:
        byte[] r26 = fe5.a;
        if (r25 >= 6) goto L97;
        if (r1[r25] != r26[r25]) goto L63;
        r25 = r25 + 1;
        goto L59
    L97:
        r5 = "xz";
        goto L101
    L38:
        if (r1[0] != 31) goto L42;
        if (r1[1] != (-99)) goto L42;
        r5 = "z";
        goto L101
    L32:
        byte[] r27 = new byte[10];
        System.arraycopy(r1, 0, r27, 0, 10);
        r9 = Arrays.equals(r27, r8);
        goto L33
    L18:
        if (r1[0] != 31) goto L22;
        if (r1[1] != (-117)) goto L22;
        r5 = "gz";
        goto L101
    L9:
        if (r1[0] != 66) goto L15;
        if (r1[1] != 90) goto L15;
        if (r1[2] != 104) goto L15;
        r5 = "bzip2";
    L102:
        e = move-exception;
        throw new CompressorException("IOException while reading signature.", e);
    L105:
        kf2.n("Mark is not supported.");
        return null;
    }

    public final i90 b(String r8, ByteArrayInputStream r9) {
    L96:
        e = move-exception;
        throw new CompressorException("Could not create CompressorInputStream.", e);
    L4:
        if ("gz".equalsIgnoreCase(r8) == false) goto L8;
        return new rk1(r9);
    L8:
        if ("bzip2".equalsIgnoreCase(r8) == false) goto L12;
        return new mo(r9);
    L12:
        if ("br".equalsIgnoreCase(r8) == false) goto L23;
        int r7 = nv.a;     // Catch: IOException -> L96
        if (r7 == 1) goto L105;
        if (r7 == 2) goto L19;
    L21:
        throw new CompressorException("Brotli compression is not available." + c);     // Catch: IOException -> L96
    L19:
        return new mv(r9);
    L105:
        Class.forName("org.brotli.dec.BrotliInputStream");     // Catch: Throwable -> L99
    L23:
        if ("xz".equalsIgnoreCase(r8) == false) goto L34;
        int r10 = fe5.b;     // Catch: IOException -> L96
        if (r10 == 1) goto L108;
        if (r10 == 2) goto L30;
    L32:
        throw new CompressorException("XZ compression is not available." + d);     // Catch: IOException -> L96
    L30:
        return new ee5(r9);
    L108:
        ee5.f();     // Catch: NoClassDefFoundError -> L100 IOException -> L96
    L34:
        if ("zstd".equalsIgnoreCase(r8) == false) goto L45;
        int r11 = se5.c;     // Catch: IOException -> L96
        if (r11 == 1) goto L110;
        if (r11 == 2) goto L41;
    L43:
        throw new CompressorException("Zstandard compression is not available." + e);     // Catch: IOException -> L96
    L41:
        return new re5(r9);
    L110:
        Class.forName("com.github.luben.zstd.ZstdInputStream");     // Catch: Throwable -> L101
    L45:
        if ("lzma".equalsIgnoreCase(r8) == false) goto L56;
        int r12 = m42.b;     // Catch: IOException -> L96
        if (r12 == 1) goto L103;
        if (r12 == 2) goto L52;
    L54:
        throw new CompressorException("LZMA compression is not available" + d);     // Catch: IOException -> L96
    L52:
        return new l42(r9);
    L103:
        int r13 = l42.p;     // Catch: NoClassDefFoundError -> L102 IOException -> L96
    L56:
        if ("pack200".equalsIgnoreCase(r8) == false) goto L60;
        return new xb3(r9);
    L60:
        if ("snappy-raw".equalsIgnoreCase(r8) == false) goto L64;
        return new bh4(r9, 32768);
    L64:
        if ("snappy-framed".equalsIgnoreCase(r8) == false) goto L68;
        return new re1(r9);
    L68:
        if ("z".equalsIgnoreCase(r8) == false) goto L72;
        return new me5(r9);
    L72:
        if ("deflate".equalsIgnoreCase(r8) == false) goto L76;
        return new yn0(r9);
    L76:
        if ("deflate64".equalsIgnoreCase(r8) == false) goto L80;
        return new xn0(r9);
    L80:
        if ("lz4-block".equalsIgnoreCase(r8) == false) goto L84;
        return new gt(r9);
    L84:
        if ("lz4-framed".equalsIgnoreCase(r8) == false) goto L88;
        return new qe1(r9);
    L88:
        if (this.a != null) goto L90;
        this.a = Collections.unmodifiableSortedMap((SortedMap) AccessController.doPrivileged(new j90()));
    L90:
        k90 r14 = (k90) this.a.get(r8.toUpperCase(Locale.ROOT));
        if (r14 == null) goto L95;
        return r14.b(r8, r9);
    L95:
        throw new CompressorException(xa3.h("Compressor: ", r8, " not found."));
    }
}
