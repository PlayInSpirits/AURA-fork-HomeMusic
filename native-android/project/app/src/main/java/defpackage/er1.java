package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import androidx.preference.Preference;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.lan.LanPlaybackActivity;
import com.eddyizm.tempus.ui.login.LoginActivity;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class er1 implements bp3, kv1, r83, gz0, md4, wc0, ik2, qc2, lm2, eg1, yr2 {
    public final /* synthetic */ int n;

    public /* synthetic */ er1(int r1) {
        this.n = r1;
    }

    public static /* synthetic */ void a() {
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void h(int r2, int r3) {
        throw new IndexOutOfBoundsException("position=" + r2 + ", limit=" + r3);
    }

    public static /* synthetic */ void j(Object r1, Object r2, String r3) {
        throw new IllegalStateException(r3 + r1 + r2);
    }

    public static /* synthetic */ void k(Object r1, String r2) {
        throw new IllegalArgumentException((r2 + r1 + '\"').toString());
    }

    public static /* synthetic */ void l(String r1) {
        throw new UnsupportedOperationException(r1);
    }

    public static /* synthetic */ void m(Throwable r1) {
        throw new RuntimeException(r1);
    }

    public static /* synthetic */ void n() {
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void o(Object r2, String r3) {
        throw new IllegalStateException(r3 + r2);
    }

    public static void p(int r34, String r35, boolean r36, String r37, String r38, boolean r39) {
        rs1 r2 = rs1.a;
        if (r34 != 0) goto L5;
        int r3 = -1;
    L7:
        if (r3 != 1) goto L9;
        String r4 = "track";
    L18:
        if (r34 == 1) goto L20;
    L25:
        String r24 = null;
    L26:
        ih3 r8 = PlayEvent.Companion;
        r35.getClass();
        r37.getClass();
        String r17 = rs1.f();
        long r9 = System.currentTimeMillis();
        if (r34 != 1) goto L29;
        String r16 = rs1.c(r35);
    L30:
        if (r34 != 1) goto L34;
        k62 r11 = (k62) rs1.o.get(r35);
        if (r11 == null) goto L34;
        String r30 = r11.a;
    L35:
        if (r34 != 1) goto L39;
        k62 r0 = (k62) rs1.o.get(r35);
        if (r0 == null) goto L39;
        String r31 = r0.b;
    L40:
        r8.getClass();
        boolean r1 = xm4.k0(r35, "hub:", false);
        String r10 = ih3.a(r9);
        if (r36 == false) goto L44;
        String r12 = PlayEvent.LIKE;
    L43:
        String r13 = r12;
        if (r1 == false) goto L47;
        String r14 = qm4.z0(r35, "hub:");
    L48:
        if (r1 == false) goto L50;
    L52:
        String r15 = null;
    L53:
        if (r1 == false) goto L55;
    L57:
        String r19 = null;
    L58:
        if (r1 == false) goto L60;
    L62:
        String r20 = null;
    L63:
        String r18 = r4;
        rs1.j(new PlayEvent(r37, r10, r13, r14, r15, null, null, r16, r17, r18, r19, r20, null, r38, r39, r24, null, null, null, null, null, r30, r31, 2031712, null));
        return;
    L60:
        if (r4.equals("artist") == false) goto L62;
        r20 = r35;
        goto L63
    L55:
        if (r4.equals("album") == false) goto L57;
        r19 = r35;
        goto L58
    L50:
        if (r4.equals("track") == false) goto L52;
        r15 = r35;
        goto L53
    L47:
        r14 = null;
        goto L48
    L44:
        r12 = PlayEvent.UNLIKE;
    L39:
        r31 = null;
    L34:
        r30 = null;
        goto L35
    L29:
        r16 = r4;
        goto L30
    L20:
        if (ot1.c(r35) == false) goto L25;
        b00 r21 = b00.a;
        String r22 = b00.a();
        if (r22 != null) goto L24;
        return;
    L24:
        r24 = r22;
        goto L26
    L9:
        if (r3 != 2) goto L11;
        r4 = "album";
        goto L18
    L11:
        if (r3 != 3) goto L13;
        r4 = "artist";
        goto L18
    L13:
        n();
        return;
    L5:
        r3 = qs1.a[xa3.w(r34)];
        goto L7
    }

    @Override // defpackage.wc0
    public void accept(Object r1) {
        switch(this.n) {
            case 14: goto L8;
            case 15: goto L4;
            case 16: goto L6;
            default: goto L4;
        };
    L4:
        ((aj2) r1).getClass();
        return;
    L6:
        ((aj2) r1).getClass();
        return;
    L8:
        ((ExecutorService) r1).shutdown();
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object r7) {
        switch(this.n) {
            case 24: goto L25;
            case 25: goto L6;
            default: goto L4;
        };
    L4:
        Bundle r8 = (Bundle) r7;
        Uri r6 = (Uri) r8.getParcelable(fn2.h);
        r6.getClass();
        String r0 = r8.getString(fn2.i);
        String r1 = r8.getString(fn2.j);
        int r2 = r8.getInt(fn2.k, 0);
        int r3 = r8.getInt(fn2.l, 0);
        String r4 = r8.getString(fn2.m);
        String r9 = r8.getString(fn2.n);
        en2 r5 = new en2();
        r5.a = r6;
        r5.b = lw2.m(r0);
        r5.c = r1;
        r5.d = r2;
        r5.e = r3;
        r5.f = r4;
        r5.g = r9;
        return new fn2(r5);
    L6:
        fn2 r10 = (fn2) r7;
        r10.getClass();
        Bundle r11 = new Bundle();
        r11.putParcelable(fn2.h, r10.a);
        String r12 = r10.b;
        if (r12 == null) goto L9;
        r11.putString(fn2.i, r12);
    L9:
        String r13 = r10.c;
        if (r13 == null) goto L12;
        r11.putString(fn2.j, r13);
    L12:
        int r14 = r10.d;
        if (r14 == 0) goto L15;
        r11.putInt(fn2.k, r14);
    L15:
        int r15 = r10.e;
        if (r15 == 0) goto L18;
        r11.putInt(fn2.l, r15);
    L18:
        String r16 = r10.f;
        if (r16 == null) goto L21;
        r11.putString(fn2.m, r16);
    L21:
        String r17 = r10.g;
        if (r17 == null) goto L24;
        r11.putString(fn2.n, r17);
    L24:
        return r11;
    L25:
        fm4 r18 = (fm4) r7;
        r18.getClass();
        Bundle r19 = new Bundle();
        int r20 = r18.n;
        if (r20 == 0) goto L28;
        r19.putInt(fm4.q, r20);
    L28:
        int r21 = r18.o;
        if (r21 == 0) goto L31;
        r19.putInt(fm4.r, r21);
    L31:
        int r22 = r18.p;
        if (r22 == 0) goto L34;
        r19.putInt(fm4.s, r22);
    L34:
        return r19;
    }

    @Override // defpackage.md4
    public boolean b() {
        return false;
    }

    @Override // defpackage.lm2
    public void c(bm2 r3) {
        int r0 = 18;
        switch(this.n) {
            case 21: goto L9;
            case 22: goto L6;
            default: goto L4;
        };
    L4:
        sk2 r2 = r3.f1();
        sk2 r4 = r3.f1();
        Objects.requireNonNull(r4);
        r2.a1(new qa1(r0, r4));
        return;
    L6:
        r3.i.f(26, new mj0(r0));
        return;
    L9:
        if (r3.Y() == false) goto L17;
        sk2 r5 = r3.f1();
        r5.getClass();
        if (Looper.myLooper() != r5.f.getLooper()) goto L14;
        boolean r6 = true;
    L15:
        rr2.w(r6);
        r5.e.getClass();
        return;
    L14:
        r6 = false;
        goto L15
    }

    @Override // defpackage.kv1
    public boolean d(int r1, int r2, int r3, int r4, int r5) {
        return false;
    }

    @Override // defpackage.ik2
    public int e(Object r2) {
        String r1 = ((dk2) r2).a;
        if (r1.startsWith("OMX.google") == false) goto L5;
        return 1;
    L5:
        if (r1.startsWith("c2.android") == false) goto L8;
        return 1;
    L8:
        if (Build.VERSION.SDK_INT < 26) goto L10;
        return 0;
    L10:
        if (r1.equals("OMX.MTK.AUDIO.DECODER.RAW") == false) goto L17;
        return -1;
    L17:
        return 0;
    }

    @Override // defpackage.yr2
    public void f(er2 r1, int r2) {
        switch(this.n) {
            case 27: goto L8;
            case 28: goto L6;
            default: goto L4;
        };
    L4:
        r1.e(r2);
        return;
    L6:
        r1.getClass();
        return;
    L8:
        r1.getClass();
    }

    @Override // defpackage.bp3
    public boolean g(Preference r1, Object r2) {
        rr1.m();
        hw.i = null;
        return true;
    }

    @Override // defpackage.gz0
    public void i(EditText r2) {
        r2.getClass();
        r2.setSingleLine(true);
        r2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(40)});
        r2.setSelection(r2.getText().length());
    }

    @Override // defpackage.qc2
    public void invoke(Object r1) {
        switch(this.n) {
            case 19: goto L6;
            default: goto L4;
        };
    L4:
        ((oi3) r1).s(0.0f);
        return;
    L6:
        ((oi3) r1).v(1);
    }

    @Override // defpackage.r83
    public pb5 x(View r4, pb5 r5) {
        switch(this.n) {
            case 10: goto L6;
            default: goto L4;
        };
    L4:
        int r3 = LoginActivity.R;
        r4.getClass();
        vz1 r6 = r5.a.h(519);
        r6.getClass();
        r4.setPadding(r6.a, r6.b, r6.c, r6.d);
        return r5;
    L6:
        int r7 = LanPlaybackActivity.N;
        r4.getClass();
        vz1 r8 = r5.a.h(519);
        r8.getClass();
        r4.setPadding(r8.a, r8.b, r8.c, r8.d);
        return r5;
    }

    public /* synthetic */ er1(kj2 r1, String r2, int r3, jn2 r4, int r5) {
        this.n = r5;
    }
}
