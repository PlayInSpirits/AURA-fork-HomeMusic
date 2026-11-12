package defpackage;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xe5 {
    public static final byte[] a = new byte[0];
    public static final cb3 b;
    public static final tl1 c;
    public static final we5 d;
    public static final fv3 e;

    static {
        yw ywVar = yw.q;
        yw[] ywVarArr = {pa.s("efbbbf"), pa.s("feff"), pa.s("fffe"), pa.s("0000ffff"), pa.s("ffff0000")};
        ArrayList arrayList = new ArrayList(new hi(ywVarArr, false));
        u40.l0(arrayList);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < 5) {
            arrayList2.set(gb.e(arrayList, ywVarArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((yw) arrayList.get(0)).d() <= 0) {
            kf2.n("the empty byte string is not a supported option");
            return;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            yw ywVar2 = (yw) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                yw ywVar3 = (yw) arrayList.get(i6);
                ywVar3.getClass();
                ywVar2.getClass();
                if (!ywVar3.m(0, ywVar2, ywVar2.d())) {
                    break;
                }
                if (ywVar3.d() == ywVar2.d()) {
                    nz2.l(ywVar3, "duplicate option: ");
                    return;
                } else if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                    arrayList.remove(i6);
                    arrayList2.remove(i6);
                } else {
                    i6++;
                }
            }
            i4 = i5;
        }
        tv tvVar = new tv();
        ud3.b(0L, tvVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (tvVar.o / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = tvVar.readInt();
        }
        b = new cb3((yw[]) Arrays.copyOf(ywVarArr, 5), iArr);
        c = h12.G(new String[0]);
        sz3 sz3Var = tz3.Companion;
        byte[] bArr = a;
        d = sz3.c(sz3Var, bArr, null, 0, 7);
        n14.Companion.getClass();
        e = m14.b(bArr, null);
    }

    public static final void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("length=" + j + ", offset=" + j2 + ", count=" + j2);
        }
    }

    public static final void b(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void c(b71 b71Var, ge3 ge3Var) throws IOException {
        b71Var.getClass();
        try {
            IOException iOException = null;
            for (ge3 ge3Var2 : b71Var.f(ge3Var)) {
                try {
                    if (b71Var.g(ge3Var2).c) {
                        c(b71Var, ge3Var2);
                    }
                    b71Var.d(ge3Var2);
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void d(hr0 hr0Var, ge3 ge3Var) {
        hr0Var.getClass();
        ge3Var.getClass();
        try {
            hr0Var.c.d(ge3Var);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int e(int i, int i2, String str, String str2) {
        str.getClass();
        while (i < i2) {
            if (qm4.n0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, char c2, int i, int i2) {
        str.getClass();
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean g(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                int i = 0;
                while (true) {
                    if (i < strArr2.length) {
                        int i2 = i + 1;
                        try {
                            if (comparator.compare(str, strArr2[i]) == 0) {
                                return true;
                            }
                            i = i2;
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            kf2.m(e2.getMessage());
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final int h(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (h12.j(cCharAt, 31) <= 0 || h12.j(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int i(String str, int i, int i2) {
        str.getClass();
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int j(String str, int i, int i2) {
        str.getClass();
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 != i) {
                    i3--;
                }
            }
        }
        return i;
    }

    public static final String[] k(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean l(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int m(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final int n(fw fwVar) {
        fwVar.getClass();
        return (fwVar.readByte() & 255) | ((fwVar.readByte() & 255) << 16) | ((fwVar.readByte() & 255) << 8);
    }

    public static final int o(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String p(String str, int i, int i2) {
        str.getClass();
        int i3 = i(str, i, i2);
        return str.substring(i3, j(str, i3, i2));
    }
}
