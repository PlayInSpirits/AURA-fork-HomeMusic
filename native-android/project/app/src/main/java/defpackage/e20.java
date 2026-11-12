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

    public e20(l51 r3, long r4) {
        this.n = 5;
        this.p = r3;
        if (r3.getPosition() < r4) goto L5;
        boolean r5 = true;
    L6:
        rr2.l(r5);
        this.o = r4;
        return;
    L5:
        r5 = false;
        goto L6
    }

    public static long u(e20 r6, long r7, float r9) {
        long r8 = g83.e(r6.o, r7);
        r6.o = r8;
        if (((hb3) r6.p) != null) goto L5;
        float r10 = g83.c(r8);
    L7:
        if (r10 > 0.0f) goto L9;
        return 9205357640488583168L;
    L9:
        if (r10 < r9) goto L27;
        hb3 r11 = (hb3) r6.p;
        long r0 = r6.o;
        if (r11 != null) goto L14;
        float r12 = g83.c(r0);
        float r4 = Float.intBitsToFloat((int) (r0 >> 32)) / r12;
        float r1 = Float.intBitsToFloat((int) (r0 & 4294967295L)) / r12;
        return g83.d(r6.o, g83.f((Float.floatToRawIntBits(r4) << 32) | (Float.floatToRawIntBits(r1) & 4294967295L), r9));
    L14:
        float r13 = r6.x(r0) - (Math.signum(r6.x(r6.o)) * r9);
        long r2 = r6.o;
        hb3 r14 = (hb3) r6.p;
        hb3 r5 = hb3.o;
        if (r14 != r5) goto L18;
        long r3 = r2 & 4294967295L;
    L17:
        float r15 = Float.intBitsToFloat((int) r3);
        if (((hb3) r6.p) == r5) goto L22;
        long r16 = Float.floatToRawIntBits(r15);
        return (((long) Float.floatToRawIntBits(r13)) & 4294967295L) | (r16 << 32);
    L22:
        return (Float.floatToRawIntBits(r13) << 32) | (((long) Float.floatToRawIntBits(r15)) & 4294967295L);
    L18:
        r3 = r2 >> 32;
        goto L17
    L27:
        return 9205357640488583168L;
    L5:
        r10 = Math.abs(r6.x(r8));
        goto L7
    }

    public void A(int r5) {
        if (r5 < 64) goto L6;
        r();
        ((e20) this.p).A(r5 - 64);
        return;
    L6:
        this.o |= 1 << r5;
    }

    @Override // defpackage.l51
    public boolean a(byte[] r1, int r2, int r3, boolean r4) {
        return ((l51) this.p).a(r1, 0, r3, r4);
    }

    @Override // defpackage.l51
    public boolean d(int r1, boolean r2) {
        return ((l51) this.p).d(r1, true);
    }

    @Override // defpackage.l51
    public boolean e(byte[] r1, int r2, int r3, boolean r4) {
        return ((l51) this.p).e(r1, r2, r3, r4);
    }

    @Override // defpackage.l51
    public long f() {
        return ((l51) this.p).f() - this.o;
    }

    @Override // defpackage.l51
    public void g(int r1) {
        ((l51) this.p).g(r1);
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
    public int h(int r1) {
        return ((l51) this.p).h(r1);
    }

    @Override // defpackage.l51
    public int i(byte[] r1, int r2, int r3) {
        return ((l51) this.p).i(r1, r2, r3);
    }

    @Override // defpackage.l51
    public void k() {
        ((l51) this.p).k();
    }

    @Override // defpackage.l51
    public void l(int r1) {
        ((l51) this.p).l(r1);
    }

    @Override // defpackage.l51
    public void n(byte[] r1, int r2, int r3) {
        ((l51) this.p).n(r1, r2, r3);
    }

    public void o(int r5) {
        if (r5 < 64) goto L8;
        e20 r4 = (e20) this.p;
        if (r4 == null) goto L10;
        r4.o(r5 - 64);
        return;
    L10:
        return;
    L8:
        this.o &= ~(1 << r5);
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r3, Throwable r4) {
        StringBuilder r5 = new StringBuilder("createBookmark id=");
        r5.append((String) this.p);
        r5.append(" pos=");
        Log.e("QueueRepository", b11.p(r5, this.o, " failed"), r4);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r5, Response r6) {
        String r0 = "";
        if (r6.body() != null) goto L5;
    L9:
        String r7 = "unknown";
    L11:
        if (r6.isSuccessful() == true) goto L13;
    L16:
        Log.w("QueueRepository", "createBookmark id=" + ((String) this.p) + " pos=" + this.o + " -> HTTP " + r6.code() + " subsonicStatus=" + r7 + " " + r0);
        return;
    L13:
        if ("ok".equals(r7) == false) goto L16;
        return;
    L5:
        if (((ApiResponse) r6.body()).getSubsonicResponse() == null) goto L9;
        r7 = String.valueOf(((ApiResponse) r6.body()).getSubsonicResponse().getStatus());
        if (((ApiResponse) r6.body()).getSubsonicResponse().getError() == null) goto L11;
        r0 = ((ApiResponse) r6.body()).getSubsonicResponse().getError().getMessage();
        goto L11
    }

    @Override // defpackage.m51
    public void p() {
        ((m51) this.p).p();
    }

    public int q(int r7) {
        e20 r0 = (e20) this.p;
        if (r0 != null) goto L10;
        long r4 = this.o;
        if (r7 < 64) goto L9;
        return Long.bitCount(r4);
    L9:
        return Long.bitCount(((1 << r7) - 1) & r4);
    L10:
        if (r7 >= 64) goto L13;
        long r1 = this.o;
        return Long.bitCount(((1 << r7) - 1) & r1);
    L13:
        int r8 = r0.q(r7 - 64);
        return Long.bitCount(this.o) + r8;
    }

    public void r() {
        if (((e20) this.p) != null) goto L6;
        this.p = new e20();
        return;
    }

    @Override // defpackage.wh0
    public int read(byte[] r1, int r2, int r3) {
        return ((l51) this.p).read(r1, r2, r3);
    }

    @Override // defpackage.l51
    public void readFully(byte[] r1, int r2, int r3) {
        ((l51) this.p).readFully(r1, r2, r3);
    }

    public boolean s(int r5) {
        if (r5 < 64) goto L6;
        r();
        return ((e20) this.p).s(r5 - 64);
    L6:
        long r0 = this.o;
        if (((1 << r5) & r0) == 0) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.m51
    public wv4 t(int r1, int r2) {
        return ((m51) this.p).t(r1, r2);
    }

    public String toString() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        if (((e20) this.p) != null) goto L10;
        return Long.toBinaryString(this.o);
    L10:
        return ((e20) this.p).toString() + "xx" + Long.toBinaryString(this.o);
    }

    public void v(int r10, boolean r11) {
        if (r10 < 64) goto L6;
        r();
        ((e20) this.p).v(r10 - 64, r11);
        return;
    L6:
        long r0 = this.o;
        if ((Long.MIN_VALUE & r0) == 0) goto L9;
        boolean r2 = true;
    L10:
        long r7 = (1 << r10) - 1;
        this.o = ((r0 & (~r7)) << 1) | (r0 & r7);
        if (r11 == false) goto L13;
        A(r10);
    L14:
        if (r2 == false) goto L16;
    L19:
        r();
        ((e20) this.p).v(0, r2);
        return;
    L16:
        if (((e20) this.p) != null) goto L19;
        return;
    L13:
        o(r10);
        goto L14
    L9:
        r2 = false;
        goto L10
    }

    @Override // defpackage.m51
    public void w(m84 r3) {
        ((m51) this.p).w(new fl4(this, r3, r3));
    }

    public float x(long r3) {
        if (((hb3) this.p) != hb3.o) goto L7;
        long r2 = r3 >> 32;
    L6:
        return Float.intBitsToFloat((int) r2);
    L7:
        r2 = r3 & 4294967295L;
        goto L6
    }

    public boolean y(int r11) {
        if (r11 < 64) goto L6;
        r();
        return ((e20) this.p).y(r11 - 64);
    L6:
        long r2 = 1 << r11;
        long r4 = this.o;
        if ((r4 & r2) == 0) goto L9;
        boolean r12 = true;
    L10:
        long r5 = r4 & (~r2);
        this.o = r5;
        long r3 = r2 - 1;
        this.o = (r5 & r3) | Long.rotateRight((~r3) & r5, 1);
        e20 r0 = (e20) this.p;
        if (r0 != null) goto L13;
    L16:
        return r12;
    L13:
        if (r0.s(0) == false) goto L15;
        A(63);
    L15:
        ((e20) this.p).y(0);
        goto L16
    L9:
        r12 = false;
        goto L10
    }

    public void z() {
        this.o = 0;
        e20 r2 = (e20) this.p;
        if (r2 == null) goto L6;
        r2.z();
        return;
    }

    public e20(fw r3) {
        this.n = 1;
        r3.getClass();
        this.p = r3;
        this.o = 262144;
    }

    public /* synthetic */ e20(long r1, Object r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r3;
    }

    public e20(Context r3, String r4, long r5) {
        this.n = 2;
        rm3 r0 = new rm3(r3, r4, false);
        this.o = r5;
        this.p = r0;
    }

    public e20(String r2, long r3) {
        this.n = 4;
        this.p = r2;
        this.o = r3;
    }

    public e20() {
        this.n = 0;
        this.o = 0;
    }

    public e20(hb3 r1, int r2) {
        this.n = 7;
        this.p = r1;
        this.o = 0;
    }
}
