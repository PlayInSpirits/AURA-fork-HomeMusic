package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.media3.session.MediaLibraryService;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveOut;
import com.eddyizm.tempus.ui.fragment.IndexFragment;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qa1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ qa1(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    private final void a() {
        Object r1 = ((MediaLibraryService) this.o).n;
        monitor-enter(r1);
        monitor-exit(r1);     // Catch: Throwable -> L6
        return;
    L6:
        th = move-exception;
        throw th;
    }

    private final void b() {
        hw2 r1 = (hw2) this.o;
        Object r0 = r1.p;
        monitor-enter(r0);
        fw2 r2 = r1.s;     // Catch: Throwable -> L7
        if (r2 == null) goto L9;
        r2.a();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    private final void c() {
        u53 r9 = (u53) this.o;
        uj0 r0 = (uj0) r9.a.get();
        if (r0 == null) goto L47;
        int r10 = r9.c.b();
        vj0 r1 = r0.a;
        monitor-enter(r1);
        int r2 = r1.A;     // Catch: Throwable -> L12
        if (r2 != 0) goto L9;
    L14:
        if (r2 == r10) goto L16;
    L19:
        r1.A = r10;     // Catch: Throwable -> L12
        if (r10 == 1) goto L43;
        if (r10 == 0) goto L43;
        if (r10 == 8) goto L43;
        if (r1.B != null) goto L36;
        Context r3 = r1.n;     // Catch: Throwable -> L12
        String r4 = f35.a;     // Catch: Throwable -> L12
        if (r3 == null) goto L34;
        TelephonyManager r5 = (TelephonyManager) r3.getSystemService("phone");     // Catch: Throwable -> L12
        if (r5 == null) goto L34;
        String r6 = r5.getNetworkCountryIso();     // Catch: Throwable -> L12
        if (TextUtils.isEmpty(r6) == true) goto L34;
        String r7 = rr2.V(r6);     // Catch: Throwable -> L12
    L35:
        r1.B = r7;     // Catch: Throwable -> L12
    L34:
        r7 = rr2.V(Locale.getDefault().getCountry());     // Catch: Throwable -> L12
    L36:
        r1.y = r1.e(r10);     // Catch: Throwable -> L12
        r1.q.getClass();     // Catch: Throwable -> L12
        long r8 = SystemClock.elapsedRealtime();     // Catch: Throwable -> L12
        if (r1.t <= 0) goto L39;
        int r11 = (int) (r8 - r1.u);     // Catch: Throwable -> L12
    L40:
        r1.f(r11, r1.v, r1.y);     // Catch: Throwable -> L12
        r1.u = r8;     // Catch: Throwable -> L12
        r1.v = 0;     // Catch: Throwable -> L12
        r1.x = 0;     // Catch: Throwable -> L12
        r1.w = 0;     // Catch: Throwable -> L12
        fg4 r12 = r1.s;     // Catch: Throwable -> L12
        ((ArrayList) r12.f).clear();     // Catch: Throwable -> L12
        r12.b = -1;     // Catch: Throwable -> L12
        r12.c = 0;     // Catch: Throwable -> L12
        r12.d = 0;     // Catch: Throwable -> L12
        monitor-exit(r1);
        return;
    L39:
        r11 = 0;
    L43:
        monitor-exit(r1);
        return;
    L16:
        if (r1.B == null) goto L19;
        monitor-exit(r1);
        return;
    L9:
        if (r1.r == true) goto L14;
        monitor-exit(r1);
        return;
    L12:
        th = move-exception;
        throw th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String r2 = null;
        int r3 = 0;
        switch(this.n) {
            case 0: goto L97;
            case 1: goto L95;
            case 2: goto L93;
            case 3: goto L91;
            case 4: goto L89;
            case 5: goto L87;
            case 6: goto L85;
            case 7: goto L83;
            case 8: goto L81;
            case 9: goto L79;
            case 10: goto L77;
            case 11: goto L70;
            case 12: goto L66;
            case 13: goto L61;
            case 14: goto L59;
            case 15: goto L55;
            case 16: goto L53;
            case 17: goto L49;
            case 18: goto L47;
            case 19: goto L45;
            case 20: goto L43;
            case 21: goto L41;
            case 22: goto L39;
            case 23: goto L35;
            case 24: goto L33;
            case 25: goto L31;
            case 26: goto L29;
            case 27: goto L17;
            case 28: goto L13;
            default: goto L4;
        };
    L4:
        PlaylistPageFragment r5 = (PlaylistPageFragment) this.o;
        if (r5.l0 == null) goto L180;
        int r0 = (int) r5.r().getDimension(R.dimen.bottom_sheet_behavior_peek_height);
        View r1 = r5.X().getWindow().getDecorView();
        WeakHashMap r4 = j65.a;
        pb5 r6 = b65.a(r1);
        if (r6 == null) goto L11;
        r3 = r6.a.h(519).d;
    L11:
        RecyclerView r7 = r5.l0.n;
        r7.setPadding(r7.getPaddingLeft(), r5.l0.n.getPaddingTop(), r5.l0.n.getPaddingRight(), r3 + r0);
        return;
    L180:
        return;
    L13:
        ey r8 = ((hk3) this.o).l0;
        if (r8 == null) goto L181;
        ((Button) r8.h).setVisibility(8);
        return;
    L181:
        return;
    L17:
        PlayerControllerFragment r9 = (PlayerControllerFragment) this.o;
        bj2 r10 = (bj2) r9.M0.get();     // Catch: Exception -> L26
        PlayerControlView r11 = (PlayerControlView) r9.l0.p;     // Catch: Exception -> L26
        if (u52.c().a == false) goto L21;
        qi3 r12 = r9.m0;     // Catch: Exception -> L26
    L22:
        r11.setPlayer(r12);     // Catch: Exception -> L26
        App.b().getClass();     // Catch: Exception -> L26
        r10.s(App.c().getBoolean("shuffle_mode", false));     // Catch: Exception -> L26
        App.b().getClass();     // Catch: Exception -> L26
        r10.p0(App.c().getInt("repeat_mode", 0));     // Catch: Exception -> L26
        r9.n0(r10);     // Catch: Exception -> L26
        r9.q0(r10.K0());     // Catch: Exception -> L26
        r9.p0(r10.K0());     // Catch: Exception -> L26
        r10.v(new zj3(r9, r10));     // Catch: Exception -> L26
        r9.E0.setOnClickListener(new j8(15, r9, r10));     // Catch: Exception -> L26
        yf4.c().h = new vj3(r9);     // Catch: Exception -> L26
        r9.x0();     // Catch: Exception -> L26
        r9.v0.setOnClickListener(new rj3(r9, 6));     // Catch: Exception -> L26
        r9.w0.setOnClickListener(new rj3(r9, 7));     // Catch: Exception -> L26
        r9.m0();     // Catch: Exception -> L26
        i61 r13 = r9.l0;     // Catch: Exception -> L26
        if (r13 == null) goto L182;
        fu.K((LinearLayout) r13.o, r10);     // Catch: Exception -> L26
        return;
    L182:
        return;
    L21:
        r12 = r10;
    L26:
        e = move-exception;
        e.printStackTrace();
        return;
    L29:
        PlayerControlView r14 = (PlayerControlView) this.o;
        float[] r15 = PlayerControlView.U0;
        r14.n();
        return;
    L31:
        ((ki3) this.o).m--;
        return;
    L33:
        c();
        return;
    L35:
        qp4 r16 = (qp4) this.o;
        ah2 r17 = (ah2) r16.a;
        if (r17 == null) goto L184;
        r17.b((zg2) r16.b, (View) r16.c, true);
        return;
    L184:
        return;
    L39:
        b();
        return;
    L41:
        a();
        return;
    L43:
        ((uq2) this.o).b();
        return;
    L45:
        ((vo2) this.o).n = -1;
        return;
    L47:
        ((sk2) this.o).Y0();
        return;
    L49:
        s22 r18 = (s22) this.o;
        if (r18 == null) goto L185;
        r18.f(null);
        return;
    L185:
        return;
    L53:
        IndexFragment r19 = (IndexFragment) this.o;
        Toast.makeText(r19.Z(), r19.s(R.string.folder_play_no_songs), 0).show();
        return;
    L55:
        WaveOut r20 = (WaveOut) this.o;
        zr1 r21 = xt1.e;
        if (r21 == null) goto L186;
        r21.invoke(r20);
        return;
    L186:
        return;
    L59:
        Context r22 = ((vb4) this.o).Z().getApplicationContext();
        r22.getClass();
        gi1.W(r22);
        return;
    L61:
        ps1 r23 = (ps1) this.o;
        oh3 r24 = r23.l(r23.n.a());
        rs1 r25 = rs1.a;
        b00 r26 = b00.a;
        String r27 = b00.a();
        if (r24 == null) goto L64;
        r2 = r24.a;
    L64:
        rs1.a(r27, r2);
        return;
    L66:
        hp1 r28 = (hp1) this.o;
        iu3 r29 = r28.n0;
        if (r29 == null) goto L187;
        le1 r30 = r28.v();
        k03 r31 = r29.c.j();
        k03 r32 = r29.d;
        Objects.requireNonNull(r32);
        r31.e(r30, new g7(r32, r3));
        return;
    L187:
        return;
    L70:
        gp1 r33 = (gp1) this.o;
        jn3 r34 = r33.n0;
        if (r34 == null) goto L73;
        le1 r35 = r33.v();
        r34.c.getClass();
        k03 r36 = hh3.l(null, false);
        k03 r37 = r34.e;
        Objects.requireNonNull(r37);
        r36.e(r35, new g7(r37, r3));
    L73:
        jn3 r38 = r33.n0;
        if (r38 == null) goto L188;
        le1 r39 = r33.v();
        r38.c.getClass();
        k03 r40 = hh3.k();
        k03 r41 = r38.d;
        Objects.requireNonNull(r41);
        r40.e(r39, new g7(r41, r3));
        return;
    L188:
        return;
    L77:
        ((bp1) this.o).c.j0();
        return;
    L79:
        ((ap1) this.o).b.j0();
        return;
    L81:
        ((bp1) this.o).c.j0();
        return;
    L83:
        ((ap1) this.o).b.j0();
        return;
    L85:
        ((cp1) ((i4) ((np0) this.o).b).o).j0();
        return;
    L87:
        ((ap1) this.o).b.j0();
        return;
    L89:
        ((fo1) this.o).w();
        return;
    L91:
        ((om1) this.o).k();
        return;
    L93:
        ((ui1) this.o).k();
        return;
    L95:
        kc1 r42 = (kc1) this.o;
        le1 r43 = r42.d0;
        r43.s.s(r42.q);
        r42.q = null;
        return;
    L97:
        ra1 r44 = (ra1) this.o;
        Object r45 = r44.q;
        monitor-enter(r45);
    L103:
        th = move-exception;
        throw th;
    L100:
        if (r44.u != null) goto L105;
        monitor-exit(r45);     // Catch: Throwable -> L103
        return;
    L105:
        monitor-exit(r45);     // Catch: Throwable -> L103
        ib1 r46 = r44.c();     // Catch: Throwable -> L115
        int r47 = r46.f;     // Catch: Throwable -> L115
        if (r47 != 2) goto L117;
        Object r48 = r44.q;     // Catch: Throwable -> L115
        monitor-enter(r48);     // Catch: Throwable -> L115
        monitor-exit(r48);     // Catch: Throwable -> L112
    L112:
        th = move-exception;
        throw th;     // Catch: Throwable -> L115
    L117:
        if (r47 != 0) goto L150;
        Method r49 = ov4.b;     // Catch: Throwable -> L142
        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");     // Catch: Throwable -> L142
        y41 r50 = r44.p;     // Catch: Throwable -> L142
        Context r51 = r44.n;     // Catch: Throwable -> L142
        r50.getClass();     // Catch: Throwable -> L142
        ib1[] r52 = {r46};     // Catch: Throwable -> L142
        vr1 r53 = d05.a;     // Catch: Throwable -> L142
        Trace.beginSection(xl.N("TypefaceCompat.createFromFontInfo"));     // Catch: Throwable -> L142
        Typeface r54 = d05.a.f(r51, r52, 0);     // Catch: Throwable -> L144
        Trace.endSection();     // Catch: Throwable -> L142
        MappedByteBuffer r55 = wr1.N(r44.n, r46.a);     // Catch: Throwable -> L142
        if (r55 == null) goto L141;
        if (r54 == null) goto L141;
        Trace.beginSection("EmojiCompat.MetadataRepo.create");     // Catch: Throwable -> L137
        na4 r56 = new na4(r54, fh0.s(r55));     // Catch: Throwable -> L137
        Trace.endSection();     // Catch: Throwable -> L142
        Trace.endSection();     // Catch: Throwable -> L115
        Object r57 = r44.q;     // Catch: Throwable -> L115
        monitor-enter(r57);     // Catch: Throwable -> L115
        bu r58 = r44.u;     // Catch: Throwable -> L130
        if (r58 == null) goto L132;
        r58.v(r56);     // Catch: Throwable -> L130
    L132:
        monitor-exit(r57);     // Catch: Throwable -> L130
        r44.b();     // Catch: Throwable -> L115
        return;
    L130:
        th = move-exception;
        throw th;     // Catch: Throwable -> L115
    L137:
        th = move-exception;
        Method r59 = ov4.b;     // Catch: Throwable -> L142
        Trace.endSection();     // Catch: Throwable -> L142
        throw th;     // Catch: Throwable -> L142
    L141:
        throw new RuntimeException("Unable to open file.");     // Catch: Throwable -> L142
    L144:
        th = move-exception;
        Trace.endSection();     // Catch: Throwable -> L142
        throw th;     // Catch: Throwable -> L142
    L142:
        th = move-exception;
        Method r60 = ov4.b;     // Catch: Throwable -> L115
        Trace.endSection();     // Catch: Throwable -> L115
        throw th;     // Catch: Throwable -> L115
    L150:
        throw new RuntimeException("fetchFonts result is not OK. (" + r47 + ")");     // Catch: Throwable -> L115
    L115:
        th = move-exception;
        monitor-enter(r44.q);
        bu r61 = r44.u;     // Catch: Throwable -> L156
        if (r61 == null) goto L158;
        r61.u(th);     // Catch: Throwable -> L156
    L158:
        r44.b();
        return;
    L156:
        th = move-exception;
        throw th;
    }
}
