package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fx {
    public static final String k;
    public static final String l;
    public final gr1 a;
    public final tl1 b;
    public final String c;
    public final pr3 d;
    public final int e;
    public final String f;
    public final tl1 g;
    public final jl1 h;
    public final long i;
    public final long j;

    static {
        qg3 qg3Var = qg3.a;
        qg3.a.getClass();
        k = "OkHttp-Sent-Millis";
        qg3.a.getClass();
        l = "OkHttp-Received-Millis";
    }

    public fx(ej4 ej4Var) throws IOException {
        gr1 gr1VarB;
        mu4 mu4VarM;
        ej4Var.getClass();
        try {
            xu3 xu3Var = new xu3(ej4Var);
            String strT = xu3Var.t(Long.MAX_VALUE);
            try {
                fr1 fr1Var = new fr1();
                fr1Var.e(null, strT);
                gr1VarB = fr1Var.b();
            } catch (IllegalArgumentException unused) {
                gr1VarB = null;
            }
            if (gr1VarB == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(strT));
                qg3 qg3Var = qg3.a;
                qg3.a.getClass();
                qg3.i("cache corruption", 5, iOException);
                throw iOException;
            }
            this.a = gr1VarB;
            this.c = xu3Var.t(Long.MAX_VALUE);
            sl1 sl1Var = new sl1();
            int iH = si0.H(xu3Var);
            for (int i = 0; i < iH; i++) {
                sl1Var.b(xu3Var.t(Long.MAX_VALUE));
            }
            this.b = sl1Var.c();
            ue1 ue1VarC = hw.C(xu3Var.t(Long.MAX_VALUE));
            this.d = (pr3) ue1VarC.p;
            this.e = ue1VarC.o;
            this.f = (String) ue1VarC.q;
            sl1 sl1Var2 = new sl1();
            int iH2 = si0.H(xu3Var);
            for (int i2 = 0; i2 < iH2; i2++) {
                sl1Var2.b(xu3Var.t(Long.MAX_VALUE));
            }
            String str = k;
            String strD = sl1Var2.d(str);
            String str2 = l;
            String strD2 = sl1Var2.d(str2);
            sl1Var2.e(str);
            sl1Var2.e(str2);
            this.i = strD != null ? Long.parseLong(strD) : 0L;
            this.j = strD2 != null ? Long.parseLong(strD2) : 0L;
            this.g = sl1Var2.c();
            if (this.a.f()) {
                String strT2 = xu3Var.t(Long.MAX_VALUE);
                if (strT2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strT2 + '\"');
                }
                v20 v20VarU = v20.b.u(xu3Var.t(Long.MAX_VALUE));
                List listA = a(xu3Var);
                List listA2 = a(xu3Var);
                if (xu3Var.l()) {
                    mu4VarM = mu4.t;
                } else {
                    xi4 xi4Var = mu4.o;
                    String strT3 = xu3Var.t(Long.MAX_VALUE);
                    xi4Var.getClass();
                    mu4VarM = xi4.m(strT3);
                }
                this.h = new jl1(mu4VarM, v20VarU, ze5.k(listA2), new hl1(ze5.k(listA), 0));
            } else {
                this.h = null;
            }
            ej4Var.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q05.h(ej4Var, th);
                throw th2;
            }
        }
    }

    public static List a(xu3 xu3Var) throws IOException {
        int iH = si0.H(xu3Var);
        if (iH == -1) {
            return u01.n;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iH);
            for (int i = 0; i < iH; i++) {
                String strT = xu3Var.t(Long.MAX_VALUE);
                tv tvVar = new tv();
                yw ywVar = yw.q;
                yw ywVarR = pa.r(strT);
                if (ywVarR == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                tvVar.X(ywVarR);
                arrayList.add(certificateFactory.generateCertificate(new rv(tvVar, 0)));
            }
            return arrayList;
        } catch (CertificateException e) {
            mj0.i(e.getMessage());
            return null;
        }
    }

    public static void b(wu3 wu3Var, List list) throws IOException {
        try {
            wu3Var.Q(list.size());
            wu3Var.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                yw ywVar = yw.q;
                encoded.getClass();
                wu3Var.y(pa.A(encoded).a());
                wu3Var.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            mj0.i(e.getMessage());
        }
    }

    public final void c(ll llVar) {
        gr1 gr1Var = this.a;
        jl1 jl1Var = this.h;
        tl1 tl1Var = this.g;
        tl1 tl1Var2 = this.b;
        wu3 wu3Var = new wu3(llVar.i(0));
        try {
            wu3Var.y(gr1Var.i);
            wu3Var.writeByte(10);
            wu3Var.y(this.c);
            wu3Var.writeByte(10);
            wu3Var.Q(tl1Var2.size());
            wu3Var.writeByte(10);
            int size = tl1Var2.size();
            for (int i = 0; i < size; i++) {
                wu3Var.y(tl1Var2.b(i));
                wu3Var.y(": ");
                wu3Var.y(tl1Var2.e(i));
                wu3Var.writeByte(10);
            }
            pr3 pr3Var = this.d;
            int i2 = this.e;
            String str = this.f;
            pr3Var.getClass();
            str.getClass();
            StringBuilder sb = new StringBuilder();
            if (pr3Var == pr3.p) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i2);
            sb.append(' ');
            sb.append(str);
            wu3Var.y(sb.toString());
            wu3Var.writeByte(10);
            wu3Var.Q(tl1Var.size() + 2);
            wu3Var.writeByte(10);
            int size2 = tl1Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                wu3Var.y(tl1Var.b(i3));
                wu3Var.y(": ");
                wu3Var.y(tl1Var.e(i3));
                wu3Var.writeByte(10);
            }
            wu3Var.y(k);
            wu3Var.y(": ");
            wu3Var.Q(this.i);
            wu3Var.writeByte(10);
            wu3Var.y(l);
            wu3Var.y(": ");
            wu3Var.Q(this.j);
            wu3Var.writeByte(10);
            if (gr1Var.f()) {
                wu3Var.writeByte(10);
                jl1Var.getClass();
                wu3Var.y(jl1Var.b.a);
                wu3Var.writeByte(10);
                b(wu3Var, jl1Var.a());
                b(wu3Var, jl1Var.c);
                wu3Var.y(jl1Var.a.n);
                wu3Var.writeByte(10);
            }
            wu3Var.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q05.h(wu3Var, th);
                throw th2;
            }
        }
    }

    public fx(k14 k14Var) {
        tl1 tl1VarC;
        oz3 oz3Var = k14Var.n;
        this.a = oz3Var.a;
        k14 k14Var2 = k14Var.u;
        k14Var2.getClass();
        tl1 tl1Var = k14Var2.n.c;
        tl1 tl1Var2 = k14Var.s;
        Set setU = si0.U(tl1Var2);
        if (setU.isEmpty()) {
            tl1VarC = ze5.a;
        } else {
            sl1 sl1Var = new sl1();
            int size = tl1Var.size();
            for (int i = 0; i < size; i++) {
                String strB = tl1Var.b(i);
                if (setU.contains(strB)) {
                    sl1Var.a(strB, tl1Var.e(i));
                }
            }
            tl1VarC = sl1Var.c();
        }
        this.b = tl1VarC;
        this.c = oz3Var.b;
        this.d = k14Var.o;
        this.e = k14Var.q;
        this.f = k14Var.p;
        this.g = tl1Var2;
        this.h = k14Var.r;
        this.i = k14Var.x;
        this.j = k14Var.y;
    }
}
