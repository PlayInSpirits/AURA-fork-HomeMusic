package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cu1 implements Closeable {
    public static final short[] s = {96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};
    public static final int[] t = {16, 32, 48, 64, 81, 113, 146, 210, 275, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};
    public static final int[] u = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    public static final int[] v;
    public static final int[] w;
    public boolean n = false;
    public fh0 o;
    public qs p;
    public final ByteArrayInputStream q;
    public final i r;

    static {
        int[] iArr = new int[288];
        v = iArr;
        Arrays.fill(iArr, 0, 144, 8);
        Arrays.fill(iArr, 144, 256, 9);
        Arrays.fill(iArr, 256, 280, 7);
        Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        w = iArr2;
        Arrays.fill(iArr2, 5);
    }

    public cu1(ByteArrayInputStream byteArrayInputStream) {
        i iVar = new i();
        iVar.c = new byte[65536];
        this.r = iVar;
        this.p = new qs(byteArrayInputStream, ByteOrder.LITTLE_ENDIAN);
        this.q = byteArrayInputStream;
        this.o = new au1();
    }

    public static tu b(int[] iArr) {
        Object obj;
        int[] iArr2 = new int[65];
        int iMax = 0;
        for (int i : iArr) {
            iMax = Math.max(iMax, i);
            iArr2[i] = iArr2[i] + 1;
        }
        int i2 = iMax + 1;
        int[] iArrCopyOf = Arrays.copyOf(iArr2, i2);
        int[] iArr3 = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 <= iMax; i4++) {
            i3 = (i3 + iArrCopyOf[i4]) << 1;
            iArr3[i4] = i3;
        }
        tu tuVar = new tu(0, 2);
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 != 0) {
                int i7 = i6 - 1;
                int i8 = iArr3[i7];
                tu tuVar2 = tuVar;
                for (int i9 = i7; i9 >= 0; i9--) {
                    if (((1 << i9) & i8) == 0) {
                        if (((tu) tuVar2.c) == null && tuVar2.b == -1) {
                            tuVar2.c = new tu(tuVar2.a + 1, 2);
                        }
                        obj = tuVar2.c;
                    } else {
                        if (((tu) tuVar2.d) == null && tuVar2.b == -1) {
                            tuVar2.d = new tu(tuVar2.a + 1, 2);
                        }
                        obj = tuVar2.d;
                    }
                    tuVar2 = (tu) obj;
                }
                tuVar2.b = i5;
                tuVar2.c = null;
                tuVar2.d = null;
                iArr3[i7] = iArr3[i7] + 1;
            }
        }
        return tuVar;
    }

    public static int f(qs qsVar, tu tuVar) {
        while (tuVar != null && tuVar.b == -1) {
            tuVar = (tu) (j(qsVar, 1) == 0 ? tuVar.c : tuVar.d);
        }
        if (tuVar != null) {
            return tuVar.b;
        }
        return -1;
    }

    public static long j(qs qsVar, int i) {
        long jB = qsVar.b(i);
        if (jB != -1) {
            return jB;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.o = new au1();
        this.p = null;
    }
}
