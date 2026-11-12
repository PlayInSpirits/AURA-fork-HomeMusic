package defpackage;

import android.content.Context;
import android.util.Log;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e20 implements Callback, l51, m51 {
    public final /* synthetic */ int n;
    public long o;
    public Object p;

    public e20(l51 l51Var, long j) {
        this.n = 5;
        this.p = l51Var;
        rr2.l(l51Var.getPosition() >= j);
        this.o = j;
    }

    public static long u(e20 e20Var, long j, float f) {
        long jE = g83.e(e20Var.o, j);
        e20Var.o = jE;
        float fC = ((hb3) e20Var.p) == null ? g83.c(jE) : Math.abs(e20Var.x(jE));
        if (fC <= 0.0f || fC < f) {
            return 9205357640488583168L;
        }
        hb3 hb3Var = (hb3) e20Var.p;
        long j2 = e20Var.o;
        if (hb3Var == null) {
            float fC2 = g83.c(j2);
            return g83.d(e20Var.o, g83.f((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / fC2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / fC2)) & 4294967295L), f));
        }
        float fX = e20Var.x(j2) - (Math.signum(e20Var.x(e20Var.o)) * f);
        long j3 = e20Var.o;
        hb3 hb3Var2 = (hb3) e20Var.p;
        hb3 hb3Var3 = hb3.o;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (hb3Var2 == hb3Var3 ? j3 & 4294967295L : j3 >> 32));
        if (((hb3) e20Var.p) == hb3Var3) {
            return (((long) Float.floatToRawIntBits(fX)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fX)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }

    public void A(int i) {
        if (i < 64) {
            this.o |= 1 << i;
        } else {
            r();
            ((e20) this.p).A(i - 64);
        }
    }

    @Override // defpackage.l51
    public boolean a(byte[] bArr, int i, int i2, boolean z) {
        return ((l51) this.p).a(bArr, 0, i2, z);
    }

    @Override // defpackage.l51
    public boolean d(int i, boolean z) {
        return ((l51) this.p).d(i, true);
    }

    @Override // defpackage.l51
    public boolean e(byte[] bArr, int i, int i2, boolean z) {
        return ((l51) this.p).e(bArr, i, i2, z);
    }

    @Override // defpackage.l51
    public long f() {
        return ((l51) this.p).f() - this.o;
    }

    @Override // defpackage.l51
    public void g(int i) {
        ((l51) this.p).g(i);
    }

    @Override // defpackage.l51
    public long getLength() {
        return ((l51) this.p).getLength() - this.o;
    }

    @Override // defpackage.l51
    public long getPosition() {
        return ((l51) this.p).getPosition() - this.o;
    }

    @Override // defpackage.l51
    public int h(int i) {
        return ((l51) this.p).h(i);
    }

    @Override // defpackage.l51
    public int i(byte[] bArr, int i, int i2) {
        return ((l51) this.p).i(bArr, i, i2);
    }

    @Override // defpackage.l51
    public void k() {
        ((l51) this.p).k();
    }

    @Override // defpackage.l51
    public void l(int i) {
        ((l51) this.p).l(i);
    }

    @Override // defpackage.l51
    public void n(byte[] bArr, int i, int i2) {
        ((l51) this.p).n(bArr, i, i2);
    }

    public void o(int i) {
        if (i < 64) {
            this.o &= ~(1 << i);
            return;
        }
        e20 e20Var = (e20) this.p;
        if (e20Var != null) {
            e20Var.o(i - 64);
        }
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        StringBuilder sb = new StringBuilder("createBookmark id=");
        sb.append((String) this.p);
        sb.append(" pos=");
        Log.e("QueueRepository", b11.p(sb, this.o, " failed"), th);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        String strValueOf;
        String message = "";
        if (response.body() == null || ((ApiResponse) response.body()).getSubsonicResponse() == null) {
            strValueOf = "unknown";
        } else {
            strValueOf = String.valueOf(((ApiResponse) response.body()).getSubsonicResponse().getStatus());
            if (((ApiResponse) response.body()).getSubsonicResponse().getError() != null) {
                message = ((ApiResponse) response.body()).getSubsonicResponse().getError().getMessage();
            }
        }
        if (response.isSuccessful() && "ok".equals(strValueOf)) {
            return;
        }
        Log.w("QueueRepository", "createBookmark id=" + ((String) this.p) + " pos=" + this.o + " -> HTTP " + response.code() + " subsonicStatus=" + strValueOf + " " + message);
    }

    @Override // defpackage.m51
    public void p() {
        ((m51) this.p).p();
    }

    public int q(int i) {
        e20 e20Var = (e20) this.p;
        if (e20Var == null) {
            long j = this.o;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.o);
        }
        return Long.bitCount(this.o) + e20Var.q(i - 64);
    }

    public void r() {
        if (((e20) this.p) == null) {
            this.p = new e20();
        }
    }

    @Override // defpackage.wh0
    public int read(byte[] bArr, int i, int i2) {
        return ((l51) this.p).read(bArr, i, i2);
    }

    @Override // defpackage.l51
    public void readFully(byte[] bArr, int i, int i2) {
        ((l51) this.p).readFully(bArr, i, i2);
    }

    public boolean s(int i) {
        if (i < 64) {
            return ((1 << i) & this.o) != 0;
        }
        r();
        return ((e20) this.p).s(i - 64);
    }

    @Override // defpackage.m51
    public wv4 t(int i, int i2) {
        return ((m51) this.p).t(i, i2);
    }

    public String toString() {
        switch (this.n) {
            case 0:
                if (((e20) this.p) == null) {
                    return Long.toBinaryString(this.o);
                }
                return ((e20) this.p).toString() + "xx" + Long.toBinaryString(this.o);
            default:
                return super.toString();
        }
    }

    public void v(int i, boolean z) {
        if (i >= 64) {
            r();
            ((e20) this.p).v(i - 64, z);
            return;
        }
        long j = this.o;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.o = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            A(i);
        } else {
            o(i);
        }
        if (z2 || ((e20) this.p) != null) {
            r();
            ((e20) this.p).v(0, z2);
        }
    }

    @Override // defpackage.m51
    public void w(m84 m84Var) {
        ((m51) this.p).w(new fl4(this, m84Var, m84Var));
    }

    public float x(long j) {
        return Float.intBitsToFloat((int) (((hb3) this.p) == hb3.o ? j >> 32 : j & 4294967295L));
    }

    public boolean y(int i) {
        if (i >= 64) {
            r();
            return ((e20) this.p).y(i - 64);
        }
        long j = 1 << i;
        long j2 = this.o;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.o = j3;
        long j4 = j - 1;
        this.o = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        e20 e20Var = (e20) this.p;
        if (e20Var != null) {
            if (e20Var.s(0)) {
                A(63);
            }
            ((e20) this.p).y(0);
        }
        return z;
    }

    public void z() {
        this.o = 0L;
        e20 e20Var = (e20) this.p;
        if (e20Var != null) {
            e20Var.z();
        }
    }

    public e20(fw fwVar) {
        this.n = 1;
        fwVar.getClass();
        this.p = fwVar;
        this.o = 262144L;
    }

    public /* synthetic */ e20(long j, Object obj, int i) {
        this.n = i;
        this.o = j;
        this.p = obj;
    }

    public e20(Context context, String str, long j) {
        this.n = 2;
        rm3 rm3Var = new rm3(context, str, false);
        this.o = j;
        this.p = rm3Var;
    }

    public e20(String str, long j) {
        this.n = 4;
        this.p = str;
        this.o = j;
    }

    public e20() {
        this.n = 0;
        this.o = 0L;
    }

    public e20(hb3 hb3Var, int i) {
        this.n = 7;
        this.p = hb3Var;
        this.o = 0L;
    }
}
