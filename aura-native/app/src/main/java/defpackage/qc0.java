package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class qc0 {
    public static final long a(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            ez1.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return g(i, i2, i3, i4);
    }

    public static /* synthetic */ long b(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return a(0, i, 0, i2);
    }

    public static final int c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final long d(long j, long j2) {
        int i = (int) (j2 >> 32);
        int j3 = nc0.j(j);
        int h = nc0.h(j);
        if (i < j3) {
            i = j3;
        }
        if (i <= h) {
            h = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int i3 = nc0.i(j);
        int g = nc0.g(j);
        if (i2 < i3) {
            i2 = i3;
        }
        if (i2 <= g) {
            g = i2;
        }
        return (h << 32) | (g & 4294967295L);
    }

    public static final int e(int i, long j) {
        int i2 = nc0.i(j);
        int g = nc0.g(j);
        if (i < i2) {
            i = i2;
        }
        return i > g ? g : i;
    }

    public static final int f(int i, long j) {
        int j2 = nc0.j(j);
        int h = nc0.h(j);
        if (i < j2) {
            i = j2;
        }
        return i > h ? h : i;
    }

    public static final long g(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int c = c(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int c2 = c(i6);
        if (c + c2 > 31) {
            h(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = c2 - 13;
        return ((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (c2 + 2)) | ((i8 & (~(i8 >> 31))) << (c2 + 33));
    }

    public static final void h(int i, int i2) {
        throw new IllegalArgumentException(b11.n("Can't represent a width of ", " and height of ", i, i2, " in Constraints"));
    }

    public static final Void i(int i) {
        throw new IllegalArgumentException(b11.j(i, "Can't represent a size of ", " in Constraints"));
    }
}
