package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import com.eddyizm.tempus.subsonic.models.Child;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hq1 implements r21 {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;

    public hq1(o83 o83Var, q21 q21Var, fw fwVar, ew ewVar) {
        fwVar.getClass();
        ewVar.getClass();
        this.b = o83Var;
        this.c = q21Var;
        this.d = fwVar;
        this.e = ewVar;
        this.f = new e20(fwVar);
    }

    @Override // defpackage.r21
    public ej4 a(k14 k14Var) {
        if (!br1.a(k14Var)) {
            return k(0L);
        }
        String strA = k14Var.s.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            gr1 gr1Var = k14Var.n.a;
            if (this.a == 4) {
                this.a = 5;
                return new dq1(this, gr1Var);
            }
            nz2.e(this.a, "state: ");
            return null;
        }
        long jE = ze5.e(k14Var);
        if (jE != -1) {
            return k(jE);
        }
        if (this.a != 4) {
            nz2.e(this.a, "state: ");
            return null;
        }
        this.a = 5;
        ((q21) this.c).a();
        return new fq1(this);
    }

    @Override // defpackage.r21
    public void b(oz3 oz3Var) {
        oz3Var.getClass();
        Proxy.Type type = ((q21) this.c).h().b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(oz3Var.b);
        sb.append(' ');
        gr1 gr1Var = oz3Var.a;
        if (gr1Var.f() || type != Proxy.Type.HTTP) {
            String strB = gr1Var.b();
            String strD = gr1Var.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(gr1Var);
        }
        sb.append(" HTTP/1.1");
        n(oz3Var.c, sb.toString());
    }

    @Override // defpackage.r21
    public void c() {
        ((ew) this.e).flush();
    }

    @Override // defpackage.r21
    public void cancel() {
        ((q21) this.c).cancel();
    }

    @Override // defpackage.r21
    public long d(k14 k14Var) {
        if (!br1.a(k14Var)) {
            return 0L;
        }
        String strA = k14Var.s.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            return -1L;
        }
        return ze5.e(k14Var);
    }

    @Override // defpackage.r21
    public of4 e(oz3 oz3Var, long j) throws ProtocolException {
        oz3Var.getClass();
        tz3 tz3Var = oz3Var.d;
        if (tz3Var != null && tz3Var.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(oz3Var.c.a("Transfer-Encoding"))) {
            if (this.a == 1) {
                this.a = 2;
                return new cq1(this);
            }
            nz2.e(this.a, "state: ");
            return null;
        }
        if (j == -1) {
            kf2.o("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.a == 1) {
            this.a = 2;
            return new zn0(this);
        }
        nz2.e(this.a, "state: ");
        return null;
    }

    @Override // defpackage.r21
    public j14 f(boolean z) throws IOException {
        e20 e20Var = (e20) this.f;
        int i = this.a;
        if (i != 1 && i != 2 && i != 3) {
            nz2.e(this.a, "state: ");
            return null;
        }
        try {
            String strT = ((fw) e20Var.p).t(e20Var.o);
            e20Var.o -= (long) strT.length();
            ue1 ue1VarC = hw.C(strT);
            int i2 = ue1VarC.o;
            j14 j14Var = new j14();
            j14Var.b = (pr3) ue1VarC.p;
            j14Var.c = i2;
            j14Var.d = (String) ue1VarC.q;
            sl1 sl1Var = new sl1();
            while (true) {
                String strT2 = ((fw) e20Var.p).t(e20Var.o);
                e20Var.o -= (long) strT2.length();
                if (strT2.length() == 0) {
                    break;
                }
                sl1Var.b(strT2);
            }
            j14Var.f = sl1Var.c().d();
            j14Var.n = gq1.o;
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.a = 3;
                return j14Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.a = 4;
                return j14Var;
            }
            this.a = 3;
            return j14Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(((q21) this.c).h().a.h.i()), e);
        }
    }

    @Override // defpackage.r21
    public void g() {
        ((ew) this.e).flush();
    }

    @Override // defpackage.r21
    public q21 h() {
        return (q21) this.c;
    }

    @Override // defpackage.r21
    public tl1 i() {
        if (this.a == 6) {
            tl1 tl1Var = (tl1) this.g;
            return tl1Var == null ? ze5.a : tl1Var;
        }
        kf2.o("too early; can't read the trailers yet");
        return null;
    }

    public void j() {
        int iA = ((h04) this.d).a((Context) this.b);
        if (this.a != iA) {
            this.a = iA;
            ((lt0) ((cn) this.c).o).b(this, iA);
        }
    }

    public eq1 k(long j) {
        if (this.a == 4) {
            this.a = 5;
            return new eq1(this, j);
        }
        nz2.e(this.a, "state: ");
        return null;
    }

    public void l() {
        im3 im3Var = (im3) this.g;
        k03 k03Var = im3Var.j;
        List list = (List) k03Var.d();
        ArrayList arrayList = (ArrayList) this.b;
        if (list == arrayList) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.add(this.a, (Child) this.f);
            k03Var.k(arrayList2);
        }
        im3.c(im3Var, (String) this.c, true);
        ((ew4) this.e).o();
    }

    public int m() {
        h04 h04Var = (h04) this.d;
        Context context = (Context) this.b;
        this.a = h04Var.a(context);
        IntentFilter intentFilter = new IntentFilter();
        int i = h04Var.n;
        if ((i & 1) != 0) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            connectivityManager.getClass();
            j04 j04Var = new j04(this);
            this.g = j04Var;
            connectivityManager.registerDefaultNetworkCallback(j04Var);
        }
        if ((i & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((i & 4) != 0) {
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        if ((i & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        v9 v9Var = new v9(10, this);
        this.f = v9Var;
        context.registerReceiver(v9Var, intentFilter, null, (Handler) this.e);
        return this.a;
    }

    public void n(tl1 tl1Var, String str) {
        ew ewVar = (ew) this.e;
        tl1Var.getClass();
        if (this.a != 0) {
            nz2.e(this.a, "state: ");
            return;
        }
        ewVar.y(str).y("\r\n");
        int size = tl1Var.size();
        for (int i = 0; i < size; i++) {
            ewVar.y(tl1Var.b(i)).y(": ").y(tl1Var.e(i)).y("\r\n");
        }
        ewVar.y("\r\n");
        this.a = 1;
    }

    public hq1(Context context, cn cnVar, h04 h04Var) {
        this.b = context.getApplicationContext();
        this.c = cnVar;
        this.d = h04Var;
        this.e = f35.q(null);
    }

    public hq1(im3 im3Var, ArrayList arrayList, String str, List list, int i, ew4 ew4Var, Child child) {
        this.g = im3Var;
        this.b = arrayList;
        this.c = str;
        this.d = list;
        this.a = i;
        this.e = ew4Var;
        this.f = child;
    }
}
