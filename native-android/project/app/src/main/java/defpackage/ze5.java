package defpackage;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ze5 {
    public static final tl1 a = xe5.c;
    public static final TimeZone b;
    public static final String c;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        b = timeZone;
        String strZ0 = qm4.z0(o83.class.getName(), "okhttp3.");
        if (qm4.p0(strZ0, "Client")) {
            strZ0 = strZ0.substring(0, strZ0.length() - 6);
        }
        c = strZ0;
    }

    public static final boolean a(gr1 gr1Var, gr1 gr1Var2) {
        gr1Var.getClass();
        gr1Var2.getClass();
        return h12.c(gr1Var.d, gr1Var2.d) && gr1Var.e == gr1Var2.e && h12.c(gr1Var.a, gr1Var2.a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j < 0) {
            nz2.f("timeout".concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            kf2.e("timeout".concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        kf2.e("timeout".concat(" too small"));
        return 0;
    }

    public static final void c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!h12.c(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long e(k14 k14Var) {
        String strA = k14Var.s.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        byte[] bArr = xe5.a;
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List f(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = Collections.unmodifiableList(gb.P(Arrays.copyOf(objArr2, objArr2.length)));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final Charset g(fw fwVar, Charset charset) {
        fwVar.getClass();
        charset.getClass();
        int iM = fwVar.m(xe5.b);
        if (iM == -1) {
            return charset;
        }
        if (iM == 0) {
            return w10.a;
        }
        if (iM == 1) {
            return w10.b;
        }
        if (iM == 2) {
            return w10.c;
        }
        if (iM == 3) {
            Charset charset2 = w10.a;
            Charset charset3 = w10.e;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            charsetForName.getClass();
            w10.e = charsetForName;
            return charsetForName;
        }
        if (iM != 4) {
            throw new AssertionError();
        }
        Charset charset4 = w10.a;
        Charset charset5 = w10.d;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        charsetForName2.getClass();
        w10.d = charsetForName2;
        return charsetForName2;
    }

    public static final boolean h(ej4 ej4Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jC = ej4Var.timeout().e() ? ej4Var.timeout().c() - jNanoTime : Long.MAX_VALUE;
        ej4Var.timeout().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            tv tvVar = new tv();
            while (ej4Var.read(tvVar, 8192L) != -1) {
                tvVar.b();
            }
            if (jC == Long.MAX_VALUE) {
                ej4Var.timeout().a();
                return true;
            }
            ej4Var.timeout().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                ej4Var.timeout().a();
                return false;
            }
            ej4Var.timeout().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                ej4Var.timeout().a();
            } else {
                ej4Var.timeout().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final tl1 i(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pl1 pl1Var = (pl1) it.next();
            yw ywVar = pl1Var.a;
            yw ywVar2 = pl1Var.b;
            String strQ = ywVar.q();
            String strQ2 = ywVar2.q();
            arrayList.add(strQ);
            arrayList.add(qm4.K0(strQ2).toString());
        }
        return new tl1((String[]) arrayList.toArray(new String[0]));
    }

    public static final String j(gr1 gr1Var, boolean z) {
        int i;
        gr1Var.getClass();
        int i2 = gr1Var.e;
        String str = gr1Var.d;
        if (qm4.o0(str, ":")) {
            str = "[" + str + ']';
        }
        if (!z) {
            String str2 = gr1Var.a;
            str2.getClass();
            if (str2.equals("http")) {
                i = 80;
            } else {
                i = str2.equals("https") ? 443 : -1;
            }
            if (i2 == i) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    public static final List k(List list) {
        list.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }
}
