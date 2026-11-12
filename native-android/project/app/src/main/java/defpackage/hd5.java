package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaCodec;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.work.impl.WorkDatabase_Impl;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.StarCallback;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.ArtistWithAlbumsID3;
import com.eddyizm.tempus.subsonic.models.Bookmarks;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hd5 implements z30, Callback, e01, in4, wa3 {
    public final /* synthetic */ int n;
    public Object o;
    public Object p;

    public hd5(pn4 r17) {
        this.n = 19;
        this.o = r17;
        ok1 r2 = new ok1();
        r2.a(Date.class, new r01());
        r2.a(Bookmarks.class, new lt());
        r2.j = true;
        ArrayList r3 = r2.e;
        int r4 = r3.size();
        ArrayList r5 = r2.f;
        ArrayList r12 = new ArrayList((r5.size() + r4) + 3);
        r12.addAll(r3);
        Collections.reverse(r12);
        ArrayList r6 = new ArrayList(r5);
        Collections.reverse(r6);
        r12.addAll(r6);
        int r7 = r2.g;
        int r8 = r2.h;
        ak0 r9 = bk0.b;
        boolean r10 = gk4.a;
        if (r7 == 2) goto L12;
        if (r8 == 2) goto L12;
        dz4 r11 = r9.a(r7, r8);
        if (r10 == false) goto L8;
        dz4 r13 = gk4.c.a(r7, r8);
        dz4 r14 = gk4.b.a(r7, r8);
    L9:
        r12.add(r11);
        if (r10 == false) goto L12;
        r12.add(r13);
        r12.add(r14);
        goto L12
    L8:
        r14 = null;
        r13 = null;
    L12:
        u21 r15 = r2.a;
        int r16 = r2.c;
        HashMap r18 = new HashMap(r2.d);
        boolean r19 = r2.i;
        boolean r20 = r2.j;
        boolean r110 = r2.k;
        int r111 = r2.b;
        new ArrayList(r3);
        new ArrayList(r5);
        nk1 r21 = new nk1(r15, r16, r18, r19, r20, r110, r111, r12, r2.l, r2.m, new ArrayList(r2.n));
        Retrofit.Builder r22 = new Retrofit.Builder();
        String r1 = r17.j();
        if (r1 == null) goto L15;
        String r112 = qm4.K0(r1).toString();
    L16:
        if (r112 != null) goto L31;
        r112 = "";
    L31:
        fr1 r23 = new fr1();     // Catch: IllegalArgumentException -> L20
        r23.e(null, r112);     // Catch: IllegalArgumentException -> L20
        gr1 r24 = r23.b();     // Catch: IllegalArgumentException -> L20
    L21:
        if (r24 != null) goto L23;
    L25:
        r112 = "https://localhost/rest/";
    L26:
        Retrofit.Builder r25 = r22.baseUrl(r112).addConverterFactory(GsonConverterFactory.create(r21));
        cx r26 = new cx();
        rx r27 = new rx(r26);
        r26.a = 2592000;
        n83 r28 = new n83();
        r28.a(2, TimeUnit.MINUTES);
        TimeUnit r29 = TimeUnit.SECONDS;
        r28.b(20, r29);
        r28.z = ze5.b(30, r29);
        r28.A = ze5.b(30, r29);
        dr1 r30 = new dr1();
        r30.b = cr1.n;
        r28.c.add(r30);
        r28.c.add(r27);
        File r31 = App.a().getCacheDir();
        r31.getClass();
        r28.l = new hx(r31);
        SSLSocketFactory r32 = x30.b;
        if (r32 == null) goto L29;
        r28.c(r32, x30.a);
    L29:
        Retrofit r33 = r25.client(new o83(r28)).build();
        r33.getClass();
        this.p = (f84) r33.create(f84.class);
        return;
    L23:
        if (r24.d.length() <= 0) goto L25;
    L20:
        r24 = null;
        goto L21
    L15:
        r112 = null;
        goto L16
    }

    @Override // defpackage.e01
    public Object a() {
        return (q15) this.o;
    }

    @Override // defpackage.in4
    public jn4 apply() {
        o72 r0 = (o72) this.o;
        h72 r1 = i();
        if (r1 == null) goto L6;
        r0.d(r1, false);
    L6:
        return r0.f(this.p);
    }

    @Override // defpackage.e01
    public boolean b(CharSequence r4, int r5, int r6, k05 r7) {
        if ((r7.c & 4) <= 0) goto L6;
        return true;
    L6:
        if (((q15) this.o) == null) goto L8;
    L12:
        ((om0) this.p).getClass();
        l05 r8 = new l05(r7);
        ((q15) this.o).setSpan(r8, r5, r6, 33);
        return true;
    L8:
        if ((r4 instanceof Spannable) == false) goto L10;
        Spannable r9 = (Spannable) r4;
    L11:
        this.o = new q15(r9);
        goto L12
    L10:
        r9 = new SpannableString(r4);
        goto L11
    }

    @Override // defpackage.wa3
    public List c(Integer r4) {
        List r0 = ((wa3) this.o).c(null);
        lg4 r3 = (lg4) this.p;
        int r1 = r3.v;
        if (r1 >= 0) goto L6;
        return r0;
    L6:
        return q40.G0(gh0.d(r3, r4, r1, Integer.valueOf(r3.E(r3.b, r1))), r0);
    }

    @Override // defpackage.in4
    public void cancel() {
        h72 r0 = i();
        if (r0 == null) goto L5;
        ef3 r1 = r0.f;
    L6:
        if (r1 == null) goto L9;
        o72.c((o72) this.o, this.p);
        return;
    L9:
        return;
    L5:
        r1 = null;
        goto L6
    }

    @Override // defpackage.in4
    public boolean d() {
        h72 r0 = i();
        if (r0 == null) goto L8;
        ef3 r1 = r0.f;
        if (r1 != null) goto L7;
        return true;
    L7:
        return r1.c();
    L8:
        return true;
    }

    @Override // defpackage.in4
    public boolean e(bt2 r5) {
        h72 r4 = i();
        if1 r0 = null;
        if (r4 == null) goto L5;
        ef3 r1 = r4.f;
    L6:
        if (r1 != null) goto L8;
        return true;
    L8:
        if (r1.c() == true) goto L28;
        ch4 r2 = ya4.t();
        if (r2 == null) goto L12;
        r0 = r2.e();
    L12:
        ch4 r3 = ya4.z(r2);
        boolean r6 = r1.e(r5);     // Catch: Throwable -> L16
        ya4.H(r2, r3, r0);
        return r6;
    L16:
        th = move-exception;
        r4.getClass();     // Catch: Throwable -> L19
        throw th;     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        ya4.H(r2, r3, r0);
        throw th;
    L28:
        return true;
    L5:
        r1 = null;
        goto L6
    }

    public void f(ValueAnimator r3) {
        xi4 r0 = new xi4(8);
        r3.addListener((pl4) this.p);
        ((ArrayList) this.o).add(r0);
    }

    @Override // defpackage.wa3
    public boolean g() {
        return ((wa3) this.o).g();
    }

    public Object h(xn3 r3) {
        HashMap r0 = (HashMap) this.p;
        jk1 r1 = (jk1) r0.get(r3);
        if (r1 != null) goto L5;
        r1 = new jk1(r3);
        r0.put(r3, r1);
    L6:
        jk1 r4 = r1.d;
        r4.c = r1.c;
        r1.c.d = r4;
        jk1 r2 = (jk1) this.o;
        r1.d = r2;
        jk1 r5 = r2.c;
        r1.c = r5;
        r5.d = r1;
        r1.d.c = r1;
        ArrayList r6 = r1.b;
        if (r6 == null) goto L9;
        int r7 = r6.size();
    L10:
        if (r7 > 0) goto L12;
        return null;
    L12:
        return r1.b.remove(r7 - 1);
    L9:
        r7 = 0;
        goto L10
    L5:
        r3.a();
        goto L6
    }

    public h72 i() {
        o72 r0 = (o72) this.o;
        c72 r2 = (c72) r0.w.g(this.p);
        if (r2 != null) goto L5;
        return null;
    L5:
        return (h72) r0.s.g(r2);
    }

    public ArrayList j(String r3) {
        w24 r1 = w24.b(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        r1.h(1, r3);
        WorkDatabase_Impl r2 = (WorkDatabase_Impl) this.o;
        r2.b();
        Cursor r4 = xl.H(r2, r1);
        ArrayList r5 = new ArrayList(r4.getCount());     // Catch: Throwable -> L8
    L5:
        if (r4.moveToNext() == false) goto L10;
        r5.add(r4.getString(0));     // Catch: Throwable -> L8
        goto L5
    L10:
        r4.close();
        r1.j();
        return r5;
    L8:
        th = move-exception;
        r4.close();
        r1.j();
        throw th;
    }

    public void k(xn3 r4, Object r5) {
        HashMap r0 = (HashMap) this.p;
        jk1 r1 = (jk1) r0.get(r4);
        if (r1 != null) goto L5;
        r1 = new jk1(r4);
        r1.d = r1;
        jk1 r3 = (jk1) this.o;
        r1.d = r3.d;
        r1.c = r3;
        r3.d = r1;
        r1.d.c = r1;
        r0.put(r4, r1);
    L7:
        if (r1.b != null) goto L9;
        r1.b = new ArrayList();
    L9:
        r1.b.add(r5);
        return;
    L5:
        r4.a();
        goto L7
    }

    public Object l() {
        jk1 r0 = (jk1) this.o;
        jk1 r1 = r0.d;
    L3:
        boolean r2 = r1.equals(r0);
        Object r3 = r1.a;
        Object r4 = null;
        if (r2 == true) goto L14;
        ArrayList r5 = r1.b;
        if (r5 == null) goto L8;
        int r6 = r5.size();
    L9:
        if (r6 <= 0) goto L11;
        r4 = r1.b.remove(r6 - 1);
    L11:
        if (r4 != null) goto L12;
        jk1 r7 = r1.d;
        r7.c = r1.c;
        r1.c.d = r7;
        ((HashMap) this.p).remove(r3);
        ((xn3) r3).a();
        r1 = r1.d;
        goto L3
    L12:
        return r4;
    L8:
        r6 = 0;
        goto L9
    L14:
        return null;
    }

    public Call m(String r12, int r13, int r14, int r15, int r16) {
        Log.d("BrowsingClient", "search3()");
        return ((f84) this.p).a(((pn4) this.o).f(), r12, r13, r14, r15, 0, r16, 0, ud3.k());
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r2, Throwable r3) {
        switch(this.n) {
            case 2: goto L10;
            case 8: goto L8;
            case 17: goto L6;
            default: goto L4;
        };
    L4:
        new Thread(new jq3((hh3) this.p, (k03) this.o)).start();
        return;
    L6:
        ((lm3) this.o).g();
        return;
    L8:
        d34.r((l61) this.o, (StarCallback) this.p);
        return;
    L10:
        ArtistID3 r4 = kb4.g((String) this.o, null);
        if (r4 == null) goto L14;
        ((k03) this.p).k(r4);
        return;
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r4, Response r5) {
        switch(this.n) {
            case 2: goto L30;
            case 8: goto L20;
            case 17: goto L15;
            default: goto L4;
        };
    L4:
        k03 r6 = (k03) this.o;
        hh3 r3 = (hh3) this.p;
        if (r5.isSuccessful() == true) goto L7;
    L13:
        new Thread(new jq3(r3, r6)).start();
        return;
    L7:
        if (r5.body() == null) goto L13;
        if (((ApiResponse) r5.body()).getSubsonicResponse().getInternetRadioStations() == null) goto L13;
        if (((ApiResponse) r5.body()).getSubsonicResponse().getInternetRadioStations().getInternetRadioStations() == null) goto L13;
        List<InternetRadioStation> r7 = ((ApiResponse) r5.body()).getSubsonicResponse().getInternetRadioStations().getInternetRadioStations();
        new Thread(new jq3(3, r7)).start();
        new Thread(new ur2(r3, r7, r6)).start();
        return;
    L15:
        lm3 r8 = (lm3) this.o;
        if (mm3.f(r5) == false) goto L18;
        ((mm3) this.p).g();
        r8.onSuccess();
        return;
    L18:
        r8.g();
        return;
    L20:
        l61 r9 = (l61) this.o;
        StarCallback r10 = (StarCallback) this.p;
        if (r5.isSuccessful() == false) goto L26;
        if (d34.w(r5) == true) goto L26;
        n61.a(r9);
        r10.onSuccess();
        return;
    L26:
        if (d34.w(r5) == false) goto L28;
        n61.j(r9);
        r10.onRefused();
        return;
    L28:
        d34.r(r9, r10);
        return;
    L30:
        String r11 = (String) this.o;
        if (r5.isSuccessful() == true) goto L33;
    L35:
        ArtistWithAlbumsID3 r12 = null;
    L36:
        ArtistID3 r13 = kb4.g(r11, r12);
        if (r13 == null) goto L44;
        ((k03) this.p).k(r13);
        return;
    L44:
        return;
    L33:
        if (r5.body() == null) goto L35;
        r12 = ((ApiResponse) r5.body()).getSubsonicResponse().getArtist();
        goto L36
    }

    public String toString() {
        switch(this.n) {
            case 10: goto L6;
            default: goto L5;
        };
    L6:
        StringBuilder r0 = new StringBuilder("GroupedLinkedMap( ");
        jk1 r5 = (jk1) this.o;
        jk1 r1 = r5.c;
        boolean r3 = false;
    L8:
        if (r1.equals(r5) == true) goto L14;
        r0.append('{');
        r0.append(r1.a);
        r0.append(':');
        ArrayList r4 = r1.b;
        if (r4 == null) goto L12;
        int r6 = r4.size();
    L13:
        r0.append(r6);
        r0.append("}, ");
        r1 = r1.c;
        r3 = true;
        goto L8
    L12:
        r6 = 0;
        goto L13
    L14:
        if (r3 == false) goto L16;
        r0.delete(r0.length() - 2, r0.length());
    L16:
        r0.append(" )");
        return r0.toString();
    L5:
        return super.toString();
    }

    public /* synthetic */ hd5(Object r1, Object r2, boolean r3, int r4) {
        this.n = r4;
        this.p = r1;
        this.o = r2;
    }

    public /* synthetic */ hd5(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    public hd5(int r2) {
        this.n = r2;
        switch(r2) {
            case 20: goto L10;
            case 21: goto L4;
            case 22: goto L8;
            case 23: goto L6;
            default: goto L4;
        };
    L4:
        this.o = new jk1(null);
        this.p = new HashMap();
        return;
    L6:
        ej1 r3 = ej1.c;
        this.o = new SparseIntArray();
        this.p = r3;
        return;
    L8:
        this.o = new f13(new Reference[16]);
        this.p = new ReferenceQueue();
        return;
    L10:
        this.o = new ArrayList();
        this.p = new pl4();
    }

    public hd5(WorkDatabase_Impl r3) {
        this.n = 0;
        this.o = r3;
        this.p = new vo0(r3, 6);
        new aq4(r3, 20);
    }

    public hd5(s24 r2) {
        this.n = 11;
        this.o = r2;
        Set r3 = Collections.newSetFromMap(new IdentityHashMap());
        r3.getClass();
        this.p = r3;
    }

    public hd5(Context r2) {
        this.n = 1;
        this.o = r2;
    }

    public hd5(MediaCodec.CryptoInfo r2) {
        this.n = 5;
        this.o = r2;
        this.p = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public hd5(gy3 r2, int[] r3) {
        this.n = 15;
        this.o = yw1.k(r2);
        this.p = r3;
    }

    public hd5(String r2, Bundle r3) {
        this.n = 13;
        if (r2 == null) goto L6;
        this.o = r2;
        this.p = r3;
        return;
    L6:
        kf2.n("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        throw null;
    }
}
