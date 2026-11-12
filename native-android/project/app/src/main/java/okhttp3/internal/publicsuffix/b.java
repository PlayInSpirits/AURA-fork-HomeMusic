package okhttp3.internal.publicsuffix;

import defpackage.aa4;
import defpackage.b11;
import defpackage.b71;
import defpackage.fa4;
import defpackage.fx0;
import defpackage.gb;
import defpackage.ge3;
import defpackage.gx0;
import defpackage.h12;
import defpackage.kf2;
import defpackage.nz2;
import defpackage.q05;
import defpackage.q40;
import defpackage.qg3;
import defpackage.qm4;
import defpackage.tk1;
import defpackage.tv1;
import defpackage.u01;
import defpackage.w10;
import defpackage.w40;
import defpackage.xu3;
import defpackage.y04;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final ge3 g;
    public static final byte[] h;
    public static final List i;
    public static final b j;
    public final ge3 a;
    public final b71 b;
    public final AtomicBoolean c;
    public final CountDownLatch d;
    public byte[] e;
    public byte[] f;

    static {
        String str = ge3.o;
        g = tv1.z("/okhttp3/internal/publicsuffix/" + b.class.getSimpleName() + ".gz");
        h = new byte[]{42};
        i = gb.O("*");
        j = new b();
    }

    public b() {
        y04 y04Var = b71.b;
        ge3 ge3Var = g;
        ge3Var.getClass();
        y04Var.getClass();
        this.a = ge3Var;
        this.b = y04Var;
        this.c = new AtomicBoolean(false);
        this.d = new CountDownLatch(1);
    }

    public static List c(String str) {
        List listD0 = qm4.D0(str, new char[]{'.'});
        if (!h12.c(q40.C0(listD0), "")) {
            return listD0;
        }
        int size = listD0.size() - 1;
        return q40.L0(listD0, size >= 0 ? size : 0);
    }

    public final String a(String str) {
        String strA;
        String strA2;
        String strA3;
        List listD0;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listC = c(unicode);
        List listD1 = u01.n;
        if (this.c.get() || !this.c.compareAndSet(false, true)) {
            try {
                this.d.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        qg3 qg3Var = qg3.a;
                        qg3.a.getClass();
                        qg3.i("Failed to read public suffix list", 5, e);
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.e == null) {
            nz2.z(g, " resource from the classpath.", "Unable to load ");
            return null;
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i2 = 0; i2 < size3; i2++) {
            byte[] bytes = ((String) listC.get(i2)).getBytes(w10.a);
            bytes.getClass();
            bArr[i2] = bytes;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                strA = null;
                break;
            }
            byte[] bArr2 = this.e;
            if (bArr2 == null) {
                h12.Q("publicSuffixListBytes");
                throw null;
            }
            strA = a.a(bArr2, bArr, i3);
            if (strA != null) {
                break;
            }
            i3++;
        }
        if (size3 <= 1) {
            strA2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                strA2 = null;
                break;
            }
            bArr3[i4] = h;
            byte[] bArr4 = this.e;
            if (bArr4 == null) {
                h12.Q("publicSuffixListBytes");
                throw null;
            }
            strA2 = a.a(bArr4, bArr3, i4);
            if (strA2 != null) {
                break;
            }
            i4++;
        }
        if (strA2 == null) {
            strA3 = null;
            break;
        }
        int i5 = size3 - 1;
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                strA3 = null;
                break;
            }
            byte[] bArr5 = this.f;
            if (bArr5 == null) {
                h12.Q("publicSuffixExceptionListBytes");
                throw null;
            }
            strA3 = a.a(bArr5, bArr, i6);
            if (strA3 != null) {
                break;
            }
            i6++;
        }
        if (strA3 != null) {
            listD0 = qm4.D0("!".concat(strA3), new char[]{'.'});
        } else if (strA == null && strA2 == null) {
            listD0 = i;
        } else {
            List listD2 = strA != null ? qm4.D0(strA, new char[]{'.'}) : listD1;
            if (strA2 != null) {
                listD1 = qm4.D0(strA2, new char[]{'.'});
            }
            listD0 = listD2.size() > listD1.size() ? listD2 : listD1;
        }
        if (listC.size() == listD0.size() && ((String) listD0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listD0.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listD0.size();
        } else {
            size = listC.size();
            size2 = listD0.size() + 1;
        }
        int i7 = size - size2;
        aa4 w40Var = new w40(0, c(str));
        if (i7 < 0) {
            kf2.e(b11.j(i7, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i7 != 0) {
            w40Var = w40Var instanceof gx0 ? ((gx0) w40Var).b(i7) : new fx0(w40Var, i7, 0);
        }
        return fa4.d0(w40Var, ".", null, 62);
    }

    public final void b() {
        try {
            xu3 xu3Var = new xu3(new tk1(this.b.k(this.a)));
            try {
                long j2 = xu3Var.readInt();
                xu3Var.P(j2);
                byte[] bArrF = xu3Var.o.F(j2);
                long j3 = xu3Var.readInt();
                xu3Var.P(j3);
                byte[] bArrF2 = xu3Var.o.F(j3);
                xu3Var.close();
                synchronized (this) {
                    this.e = bArrF;
                    this.f = bArrF2;
                }
                this.d.countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    q05.h(xu3Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            this.d.countDown();
            throw th3;
        }
    }
}
