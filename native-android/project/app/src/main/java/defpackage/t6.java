package defpackage;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.net.Uri;
import android.net.nsd.NsdServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.preference.Preference;
import androidx.work.impl.WorkDatabase;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubAssistantTask;
import com.eddyizm.tempus.homemusic.HubAuthOptions;
import com.eddyizm.tempus.homemusic.HubException;
import com.eddyizm.tempus.homemusic.HubMe;
import com.eddyizm.tempus.homemusic.HubMix;
import com.eddyizm.tempus.homemusic.HubShareActivity;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.SmartAddOut;
import com.eddyizm.tempus.homemusic.SmartContexts;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.WaveSession;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.provider.AlbumArtContentProvider;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.subsonic.models.PlaylistWithSongs;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.SearchFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.ArtistBottomSheetDialog;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t6 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ t6(pn2 r1, fr2 r2, nj2 r3, String r4, Bundle r5) {
        this.n = 15;
        this.o = r1;
        this.p = r2;
        this.q = r3;
        this.r = r5;
    }

    private final void a() {
        lo2 r0 = (lo2) this.o;
        String r1 = (String) this.p;
        Bundle r2 = (Bundle) this.q;
        sk2 r5 = (sk2) this.r;
        r0.r.execute(new v6(r0, r5, r1, r2));
    }

    private final void b() {
        lo2 r0 = (lo2) this.o;
        bl2 r1 = (bl2) this.p;
        ko2 r2 = (ko2) this.q;
        kn2 r6 = (kn2) this.r;
        sk2 r3 = (sk2) r1.get(0, TimeUnit.MILLISECONDS);     // Catch: Throwable -> L8
        if (r0.d(r6) == false) goto L6;
        r2.n.k(r2.o, false);     // Catch: Throwable -> L8
    L6:
        r3.v(r2);     // Catch: Throwable -> L8
        return;
    L8:
        r0.n.l(r6);
    }

    private final void c() {
        nq2 r0 = (nq2) this.o;
        ((zh0) this.p).D(r0, (sp2) this.q, (ArrayList) this.r);
    }

    private final void d() {
        nq2 r0 = (nq2) this.o;
        ((zh0) this.p).D(r0, (sp2) this.q, (Collection) this.r);
    }

    private final void e() {
        lr0 r0 = (lr0) this.o;
        AtomicInteger r1 = (AtomicInteger) this.p;
        ArrayList r2 = (ArrayList) this.q;
        ArrayList r9 = (ArrayList) this.r;
        if (r1.incrementAndGet() != r2.size()) goto L28;
        ArrayList r3 = new ArrayList();
        int r4 = 0;
    L6:
        if (r4 >= r9.size()) goto L21;
        ic2 r5 = (ic2) r9.get(r4);
        if (r5 != null) goto L23;
    L15:
        Bitmap r6 = null;
    L16:
        pm2 r7 = f92.i((gn2) r2.get(r4), r6);
        if (r4 != (-1)) goto L19;
        long r8 = -1;
    L20:
        r3.add(new or2(null, r7, r8));
        r4 = r4 + 1;
        goto L6
    L19:
        r8 = r4;
        goto L20
    L23:
        r6 = (Bitmap) hw.j(r5);     // Catch: Throwable -> L11 CancellationException -> L13
    L11:
        e = move-exception;
        l93.B("MediaSessionLegacyStub", "Failed to get bitmap", e);
        goto L15
    L21:
        ls2.E(((ls2) r0.r).m, r3);
        return;
    }

    private final void f() {
        pn2 r0 = (pn2) this.o;
        AtomicReference r1 = (AtomicReference) this.p;
        fr2 r2 = (fr2) this.q;
        q90 r3 = (q90) this.r;
        r1.set(r0.w.p(r2));
        r3.d();
    }

    private final void g() {
        kt2 r5 = (kt2) this.o;
        fr2 r1 = (fr2) this.p;
        tn2 r2 = (tn2) this.q;
        ju1 r3 = (ju1) this.r;
        na4 r0 = r5.f;
        boolean r17 = false;
        r5.g.remove(r1);     // Catch: Throwable -> L11
        if (r2.l() == false) goto L7;
        au0.k(r3);
        return;
    L7:
        ft2 r6 = (ft2) r1.d;     // Catch: Throwable -> L11
        r6.getClass();     // Catch: Throwable -> L11
        IBinder r7 = r6.n.asBinder();     // Catch: Throwable -> L11
        dr2 r8 = r2.p(r1);     // Catch: Throwable -> L11
        if (r0.F(r1) == false) goto L13;
        l93.q0("MediaSessionStub", "Controller " + r1 + " has sent connection request multiple times");     // Catch: Throwable -> L11
    L13:
        r0.a(r7, r1, r8.a, r8.b);     // Catch: Throwable -> L11
        yk r4 = r0.C(r1);     // Catch: Throwable -> L11
        if (r4 != null) goto L18;
        l93.q0("MediaSessionStub", "Ignoring connection request from unknown controller info");     // Catch: Throwable -> L11
        au0.k(r3);
        return;
    L18:
        al3 r9 = r2.s;     // Catch: Throwable -> L11
        lk3 r10 = r2.r;     // Catch: Throwable -> L11
        mi3 r11 = r8.b;     // Catch: Throwable -> L11
        lk3 r15 = r5.X(r10);     // Catch: Throwable -> L11
        MediaSession.Token r12 = ((kr2) r2.h.m.o).c.o;     // Catch: Throwable -> L11
        PendingIntent r13 = r2.t;     // Catch: Throwable -> L11
        yw1 r14 = r8.c;     // Catch: Throwable -> L11
        if (r14 != null) goto L22;
        r14 = r2.z;     // Catch: Throwable -> L11
    L22:
        yw1 r16 = r8.d;     // Catch: Throwable -> L11
        if (r16 != null) goto L58;
        r16 = r2.A;     // Catch: Throwable -> L11
    L58:
        oa0 r18 = new oa0(1009002300, 8, r5, r13, r14, r16, r2.q, r8.a, r11, r9.o(), r2.j.a.getExtras(), r2.B, r15, r12);     // Catch: Throwable -> L40
        if (r2.l() == false) goto L61;
        au0.k(r3);
        return;
    L61:
        int r19 = r4.s();     // Catch: Throwable -> L40 RemoteException -> L42
        ju1 r20 = r3;
        if ((r20 instanceof mm2) == false) goto L37;
        Bundle r21 = new Bundle();     // Catch: Throwable -> L11 RemoteException -> L57
        r21.putBinder(oa0.B, new na0(r18));     // Catch: Throwable -> L11 RemoteException -> L57
    L38:
        r20.r(r19, r21);     // Catch: Throwable -> L11 RemoteException -> L57
        r17 = true;
        goto L43
    L37:
        r21 = r18.b(r1.c);     // Catch: Throwable -> L11 RemoteException -> L57
    L43:
        if (r17 == true) goto L46;
    L51:
        if (r17 == true) goto L64;
        au0.k(r20);
        return;
    L64:
        return;
    L46:
        if (r2.y == true) goto L48;
    L50:
        r2.e.getClass();     // Catch: Throwable -> L11
        goto L51
    L48:
        if (tn2.m(r1) == false) goto L50;
    L42:
        r20 = r3;
    L40:
        th = th;
        r3 = r3;
    L54:
        if (0 != 0) goto L56;
        au0.k(r3);
    L56:
        throw th;
    L11:
        th = th;
        goto L54
    }

    private final void h() {
        tn2 r0 = (tn2) this.o;
        lb4 r1 = (lb4) this.p;
        wc0 r2 = (wc0) this.q;
        ic2 r4 = (ic2) this.r;
        if (r0.l() == false) goto L11;
        r1.l(null);
        return;
    L11:
        r2.accept(r4);     // Catch: Throwable -> L8
        r1.l(null);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        r1.m(th);
    }

    private final void i() {
        tn2 r0 = (tn2) this.o;
        ht2 r1 = (ht2) this.p;
        fr2 r2 = (fr2) this.q;
        List r4 = (List) this.r;
        if (r0.l() == true) goto L6;
        r1.b(r0.s, r2, r4);
        return;
    }

    private final void j() {
        mm3 r0 = (mm3) this.o;
        Boolean r1 = (Boolean) this.p;
        String r4 = (String) this.q;
        ArrayList r7 = (ArrayList) this.r;
        Boolean r9 = Boolean.TRUE;
        if (r9.equals(r1) == false) goto L5;
    L4:
        Boolean r6 = r9;
        App.f(false).g().S(r4, null, r6, r7, null).enqueue(new pz1(13, r0));
        return;
    L5:
        r9 = r0.j(r4);
        goto L4
    }

    private final void k() {
        mm3 r0 = (mm3) this.o;
        String r3 = (String) this.p;
        ArrayList r7 = (ArrayList) this.q;
        hq1 r8 = (hq1) this.r;
        r0.getClass();
        App.f(false).g().S(r3, null, r0.j(r3), null, r7).enqueue(new xc5(r0, r8));
    }

    private final void l() {
        List r0 = (List) this.o;
        rc5 r1 = (rc5) this.p;
        r90 r2 = (r90) this.q;
        WorkDatabase r6 = (WorkDatabase) this.r;
        Iterator r3 = r0.iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        ((a64) r3.next()).d(r1.a);
        goto L4
    L6:
        c64.b(r2, r6, r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int r5 = 0;
        HubException r6 = null;
        switch(this.n) {
            case 0: goto L375;
            case 1: goto L367;
            case 2: goto L291;
            case 3: goto L279;
            case 4: goto L262;
            case 5: goto L245;
            case 6: goto L239;
            case 7: goto L214;
            case 8: goto L129;
            case 9: goto L108;
            case 10: goto L93;
            case 11: goto L85;
            case 12: goto L81;
            case 13: goto L64;
            case 14: goto L59;
            case 15: goto L47;
            case 16: goto L41;
            case 17: goto L39;
            case 18: goto L37;
            case 19: goto L35;
            case 20: goto L33;
            case 21: goto L31;
            case 22: goto L29;
            case 23: goto L27;
            case 24: goto L25;
            case 25: goto L23;
            case 26: goto L21;
            case 27: goto L19;
            case 28: goto L17;
            default: goto L4;
        };
    L4:
        SearchFragment r1 = (SearchFragment) this.o;
        PlaylistWithSongs r2 = (PlaylistWithSongs) this.p;
        ArrayList r3 = (ArrayList) this.q;
        ArrayList r0 = (ArrayList) this.r;
        if (r1.T != null) goto L7;
        return;
    L7:
        if (r1.y() == false) goto L463;
        r2.setName(r1.T.getContext().getString(R.string.search_all_songs, new Object[]{String.valueOf(r3.size())}));
        boolean r4 = r0.isEmpty();
        ej r7 = r1.s0;
        if (r4 == true) goto L15;
        r7.p(r0);
        View r8 = r1.T;
        if (r8 == null) goto L464;
        ae1 r9 = r1.l0;
        if (r9 == null) goto L465;
        r9.a.setText(r8.getContext().getString(R.string.search_all_songs_play, new Object[]{String.valueOf(((Playlist) r0.get(0)).getName())}));
        return;
    L465:
        return;
    L464:
        return;
    L15:
        r7.p(Collections.EMPTY_LIST);
        return;
    L463:
        return;
    L17:
        l();
        return;
    L19:
        k();
        return;
    L21:
        j();
        return;
    L23:
        i();
        return;
    L25:
        h();
        return;
    L27:
        g();
        return;
    L29:
        f();
        return;
    L31:
        e();
        return;
    L33:
        d();
        return;
    L35:
        c();
        return;
    L37:
        b();
        return;
    L39:
        a();
        return;
    L41:
        tn2 r10 = (tn2) this.o;
        lb4 r11 = (lb4) this.p;
        fr2 r12 = (fr2) this.q;
        String r13 = (String) this.r;
        m92 r14 = (m92) tn2.E(r11);
        if (r14 != null) goto L44;
    L45:
        er2 r15 = r12.d;
        r15.getClass();
        r10.E.remove(r13, r12);
        r10.F.remove(r15, r13);
        return;
    L44:
        if (r14.a != 0) goto L45;
        return;
    L47:
        pn2 r16 = (pn2) this.o;
        fr2 r17 = (fr2) this.p;
        nj2 r18 = (nj2) this.q;
        Bundle r19 = (Bundle) this.r;
        if (r16.x.I(r17, 50005) == true) goto L50;
        r18.f(null);
        return;
    L50:
        er2 r20 = r17.d;
        r20.getClass();
        on2 r21 = (on2) r20;
        Object r22 = r21.n;
        monitor-enter(r22);
        r21.p.add(new tv1());     // Catch: Throwable -> L56
        monitor-exit(r22);     // Catch: Throwable -> L56
        f92.h(r16.z.f, r19);
        r16.z.w(r17);
        return;
    L56:
        th = move-exception;
        throw th;
    L59:
        pn2 r23 = (pn2) this.o;
        fr2 r24 = (fr2) this.p;
        Bundle r25 = (Bundle) this.q;
        String r26 = (String) this.r;
        tn2 r27 = r23.z;
        if (r23.x.I(r24, 50001) == false) goto L469;
        r27.y(r24, r26, f92.h(r27.f, r25));
        return;
    L469:
        return;
    L64:
        AtomicInteger r28 = (AtomicInteger) this.o;
        yw1 r29 = (yw1) this.p;
        ArrayList r30 = (ArrayList) this.q;
        lb4 r31 = (lb4) this.r;
        if (r28.incrementAndGet() != r29.size()) goto L470;
        ArrayList r32 = new ArrayList();
    L68:
        if (r5 >= r30.size()) goto L79;
        ic2 r33 = (ic2) r30.get(r5);
        if (r33 != null) goto L446;
    L77:
        Bitmap r34 = null;
    L78:
        r32.add(f92.a((gn2) r29.get(r5), r34));
        r5 = r5 + 1;
        goto L68
    L446:
        r34 = (Bitmap) hw.j(r33);     // Catch: ExecutionException -> L73 Throwable -> L75
    L75:
        e = move-exception;
        l93.B("MLSLegacyStub", "Failed to get bitmap", e);
        goto L77
    L79:
        r31.l(r32);
        return;
    L470:
        return;
    L81:
        fx3 r35 = (fx3) this.o;
        LinkedHashMap r36 = (LinkedHashMap) this.p;
        NsdServiceInfo r37 = (NsdServiceInfo) this.q;
        ArrayAdapter r38 = (ArrayAdapter) this.r;
        if (r35.n == true) goto L471;
        r36.remove(r37.getServiceName());
        r38.clear();
        r38.addAll(r36.keySet());
        return;
    L471:
        return;
    L85:
        fx3 r39 = (fx3) this.o;
        nc1 r40 = (nc1) this.p;
        NsdServiceInfo r41 = (NsdServiceInfo) this.q;
        f9 r42 = (f9) this.r;
        if (r39.n == false) goto L88;
        return;
    L88:
        if (r40.isFinishing() == false) goto L90;
        return;
    L90:
        if (r40.isDestroyed() == true) goto L474;
        u52.b(r40, r41, null);
        r42.dismiss();
        return;
    L474:
        return;
    L93:
        Map<String, ? extends Object> r43 = (Map) this.o;
        String r44 = (String) this.p;
        MainActivity r45 = (MainActivity) this.q;
        Runnable r46 = (Runnable) this.r;
        rr1 r47 = rr1.a;     // Catch: Throwable -> L104
        boolean r48 = rr1.e().contains("wave_origin_v1");     // Catch: Throwable -> L104
        WaveSession.Companion r49 = WaveSession.Companion;     // Catch: Throwable -> L104
        if (r48 == false) goto L97;
        String r110 = r44;
    L98:
        String r50 = rs1.f();     // Catch: Throwable -> L104
        if (r48 == false) goto L101;
        String r111 = r50;
    L102:
        Object r51 = rr1.A(r49.startBody(r43, null, r110, null, r111));     // Catch: Throwable -> L104
    L106:
        io1.b.post(new v6(r45, r51, r46, 22));
        return;
    L101:
        r111 = null;
        goto L102
    L97:
        r110 = null;
    L104:
        th = move-exception;
        r51 = new s14(th);
        goto L106
    L108:
        Object r52 = this.o;
        SmartSession r53 = (SmartSession) this.p;
        String r54 = (String) this.r;
        Context r55 = (Context) this.q;
        if ((r52 instanceof s14) == true) goto L118;
        r53.accept(r54);
        a.c();
        String r56 = ((SmartAddOut) r52).getStatus();
        if (h12.c(r56, "downloading") == false) goto L114;
        int r57 = R.string.homemusic_smart_downloading;
    L117:
        Toast.makeText(r55, r57, 0).show();
        goto L118
    L114:
        if (h12.c(r56, SmartContexts.LIKED) == false) goto L116;
        r57 = R.string.homemusic_smart_liked;
        goto L117
    L116:
        r57 = R.string.homemusic_smart_added;
    L118:
        Throwable r58 = bb3.a(r52);
        if (r58 == null) goto L475;
        Log.w("HubSmart", "add", r58);
        if ((r58 instanceof HubException) == false) goto L123;
        r6 = (HubException) r58;
    L123:
        if (r6 == null) goto L126;
        String r59 = r6.getMessage();
        if (r59 == null) goto L126;
    L127:
        Toast.makeText(r55, r59, 1).show();
        return;
    L126:
        r59 = r55.getString(R.string.homemusic_smart_failed);
        r59.getClass();
        goto L127
    L475:
        return;
    L129:
        ArrayList r60 = (ArrayList) this.o;
        HubShareActivity r61 = (HubShareActivity) this.p;
        ArrayList r62 = (ArrayList) this.q;
        String r63 = (String) this.r;
        ux3 r64 = HubShareActivity.P;
        rr1.h();     // Catch: Exception -> L150
        jx3 r112 = new jx3();     // Catch: Exception -> L150
        ArrayList r113 = new ArrayList();     // Catch: Exception -> L150
        int r114 = 10;
        if (r60.isEmpty() == true) goto L153;
        l93.o(10, 10);     // Catch: Exception -> L150
        int r65 = r60.size();     // Catch: Exception -> L150
        int r115 = r65 / 10;     // Catch: Exception -> L150
        if ((r65 % 10) != 0) goto L135;
        int r116 = 0;
    L136:
        int r117 = r115 + r116;     // Catch: Exception -> L150
        Throwable r118 = null;
        ArrayList r66 = new ArrayList(r117);     // Catch: Exception -> L150
        int r119 = 0;
    L137:
        if (r119 < 0) goto L147;
        if (r119 >= r65) goto L147;
        int r67 = r65 - r119;     // Catch: Exception -> L150
        if (r114 > r67) goto L143;
        r67 = r114;
    L143:
        ArrayList r120 = new ArrayList(r67);     // Catch: Exception -> L150
    L144:
        if (r5 >= r67) goto L146;
        r120.add(r60.get(r5 + r119));     // Catch: Exception -> L150
        r5 = r5 + 1;     // Catch: Exception -> L150
        goto L144
    L146:
        r66.add(r120);     // Catch: Exception -> L150
        r119 = r119 + 10;     // Catch: Exception -> L150
        r5 = 0;
        r114 = 10;
    L147:
        int r68 = r66.size();     // Catch: Exception -> L150
        HubAssistantTask r69 = null;
        int r70 = 0;
    L148:
        if (r70 >= r68) goto L152;
        Object r71 = r66.get(r70);     // Catch: Exception -> L150
        r70 = r70 + 1;     // Catch: Exception -> L150
        List r72 = (List) r71;     // Catch: Exception -> L150
        String r73 = r61.getResources().getQuantityString(R.plurals.homemusic_share_sending_images, r72.size(), new Object[]{Integer.valueOf(r72.size())});     // Catch: Exception -> L150
        r73.getClass();     // Catch: Exception -> L150
        io1.b.post(new ws1(r61, r73, 2));     // Catch: Exception -> L150
        ContentResolver r74 = r61.getContentResolver();     // Catch: Exception -> L150
        r74.getClass();     // Catch: Exception -> L150
        r69 = rr1.a(r74, r72);     // Catch: Exception -> L150
        goto L148
    L152:
        r69.getClass();     // Catch: Exception -> L150
        r112.n = "/assistant/" + r69.getId();     // Catch: Exception -> L150
        String r75 = r61.getString(R.string.homemusic_share_images_sent);     // Catch: Exception -> L150
    L155:
        if (r62.isEmpty() == true) goto L185;
        int r76 = r62.size();     // Catch: Exception -> L150
        int r77 = 0;
        int r78 = 0;
        int r79 = 0;
    L157:
        if (r79 >= r76) goto L171;
        Object r121 = r62.get(r79);     // Catch: Exception -> L150
        r79 = r79 + 1;     // Catch: Exception -> L150
        int r122 = r77 + 1;     // Catch: Exception -> L150
        if (r77 < 0) goto L169;
        Uri r123 = (Uri) r121;     // Catch: Exception -> L150
        String r80 = r61.getString(R.string.homemusic_share_uploading, new Object[]{Integer.valueOf(r122), Integer.valueOf(r62.size())});     // Catch: Exception -> L150
        r80.getClass();     // Catch: Exception -> L150
        ArrayList r124 = r60;
        String r125 = r75;
        io1.b.post(new ws1(r61, r80, 2));     // Catch: Exception -> L150
        ContentResolver r81 = r61.getContentResolver();     // Catch: Exception -> L150 IOException -> L163
        r81.getClass();     // Catch: Exception -> L150 IOException -> L163
        rr1.y(r81, r123);     // Catch: Exception -> L150 IOException -> L163
        r78 = r78 + 1;
    L168:
        r77 = r122;
        r60 = r124;
        r75 = r125;
        goto L157
    L163:
        e = move-exception;
        Log.w("HubShareActivity", "Upload failed for " + r123, e);     // Catch: Exception -> L150
        String r82 = e.getMessage();     // Catch: Exception -> L150
        if (r82 != null) goto L167;
        r82 = e.getClass().getSimpleName();     // Catch: Exception -> L150
    L167:
        r113.add(r82);     // Catch: Exception -> L150
        goto L168
    L169:
        gb.c0();     // Catch: Exception -> L150
        throw r118;     // Catch: Exception -> L150
    L171:
        ArrayList r126 = r60;
        String r127 = r75;
        if (r78 <= 0) goto L179;
        r112.n = "/upload";     // Catch: Exception -> L150
        if (r126.isEmpty() == true) goto L177;
        String r83 = r61.getString(R.string.homemusic_share_images_sent);     // Catch: Exception -> L150
    L176:
        String r84 = r83;
    L188:
        if (r126.isEmpty() == true) goto L190;
    L204:
        if (r84 == null) goto L206;
        Collection r85 = gb.O(r84);     // Catch: Exception -> L150
    L207:
        ArrayList r86 = new ArrayList(r40.k0(r113, 10));     // Catch: Exception -> L150
        int r87 = r113.size();     // Catch: Exception -> L150
        int r88 = 0;
    L208:
        if (r88 >= r87) goto L210;
        Object r89 = r113.get(r88);     // Catch: Exception -> L150
        r88 = r88 + 1;     // Catch: Exception -> L150
        String r90 = r61.getString(R.string.homemusic_share_partial_error, new Object[]{(String) r89});     // Catch: Exception -> L150
        r90.getClass();     // Catch: Exception -> L150
        r86.add(r90);     // Catch: Exception -> L150
        goto L208
    L210:
        io1.b.post(new v6(r61, r112, q40.B0(q40.G0(r85, r86), "\n", null, null, null, 62), 16));     // Catch: Exception -> L150
        return;
    L206:
        r85 = u01.n;     // Catch: Exception -> L150
        goto L207
    L190:
        if (r62.isEmpty() == false) goto L204;
        String r91 = r61.getString(R.string.homemusic_share_sending_link);     // Catch: Exception -> L150
        r91.getClass();     // Catch: Exception -> L150
        io1.b.post(new ws1(r61, r91, 2));     // Catch: Exception -> L150
        ux3 r92 = HubShareActivity.P;     // Catch: Exception -> L150
        r92.getClass();     // Catch: Exception -> L150
        Matcher r93 = r92.n.matcher(r63);     // Catch: Exception -> L150
        r93.getClass();     // Catch: Exception -> L150
        if (r93.find(0) == true) goto L194;
        jv3 r94 = r118;
    L195:
        if (r94 == 0) goto L197;
        String r95 = ((Matcher) r94.n).group();     // Catch: Exception -> L150
        r95.getClass();     // Catch: Exception -> L150
        String r96 = r95;
    L198:
        if (r96 != 0) goto L200;
    L202:
        HubAssistantTask r97 = rr1.b(r63, r96, false);     // Catch: Exception -> L150
    L203:
        r112.n = "/assistant/" + r97.getId();     // Catch: Exception -> L150
        goto L204
    L200:
        if ((r63.length() - r96.length()) > 1) goto L202;
        r97 = rr1.b(r63, r96, true);     // Catch: Exception -> L150
        goto L203
    L197:
        r96 = r118;
        goto L198
    L194:
        r94 = new jv3(r93, r63);     // Catch: Exception -> L150
        goto L195
    L177:
        r83 = r61.getString(R.string.homemusic_share_audio_sent, new Object[]{Integer.valueOf(r78)});     // Catch: Exception -> L150
        goto L176
    L179:
        if (r112.n != null) goto L186;
        String r98 = (String) q40.x0(r113);     // Catch: Exception -> L150
        if (r98 != null) goto L184;
        r98 = r61.getString(R.string.homemusic_share_failed);     // Catch: Exception -> L150
        r98.getClass();     // Catch: Exception -> L150
    L184:
        throw new HubException(r98);     // Catch: Exception -> L150
    L186:
        r84 = r127;
        goto L188
    L185:
        r126 = r60;
        r127 = r75;
        goto L186
    L135:
        r116 = 1;
        goto L136
    L153:
        r118 = null;
        r75 = null;
    L150:
        e = move-exception;
        Log.w("HubShareActivity", "Share failed", e);
        io1.b.post(new ws1(1, r61, e));
        return;
    L214:
        vb4 r99 = (vb4) this.o;
        jx3 r100 = (jx3) this.p;
        jx3 r101 = (jx3) this.q;
        Preference r102 = (Preference) this.r;
        Object r103 = ((HubAuthOptions) rr1.s(null, "/api/auth/options", HubAuthOptions.class)).getGoogleClientId();     // Catch: Throwable -> L217
    L220:
        if ((r103 instanceof s14) == false) goto L222;
        r103 = null;
    L222:
        String r104 = (String) r103;
        if (r104 != null) goto L225;
    L236:
        HubMe r105 = null;
    L237:
        io1.b.post(new up(r99, r105, r100, r104, r101, r102));
        return;
    L225:
        if (qm4.u0(r104) == true) goto L236;
        Object r106 = rr1.h();     // Catch: Throwable -> L229
    L232:
        if ((r106 instanceof s14) == false) goto L234;
        Object r128 = null;
    L235:
        r105 = (HubMe) r128;
        goto L237
    L234:
        r128 = r106;
    L229:
        th = move-exception;
        r106 = new s14(th);
    L217:
        th = move-exception;
        r103 = new s14(th);
        goto L220
    L239:
        String r107 = (String) this.o;
        Child r108 = (Child) this.p;
        String r109 = (String) this.q;
        fx3 r129 = (fx3) this.r;
        rr1.f(r107, r108.getArtist(), r108.getTitle(), r109, rs1.f());     // Catch: Exception -> L242
        WeakReference r130 = b.a;     // Catch: Exception -> L242
        io1.b.post(new kt1(2, r107));     // Catch: Exception -> L242
        return;
    L242:
        e = move-exception;
        Log.w("HubDislikes", "dislike " + r107 + ": " + e.getMessage());
        r129.n = true;
        rs1.j(ih3.c(PlayEvent.Companion, PlayEvent.DISLIKE, r107, rs1.f(), System.currentTimeMillis(), r109, 16304));
        return;
    L245:
        cp1 r131 = (cp1) this.o;
        PlaylistWithSongs r132 = (PlaylistWithSongs) this.p;
        MainActivity r133 = (MainActivity) this.q;
        HubMix r134 = (HubMix) this.r;
        if (r131.T == null) goto L480;
        if (r132 != null) goto L250;
        js1.a(r133, "/mix/" + r134.getId());
        return;
    L250:
        String r135 = r132.getId();
        String r136 = r132.getName();
        if (r136 != null) goto L253;
        r136 = r134.getTitle();
    L253:
        Playlist r137 = new Playlist(r135, r136, r132.getDuration(), r132.getCoverArtId());
        r137.setSongCount(r132.getSongCount());
        Bundle r138 = new Bundle();
        r138.putParcelable("PLAYLIST_OBJECT", r137);
        r133.T.m(R.id.action_homeFragment_to_playlistPageFragment, r138, null);     // Catch: Throwable -> L256
        Object r139 = j15.a;     // Catch: Throwable -> L256
    L258:
        Throwable r140 = bb3.a(r139);
        if (r140 == null) goto L479;
        Log.w("HomeMixCards", "open the mix", r140);
        return;
    L479:
        return;
    L256:
        th = move-exception;
        r139 = new s14(th);
        goto L258
    L480:
        return;
    L262:
        String r141 = (String) this.o;
        cp1 r142 = (cp1) this.p;
        MainActivity r143 = (MainActivity) this.q;
        HubMix r144 = (HubMix) this.r;
        ApiResponse r145 = (ApiResponse) App.f(false).g().F(r141).execute().body();     // Catch: Throwable -> L269
        if (r145 == null) goto L271;
        SubsonicResponse r146 = r145.getSubsonicResponse();     // Catch: Throwable -> L269
        if (r146 == null) goto L271;
        Object r147 = r146.getPlaylist();     // Catch: Throwable -> L269
    L274:
        if ((r147 instanceof s14) == false) goto L276;
        Object r148 = null;
    L277:
        io1.b.post(new t6(r142, (PlaylistWithSongs) r148, r143, r144, 5));
        return;
    L276:
        r148 = r147;
    L271:
        r147 = null;
    L269:
        th = move-exception;
        r147 = new s14(th);
        goto L274
    L279:
        na4 r149 = (na4) this.o;
        AtomicBoolean r150 = (AtomicBoolean) this.p;
        ba0 r151 = (ba0) this.q;
        AtomicBoolean r152 = (AtomicBoolean) this.r;
        Object r153 = r149.n;
        monitor-enter(r153);
    L284:
        th = move-exception;
        throw th;
    L282:
        if (r150.get() == true) goto L286;
        r149.r(r151);     // Catch: Throwable -> L284
    L287:
        monitor-exit(r153);     // Catch: Throwable -> L284
        return;
    L286:
        r152.set(true);     // Catch: Throwable -> L284
        goto L287
    L291:
        qi3 r154 = (qi3) this.o;
        String r155 = (String) this.p;
        String r156 = (String) this.q;
        MediaService r157 = (MediaService) this.r;
        gn2 r158 = r154.a();
        if (r158 == null) goto L486;
        do2 r159 = r158.d;
        int r160 = r154.o0();
        if (r160 == (-1)) goto L487;
        Bundle r161 = r159.I;
        CharSequence r162 = r159.a;
        if (r161 == null) goto L300;
        String r163 = r161.getString("type");
    L302:
        if (h12.c(r163, WaveOrigin.RADIO) == false) goto L488;
        CharSequence r164 = r159.b;
        if (r164 != null) goto L307;
    L308:
        if (r162 != null) goto L310;
    L311:
        if (r161 == null) goto L316;
        String r165 = r161.getString("radioArtist");
        if (r165 == null) goto L316;
        if (qm4.u0(r165) == true) goto L316;
        return;
    L316:
        if (r161 == null) goto L321;
        String r166 = r161.getString("radioTitle");
        if (r166 == null) goto L321;
        if (qm4.u0(r166) == true) goto L321;
        return;
    L321:
        co2 r167 = r159.a();
        if (r161 != null) goto L324;
        Bundle r168 = new Bundle();
    L325:
        Bundle r169 = new Bundle(r168);
        if (r155 == null) goto L328;
        r169.putString("radioArtist", r155);
    L328:
        if (r156 == null) goto L330;
        r169.putString("radioTitle", r156);
    L330:
        if (r161 == null) goto L333;
        String r170 = r161.getString("stationName");
        if (r170 == null) goto L333;
    L337:
        if (qm4.u0(r170) == true) goto L339;
        r169.putString("stationName", r170);
    L339:
        if (r155 != null) goto L341;
    L348:
        if (r156 != null) goto L350;
    L353:
        if (r155 != null) goto L355;
    L356:
        r155 = r170;
    L357:
        r167.a = r155;
        if (qm4.u0(r170) == true) goto L360;
        r167.b = r170;
    L360:
        r167.H = r169;
        if ((r154 instanceof ExoPlayer) == false) goto L363;
        ExoPlayer r171 = (ExoPlayer) r154;
    L364:
        if (r171 == null) goto L485;
        tm2 r172 = r158.a();
        r172.k = new do2(r167);
        ((fq) r171).z0(r160, r172.a());
        r157.w(r171);
        return;
    L485:
        return;
    L363:
        r171 = null;
        goto L364
    L355:
        if (qm4.u0(r155) == false) goto L357;
    L350:
        if (qm4.u0(r156) == true) goto L353;
        r155 = r156;
        goto L357
    L341:
        if (qm4.u0(r155) == true) goto L348;
        if (r156 == null) goto L348;
        if (qm4.u0(r156) == true) goto L348;
        r155 = b11.o(r155, " - ", r156);
    L333:
        if (r162 == null) goto L335;
        r170 = r162.toString();
        goto L337
    L335:
        r170 = "";
        goto L337
    L324:
        r168 = r161;
        goto L325
    L310:
        if (qm4.u0(r162) == true) goto L311;
        return;
    L307:
        if (qm4.u0(r164) == true) goto L308;
        return;
    L488:
        return;
    L300:
        r163 = null;
        goto L302
    L487:
        return;
    L486:
        return;
    L367:
        ArtistBottomSheetDialog r173 = (ArtistBottomSheetDialog) this.o;
        TextView r174 = (TextView) this.p;
        TextView r175 = (TextView) this.q;
        TextView r176 = (TextView) this.r;
        r173.F0 = false;
        if (r174 == null) goto L370;
        r174.setEnabled(true);
    L370:
        if (r175 == null) goto L372;
        r175.setEnabled(true);
    L372:
        if (r176 == null) goto L489;
        r176.setEnabled(true);
        return;
    L489:
        return;
    L375:
        ParcelFileDescriptor r177 = (ParcelFileDescriptor) this.o;
        File r178 = (File) this.p;
        Context r179 = (Context) this.q;
        Uri r180 = (Uri) this.r;
        int r181 = AlbumArtContentProvider.o;
        ParcelFileDescriptor.AutoCloseOutputStream r182 = new ParcelFileDescriptor.AutoCloseOutputStream(r177);     // Catch: Exception -> L406
        if (r178 != null) goto L443;
        vz3 r183 = (vz3) com.bumptech.glide.a.c(r179).p().N(r180).e(xq0.d);     // Catch: Throwable -> L382
        if (ud3.R() == false) goto L384;
        r183 = (vz3) r183.l();     // Catch: Throwable -> L382
    L384:
        r178 = (File) r183.R(Integer.MIN_VALUE, Integer.MIN_VALUE).get();     // Catch: Throwable -> L382
    L382:
        th = move-exception;
        r182.close();     // Catch: Throwable -> L410
    L491:
        throw th;     // Catch: Exception -> L406
    L410:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Exception -> L406
        throw th;     // Catch: Exception -> L406
    L443:
        FileInputStream r184 = new FileInputStream(r178);     // Catch: Throwable -> L382 Exception -> L396
        byte[] r185 = new byte[8192];     // Catch: Throwable -> L392
    L388:
        int r186 = r184.read(r185);     // Catch: Throwable -> L392
        if (r186 == (-1)) goto L394;
        r182.write(r185, 0, r186);     // Catch: Throwable -> L392
        goto L388
    L394:
        r184.close();     // Catch: Throwable -> L382 Exception -> L396
    L404:
        r182.close();     // Catch: Exception -> L406
        return;
    L392:
        th = move-exception;
        r184.close();     // Catch: Throwable -> L400
        throw th;     // Catch: Throwable -> L382 Exception -> L396
    L400:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L382 Exception -> L396
        throw th;     // Catch: Throwable -> L382 Exception -> L396
    L396:
        e = move-exception;
        r177.closeWithError("Failed to load image: " + e.getMessage());     // Catch: Throwable -> L382
    L406:
        e = move-exception;
        r177.closeWithError("Failed to load image: " + e.getMessage());     // Catch: IOException -> L415
        return;
    }

    public /* synthetic */ t6(pn2 r1, AtomicInteger r2, yw1 r3, ArrayList r4, lb4 r5) {
        this.n = 13;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
    }

    public /* synthetic */ t6(lo2 r1, kn2 r2, String r3, Bundle r4, sk2 r5) {
        this.n = 17;
        this.o = r1;
        this.p = r3;
        this.q = r4;
        this.r = r5;
    }

    public /* synthetic */ t6(Object r2, SmartSession r3, String r4, Context r5) {
        this.n = 9;
        this.o = r2;
        this.p = r3;
        this.r = r4;
        this.q = r5;
    }

    public /* synthetic */ t6(Object r1, Object r2, Object r3, Object r4, int r5) {
        this.n = r5;
        this.o = r1;
        this.p = r2;
        this.q = r3;
        this.r = r4;
    }
}
