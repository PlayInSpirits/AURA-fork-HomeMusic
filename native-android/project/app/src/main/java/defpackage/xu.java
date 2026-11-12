package defpackage;

import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xu implements r02 {
    public final /* synthetic */ int a;
    public final Object b;

    public xu(be0 be0Var) {
        this.a = 0;
        be0Var.getClass();
        this.b = be0Var;
    }

    public static int d(k14 k14Var, int i) {
        String strA = k14Var.s.a("Retry-After");
        if (strA == null) {
            strA = null;
        }
        if (strA == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        patternCompile.getClass();
        if (!patternCompile.matcher(strA).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:202:0x0493  */
    /* JADX WARN: Code duplicated, block: B:205:0x049b  */
    /* JADX WARN: Code duplicated, block: B:208:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:209:0x04af  */
    /* JADX WARN: Code duplicated, block: B:215:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:218:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:220:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:222:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:230:0x050a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:231:0x050c  */
    /* JADX WARN: Code duplicated, block: B:232:0x0511 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x0513  */
    /* JADX WARN: Code duplicated, block: B:235:0x0518 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:236:0x051a  */
    /* JADX WARN: Code duplicated, block: B:238:0x0541  */
    /* JADX WARN: Code duplicated, block: B:313:0x0727  */
    /* JADX WARN: Code duplicated, block: B:314:0x072c  */
    /* JADX WARN: Code duplicated, block: B:317:0x0749  */
    /* JADX WARN: Code duplicated, block: B:324:0x0773  */
    /* JADX WARN: Code duplicated, block: B:343:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:345:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:346:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:348:0x080c  */
    /* JADX WARN: Code duplicated, block: B:446:0x0814 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.r02
    public final k14 a(ev3 ev3Var) throws IOException {
        int i;
        int i2;
        String str;
        n14 n14Var;
        k14 k14Var;
        int iO;
        long time;
        long time2;
        Date dateA;
        Date dateA2;
        Date dateA3;
        String str2;
        String str3;
        String str4;
        hd5 hd5Var;
        long j;
        long time3;
        String string;
        int i3;
        int i4;
        long millis;
        long millis2;
        String str5;
        String str6;
        long j2;
        j14 j14VarF;
        int i5;
        k14 k14VarM;
        k14 k14VarA;
        jw jwVar;
        String strA;
        String str7;
        k14 k14VarA2;
        ll llVarJ;
        ll llVarJ2;
        k14 k14Var2;
        boolean z;
        SSLSocketFactory sSLSocketFactory;
        m83 m83Var;
        o00 o00Var;
        switch (this.a) {
            case 0:
                be0 be0Var = (be0) this.b;
                oz3 oz3Var = ev3Var.e;
                nz3 nz3VarA = oz3Var.a();
                gr1 gr1Var = oz3Var.a;
                tl1 tl1Var = oz3Var.c;
                tz3 tz3Var = oz3Var.d;
                if (tz3Var != null) {
                    hu2 hu2VarContentType = tz3Var.contentType();
                    if (hu2VarContentType != null) {
                        nz3VarA.a("Content-Type", hu2VarContentType.a);
                    }
                    long jContentLength = tz3Var.contentLength();
                    if (jContentLength != -1) {
                        nz3VarA.a("Content-Length", String.valueOf(jContentLength));
                        nz3VarA.c.e("Transfer-Encoding");
                    } else {
                        nz3VarA.a("Transfer-Encoding", "chunked");
                        nz3VarA.c.e("Content-Length");
                    }
                }
                if (tl1Var.a("Host") == null) {
                    i = 0;
                    nz3VarA.a("Host", ze5.j(gr1Var, false));
                } else {
                    i = 0;
                }
                if (tl1Var.a("Connection") == null) {
                    nz3VarA.a("Connection", "Keep-Alive");
                }
                if (tl1Var.a("Accept-Encoding") == null && tl1Var.a("Range") == null) {
                    nz3VarA.a("Accept-Encoding", "gzip");
                    i2 = 1;
                } else {
                    i2 = i;
                }
                List listW = be0Var.w(gr1Var);
                if (listW.isEmpty()) {
                    str = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (Object obj : listW) {
                        int i6 = i + 1;
                        if (i < 0) {
                            gb.c0();
                            throw null;
                        }
                        ae0 ae0Var = (ae0) obj;
                        if (i > 0) {
                            sb.append("; ");
                        }
                        sb.append(ae0Var.a);
                        sb.append('=');
                        sb.append(ae0Var.b);
                        i = i6;
                    }
                    str = null;
                    nz3VarA.a("Cookie", sb.toString());
                }
                if (tl1Var.a("User-Agent") == null) {
                    nz3VarA.a("User-Agent", "okhttp/5.0.0-alpha.14");
                }
                oz3 oz3Var2 = new oz3(nz3VarA);
                k14 k14VarB = ev3Var.b(oz3Var2);
                tl1 tl1Var2 = k14VarB.s;
                br1.b(be0Var, oz3Var2.a, tl1Var2);
                j14 j14VarF2 = k14VarB.f();
                j14VarF2.a = oz3Var2;
                if (i2 != 0) {
                    String strA2 = tl1Var2.a("Content-Encoding");
                    if (strA2 == null) {
                        strA2 = str;
                    }
                    if ("gzip".equalsIgnoreCase(strA2) && br1.a(k14VarB) && (n14Var = k14VarB.t) != null) {
                        tk1 tk1Var = new tk1(n14Var.source());
                        sl1 sl1VarD = tl1Var2.d();
                        sl1VarD.e("Content-Encoding");
                        sl1VarD.e("Content-Length");
                        j14VarF2.f = sl1VarD.c().d();
                        String strA3 = tl1Var2.a("Content-Type");
                        j14VarF2.g = new fv3(strA3 == null ? str : strA3, -1L, new xu3(tk1Var), 0);
                    }
                }
                return j14VarF2.a();
            case 1:
                hx hxVar = (hx) this.b;
                if (hxVar != null) {
                    oz3 oz3Var3 = ev3Var.e;
                    oz3Var3.getClass();
                    gr1 gr1Var2 = oz3Var3.a;
                    try {
                        fr0 fr0VarN = hxVar.n.n(si0.D(gr1Var2));
                        if (fr0VarN == null) {
                            k14Var2 = null;
                        } else {
                            try {
                                fx fxVar = new fx((ej4) fr0VarN.p.get(0));
                                String str8 = fxVar.c;
                                tl1 tl1Var3 = fxVar.b;
                                gr1 gr1Var3 = fxVar.a;
                                tl1 tl1Var4 = fxVar.g;
                                String strA4 = tl1Var4.a("Content-Type");
                                String strA5 = tl1Var4.a("Content-Length");
                                gr1Var3.getClass();
                                tl1Var3.getClass();
                                str8.getClass();
                                nz3 nz3Var = new nz3();
                                nz3Var.a = gr1Var3;
                                nz3Var.c = tl1Var3.d();
                                nz3Var.b(!str8.equals("\u0000") ? str8 : "GET", null);
                                oz3 oz3Var4 = new oz3(nz3Var);
                                byte[] bArr = xe5.a;
                                gq1 gq1Var = gq1.q;
                                new ArrayList(20);
                                pr3 pr3Var = fxVar.d;
                                pr3Var.getClass();
                                int i7 = fxVar.e;
                                String str9 = fxVar.f;
                                str9.getClass();
                                sl1 sl1VarD2 = tl1Var4.d();
                                ex exVar = new ex(fr0VarN, strA4, strA5);
                                jl1 jl1Var = fxVar.h;
                                long j3 = fxVar.i;
                                long j4 = fxVar.j;
                                if (i7 < 0) {
                                    nz2.f(f34.f(i7, "code < 0: "));
                                    return null;
                                }
                                tl1 tl1VarC = sl1VarD2.c();
                                k14Var2 = new k14(oz3Var4, pr3Var, str9, i7, jl1Var, tl1VarC, exVar, null, null, null, j3, j4, null, gq1Var);
                                if (gr1Var3.equals(gr1Var2) && str8.equals(oz3Var3.b)) {
                                    Set setU = si0.U(tl1VarC);
                                    if (!(setU instanceof Collection) || !setU.isEmpty()) {
                                        Iterator it = setU.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                String str10 = (String) it.next();
                                                if (!tl1Var3.f(str10).equals(oz3Var3.c.f(str10))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                xe5.b(k14Var2.t);
                                k14Var2 = null;
                            } catch (IOException unused) {
                                xe5.b(fr0VarN);
                            }
                        }
                    } catch (IOException unused2) {
                    }
                    k14Var = k14Var2;
                } else {
                    k14Var = null;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                oz3 oz3Var5 = ev3Var.e;
                oz3Var5.getClass();
                if (k14Var != null) {
                    time = k14Var.x;
                    time2 = k14Var.y;
                    tl1 tl1Var5 = k14Var.s;
                    int size = tl1Var5.size();
                    int i8 = 0;
                    iO = -1;
                    dateA = null;
                    dateA2 = null;
                    dateA3 = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    while (i8 < size) {
                        String strB = tl1Var5.b(i8);
                        long j5 = jCurrentTimeMillis;
                        String strE = tl1Var5.e(i8);
                        if (strB.equalsIgnoreCase("Date")) {
                            str4 = strE;
                            dateA3 = mi0.a(strE);
                        } else if (strB.equalsIgnoreCase("Expires")) {
                            dateA = mi0.a(strE);
                        } else if (strB.equalsIgnoreCase("Last-Modified")) {
                            str3 = strE;
                            dateA2 = mi0.a(strE);
                        } else if (strB.equalsIgnoreCase("ETag")) {
                            str2 = strE;
                        } else if (strB.equalsIgnoreCase("Age")) {
                            iO = xe5.o(-1, strE);
                        }
                        i8++;
                        jCurrentTimeMillis = j5;
                    }
                } else {
                    iO = -1;
                    time = 0;
                    time2 = 0;
                    dateA = null;
                    dateA2 = null;
                    dateA3 = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                long j6 = jCurrentTimeMillis;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int i9 = 4;
                if (k14Var == null) {
                    hd5Var = new hd5(i9, oz3Var5, null);
                } else {
                    Object obj2 = null;
                    gr1 gr1Var4 = oz3Var5.a;
                    tl1 tl1Var6 = oz3Var5.c;
                    if (gr1Var4.f() && k14Var.r == null) {
                        hd5Var = new hd5(4, oz3Var5, obj2);
                    } else {
                        int i10 = 4;
                        if (kb4.I(k14Var, oz3Var5)) {
                            ix ixVarO = oz3Var5.f;
                            if (ixVarO == null) {
                                int i11 = ix.n;
                                ixVarO = au0.O(oz3Var5.c);
                                oz3Var5.f = ixVarO;
                            }
                            if (!ixVarO.a && tl1Var6.a("If-Modified-Since") == null && tl1Var6.a("If-None-Match") == null) {
                                ix ixVarB = k14Var.b();
                                long jMax = dateA3 != null ? Math.max(0L, time2 - dateA3.getTime()) : 0L;
                                if (iO != -1) {
                                    jMax = Math.max(jMax, timeUnit.toMillis(iO));
                                }
                                long jMax2 = jMax + Math.max(0L, time2 - time) + Math.max(0L, j6 - time2);
                                int i12 = k14Var.b().c;
                                if (i12 != -1) {
                                    time3 = timeUnit.toMillis(i12);
                                } else {
                                    if (dateA != null) {
                                        if (dateA3 != null) {
                                            time2 = dateA3.getTime();
                                        }
                                        time3 = dateA.getTime() - time2;
                                        if (time3 <= 0) {
                                            time3 = 0;
                                        }
                                    } else if (dateA2 == null) {
                                        j = 0;
                                        time3 = j;
                                    } else {
                                        List list = k14Var.n.a.g;
                                        if (list == null) {
                                            string = null;
                                        } else {
                                            StringBuilder sb2 = new StringBuilder();
                                            y41.h(list, sb2);
                                            string = sb2.toString();
                                        }
                                        if (string == null) {
                                            if (dateA3 != null) {
                                                time = dateA3.getTime();
                                            }
                                            long time4 = time - dateA2.getTime();
                                            j = 0;
                                            if (time4 > 0) {
                                                time3 = time4 / 10;
                                            }
                                        } else {
                                            j = 0;
                                        }
                                        time3 = j;
                                    }
                                    i3 = ixVarO.c;
                                    if (i3 != -1) {
                                        time3 = Math.min(time3, timeUnit.toMillis(i3));
                                    }
                                    i4 = ixVarO.i;
                                    if (i4 != -1) {
                                        millis = timeUnit.toMillis(i4);
                                    } else {
                                        millis = j;
                                    }
                                    if (!ixVarB.g || (i5 = ixVarO.h) == -1) {
                                        millis2 = j;
                                    } else {
                                        millis2 = timeUnit.toMillis(i5);
                                    }
                                    if (ixVarB.a) {
                                        if (str2 != null) {
                                            str5 = str2;
                                            str6 = "If-None-Match";
                                        } else {
                                            if (dateA2 != null) {
                                                str5 = str3;
                                            } else if (dateA3 != null) {
                                                str5 = str4;
                                            } else {
                                                hd5Var = new hd5(4, oz3Var5, null);
                                            }
                                            str6 = "If-Modified-Since";
                                        }
                                        sl1 sl1VarD3 = tl1Var6.d();
                                        str5.getClass();
                                        e35.p(sl1VarD3, str6, str5);
                                        nz3 nz3VarA2 = oz3Var5.a();
                                        nz3VarA2.c = sl1VarD3.c().d();
                                        hd5Var = new hd5(4, new oz3(nz3VarA2), k14Var);
                                    } else {
                                        j2 = jMax2 + millis;
                                        if (j2 < millis2 + time3) {
                                            j14VarF = k14Var.f();
                                            if (j2 >= time3) {
                                                j14VarF.f.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                            }
                                            if (jMax2 > 86400000 && k14Var.b().c == -1 && dateA == null) {
                                                j14VarF.f.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                            }
                                            hd5Var = new hd5(4, null, j14VarF.a());
                                        } else {
                                            if (str2 != null) {
                                                str5 = str2;
                                                str6 = "If-None-Match";
                                            } else {
                                                if (dateA2 != null) {
                                                    str5 = str3;
                                                } else if (dateA3 != null) {
                                                    str5 = str4;
                                                } else {
                                                    hd5Var = new hd5(4, oz3Var5, null);
                                                }
                                                str6 = "If-Modified-Since";
                                            }
                                            sl1 sl1VarD4 = tl1Var6.d();
                                            str5.getClass();
                                            e35.p(sl1VarD4, str6, str5);
                                            nz3 nz3VarA3 = oz3Var5.a();
                                            nz3VarA3.c = sl1VarD4.c().d();
                                            hd5Var = new hd5(4, new oz3(nz3VarA3), k14Var);
                                        }
                                    }
                                }
                                j = 0;
                                i3 = ixVarO.c;
                                if (i3 != -1) {
                                    time3 = Math.min(time3, timeUnit.toMillis(i3));
                                }
                                i4 = ixVarO.i;
                                if (i4 != -1) {
                                    millis = timeUnit.toMillis(i4);
                                } else {
                                    millis = j;
                                }
                                if (ixVarB.g) {
                                    millis2 = j;
                                } else {
                                    millis2 = j;
                                }
                                if (ixVarB.a) {
                                    j2 = jMax2 + millis;
                                    if (j2 < millis2 + time3) {
                                        j14VarF = k14Var.f();
                                        if (j2 >= time3) {
                                            j14VarF.f.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                        }
                                        if (jMax2 > 86400000) {
                                            j14VarF.f.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                        }
                                        hd5Var = new hd5(4, null, j14VarF.a());
                                    } else {
                                        if (str2 != null) {
                                            str5 = str2;
                                            str6 = "If-None-Match";
                                        } else {
                                            if (dateA2 != null) {
                                                str5 = str3;
                                            } else if (dateA3 != null) {
                                                str5 = str4;
                                            } else {
                                                hd5Var = new hd5(4, oz3Var5, null);
                                            }
                                            str6 = "If-Modified-Since";
                                        }
                                        sl1 sl1VarD5 = tl1Var6.d();
                                        str5.getClass();
                                        e35.p(sl1VarD5, str6, str5);
                                        nz3 nz3VarA4 = oz3Var5.a();
                                        nz3VarA4.c = sl1VarD5.c().d();
                                        hd5Var = new hd5(4, new oz3(nz3VarA4), k14Var);
                                    }
                                } else {
                                    if (str2 != null) {
                                        str5 = str2;
                                        str6 = "If-None-Match";
                                    } else {
                                        if (dateA2 != null) {
                                            str5 = str3;
                                        } else if (dateA3 != null) {
                                            str5 = str4;
                                        } else {
                                            hd5Var = new hd5(4, oz3Var5, null);
                                        }
                                        str6 = "If-Modified-Since";
                                    }
                                    sl1 sl1VarD6 = tl1Var6.d();
                                    str5.getClass();
                                    e35.p(sl1VarD6, str6, str5);
                                    nz3 nz3VarA5 = oz3Var5.a();
                                    nz3VarA5.c = sl1VarD6.c().d();
                                    hd5Var = new hd5(4, new oz3(nz3VarA5), k14Var);
                                }
                            } else {
                                hd5Var = new hd5(4, oz3Var5, null);
                            }
                        } else {
                            hd5Var = new hd5(i10, oz3Var5, obj2);
                        }
                    }
                }
                if (((oz3) hd5Var.o) != null) {
                    ix ixVarO2 = oz3Var5.f;
                    if (ixVarO2 == null) {
                        int i13 = ix.n;
                        ixVarO2 = au0.O(oz3Var5.c);
                        oz3Var5.f = ixVarO2;
                    }
                    if (ixVarO2.j) {
                        Object obj3 = null;
                        hd5Var = new hd5(4, obj3, obj3);
                    }
                }
                oz3 oz3Var6 = (oz3) hd5Var.o;
                k14 k14Var3 = (k14) hd5Var.p;
                hx hxVar2 = (hx) this.b;
                if (hxVar2 != null) {
                    synchronized (hxVar2) {
                    }
                }
                if (k14Var != null && k14Var3 == null) {
                    xe5.b(k14Var.t);
                }
                if (oz3Var6 == null && k14Var3 == null) {
                    fv3 fv3Var = xe5.e;
                    gq1 gq1Var2 = gq1.q;
                    ArrayList arrayList = new ArrayList(20);
                    oz3 oz3Var7 = ev3Var.e;
                    oz3Var7.getClass();
                    return new k14(oz3Var7, pr3.q, "Unsatisfiable Request (only-if-cached)", 504, null, new tl1((String[]) arrayList.toArray(new String[0])), fv3Var, null, null, null, -1L, System.currentTimeMillis(), null, gq1Var2);
                }
                if (oz3Var6 == null) {
                    k14Var3.getClass();
                    j14 j14VarF3 = k14Var3.f();
                    k14 k14VarM2 = xl.M(k14Var3);
                    xl.i("cacheResponse", k14VarM2);
                    j14VarF3.i = k14VarM2;
                    return j14VarF3.a();
                }
                try {
                    k14 k14VarB2 = ev3Var.b(oz3Var6);
                    if (k14Var3 == null) {
                        j14 j14VarF4 = k14VarB2.f();
                        if (k14Var3 != null) {
                            k14VarM = xl.M(k14Var3);
                        } else {
                            k14VarM = null;
                        }
                        xl.i("cacheResponse", k14VarM);
                        j14VarF4.i = k14VarM;
                        k14 k14VarM3 = xl.M(k14VarB2);
                        xl.i("networkResponse", k14VarM3);
                        j14VarF4.h = k14VarM3;
                        k14VarA = j14VarF4.a();
                        if (((hx) this.b) != null) {
                            if (!br1.a(k14VarA) && kb4.I(k14VarA, oz3Var6)) {
                                hx hxVar3 = (hx) this.b;
                                j14 j14VarF5 = k14VarA.f();
                                j14VarF5.a = oz3Var6;
                                k14 k14VarA3 = j14VarF5.a();
                                hxVar3.getClass();
                                oz3 oz3Var8 = k14VarA3.n;
                                String str11 = oz3Var8.b;
                                try {
                                    if (gb.J(str11)) {
                                        hxVar3.b(oz3Var8);
                                    } else {
                                        if (str11.equals("GET") && !si0.U(k14VarA3.s).contains("*")) {
                                            fx fxVar2 = new fx(k14VarA3);
                                            try {
                                                jr0 jr0Var = hxVar3.n;
                                                String strD = si0.D(oz3Var8.a);
                                                ux3 ux3Var = jr0.G;
                                                llVarJ = jr0Var.j(strD, -1L);
                                                if (llVarJ == null) {
                                                    jwVar = null;
                                                } else {
                                                    try {
                                                        fxVar2.c(llVarJ);
                                                        jw jwVar2 = new jw();
                                                        jwVar2.r = hxVar3;
                                                        jwVar2.o = llVarJ;
                                                        of4 of4VarI = llVarJ.i(1);
                                                        jwVar2.p = of4VarI;
                                                        jwVar2.q = new gx(hxVar3, jwVar2, of4VarI);
                                                        jwVar = jwVar2;
                                                    } catch (IOException unused3) {
                                                        if (llVarJ != null) {
                                                            llVarJ.a();
                                                        }
                                                        jwVar = null;
                                                    }
                                                }
                                            } catch (IOException unused4) {
                                                llVarJ = null;
                                            }
                                        } else {
                                            jwVar = null;
                                        }
                                        if (jwVar != null) {
                                            gx gxVar = (gx) jwVar.q;
                                            fw fwVarSource = k14VarA.t.source();
                                            gxVar.getClass();
                                            ox oxVar = new ox(fwVarSource, jwVar, new wu3(gxVar));
                                            strA = k14VarA.s.a("Content-Type");
                                            if (strA == null) {
                                                str7 = null;
                                            } else {
                                                str7 = strA;
                                            }
                                            long jContentLength2 = k14VarA.t.contentLength();
                                            j14 j14VarF6 = k14VarA.f();
                                            j14VarF6.g = new fv3(str7, jContentLength2, new xu3(oxVar), 0);
                                            k14VarA2 = j14VarF6.a();
                                        }
                                    }
                                    break;
                                } catch (IOException unused5) {
                                }
                                jwVar = null;
                                if (jwVar != null) {
                                    gx gxVar2 = (gx) jwVar.q;
                                    fw fwVarSource2 = k14VarA.t.source();
                                    gxVar2.getClass();
                                    ox oxVar2 = new ox(fwVarSource2, jwVar, new wu3(gxVar2));
                                    strA = k14VarA.s.a("Content-Type");
                                    if (strA == null) {
                                        str7 = null;
                                    } else {
                                        str7 = strA;
                                    }
                                    long jContentLength3 = k14VarA.t.contentLength();
                                    j14 j14VarF7 = k14VarA.f();
                                    j14VarF7.g = new fv3(str7, jContentLength3, new xu3(oxVar2), 0);
                                    k14VarA2 = j14VarF7.a();
                                }
                            } else if (gb.J(oz3Var6.b)) {
                                try {
                                    ((hx) this.b).b(oz3Var6);
                                    break;
                                } catch (IOException unused6) {
                                }
                            }
                        }
                        return k14VarA;
                    }
                    if (k14VarB2.q != 304) {
                        xe5.b(k14Var3.t);
                        j14 j14VarF8 = k14VarB2.f();
                        if (k14Var3 != null) {
                            k14VarM = xl.M(k14Var3);
                        } else {
                            k14VarM = null;
                        }
                        xl.i("cacheResponse", k14VarM);
                        j14VarF8.i = k14VarM;
                        k14 k14VarM4 = xl.M(k14VarB2);
                        xl.i("networkResponse", k14VarM4);
                        j14VarF8.h = k14VarM4;
                        k14VarA = j14VarF8.a();
                        if (((hx) this.b) != null) {
                            if (!br1.a(k14VarA)) {
                                if (gb.J(oz3Var6.b)) {
                                    ((hx) this.b).b(oz3Var6);
                                }
                            } else if (gb.J(oz3Var6.b)) {
                                ((hx) this.b).b(oz3Var6);
                            }
                            break;
                        }
                        return k14VarA;
                    }
                    j14 j14VarF9 = k14Var3.f();
                    tl1 tl1Var7 = k14Var3.s;
                    tl1 tl1Var8 = k14VarB2.s;
                    ArrayList arrayList2 = new ArrayList(20);
                    int size2 = tl1Var7.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        String strB2 = tl1Var7.b(i14);
                        String strE2 = tl1Var7.e(i14);
                        if ((!"Warning".equalsIgnoreCase(strB2) || !xm4.k0(strE2, "1", false)) && ("Content-Length".equalsIgnoreCase(strB2) || "Content-Encoding".equalsIgnoreCase(strB2) || "Content-Type".equalsIgnoreCase(strB2) || !j51.C(strB2) || tl1Var8.a(strB2) == null)) {
                            arrayList2.add(strB2);
                            arrayList2.add(qm4.K0(strE2).toString());
                        }
                    }
                    int size3 = tl1Var8.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        String strB3 = tl1Var8.b(i15);
                        if (!"Content-Length".equalsIgnoreCase(strB3) && !"Content-Encoding".equalsIgnoreCase(strB3) && !"Content-Type".equalsIgnoreCase(strB3) && j51.C(strB3)) {
                            String strE3 = tl1Var8.e(i15);
                            arrayList2.add(strB3);
                            arrayList2.add(qm4.K0(strE3).toString());
                        }
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                    strArr.getClass();
                    sl1 sl1Var = new sl1();
                    ArrayList arrayList3 = sl1Var.a;
                    arrayList3.getClass();
                    List listAsList = Arrays.asList(strArr);
                    listAsList.getClass();
                    arrayList3.addAll(listAsList);
                    j14VarF9.f = sl1Var;
                    j14VarF9.k = k14VarB2.x;
                    j14VarF9.l = k14VarB2.y;
                    k14 k14VarM5 = xl.M(k14Var3);
                    xl.i("cacheResponse", k14VarM5);
                    j14VarF9.i = k14VarM5;
                    k14 k14VarM6 = xl.M(k14VarB2);
                    xl.i("networkResponse", k14VarM6);
                    j14VarF9.h = k14VarM6;
                    k14VarA2 = j14VarF9.a();
                    k14VarB2.t.close();
                    hx hxVar4 = (hx) this.b;
                    hxVar4.getClass();
                    synchronized (hxVar4) {
                    }
                    ((hx) this.b).getClass();
                    fx fxVar3 = new fx(k14VarA2);
                    n14 n14Var2 = k14Var3.t;
                    n14Var2.getClass();
                    fr0 fr0Var = ((ex) n14Var2).n;
                    try {
                        llVarJ2 = fr0Var.q.j(fr0Var.n, fr0Var.o);
                        if (llVarJ2 != null) {
                            try {
                                fxVar3.c(llVarJ2);
                                llVarJ2.b();
                                break;
                            } catch (IOException unused7) {
                                if (llVarJ2 != null) {
                                    try {
                                        llVarJ2.a();
                                        break;
                                    } catch (IOException unused8) {
                                    }
                                }
                            }
                        }
                    } catch (IOException unused9) {
                        llVarJ2 = null;
                    }
                    return k14VarA2;
                } catch (Throwable th) {
                    if (k14Var != null) {
                        xe5.b(k14Var.t);
                    }
                    throw th;
                }
            case 2:
                oz3 oz3Var9 = ev3Var.e;
                ArrayList arrayList4 = (ArrayList) this.b;
                int size4 = arrayList4.size();
                int i16 = 0;
                IOException iOException = null;
                while (i16 < size4) {
                    int i17 = i16 + 1;
                    String str12 = (String) arrayList4.get(i16);
                    nz3 nz3VarA6 = oz3Var9.a();
                    fr1 fr1VarG = oz3Var9.a.g();
                    fr1VarG.d(str12);
                    nz3VarA6.a = fr1VarG.b();
                    try {
                        return ev3Var.b(new oz3(nz3VarA6));
                    } catch (IOException e) {
                        StringBuilder sbJ = xa3.j("Mirror ", str12, " failed: ");
                        sbJ.append(e.getMessage());
                        Log.w("RadioBrowserClient", sbJ.toString());
                        iOException = e;
                        i16 = i17;
                    }
                }
                if (iOException != null) {
                    throw iOException;
                }
                throw new IOException("All radio-browser mirrors failed");
            default:
                oz3 oz3Var10 = ev3Var.e;
                bv3 bv3Var = ev3Var.a;
                List listF0 = u01.n;
                k14 k14VarA4 = null;
                int i18 = 0;
                oz3 oz3VarB = oz3Var10;
                while (true) {
                    boolean z2 = true;
                    while (true) {
                        oz3VarB.getClass();
                        if (bv3Var.w == null) {
                            synchronized (bv3Var) {
                                try {
                                    if (bv3Var.y) {
                                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                    }
                                    if (bv3Var.x) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (z2) {
                                o83 o83Var = bv3Var.n;
                                gr4 gr4Var = o83Var.D;
                                dv3 dv3Var = bv3Var.p;
                                int i19 = o83Var.y;
                                int i20 = o83Var.z;
                                int i21 = ev3Var.f;
                                int i22 = ev3Var.g;
                                boolean z3 = o83Var.e;
                                boolean z4 = o83Var.f;
                                gr1 gr1Var5 = oz3VarB.a;
                                gr1Var5.getClass();
                                if (gr1Var5.f()) {
                                    SSLSocketFactory sSLSocketFactory2 = o83Var.p;
                                    if (sSLSocketFactory2 != null) {
                                        m83 m83Var2 = o83Var.t;
                                        o00Var = o83Var.u;
                                        sSLSocketFactory = sSLSocketFactory2;
                                        m83Var = m83Var2;
                                    } else {
                                        kf2.o("CLEARTEXT-only client");
                                    }
                                } else {
                                    sSLSocketFactory = null;
                                    m83Var = null;
                                    o00Var = null;
                                }
                                gv3 gv3Var = new gv3(gr4Var, dv3Var, i19, i20, i21, i22, z3, z4, new f6(gr1Var5.d, gr1Var5.e, o83Var.l, o83Var.o, sSLSocketFactory, m83Var, o00Var, o83Var.n, o83Var.s, o83Var.r, o83Var.m), bv3Var.n.C, new hy(bv3Var, bv3Var.p.a, ev3Var));
                                o83 o83Var2 = bv3Var.n;
                                bv3Var.t = o83Var2.f ? new lr0(gv3Var, o83Var2.D) : new om1(23, gv3Var);
                            }
                            try {
                                if (bv3Var.A) {
                                    throw new IOException("Canceled");
                                }
                                try {
                                } catch (IOException e2) {
                                    if (!c(e2, bv3Var, oz3VarB, !(e2 instanceof ConnectionShutdownException))) {
                                        Iterator it2 = listF0.iterator();
                                        while (it2.hasNext()) {
                                            j51.d(e2, (Exception) it2.next());
                                        }
                                        throw e2;
                                    }
                                    listF0 = q40.F0(e2, listF0);
                                    bv3Var.d(true);
                                    z2 = false;
                                }
                            } catch (Throwable th3) {
                                bv3Var.d(true);
                                throw th3;
                            }
                        } else {
                            kf2.o("Check failed.");
                        }
                        break;
                    }
                    j14 j14VarF10 = ev3Var.b(oz3VarB).f();
                    j14VarF10.a = oz3VarB;
                    j14VarF10.j = k14VarA4 != null ? xl.M(k14VarA4) : null;
                    k14VarA4 = j14VarF10.a();
                    y10 y10Var = bv3Var.w;
                    oz3VarB = b(k14VarA4, y10Var);
                    if (oz3VarB == null) {
                        if (y10Var != null && y10Var.b) {
                            if (bv3Var.v) {
                                throw new IllegalStateException("Check failed.");
                            }
                            bv3Var.v = true;
                            bv3Var.q.i();
                        }
                        z = false;
                    } else {
                        z = false;
                        tz3 tz3Var2 = oz3VarB.d;
                        if (tz3Var2 == null || !tz3Var2.isOneShot()) {
                            xe5.b(k14VarA4.t);
                            i18++;
                            if (i18 > 20) {
                                throw new ProtocolException("Too many follow-up requests: " + i18);
                            }
                            bv3Var.d(true);
                        }
                    }
                    bv3Var.d(z);
                    return k14VarA4;
                }
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x013f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0152  */
    /* JADX WARN: Code duplicated, block: B:113:0x0159  */
    /* JADX WARN: Code duplicated, block: B:116:0x0176  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:88:0x010f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x0133  */
    public oz3 b(k14 k14Var, y10 y10Var) throws ProtocolException {
        o83 o83Var;
        String strA;
        oz3 oz3Var;
        fr1 fr1Var;
        gr1 gr1VarB;
        nz3 nz3VarA;
        boolean z;
        tz3 tz3Var;
        k14 k14Var2;
        o34 o34Var = y10Var != null ? y10Var.e().d : null;
        int i = k14Var.q;
        oz3 oz3Var2 = k14Var.n;
        String str = oz3Var2.b;
        if (i == 307 || i == 308) {
            o83Var = (o83) this.b;
            if (o83Var.h) {
                strA = k14Var.s.a("Location");
                if (strA == null) {
                    strA = null;
                }
                oz3Var = k14Var.n;
                if (strA != null) {
                    gr1 gr1Var = oz3Var.a;
                    gr1Var.getClass();
                    try {
                        fr1Var = new fr1();
                        fr1Var.e(gr1Var, strA);
                    } catch (IllegalArgumentException unused) {
                        fr1Var = null;
                    }
                    if (fr1Var != null) {
                        gr1VarB = fr1Var.b();
                    } else {
                        gr1VarB = null;
                    }
                    if (gr1VarB != null && (h12.c(gr1VarB.a, oz3Var.a.a) || o83Var.i)) {
                        nz3VarA = oz3Var.a();
                        if (gb.T(str)) {
                            int i2 = k14Var.q;
                            z = !str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (!str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                nz3VarA.b(str, z ? oz3Var.d : null);
                            } else {
                                nz3VarA.b("GET", null);
                            }
                            if (!z) {
                                nz3VarA.c.e("Transfer-Encoding");
                                nz3VarA.c.e("Content-Length");
                                nz3VarA.c.e("Content-Type");
                            }
                        }
                        if (!ze5.a(oz3Var.a, gr1VarB)) {
                            nz3VarA.c.e("Authorization");
                        }
                        nz3VarA.a = gr1VarB;
                        return new oz3(nz3VarA);
                    }
                }
            }
        } else {
            if (i == 401) {
                ((o83) this.b).g.getClass();
                return null;
            }
            if (i == 421) {
                tz3 tz3Var2 = oz3Var2.d;
                if ((tz3Var2 == null || !tz3Var2.isOneShot()) && y10Var != null && !h12.c(((s21) y10Var.e).d().n().h.d, ((r21) y10Var.f).h().h().a.h.d)) {
                    cv3 cv3VarE = y10Var.e();
                    synchronized (cv3VarE) {
                        cv3VarE.n = true;
                    }
                    return k14Var.n;
                }
            } else if (i == 503) {
                k14 k14Var3 = k14Var.w;
                if ((k14Var3 == null || k14Var3.q != 503) && d(k14Var, Integer.MAX_VALUE) == 0) {
                    return k14Var.n;
                }
            } else {
                if (i == 407) {
                    o34Var.getClass();
                    if (o34Var.b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    ((o83) this.b).n.getClass();
                    return null;
                }
                if (i != 408) {
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            o83Var = (o83) this.b;
                            if (o83Var.h) {
                                strA = k14Var.s.a("Location");
                                if (strA == null) {
                                    strA = null;
                                }
                                oz3Var = k14Var.n;
                                if (strA != null) {
                                    gr1 gr1Var2 = oz3Var.a;
                                    gr1Var2.getClass();
                                    fr1Var = new fr1();
                                    fr1Var.e(gr1Var2, strA);
                                    if (fr1Var != null) {
                                        gr1VarB = fr1Var.b();
                                    } else {
                                        gr1VarB = null;
                                    }
                                    if (gr1VarB != null) {
                                        nz3VarA = oz3Var.a();
                                        if (gb.T(str)) {
                                            int i3 = k14Var.q;
                                            if (str.equals("PROPFIND")) {
                                            }
                                            if (str.equals("PROPFIND")) {
                                                nz3VarA.b(str, z ? oz3Var.d : null);
                                            } else {
                                                nz3VarA.b(str, z ? oz3Var.d : null);
                                            }
                                            if (!z) {
                                                nz3VarA.c.e("Transfer-Encoding");
                                                nz3VarA.c.e("Content-Length");
                                                nz3VarA.c.e("Content-Type");
                                            }
                                        }
                                        if (!ze5.a(oz3Var.a, gr1VarB)) {
                                            nz3VarA.c.e("Authorization");
                                        }
                                        nz3VarA.a = gr1VarB;
                                        return new oz3(nz3VarA);
                                    }
                                }
                            }
                        default:
                            return null;
                    }
                } else if (((o83) this.b).e && (((tz3Var = oz3Var2.d) == null || !tz3Var.isOneShot()) && (((k14Var2 = k14Var.w) == null || k14Var2.q != 408) && d(k14Var, 0) <= 0))) {
                    return k14Var.n;
                }
            }
        }
        return null;
    }

    public boolean c(IOException iOException, bv3 bv3Var, oz3 oz3Var, boolean z) {
        tz3 tz3Var;
        if (!((o83) this.b).e) {
            return false;
        }
        if ((z && (((tz3Var = oz3Var.d) != null && tz3Var.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        y10 y10Var = bv3Var.B;
        if (y10Var == null || !y10Var.c) {
            return false;
        }
        s21 s21Var = bv3Var.t;
        s21Var.getClass();
        r34 r34VarD = s21Var.d();
        y10 y10Var2 = bv3Var.B;
        return r34VarD.m(y10Var2 != null ? y10Var2.e() : null);
    }

    public /* synthetic */ xu(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public xu(o83 o83Var) {
        this.a = 3;
        o83Var.getClass();
        this.b = o83Var;
    }
}
