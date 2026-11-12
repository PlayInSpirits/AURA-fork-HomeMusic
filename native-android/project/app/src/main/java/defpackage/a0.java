package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.widget.Toast;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.ui.DefaultTimeBar;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.ui.fragment.AlbumPageFragment;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import com.eddyizm.tempus.ui.fragment.DirectoryFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.AlbumBottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.skydoves.colorpickerview.ColorPickerView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ a0(q41 r1, int r2) {
        this.n = 28;
        this.o = r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // java.lang.Runnable
    public final void run() {
        int r1 = this.n;
        int r5 = 2;
        int r7 = 3;
        boolean r9 = true;
        int r10 = 0;
        Object r0 = this.o;
        switch(r1) {
            case 0: goto L248;
            case 1: goto L207;
            case 2: goto L205;
            case 3: goto L196;
            case 4: goto L184;
            case 5: goto L152;
            case 6: goto L150;
            case 7: goto L123;
            case 8: goto L119;
            case 9: goto L117;
            case 10: goto L115;
            case 11: goto L113;
            case 12: goto L111;
            case 13: goto L107;
            case 14: goto L105;
            case 15: goto L103;
            case 16: goto L101;
            case 17: goto L97;
            case 18: goto L89;
            case 19: goto L87;
            case 20: goto L85;
            case 21: goto L83;
            case 22: goto L81;
            case 23: goto L79;
            case 24: goto L77;
            case 25: goto L28;
            case 26: goto L26;
            case 27: goto L17;
            case 28: goto L15;
            default: goto L4;
        };
    L4:
        sk3 r2 = (sk3) r0;
        monitor-enter(r2);     // Catch: ExoPlaybackException -> L12
        monitor-exit(r2);     // Catch: ExoPlaybackException -> L12
        r2.a.c(r2.c, r2.d);     // Catch: Throwable -> L9
        r2.a(true);     // Catch: ExoPlaybackException -> L12
        return;
    L9:
        th = move-exception;
        r2.a(true);     // Catch: ExoPlaybackException -> L12
        throw th;     // Catch: ExoPlaybackException -> L12
    L12:
        e = move-exception;
        l93.G("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
        er1.m(e);
        return;
    L15:
        nj0 r3 = ((q41) r0).K;
        r3.b0(r3.W(), 1034, new oi0(15));
        return;
    L17:
        i41 r4 = (i41) r0;
        c6 r6 = r4.D;
        Context r8 = r4.f;
        String r11 = f35.a;
        int r12 = xl.n(r8).generateAudioSessionId();
        if (r12 != (-1)) goto L21;
        r12 = 0;
    L21:
        Integer r13 = Integer.valueOf(r12);
        r6.f = r13;
        wo r14 = new wo(r6, r13, r10);
        yp4 r15 = (yp4) r6.c;
        if (r15.a.getLooper().getThread().isAlive() == false) goto L295;
        r15.d(r14);
        return;
    L295:
        return;
    L26:
        ix0 r16 = (ix0) r0;
        boolean r17 = r16.h.isPopupShowing();
        r16.s(r17);
        r16.m = r17;
        return;
    L28:
        bu0 r18 = (bu0) r0;
        r18.getClass();
        if (ud3.o() != null) goto L31;
        r18.f.i(-1);
        return;
    L31:
        lg1 r19 = new lg1(10, (ss0) r18.c.o);
        Thread r20 = new Thread(r19);
        r20.start();
        r20.join();     // Catch: InterruptedException -> L34
    L36:
        List r21 = (List) r19.p;
        if (r21 != null) goto L39;
    L75:
        r18.f.i(0);
        return;
    L39:
        if (r21.isEmpty() == true) goto L75;
        ArrayList r22 = new ArrayList();
        Iterator r23 = r21.iterator();
    L43:
        if (r23.hasNext() == false) goto L62;
        Download r24 = (Download) r23.next();
        String r25 = r24.getDownloadUri();
        if (r25 == null) goto L43;
        if (r25.isEmpty() == true) goto L43;
        Uri r26 = Uri.parse(r25);
        if (r26.getScheme() == null) goto L43;
        if (r26.getScheme().equalsIgnoreCase("content") == false) goto L43;
        Application r27 = r18.b;     // Catch: SecurityException -> L56
        r27.getClass();     // Catch: SecurityException -> L56
        af4 r28 = new af4();     // Catch: SecurityException -> L56
        r28.b = r27;     // Catch: SecurityException -> L56
        r28.c = r26;     // Catch: SecurityException -> L56
    L57:
        if (r28 == null) goto L60;
        if (r28.b() == true) goto L43;
    L60:
        r22.add(r24);
    L56:
        r28 = null;
        goto L57
    L62:
        if (r22.isEmpty() == true) goto L74;
        ArrayList r29 = new ArrayList();
        int r30 = r22.size();
    L64:
        if (r10 >= r30) goto L73;
        Object r31 = r22.get(r10);
        r10 = r10 + 1;
        Download r32 = (Download) r31;
        r29.add(r32.getId());
        ConcurrentHashMap r33 = g51.a;
        monitor-enter(g51.class);
        String r34 = g51.a(r32.getArtist(), r32.getTitle(), r32.getAlbum());     // Catch: Throwable -> L70
        g51.a.remove(r34);     // Catch: Throwable -> L70
        j51.K(r34);     // Catch: Throwable -> L70
        monitor-exit(g51.class);
    L70:
        th = move-exception;
        throw th;
    L73:
        new Thread(new lg1(9, (ss0) r18.c.o, r29)).start();
        g51.i();
        r18.f.i(Integer.valueOf(r29.size()));
        return;
    L74:
        r18.f.i(0);
        return;
    L34:
        e = move-exception;
        e.printStackTrace();
        goto L36
    L77:
        ((la0) r0).d();
        return;
    L79:
        ((zd0) r0).d();
        return;
    L81:
        DirectoryFragment r35 = (DirectoryFragment) r0;
        Toast.makeText(r35.Z(), r35.s(R.string.folder_play_no_songs), 0).show();
        return;
    L83:
        ((tn0) r0).h.d();
        return;
    L85:
        int r36 = DefaultTimeBar.f0;
        ((DefaultTimeBar) r0).d(false);
        return;
    L87:
        ((ik0) r0).d(null);
        return;
    L89:
        jk0 r37 = (jk0) r0;
        if (r37.p == true) goto L299;
        pw0 r38 = r37.o;
        if (r38 == null) goto L95;
        r38.d(r37.n);
    L95:
        r37.q.n.remove(r37);
        r37.p = true;
        return;
    L299:
        return;
    L97:
        tj0 r39 = (tj0) r0;
        if (r39.a0 < 300000) goto L300;
        r39.n.n();
        r39.a0 = 0;
        return;
    L300:
        return;
    L101:
        nj0 r40 = (nj0) r0;
        r40.b0(r40.W(), 1028, new jj0(r5));
        r40.s.d();
        return;
    L103:
        CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$5hlDM94MjJzc7w2nd16ozsS7vqI((CredentialProviderCreatePublicKeyCredentialController) r0);
        return;
    L105:
        n70.a((n70) r0);
        return;
    L107:
        i70 r41 = (i70) r0;
        Runnable r42 = r41.o;
        if (r42 == null) goto L301;
        r42.run();
        r41.o = null;
        return;
    L301:
        return;
    L111:
        ColorPickerView r43 = (ColorPickerView) r0;
        int r44 = ColorPickerView.H;
        r43.a(r43.getColor());
        r43.f(r43.p);
        return;
    L113:
        ((s30) r0).s(true);
        return;
    L115:
        au r45 = (au) r0;
        r45.g = null;
        ((BottomSheetBehavior) r45.b).J(4);
        return;
    L117:
        ((tc2) r0).f(-1, new kf2(6));
        return;
    L119:
        kl r46 = (kl) r0;
        if (r46.c.o == false) goto L302;
        r46.a.n.w1(3, false);
        return;
    L302:
        return;
    L123:
        cl r47 = (cl) r0;
        Object r48 = r47.a;
        monitor-enter(r48);
    L129:
        th = move-exception;
        throw th;
    L126:
        if (r47.m == false) goto L131;
        monitor-exit(r48);     // Catch: Throwable -> L129
        return;
    L131:
        long r49 = r47.l - 1;     // Catch: Throwable -> L129
        r47.l = r49;     // Catch: Throwable -> L129
        if (r49 <= 0) goto L135;
        monitor-exit(r48);     // Catch: Throwable -> L129
        return;
    L135:
        if (r49 >= 0) goto L145;
        IllegalStateException r50 = new IllegalStateException();     // Catch: Throwable -> L129
        Object r51 = r47.a;     // Catch: Throwable -> L129
        monitor-enter(r51);     // Catch: Throwable -> L129
        r47.n = r50;     // Catch: Throwable -> L142
        monitor-exit(r51);     // Catch: Throwable -> L142
        monitor-exit(r48);     // Catch: Throwable -> L129
        return;
    L142:
        th = move-exception;
        throw th;     // Catch: Throwable -> L129
    L145:
        r47.a();     // Catch: Throwable -> L129
        monitor-exit(r48);     // Catch: Throwable -> L129
        return;
    L150:
        ArtistPageFragment r52 = (ArtistPageFragment) r0;
        r52.l0.k.setVisibility(0);
        r52.l0.p.setVisibility(8);
        r52.l0.s.setVisibility(8);
        r52.l0.r.setVisibility(8);
        r52.l0.q.setVisibility(0);
        r52.l0.t.setVisibility(8);
        return;
    L152:
        lb r53 = (lb) r0;
        boolean r54 = r53.e();
        ra r55 = r53.n;
        if (r54 == false) goto L306;
        Trace.beginSection("ContentCapture:changeChecker");
        r55.q(true);     // Catch: Throwable -> L181
        i03 r56 = r53.x;     // Catch: Throwable -> L181
        int[] r57 = r56.b;     // Catch: Throwable -> L181
        long[] r58 = r56.a;     // Catch: Throwable -> L181
        int r59 = r58.length - 2;     // Catch: Throwable -> L181
        if (r59 < 0) goto L173;
        int r60 = 0;
    L159:
        long r61 = r58[r60];     // Catch: Throwable -> L181
        if (((((~r61) << 7) & r61) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L171;
        int r62 = 8 - ((~(r60 - r59)) >>> 31);     // Catch: Throwable -> L181
        int r110 = r10;
    L162:
        if (r110 >= r62) goto L170;
        if ((255 & r61) >= 128) goto L169;
        int r111 = r57[(r60 << 3) + r110];     // Catch: Throwable -> L181
        if (r53.d().a(r111) == true) goto L169;
        r53.q.add(new yc0(r111, r53.w, zc0.o, null));     // Catch: Throwable -> L181
        r53.u.d(j15.a);     // Catch: Throwable -> L181
    L169:
        r61 = r61 >> 8;     // Catch: Throwable -> L181
        r110 = r110 + 1;     // Catch: Throwable -> L181
        goto L162
    L170:
        if (r62 != 8) goto L173;
    L171:
        if (r60 == r59) goto L173;
        r60 = r60 + 1;     // Catch: Throwable -> L181
        r10 = 0;
    L173:
        Trace.beginSection("ContentCapture:sendAppearEvents");     // Catch: Throwable -> L181
        r53.g(r55.getSemanticsOwner().a(), r53.y);     // Catch: Throwable -> L178
        Trace.endSection();     // Catch: Throwable -> L181
        r53.c(r53.d());     // Catch: Throwable -> L181
        r53.l();     // Catch: Throwable -> L181
        r53.z = false;     // Catch: Throwable -> L181
        Trace.endSection();
        return;
    L178:
        th = move-exception;
        Trace.endSection();     // Catch: Throwable -> L181
        throw th;     // Catch: Throwable -> L181
    L181:
        th = move-exception;
        Trace.endSection();
        throw th;
    L306:
        return;
    L184:
        ya r63 = (ya) r0;
        Trace.beginSection("Compose:semantics:measureAndLayout");
        r63.q.q(true);     // Catch: Throwable -> L193
        Trace.endSection();
        Trace.beginSection("Compose:semantics:checkForSemanticsChanges");
        r63.n();     // Catch: Throwable -> L190
        Trace.endSection();
        r63.V = false;
        return;
    L190:
        th = move-exception;
        Trace.endSection();
        throw th;
    L193:
        th = move-exception;
        Trace.endSection();
        throw th;
    L196:
        AlbumPageFragment r64 = (AlbumPageFragment) r0;
        if (r64.l0 == null) goto L307;
        int r65 = (int) r64.r().getDimension(R.dimen.bottom_sheet_behavior_peek_height);
        View r66 = r64.X().getWindow().getDecorView();
        WeakHashMap r67 = j65.a;
        pb5 r68 = b65.a(r66);
        if (r68 != null) goto L202;
        int r112 = 0;
    L203:
        RecyclerView r69 = (RecyclerView) r64.l0.q;
        r69.setPadding(r69.getPaddingLeft(), ((RecyclerView) r64.l0.q).getPaddingTop(), ((RecyclerView) r64.l0.q).getPaddingRight(), r112 + r65);
        return;
    L202:
        r112 = r68.a.h(519).d;
        goto L203
    L307:
        return;
    L205:
        ((AlbumBottomSheetDialog) r0).o0();
        return;
    L207:
        Activity r70 = (Activity) r0;
        if (r70.isFinishing() == true) goto L308;
        Handler r71 = n5.g;
        Method r72 = n5.f;
        Application r73 = Build.VERSION.SDK_INT;
        if (r73 < 28) goto L212;
        r70.recreate();
        return;
    L212:
        m5 r74 = 27;
        if (r73 == 26) goto L215;
        if (r73 == 27) goto L215;
    L218:
        if (n5.e == null) goto L220;
    L264:
        Object r113 = n5.c.get(r70);     // Catch: Throwable -> L250
        if (r113 == null) goto L246;
        Object r75 = n5.b.get(r70);     // Catch: Throwable -> L250
        if (r75 == null) goto L246;
        r73 = r70.getApplication();     // Catch: Throwable -> L250
        r74 = new m5(r70);     // Catch: Throwable -> L250
        r73.registerActivityLifecycleCallbacks(r74);     // Catch: Throwable -> L250
        r71.post(new lg1(r5, r74, r113));     // Catch: Throwable -> L250
        if (r73 == 26) goto L265;
        if (r73 == 27) goto L265;
        r9 = false;
    L265:
        if (r9 == true) goto L268;
        r70.recreate();     // Catch: Throwable -> L238
    L243:
        r71.post(new lg1(r7, r73, r74));     // Catch: Throwable -> L250
        return;
    L268:
        Boolean r114 = Boolean.FALSE;     // Catch: Throwable -> L240
        r72.invoke(r75, new Object[]{r113, null, null, 0, r114, null, null, r114, r114});     // Catch: Throwable -> L238
    L240:
        th = th;
        ?? r76 = r73;
        ?? r77 = r74;
    L244:
        r71.post(new lg1(r7, r76, r77));     // Catch: Throwable -> L250
        throw th;     // Catch: Throwable -> L250
    L238:
        th = th;
        r76 = r73;
        r77 = r74;
    L246:
        r70.recreate();
        return;
    L220:
        if (n5.d != null) goto L264;
    L215:
        if (r72 != null) goto L218;
    L308:
        return;
    L248:
        ((b0) r0).b();
    }

    public /* synthetic */ a0(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    public /* synthetic */ a0(q41 r1, sk3 r2) {
        this.n = 29;
        this.o = r2;
    }
}
