package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.AutoCompleteTextView;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.HubFragment;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.crash.CrashActivity;
import com.eddyizm.tempus.ui.fragment.LibraryFragment;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.internal.CheckableImageButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cn implements st, qc2, mn0, g3, ns, gz3, p5, ep3, ne4, np4, zd1, r83, lm2, yr2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ cn(va4 r2) {
        this.n = 29;
        Bundle r0 = Bundle.EMPTY;
        this.o = r2;
    }

    @Override // defpackage.q33
    public boolean a(MenuItem r4) {
        CrashActivity r3 = (CrashActivity) this.o;
        int r0 = CrashActivity.T;
        int r5 = r4.getItemId();
        if (r5 != R.id.crash_nav_info) goto L7;
        r3.p(new if0(), "Crash Landing");
        return true;
    L7:
        if (r5 != R.id.crash_nav_logs) goto L11;
        r3.p(new jf0(), "Crash Landing");
        return true;
    L11:
        if (r5 != R.id.crash_nav_export) goto L14;
        r3.p(new gf0(), "Crash Landing");
        return true;
    L14:
        return false;
    }

    public boolean b(om1 r7, int r8, Bundle r9) {
        hg r6 = (hg) this.o;
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 25) goto L5;
    L15:
        nz1 r10 = (nz1) r7.o;
        ClipData r11 = new ClipData(r10.getDescription(), new ClipData.Item(r10.a()));
        if (r0 < 31) goto L18;
        id0 r1 = new d34(r11, 2);
    L19:
        r1.c(r10.c());
        r1.setExtras(r9);
        if (j65.j(r6, r1.build()) != null) goto L22;
        return true;
    L22:
        return false;
    L18:
        jd0 r2 = new jd0();
        r2.o = r11;
        r2.p = 2;
        r1 = r2;
        goto L19
    L5:
        if ((r8 & 1) == 0) goto L15;
        ((nz1) r7.o).b();     // Catch: Exception -> L12
        Parcelable r12 = (Parcelable) ((nz1) r7.o).d();
        if (r9 != null) goto L10;
        r9 = new Bundle();
    L11:
        r9.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", r12);
        goto L15
    L10:
        r9 = new Bundle(r9);
    L12:
        e = move-exception;
        Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
        return false;
    }

    @Override // defpackage.lm2
    public void c(bm2 r15) {
        int r0 = this.n;
        boolean r1 = false;
        Object r14 = this.o;
        switch(r0) {
            case 25: goto L36;
            case 26: goto L24;
            case 27: goto L14;
            default: goto L4;
        };
    L4:
        Bundle r16 = (Bundle) r14;
        if (r15.Y() == false) goto L65;
        gy3 r2 = r15.u;
        gy3 r3 = r15.v;
        r15.I = r16;
        gy3 r17 = bm2.u1(r15.t, r15.s, r15.w, r15.z, r16);
        r15.u = r17;
        r15.v = bm2.t1(r17, r15.s, r15.I, r15.w, r15.z);
        boolean r18 = r15.u.equals(r2);
        r15.v.equals(r3);
        sk2 r19 = r15.f1();
        r19.getClass();
        if (Looper.myLooper() != r19.f.getLooper()) goto L10;
        r1 = true;
    L10:
        rr2.w(r1);
        qk2 r110 = r19.e;
        r110.getClass();
        if (r18 == true) goto L64;
        r110.u();
        return;
    L64:
        return;
    L65:
        return;
    L14:
        PendingIntent r111 = (PendingIntent) r14;
        if (r15.Y() == true) goto L17;
        return;
    L17:
        if (Objects.equals(r15.r, r111) == true) goto L67;
        r15.r = r111;
        sk2 r112 = r15.f1();
        r112.getClass();
        if (Looper.myLooper() != r112.f.getLooper()) goto L22;
        r1 = true;
    L22:
        rr2.w(r1);
        r112.e.getClass();
        return;
    L67:
        return;
    L24:
        za4 r113 = (za4) r14;
        if (r15.Y() == true) goto L28;
        return;
    L28:
        if (r15.k.isEmpty() == false) goto L68;
        za4 r4 = r15.q.c;
        if (r4.c < r113.c) goto L32;
        return;
    L32:
        if (ju2.a(r113, r4) == false) goto L71;
        r15.q = r15.q.j(r113);
        return;
    L71:
        return;
    L68:
        return;
    L36:
        oa0 r114 = (oa0) r14;
        cb4 r5 = r15.e;
        if (r15.D == null) goto L39;
        l93.F("MCImplBase", "Cannot be notified about the connection result many times. Probably a bug or malicious app.");
        r15.f1().Y0();
        return;
    L39:
        pu1 r6 = r114.c;
        yw1 r7 = r114.n;
        Bundle r8 = r114.i;
        r15.D = r6;
        r15.r = r114.d;
        r15.w = r114.e;
        mi3 r9 = r114.f;
        r15.x = r9;
        mi3 r10 = r114.g;
        r15.y = r10;
        mi3 r11 = bm2.Y0(r9, r10);
        r15.z = r11;
        yw1 r12 = r114.k;
        r15.s = r12;
        yw1 r13 = r114.l;
        r15.t = r13;
        gy3 r20 = bm2.u1(r13, r12, r15.w, r11, r8);
        r15.u = r20;
        r15.v = bm2.t1(r20, r15.s, r8, r15.w, r15.z);
        ue1 r21 = new ue1(4);
        int r22 = 0;
    L41:
        if (r22 >= r7.size()) goto L48;
        j60 r23 = (j60) r7.get(r22);
        va4 r24 = r23.a;
        if (r24 == null) goto L47;
        if (r24.a != 0) goto L47;
        r21.x(r24.b, r23);
    L47:
        r22 = r22 + 1;
        goto L41
    L48:
        r21.d(true);
        r15.q = r114.j;
        MediaSession.Token r25 = r114.m;
        if (r25 != null) goto L51;
        r25 = r5.a.i();
    L51:
        MediaSession.Token r115 = r25;
        if (r115 == null) goto L58;
        r15.E = new MediaController(r15.d, r115);
    L58:
        r114.c.asBinder().linkToDeath(r15.g, 0);     // Catch: RemoteException -> L56
        r15.n = new cb4(r5.a.a(), r114.a, r114.b, r5.a.g(), r114.c, r114.h, r115);
        r15.I = r8;
        r15.f1().X0();
        return;
    L56:
        r15.f1().Y0();
    }

    @Override // defpackage.zd1
    public void d(String r1, Bundle r2) {
        re2 r0 = (re2) this.o;
        String r3 = r2.getString("color_key");
        if (r3 == null) goto L5;
        r0.h0(r3);
    L5:
        zc1 r4 = r0.l0;
        r4.getClass();
        MaterialCardView r5 = (MaterialCardView) r4.f;
        if (r3 == null) goto L8;
        int r6 = Color.parseColor(qm4.z0(r3, "HEX:"));
    L9:
        r5.setCardBackgroundColor(r6);
        return;
    L8:
        r6 = Color.parseColor("#B5076B");
        goto L9
    }

    @Override // defpackage.ns
    public long e(long r9) {
        v71 r8 = (v71) this.o;
        return f35.k((r9 * ((long) r8.e)) / 1000000, 0, r8.j - 1);
    }

    @Override // defpackage.yr2
    public void f(er2 r2, int r3) {
        va4 r1 = (va4) this.o;
        Bundle r0 = Bundle.EMPTY;
        r2.l(r3, r1);
    }

    @Override // defpackage.mn0
    public gy3 g(int r7, sv4 r8, int[] r9) {
        jn0 r4 = (jn0) this.o;
        uw1 r6 = yw1.j();
        int r3 = 0;
    L4:
        if (r3 >= r8.a) goto L7;
        r6.c(new gn0(r7, r8, r3, r4, r9[r3]));
        r3 = r3 + 1;
        goto L4
    L7:
        return r6.f();
    }

    @Override // defpackage.ne4
    public long get() {
        return ((v52) this.o).b(SystemClock.elapsedRealtime());
    }

    @Override // defpackage.p5
    public void i(Object r8) {
        int r0 = this.n;
        Object r7 = this.o;
        switch(r0) {
            case 16: goto L6;
            default: goto L4;
        };
    L4:
        ((Boolean) r8).getClass();
        ((le2) r7).h0();
        return;
    L6:
        HubFragment r9 = (HubFragment) r7;
        o5 r10 = (o5) r8;
        List r1 = HubFragment.y0;
        r10.getClass();
        ValueCallback r2 = r9.r0;
        if (r2 == null) goto L32;
        Uri[] r3 = null;
        r9.r0 = null;
        Intent r11 = r10.o;
        if (r10.n != (-1)) goto L28;
        if (r11 == null) goto L28;
        ArrayList r12 = new ArrayList();
        ClipData r4 = r11.getClipData();
        if (r4 == null) goto L19;
        int r5 = r4.getItemCount();
        int r6 = 0;
    L16:
        if (r6 >= r5) goto L19;
        Uri r13 = r4.getItemAt(r6).getUri();
        r13.getClass();
        r12.add(r13);
        r6 = r6 + 1;
    L19:
        if (r12.isEmpty() == false) goto L24;
        Uri r14 = r11.getData();
        if (r14 == null) goto L24;
        r12.add(r14);
    L24:
        if (r12.isEmpty() == true) goto L27;
        r3 = (Uri[]) r12.toArray(new Uri[0]);
    L27:
        r2.onReceiveValue(r3);
        return;
    L28:
        r2.onReceiveValue(null);
        return;
    }

    @Override // defpackage.qc2
    public void invoke(Object r3) {
        int r0 = this.n;
        Object r2 = this.o;
        switch(r0) {
            case 3: goto L14;
            case 4: goto L12;
            case 5: goto L10;
            case 6: goto L4;
            case 7: goto L4;
            case 8: goto L4;
            case 9: goto L8;
            case 10: goto L6;
            default: goto L4;
        };
    L4:
        ((oi3) r3).h((qv2) r2);
        return;
    L6:
        ((oi3) r3).F(((d41) r2).n.S);
        return;
    L8:
        ((oi3) r3).e((jg0) r2);
        return;
    L10:
        ((ho2) r3).getClass();
        return;
    L12:
        ho2 r4 = (ho2) r3;
        r4.getClass();
        r4.w = ((un2) r2).a;
        return;
    L14:
        bj0 r5 = (bj0) r2;
        ho2 r6 = (ho2) r3;
        r6.y += r5.g;
        r6.z += r5.e;
    }

    @Override // defpackage.np4
    public void j() {
        LibraryFragment r5 = (LibraryFragment) this.o;
        le1 r0 = r5.v();
        r5.o0.d(r0);
        n92 r1 = r5.o0;
        r1.f.getClass();
        k03 r2 = y41.j(15, true);
        k03 r3 = r1.l;
        Objects.requireNonNull(r3);
        r2.e(r0, new g7(r3, 0));
        r5.o0.e(r0);
        r5.o0.f(r0);
        r5.l0.v.setRefreshing(false);
    }

    @Override // defpackage.gz3
    public void k(long r1, be3 r3) {
        ji2.s(r1, r3, ((oe1) this.o).J);
    }

    @Override // defpackage.g3
    public void onTouchExplorationStateChanged(boolean r2) {
        ix0 r1 = (ix0) this.o;
        AutoCompleteTextView r0 = r1.h;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getInputType() == 0) goto L7;
        return;
    L7:
        CheckableImageButton r3 = r1.d;
        if (r2 == false) goto L10;
        int r4 = 2;
    L11:
        WeakHashMap r5 = j65.a;
        r3.setImportantForAccessibility(r4);
        return;
    L10:
        r4 = 1;
        goto L11
    }

    @Override // defpackage.ep3
    public CharSequence r(Preference r1) {
        EditTextPreference r2 = (EditTextPreference) r1;
        return (CharSequence) ((gf1) this.o).invoke();
    }

    @Override // defpackage.r83
    public pb5 x(View r8, pb5 r9) {
        View r7 = (View) this.o;
        int r10 = MainActivity.e0;
        mb5 r11 = r9.a;
        vz1 r1 = r11.h(519);
        vz1 r12 = r11.h(128);
        int r3 = Math.max(r1.b, r12.b);
        int r4 = r1.a;
        int r5 = r1.c;
        r7.setPadding(r4, r3, r5, 0);
        int r13 = Build.VERSION.SDK_INT;
        if (r13 < 36) goto L6;
        bb5 r14 = new ab5(r9);
    L21:
        r14.d(519, vz1.b(r4, 0, r5, r1.d));
        r14.d(1, vz1.e);
        r14.d(128, vz1.b(r12.a, 0, r12.c, r12.d));
        return r14.b();
    L6:
        if (r13 < 35) goto L9;
        r14 = new za5(r9);
        goto L21
    L9:
        if (r13 < 34) goto L12;
        r14 = new ya5(r9);
        goto L21
    L12:
        if (r13 < 31) goto L15;
        r14 = new xa5(r9);
        goto L21
    L15:
        if (r13 < 30) goto L18;
        r14 = new wa5(r9);
        goto L21
    L18:
        if (r13 < 29) goto L20;
        r14 = new va5(r9);
        goto L21
    L20:
        r14 = new ua5(r9);
        goto L21
    }

    public /* synthetic */ cn(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    public /* synthetic */ cn(q9 r1, bj0 r2) {
        this.n = 3;
        this.o = r2;
    }

    public /* synthetic */ cn(q9 r1, ed2 r2, un2 r3, IOException r4, boolean r5) {
        this.n = 4;
        this.o = r3;
    }

    public /* synthetic */ cn(q9 r1, Object r2, long r3) {
        this.n = 5;
        this.o = r2;
    }

    public /* synthetic */ cn(int r1, PendingIntent r2) {
        this.n = 27;
        this.o = r2;
    }
}
