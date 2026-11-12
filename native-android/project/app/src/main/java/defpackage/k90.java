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
    public static final k90 b = new k90();
    public static final String c = d("Google Brotli Dec", "https://github.com/google/brotli/");
    public static final String d = d("XZ for Java", "https://tukaani.org/xz/java.html");
    public static final String e = d("Zstd JNI", "https://github.com/luben/zstd-jni");
    public SortedMap a;

    public static HashSet c() {
        HashSet hashSet = new HashSet(14);
        Collections.addAll(hashSet, "gz", "br", "bzip2", "xz", "lzma", "pack200", "deflate", "snappy-raw", "snappy-framed", "z", "lz4-block", "lz4-framed", "zstd", "deflate64");
        return hashSet;
    }

    public static String d(String str, String str2) {
        return " In addition to Apache Commons Compress you need the " + str + " library - see " + str2;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x00f9 A[EDGE_INSN: B:112:0x00f9->B:90:0x00f9 BREAK  A[LOOP:1: B:78:0x00d6->B:89:0x00f6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00f9 A[EDGE_INSN: B:113:0x00f9->B:90:0x00f9 BREAK  A[LOOP:1: B:78:0x00d6->B:89:0x00f6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00be A[EDGE_INSN: B:116:0x00be->B:70:0x00be BREAK  A[LOOP:3: B:66:0x00b4->B:94:0x0106], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x00ae A[EDGE_INSN: B:118:0x00ae->B:63:0x00ae BREAK  A[LOOP:4: B:59:0x00a4->B:96:0x010c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8 A[LOOP:2: B:84:0x00e8->B:88:0x00f4, LOOP_START, PHI: r2
  0x00e8: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:83:0x00e6, B:88:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4 A[LOOP:2: B:84:0x00e8->B:88:0x00f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6 A[LOOP:1: B:78:0x00d6->B:89:0x00f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106 A[LOOP:3: B:66:0x00b4->B:94:0x0106, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x010c A[LOOP:4: B:59:0x00a4->B:96:0x010c, LOOP_END] */
    public final i90 a(ByteArrayInputStream byteArrayInputStream) throws CompressorException {
        byte[] bArr;
        boolean zEquals;
        int i;
        byte[] bArr2;
        String str;
        int i2;
        byte[] bArr3;
        byte[] bArr4;
        boolean zEquals2;
        int i3;
        byte[] bArr5;
        byte[] bArr6;
        int i4;
        byte b2;
        if (!byteArrayInputStream.markSupported()) {
            kf2.n("Mark is not supported.");
            return null;
        }
        byte[] bArr7 = new byte[12];
        byteArrayInputStream.mark(12);
        int i5 = 0;
        try {
            int iD = vr1.D(byteArrayInputStream, bArr7, 0, 12);
            byteArrayInputStream.reset();
            int i6 = mo.J;
            if (iD >= 3 && bArr7[0] == 66 && bArr7[1] == 90 && bArr7[2] == 104) {
                str = "bzip2";
            } else {
                int i7 = rk1.w;
                if (iD >= 2 && bArr7[0] == 31 && bArr7[1] == -117) {
                    str = "gz";
                } else {
                    int i8 = xb3.r;
                    if (iD < i8) {
                        bArr = re1.z;
                        if (iD < 10) {
                            zEquals = false;
                        } else {
                            byte[] bArr8 = new byte[10];
                            System.arraycopy(bArr7, 0, bArr8, 0, 10);
                            zEquals = Arrays.equals(bArr8, bArr);
                        }
                        if (zEquals) {
                            str = "snappy-framed";
                        } else {
                            int i9 = me5.C;
                            if (iD <= 3 && bArr7[0] == 31 && bArr7[1] == -99) {
                                str = "z";
                            } else {
                                int i10 = yn0.q;
                                if (iD <= 3 && bArr7[0] == 120 && ((b2 = bArr7[1]) == 1 || b2 == 94 || b2 == -100 || b2 == -38)) {
                                    str = "deflate";
                                } else {
                                    if (iD < 6) {
                                        byte[] bArr9 = fe5.a;
                                    } else {
                                        i = 0;
                                        while (true) {
                                            bArr2 = fe5.a;
                                            if (i >= 6) {
                                                str = "xz";
                                            } else {
                                                if (bArr7[i] != bArr2[i]) {
                                                    break;
                                                }
                                                i++;
                                            }
                                        }
                                    }
                                    if (iD < 3) {
                                        byte[] bArr10 = m42.a;
                                    } else {
                                        i2 = 0;
                                        while (true) {
                                            bArr3 = m42.a;
                                            if (i2 >= 3) {
                                                str = "lzma";
                                            } else {
                                                if (bArr7[i2] != bArr3[i2]) {
                                                    break;
                                                }
                                                i2++;
                                            }
                                        }
                                    }
                                    bArr4 = qe1.B;
                                    if (iD < 4) {
                                        zEquals2 = false;
                                    } else {
                                        byte[] bArr11 = new byte[4];
                                        System.arraycopy(bArr7, 0, bArr11, 0, 4);
                                        zEquals2 = Arrays.equals(bArr11, bArr4);
                                    }
                                    if (!zEquals2) {
                                        if (iD >= 4) {
                                            i3 = 0;
                                            while (true) {
                                                bArr5 = se5.a;
                                                if (i3 >= 4) {
                                                    break;
                                                }
                                                if (bArr7[i3] == bArr5[i3]) {
                                                    i3++;
                                                } else if (80 == (bArr7[0] & 240)) {
                                                    while (true) {
                                                        bArr6 = se5.b;
                                                        if (i5 >= 3) {
                                                            break;
                                                        }
                                                        i4 = i5 + 1;
                                                        if (bArr7[i4] == bArr6[i5]) {
                                                            i5 = i4;
                                                        }
                                                    }
                                                }
                                            }
                                            str = "zstd";
                                        } else {
                                            byte[] bArr12 = se5.a;
                                        }
                                        throw new CompressorException("No Compressor found for the stream signature.");
                                    }
                                    str = "lz4-framed";
                                }
                            }
                        }
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= i8) {
                                str = "pack200";
                            } else {
                                if (bArr7[i11] != xb3.q[i11]) {
                                    break;
                                }
                                i11++;
                            }
                        }
                        bArr = re1.z;
                        if (iD < 10) {
                            zEquals = false;
                        } else {
                            byte[] bArr13 = new byte[10];
                            System.arraycopy(bArr7, 0, bArr13, 0, 10);
                            zEquals = Arrays.equals(bArr13, bArr);
                        }
                        if (zEquals) {
                            str = "snappy-framed";
                        } else {
                            int i12 = me5.C;
                            if (iD <= 3) {
                                int i13 = yn0.q;
                                if (iD <= 3) {
                                    if (iD < 6) {
                                        byte[] bArr14 = fe5.a;
                                    } else {
                                        i = 0;
                                        while (true) {
                                            bArr2 = fe5.a;
                                            if (i >= 6) {
                                                str = "xz";
                                            } else {
                                                if (bArr7[i] != bArr2[i]) {
                                                    break;
                                                    break;
                                                }
                                                i++;
                                            }
                                        }
                                    }
                                    if (iD < 3) {
                                        byte[] bArr15 = m42.a;
                                    } else {
                                        i2 = 0;
                                        while (true) {
                                            bArr3 = m42.a;
                                            if (i2 >= 3) {
                                                str = "lzma";
                                            } else {
                                                if (bArr7[i2] != bArr3[i2]) {
                                                    break;
                                                    break;
                                                }
                                                i2++;
                                            }
                                        }
                                    }
                                    bArr4 = qe1.B;
                                    if (iD < 4) {
                                        zEquals2 = false;
                                    } else {
                                        byte[] bArr16 = new byte[4];
                                        System.arraycopy(bArr7, 0, bArr16, 0, 4);
                                        zEquals2 = Arrays.equals(bArr16, bArr4);
                                    }
                                    if (!zEquals2) {
                                        if (iD >= 4) {
                                            i3 = 0;
                                            while (true) {
                                                bArr5 = se5.a;
                                                if (i3 >= 4) {
                                                    break;
                                                    break;
                                                }
                                                if (bArr7[i3] == bArr5[i3]) {
                                                    i3++;
                                                } else if (80 == (bArr7[0] & 240)) {
                                                    while (true) {
                                                        bArr6 = se5.b;
                                                        if (i5 >= 3) {
                                                            break;
                                                            break;
                                                        }
                                                        i4 = i5 + 1;
                                                        if (bArr7[i4] == bArr6[i5]) {
                                                            i5 = i4;
                                                        }
                                                    }
                                                }
                                            }
                                            str = "zstd";
                                        } else {
                                            byte[] bArr17 = se5.a;
                                        }
                                        throw new CompressorException("No Compressor found for the stream signature.");
                                    }
                                    str = "lz4-framed";
                                } else {
                                    if (iD < 6) {
                                        byte[] bArr18 = fe5.a;
                                    } else {
                                        i = 0;
                                        while (true) {
                                            bArr2 = fe5.a;
                                            if (i >= 6) {
                                                str = "xz";
                                            } else {
                                                if (bArr7[i] != bArr2[i]) {
                                                    break;
                                                    break;
                                                }
                                                i++;
                                            }
                                        }
                                    }
                                    if (iD < 3) {
                                        byte[] bArr19 = m42.a;
                                    } else {
                                        i2 = 0;
                                        while (true) {
                                            bArr3 = m42.a;
                                            if (i2 >= 3) {
                                                str = "lzma";
                                            } else {
                                                if (bArr7[i2] != bArr3[i2]) {
                                                    break;
                                                    break;
                                                }
                                                i2++;
                                            }
                                        }
                                    }
                                    bArr4 = qe1.B;
                                    if (iD < 4) {
                                        zEquals2 = false;
                                    } else {
                                        byte[] bArr110 = new byte[4];
                                        System.arraycopy(bArr7, 0, bArr110, 0, 4);
                                        zEquals2 = Arrays.equals(bArr110, bArr4);
                                    }
                                    if (!zEquals2) {
                                        if (iD >= 4) {
                                            i3 = 0;
                                            while (true) {
                                                bArr5 = se5.a;
                                                if (i3 >= 4) {
                                                    break;
                                                    break;
                                                }
                                                if (bArr7[i3] == bArr5[i3]) {
                                                    i3++;
                                                } else if (80 == (bArr7[0] & 240)) {
                                                    while (true) {
                                                        bArr6 = se5.b;
                                                        if (i5 >= 3) {
                                                            break;
                                                            break;
                                                        }
                                                        i4 = i5 + 1;
                                                        if (bArr7[i4] == bArr6[i5]) {
                                                            i5 = i4;
                                                        }
                                                    }
                                                }
                                            }
                                            str = "zstd";
                                        } else {
                                            byte[] bArr111 = se5.a;
                                        }
                                        throw new CompressorException("No Compressor found for the stream signature.");
                                    }
                                    str = "lz4-framed";
                                }
                            } else {
                                int i14 = yn0.q;
                                if (iD <= 3) {
                                    if (iD < 6) {
                                        byte[] bArr112 = fe5.a;
                                    } else {
                                        i = 0;
                                        while (true) {
                                            bArr2 = fe5.a;
                                            if (i >= 6) {
                                                str = "xz";
                                            } else {
                                                if (bArr7[i] != bArr2[i]) {
                                                    break;
                                                    break;
                                                }
                                                i++;
                                            }
                                        }
                                    }
                                    if (iD < 3) {
                                        byte[] bArr113 = m42.a;
                                    } else {
                                        i2 = 0;
                                        while (true) {
                                            bArr3 = m42.a;
                                            if (i2 >= 3) {
                                                str = "lzma";
                                            } else {
                                                if (bArr7[i2] != bArr3[i2]) {
                                                    break;
                                                    break;
                                                }
                                                i2++;
                                            }
                                        }
                                    }
                                    bArr4 = qe1.B;
                                    if (iD < 4) {
                                        zEquals2 = false;
                                    } else {
                                        byte[] bArr114 = new byte[4];
                                        System.arraycopy(bArr7, 0, bArr114, 0, 4);
                                        zEquals2 = Arrays.equals(bArr114, bArr4);
                                    }
                                    if (!zEquals2) {
                                        if (iD >= 4) {
                                            i3 = 0;
                                            while (true) {
                                                bArr5 = se5.a;
                                                if (i3 >= 4) {
                                                    break;
                                                    break;
                                                }
                                                if (bArr7[i3] == bArr5[i3]) {
                                                    i3++;
                                                } else if (80 == (bArr7[0] & 240)) {
                                                    while (true) {
                                                        bArr6 = se5.b;
                                                        if (i5 >= 3) {
                                                            break;
                                                            break;
                                                        }
                                                        i4 = i5 + 1;
                                                        if (bArr7[i4] == bArr6[i5]) {
                                                            i5 = i4;
                                                        }
                                                    }
                                                }
                                            }
                                            str = "zstd";
                                        } else {
                                            byte[] bArr115 = se5.a;
                                        }
                                        throw new CompressorException("No Compressor found for the stream signature.");
                                    }
                                    str = "lz4-framed";
                                } else {
                                    if (iD < 6) {
                                        byte[] bArr116 = fe5.a;
                                    } else {
                                        i = 0;
                                        while (true) {
                                            bArr2 = fe5.a;
                                            if (i >= 6) {
                                                str = "xz";
                                            } else {
                                                if (bArr7[i] != bArr2[i]) {
                                                    break;
                                                    break;
                                                }
                                                i++;
                                            }
                                        }
                                    }
                                    if (iD < 3) {
                                        byte[] bArr117 = m42.a;
                                    } else {
                                        i2 = 0;
                                        while (true) {
                                            bArr3 = m42.a;
                                            if (i2 >= 3) {
                                                str = "lzma";
                                            } else {
                                                if (bArr7[i2] != bArr3[i2]) {
                                                    break;
                                                    break;
                                                }
                                                i2++;
                                            }
                                        }
                                    }
                                    bArr4 = qe1.B;
                                    if (iD < 4) {
                                        zEquals2 = false;
                                    } else {
                                        byte[] bArr118 = new byte[4];
                                        System.arraycopy(bArr7, 0, bArr118, 0, 4);
                                        zEquals2 = Arrays.equals(bArr118, bArr4);
                                    }
                                    if (!zEquals2) {
                                        if (iD >= 4) {
                                            i3 = 0;
                                            while (true) {
                                                bArr5 = se5.a;
                                                if (i3 >= 4) {
                                                    break;
                                                    break;
                                                }
                                                if (bArr7[i3] == bArr5[i3]) {
                                                    i3++;
                                                } else if (80 == (bArr7[0] & 240)) {
                                                    while (true) {
                                                        bArr6 = se5.b;
                                                        if (i5 >= 3) {
                                                            break;
                                                            break;
                                                        }
                                                        i4 = i5 + 1;
                                                        if (bArr7[i4] == bArr6[i5]) {
                                                            i5 = i4;
                                                        }
                                                    }
                                                }
                                            }
                                            str = "zstd";
                                        } else {
                                            byte[] bArr119 = se5.a;
                                        }
                                        throw new CompressorException("No Compressor found for the stream signature.");
                                    }
                                    str = "lz4-framed";
                                }
                            }
                        }
                    }
                }
            }
            return b(str, byteArrayInputStream);
        } catch (IOException e2) {
            throw new CompressorException("IOException while reading signature.", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r7 == 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r7 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        if (r7 == 2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ba, code lost:
    
        if (r7 == 2) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i90 b(String str, ByteArrayInputStream byteArrayInputStream) throws CompressorException {
        try {
            if ("gz".equalsIgnoreCase(str)) {
                return new rk1(byteArrayInputStream);
            }
            if ("bzip2".equalsIgnoreCase(str)) {
                return new mo(byteArrayInputStream);
            }
            if ("br".equalsIgnoreCase(str)) {
                int i = nv.a;
                if (i == 1) {
                    try {
                        Class.forName("org.brotli.dec.BrotliInputStream");
                    } catch (Exception | NoClassDefFoundError unused) {
                        throw new CompressorException("Brotli compression is not available." + c);
                    }
                }
                return new mv(byteArrayInputStream);
            }
            if ("xz".equalsIgnoreCase(str)) {
                int i2 = fe5.b;
                if (i2 == 1) {
                    try {
                        ee5.f();
                    } catch (NoClassDefFoundError unused2) {
                        throw new CompressorException("XZ compression is not available." + d);
                    }
                }
                return new ee5(byteArrayInputStream);
            }
            if ("zstd".equalsIgnoreCase(str)) {
                int i3 = se5.c;
                if (i3 == 1) {
                    try {
                        Class.forName("com.github.luben.zstd.ZstdInputStream");
                    } catch (Exception | NoClassDefFoundError unused3) {
                        throw new CompressorException("Zstandard compression is not available." + e);
                    }
                }
                return new re5(byteArrayInputStream);
            }
            if ("lzma".equalsIgnoreCase(str)) {
                int i4 = m42.b;
                if (i4 == 1) {
                    try {
                        int i5 = l42.p;
                    } catch (NoClassDefFoundError unused4) {
                        throw new CompressorException("LZMA compression is not available" + d);
                    }
                }
                return new l42(byteArrayInputStream);
            }
            if ("pack200".equalsIgnoreCase(str)) {
                return new xb3(byteArrayInputStream);
            }
            if ("snappy-raw".equalsIgnoreCase(str)) {
                return new bh4(byteArrayInputStream, 32768);
            }
            if ("snappy-framed".equalsIgnoreCase(str)) {
                return new re1(byteArrayInputStream);
            }
            if ("z".equalsIgnoreCase(str)) {
                return new me5(byteArrayInputStream);
            }
            if ("deflate".equalsIgnoreCase(str)) {
                return new yn0(byteArrayInputStream);
            }
            if ("deflate64".equalsIgnoreCase(str)) {
                return new xn0(byteArrayInputStream);
            }
            if ("lz4-block".equalsIgnoreCase(str)) {
                return new gt(byteArrayInputStream);
            }
            if ("lz4-framed".equalsIgnoreCase(str)) {
                return new qe1(byteArrayInputStream);
            }
            if (this.a == null) {
                this.a = Collections.unmodifiableSortedMap((SortedMap) AccessController.doPrivileged(new j90()));
            }
            k90 k90Var = (k90) this.a.get(str.toUpperCase(Locale.ROOT));
            if (k90Var != null) {
                return k90Var.b(str, byteArrayInputStream);
            }
            throw new CompressorException(xa3.h("Compressor: ", str, " not found."));
        } catch (IOException e2) {
            throw new CompressorException("Could not create CompressorInputStream.", e2);
        }
    }
}
