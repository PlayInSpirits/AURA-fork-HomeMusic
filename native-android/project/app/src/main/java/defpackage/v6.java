package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.preference.Preference;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubException;
import com.eddyizm.tempus.homemusic.HubMixToday;
import com.eddyizm.tempus.homemusic.HubShareActivity;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.SmartNextIn;
import com.eddyizm.tempus.homemusic.SmartOut;
import com.eddyizm.tempus.homemusic.SmartPlan;
import com.eddyizm.tempus.homemusic.SmartRec;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.homemusic.WaveNextIn;
import com.eddyizm.tempus.homemusic.WaveOut;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.homemusic.WaveSession;
import com.eddyizm.tempus.homemusic.WaveTrack;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v6 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ v6(pn2 r1, fr2 r2, uj2 r3, String r4) {
        this.n = 26;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    private final void a() {
        ic2 r0 = (ic2) this.o;
        lb4 r1 = (lb4) this.p;
        gn2 r4 = (gn2) this.q;
        Bitmap r2 = (Bitmap) hw.j(r0);     // Catch: ExecutionException -> L5 Throwable -> L7
    L9:
        r1.l(f92.a(r4, r2));
        return;
    L7:
        e = move-exception;
        l93.B("MLSLegacyStub", "failed to get bitmap", e);
        r2 = null;
        goto L9
    }

    private final void b() {
        pn2 r0 = (pn2) this.o;
        fr2 r1 = (fr2) this.p;
        uj2 r6 = (uj2) this.q;
        if (r0.x.I(r1, 50004) == true) goto L6;
        r6.f(null);
        return;
    L6:
        tn2 r2 = r0.z;
        pq r3 = r2.D;
        r2.B(r1);
        r3.getClass();
        mw1 r4 = new mw1(m92.b(-6));
        int r5 = 0;
        r4.f(new sn2(r2, r4, r1, r5), new rn2(r2, r5));
        lb4 r7 = f35.h0(r4, new ln2(r0, r5));
        r7.f(new nn2(r7, r6, r5), gq0.n);
    }

    private final void c() {
        tn2 r0 = (tn2) this.o;
        fr2 r1 = (fr2) this.p;
        String r4 = (String) this.q;
        r0.getClass();
        er2 r2 = r1.d;
        r2.getClass();
        r0.E.remove(r4, r1);
        r0.F.remove(r2, r4);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        int r5 = 12;
        HubException r6 = null;
        va4 r7 = null;
        final int r8 = 1;
        int r9 = 0;
        switch(this.n) {
            case 0: goto L446;
            case 1: goto L444;
            case 2: goto L413;
            case 3: goto L399;
            case 4: goto L385;
            case 5: goto L360;
            case 6: goto L358;
            case 7: goto L356;
            case 8: goto L354;
            case 9: goto L336;
            case 10: goto L329;
            case 11: goto L313;
            case 12: goto L294;
            case 13: goto L288;
            case 14: goto L283;
            case 15: goto L279;
            case 16: goto L266;
            case 17: goto L239;
            case 18: goto L141;
            case 19: goto L131;
            case 20: goto L104;
            case 21: goto L66;
            case 22: goto L44;
            case 23: goto L40;
            case 24: goto L32;
            case 25: goto L30;
            case 26: goto L28;
            case 27: goto L23;
            case 28: goto L21;
            default: goto L4;
        };
    L4:
        sk2 r1 = (sk2) this.o;
        String r2 = (String) this.p;
        Bundle r0 = (Bundle) this.q;
        r1.c1();
        rk2 r3 = r1.d;
        if (r3.Y() == true) goto L7;
        wa4 r4 = wa4.b;
    L8:
        o15 r10 = r4.a.h();
    L10:
        if (r10.hasNext() == false) goto L16;
        va4 r11 = (va4) r10.next();
        if (r11.a != 0) goto L10;
        if (r11.b.equals(r2) == false) goto L10;
        r7 = r11;
    L16:
        if (r7 == null) goto L18;
    L19:
        ic2 r12 = r1.b1(new va4(r2, r0), Bundle.EMPTY);
        vc0 r13 = new vc0(r2);
        r12.f(new lg1(r9, r12, r13), gq0.n);
        return;
    L18:
        if (j60.n(r2) == true) goto L19;
        return;
    L7:
        r4 = r3.P0();
        goto L8
    L21:
        c();
        return;
    L23:
        pn2 r14 = (pn2) this.o;
        fr2 r15 = (fr2) this.p;
        String r16 = (String) this.q;
        if (r14.x.I(r15, 50002) == false) goto L521;
        r14.z.z(r15, r16);
        return;
    L521:
        return;
    L28:
        b();
        return;
    L30:
        a();
        return;
    L32:
        AtomicBoolean r17 = (AtomicBoolean) this.o;
        oy r18 = (oy) this.p;
        uy1 r19 = (uy1) this.q;
        if (r17.get() == true) goto L522;
        r19.invoke();     // Catch: Throwable -> L37
        r18.a(null);     // Catch: Throwable -> L37
        return;
    L37:
        th = move-exception;
        r18.b(th);
        return;
    L522:
        return;
    L40:
        fx3 r20 = (fx3) this.o;
        fx3 r21 = (fx3) this.p;
        f9 r22 = (f9) this.q;
        r20.n = false;
        if (r21.n == true) goto L524;
        r22.setTitle(R.string.lan_connection_error);
        return;
    L524:
        return;
    L44:
        MainActivity r23 = (MainActivity) this.o;
        Object r24 = this.p;
        Runnable r25 = (Runnable) this.q;
        if (r23.isFinishing() == false) goto L47;
        return;
    L47:
        if (r23.isDestroyed() == false) goto L50;
        return;
    L50:
        if ((r24 instanceof s14) == true) goto L52;
        b.i(r23, (WaveOut) r24);
    L52:
        Throwable r26 = bb3.a(r24);
        if (r26 == null) goto L526;
        Log.w("HubWave", PlayEvent.START, r26);
        if (r25 == null) goto L58;
        r25.run();
        return;
    L58:
        if ((r26 instanceof HubException) == false) goto L60;
        r6 = (HubException) r26;
    L60:
        if (r6 == null) goto L63;
        String r27 = r6.getMessage();
        if (r27 == null) goto L63;
    L64:
        Toast.makeText(r23, r27, 1).show();
        return;
    L63:
        r27 = r23.getString(R.string.homemusic_wave_failed);
        r27.getClass();
        goto L64
    L526:
        return;
    L66:
        WaveSession r28 = (WaveSession) this.o;
        jx3 r29 = (jx3) this.p;
        Serializable r30 = (Serializable) this.q;
        WeakReference r31 = b.a;
        WaveNextIn r32 = (WaveNextIn) r29.n;
        r28.setInFlight(false);
        if (b.b == r28) goto L70;
        return;
    L70:
        if ((r30 instanceof s14) == true) goto L85;
        kd3 r33 = (kd3) r30;
        WaveOut r34 = (WaveOut) r33.n;
        List r35 = (List) r33.o;
        r28.sent(r32);
        r28.setFailures(0);
        b.b(r28, r35);
        r28.setSettledFor(r28.getAskedFor());
        if (r28.getAgain() == false) goto L74;
        b.c();
        return;
    L74:
        b.f(r28);
        qi3 r36 = b.j(r28);
        if (r36 == null) goto L530;
        int r37 = b.a(r36, r28).size();
        if (r35.isEmpty() == true) goto L79;
    L84:
        r28.setPolls(0);
        goto L85
    L79:
        if (r34.getPending() == false) goto L84;
        if (r37 > 2) goto L84;
        r28.setPolls(r28.getPolls() + 1);
        Long r38 = WaveRetry.INSTANCE.afterPending(r28.getPolls());
        if (r38 == null) goto L85;
        long r39 = r38.longValue();
        b.e();
        u6 r40 = new u6(r5);
        b.c = r40;
        io1.b.postDelayed(r40, r39);
        goto L85
    L530:
        return;
    L85:
        Throwable r41 = bb3.a(r30);
        if (r41 == null) goto L531;
        boolean r42 = r41 instanceof HubException;
        if (r42 == true) goto L90;
    L92:
        Log.w("HubWave", "next " + r28.getId() + ": " + r41.getMessage());
        if (r42 == true) goto L95;
        rr1.m();
    L95:
        r28.setFailures(r28.getFailures() + 1);
        b.f(r28);
        qi3 r43 = b.j(r28);
        if (r43 == null) goto L533;
        int r44 = b.a(r43, r28).size();
        if (r28.getAgain() == true) goto L100;
        if (r44 <= 2) goto L100;
        return;
    L100:
        Long r45 = WaveRetry.INSTANCE.afterFailure(r28.getFailures());
        if (r45 == null) goto L535;
        long r46 = r45.longValue();
        b.e();
        u6 r47 = new u6(r5);
        b.c = r47;
        io1.b.postDelayed(r47, r46);
        return;
    L535:
        return;
    L533:
        return;
    L90:
        if (((HubException) r41).n != 404) goto L92;
        String r48 = r28.getId();
        r28.setInFlight(true);
        io1.a.execute(new ws1(r28, r48, 5));
        return;
    L531:
        return;
    L104:
        WaveNextIn r49 = (WaveNextIn) this.o;
        final String r50 = (String) this.p;
        WaveSession r51 = (WaveSession) this.q;
        final jx3 r52 = new jx3();
        r52.n = r49;
        WeakReference r53 = b.a;
        b00 r54 = b00.a;     // Catch: Throwable -> L110
        String r55 = b00.a();     // Catch: Throwable -> L110
        rr1 r56 = rr1.a;     // Catch: Throwable -> L110
        WaveNextIn r57 = r49.compatible(rr1.e().contains("typed_favorites_v1"), rr1.e().contains("favorite_compensation_chains_v1"), r55);     // Catch: Throwable -> L110
        r52.n = r57;     // Catch: Throwable -> L110
        List<PlayEvent> r58 = r57.getPlayed();     // Catch: Throwable -> L110
        if (r58 != null) goto L108;
    L112:
        Iterator<T> r59 = r58.iterator();     // Catch: Throwable -> L110
    L114:
        if (r59.hasNext() == false) goto L122;
        if (((PlayEvent) r59.next()).getAccount() == null) goto L114;
        rr1 r60 = rr1.a;     // Catch: Throwable -> L110
        if (r55 == null) goto L121;
        WaveOut r61 = (WaveOut) rr1.B(r55, new bt1(r50, r52, r8));     // Catch: Throwable -> L110
    L123:
        List<WaveTrack> r62 = r61.getTracks();     // Catch: Throwable -> L110
        if (r62 != null) goto L126;
        r62 = u01.n;     // Catch: Throwable -> L110
    L126:
        Object r63 = new kd3(r61, b.k(r51.getContext(), r62));     // Catch: Throwable -> L110
    L129:
        io1.b.post(new v6(r51, r52, r63, 21));
        return;
    L121:
        throw new IllegalArgumentException("Required value was null.");     // Catch: Throwable -> L110
    L122:
        r61 = rr1.z(r50, (WaveNextIn) r52.n);     // Catch: Throwable -> L110
        goto L123
    L108:
        if (r58.isEmpty() == false) goto L112;
    L110:
        th = move-exception;
        r63 = new s14(th);
        goto L129
    L131:
        Object r64 = this.o;
        Context r65 = (Context) this.p;
        String r66 = (String) this.q;
        if ((r64 instanceof s14) == false) goto L139;
        Throwable r67 = bb3.a(r64);
        if (r67 == null) goto L537;
        Log.w("HubTracks", "download ".concat(r66), r67);
        String r68 = r67.getMessage();
        if (r68 != null) goto L138;
        r68 = "";
    L138:
        Toast.makeText(r65, r65.getString(R.string.homemusic_hub_action_failed, new Object[]{r68}), 1).show();
        return;
    L537:
        return;
    L139:
        r64.getClass();
        kf2.k();
        return;
    L141:
        SmartSession r69 = (SmartSession) this.o;
        jx3 r70 = (jx3) this.p;
        Serializable r71 = (Serializable) this.q;
        WeakReference r72 = a.a;
        SmartNextIn r73 = (SmartNextIn) r70.n;
        r69.setInFlight(false);
        if (a.b == r69) goto L145;
        return;
    L145:
        if ((r71 instanceof s14) == true) goto L222;
        kd3 r110 = (kd3) r71;
        SmartOut r111 = (SmartOut) r110.n;
        List r112 = (List) r110.o;
        r69.sent(r73);
        r69.setFailures(0);
        if (r112.isEmpty() == false) goto L149;
    L148:
        SmartSession r113 = null;
    L212:
        if (r69.getAgain() == false) goto L215;
        a.b();
        return;
    L215:
        if (r112.isEmpty() == true) goto L217;
    L221:
        r69.setPolls(0);
    L223:
        Throwable r74 = bb3.a(r71);
        if (r74 == null) goto L540;
        boolean r75 = r74 instanceof HubException;
        if (r75 == true) goto L228;
    L230:
        Log.w("HubSmart", "next " + r69.getId() + ": " + r74.getMessage());
        if (r75 == true) goto L233;
        rr1.m();
    L233:
        r69.setFailures(r69.getFailures() + 1);
        if (r69.getAgain() == false) goto L542;
        Long r76 = WaveRetry.INSTANCE.afterFailure(r69.getFailures());
        if (r76 == null) goto L543;
        long r77 = r76.longValue();
        a.d();
        u6 r78 = new u6(11);
        a.c = r78;
        io1.b.postDelayed(r78, r77);
        return;
    L543:
        return;
    L542:
        return;
    L228:
        if (((HubException) r74).n != 404) goto L230;
        r69.expire();
        a.b = r113;
        a.d();
        a.c();
        return;
    L540:
        return;
    L217:
        if (r111.getPending() == false) goto L221;
        r69.setPolls(r69.getPolls() + 1);
        Long r79 = WaveRetry.INSTANCE.afterPending(r69.getPolls());
        if (r79 == null) goto L223;
        long r80 = r79.longValue();
        a.d();
        u6 r81 = new u6(11);
        a.c = r81;
        io1.b.postDelayed(r81, r80);
        goto L223
    L149:
        ao2 r82 = (ao2) a.a.get();
        if (r82 == null) goto L148;
        qi3 r114 = a.h();
        if (r114 != null) goto L156;
    L163:
        r114 = null;
    L164:
        if (r114 == null) goto L148;
        ArrayList r115 = a.e(r114);
        r113 = null;
        ArrayList r116 = new ArrayList(r40.k0(r115, 10));
        int r83 = r115.size();
        int r84 = 0;
    L167:
        if (r84 >= r83) goto L169;
        Object r117 = r115.get(r84);
        r84 = r84 + 1;
        gn2 r85 = (gn2) r117;
        String r86 = r85.a;
        r86.getClass();
        r116.add(new s11(r86, r69.isRec(r85.a)));
        goto L167
    L169:
        SmartPlan r87 = SmartPlan.INSTANCE;
        int r88 = r114.o0();
        ArrayList r89 = new ArrayList(r40.k0(r112, 10));
        Iterator r90 = r112.iterator();
    L171:
        if (r90.hasNext() == false) goto L173;
        r89.add(((dt1) r90.next()).a);
        goto L171
    L173:
        List<kd3> r91 = r87.insertions(r116, r88, r89);
        if (r91.isEmpty() == true) goto L212;
        int r92 = lg2.W(r40.k0(r112, 10));
        int r93 = 16;
        if (r92 >= 16) goto L179;
        r92 = 16;
    L179:
        LinkedHashMap r94 = new LinkedHashMap(r92);
        Iterator r95 = r112.iterator();
    L181:
        if (r95.hasNext() == false) goto L183;
        Object r118 = r95.next();
        r94.put(((dt1) r118).a.getQueueId(), r118);
        goto L181
    L183:
        ArrayList r96 = new ArrayList(r40.k0(r91, 10));
        Iterator<T> r119 = r91.iterator();
    L185:
        if (r119.hasNext() == false) goto L187;
        r96.add((SmartRec) ((kd3) r119.next()).o);
        goto L185
    L187:
        List<String> r97 = r69.register(r96);
        rs1 r120 = rs1.a;
        int r121 = lg2.W(r40.k0(r97, 10));
        if (r121 < 16) goto L191;
        r93 = r121;
    L191:
        LinkedHashMap r122 = new LinkedHashMap(r93);
        Iterator<T> r98 = r97.iterator();
    L193:
        if (r98.hasNext() == false) goto L195;
        Object r99 = r98.next();
        String r123 = (String) r99;
        r122.put(r99, r69.getRecContext());
        goto L193
    L195:
        rs1.b(r122, a.f(r69));
        Iterator<kd3> r100 = r91.iterator();
    L197:
        if (r100.hasNext() == false) goto L202;
        kd3 r101 = r100.next();
        int r124 = ((Number) r101.n).intValue();
        dt1 r102 = (dt1) r94.get(((SmartRec) r101.o).getQueueId());
        if (r102 == null) goto L197;
        bo2.h(r82, r124, gb.O(r102.b), gb.O(r102.c));
        goto L197
    L202:
        String r103 = r69.getId();
        ArrayList r104 = new ArrayList(r40.k0(r91, 10));
        Iterator<T> r105 = r91.iterator();
    L204:
        if (r105.hasNext() == false) goto L206;
        r104.add(((SmartRec) ((kd3) r105.next()).o).getRef());
        goto L204
    L206:
        ArrayList r106 = new ArrayList(r40.k0(r91, 10));
        Iterator<T> r107 = r91.iterator();
    L208:
        if (r107.hasNext() == false) goto L210;
        r106.add(((SmartRec) ((kd3) r107.next()).o).getAfter());
        goto L208
    L210:
        Log.i("HubSmart", "next " + r103 + ": " + r104 + " after " + r106);
        goto L212
    L156:
        if (a.j(r114) == true) goto L159;
        r114 = null;
    L159:
        if (r114 == null) goto L163;
        if (a.b != r69) goto L163;
    L222:
        r113 = null;
        goto L223
    L239:
        SmartNextIn r108 = (SmartNextIn) this.o;
        final String r109 = (String) this.p;
        SmartSession r125 = (SmartSession) this.q;
        final jx3 r126 = new jx3();
        r126.n = r108;
        WeakReference r127 = a.a;
        b00 r128 = b00.a;     // Catch: Throwable -> L245
        String r129 = b00.a();     // Catch: Throwable -> L245
        rr1 r130 = rr1.a;     // Catch: Throwable -> L245
        SmartNextIn r131 = r108.compatible(rr1.e().contains("typed_favorites_v1"), rr1.e().contains("favorite_compensation_chains_v1"), r129);     // Catch: Throwable -> L245
        r126.n = r131;     // Catch: Throwable -> L245
        List<PlayEvent> r132 = r131.getPlayed();     // Catch: Throwable -> L245
        if (r132 != null) goto L243;
    L247:
        Iterator<T> r133 = r132.iterator();     // Catch: Throwable -> L245
    L249:
        if (r133.hasNext() == false) goto L257;
        if (((PlayEvent) r133.next()).getAccount() == null) goto L249;
        rr1 r134 = rr1.a;     // Catch: Throwable -> L245
        if (r129 == null) goto L256;
        final int r135 = 0;
        SmartOut r136 = (SmartOut) rr1.B(r129, new bt1(r109, r126, r135));     // Catch: Throwable -> L245
    L258:
        List<SmartRec> r137 = r136.getRecs();     // Catch: Throwable -> L245
        if (r137 != null) goto L261;
        r137 = u01.n;     // Catch: Throwable -> L245
    L261:
        Object r138 = new kd3(r136, a.l(r137));     // Catch: Throwable -> L245
    L264:
        io1.b.post(new v6(r125, r126, r138, 18));
        return;
    L256:
        throw new IllegalArgumentException("Required value was null.");     // Catch: Throwable -> L245
    L257:
        r136 = rr1.v(r109, (SmartNextIn) r126.n);     // Catch: Throwable -> L245
        goto L258
    L243:
        if (r132.isEmpty() == false) goto L247;
    L245:
        th = move-exception;
        r138 = new s14(th);
        goto L264
    L266:
        HubShareActivity r139 = (HubShareActivity) this.o;
        jx3 r140 = (jx3) this.p;
        String r141 = (String) this.q;
        ux3 r142 = HubShareActivity.P;
        Object r143 = r140.n;
        r143.getClass();
        String r144 = (String) r143;
        if (qm4.u0(r141) == false) goto L269;
        String r145 = null;
    L271:
        if (r139.isFinishing() == false) goto L273;
        return;
    L273:
        if (r139.isDestroyed() == true) goto L546;
        if (r145 == null) goto L277;
        Toast.makeText(r139, r145, 1).show();
    L277:
        r139.startActivity(new Intent(r139, MainActivity.class).addFlags(872415232).putExtra("homemusic_hub_route", r144));
        r139.finish();
        return;
    L546:
        return;
    L269:
        r145 = r141;
        goto L271
    L279:
        vb4 r146 = (vb4) this.o;
        Preference r147 = (Preference) this.p;
        String r148 = (String) this.q;
        if (r146.y() == false) goto L547;
        r147.x(r148);
        return;
    L547:
        return;
    L283:
        cp1 r149 = (cp1) this.o;
        boolean[] r150 = (boolean[]) this.p;
        List r151 = (List) this.q;
        if (r150[0] == true) goto L548;
        bo2.o(r149.F0, r151, 0);
        r150[0] = true;
        return;
    L548:
        return;
    L288:
        cp1 r152 = (cp1) this.o;
        HubMixToday r153 = (HubMixToday) this.p;
        View r154 = (View) this.q;
        if (r152.T == null) goto L549;
        if (r153 == null) goto L550;
        r154.setTag(r153);
        ud3.E0(r154, r153);
        return;
    L550:
        return;
    L549:
        return;
    L294:
        fo1 r155 = (fo1) this.o;
        Object r156 = this.p;
        gf1 r157 = (gf1) this.q;
        if (r155.c() == true) goto L298;
        return;
    L298:
        if ((r156 instanceof s14) == true) goto L300;
        kd3 r158 = (kd3) r156;
        r155.u((String) r158.n, (String) r158.o);
    L300:
        Throwable r159 = bb3.a(r156);
        if (r159 == null) goto L551;
        r155.r(false);
        if ((r159 instanceof HubException) == true) goto L305;
    L308:
        String r160 = r159.getMessage();
        if (r160 != null) goto L311;
        r160 = r155.v(R.string.homemusic_login_no_hub, new Object[0]);
    L311:
        r155.t(r160);
        return;
    L305:
        if (((HubException) r159).n != 409) goto L308;
        if (r157 == null) goto L308;
        r157.invoke();
        return;
    L551:
        return;
    L313:
        fo1 r161 = (fo1) this.o;
        Object r162 = this.p;
        String r163 = (String) this.q;
        if (r161.c() == false) goto L556;
        r161.r(false);
        if ((r162 instanceof s14) == false) goto L324;
        Throwable r164 = bb3.a(r162);
        if (r164 == null) goto L554;
        String r165 = r164.getMessage();
        if (r165 != null) goto L323;
        r165 = r161.v(R.string.homemusic_login_no_hub, new Object[0]);
    L323:
        r161.t(r165);
        return;
    L554:
        return;
    L324:
        if (r162 == null) goto L327;
        kf2.k();
        return;
    L327:
        ((uc1) r161.c).c.setText(null);
        r161.h = r163;
        System.currentTimeMillis();
        throw null;
    L556:
        return;
    L329:
        gf1 r166 = (gf1) this.o;
        fo1 r167 = (fo1) this.p;
        gf1 r168 = (gf1) this.q;
        Object r169 = r166.invoke();     // Catch: Throwable -> L332
    L334:
        io1.b.post(new v6(r167, r169, r168, r5));
        return;
    L332:
        th = move-exception;
        r169 = new s14(th);
        goto L334
    L336:
        vj r170 = (vj) this.o;
        bu r171 = (bu) this.p;
        ThreadPoolExecutor r172 = (ThreadPoolExecutor) this.q;
        sa1 r173 = si0.o(r170.n);     // Catch: Throwable -> L345
        if (r173 == null) goto L351;
        ra1 r174 = (ra1) ((sz0) r173.b);     // Catch: Throwable -> L345
        Object r175 = r174.q;     // Catch: Throwable -> L345
        monitor-enter(r175);     // Catch: Throwable -> L345
        r174.s = r172;     // Catch: Throwable -> L347
        monitor-exit(r175);     // Catch: Throwable -> L347
        ((sz0) r173.b).a(new vz0(r171, r172));     // Catch: Throwable -> L345
        return;
    L347:
        th = move-exception;
        throw th;     // Catch: Throwable -> L345
    L351:
        throw new RuntimeException("EmojiCompat font provider not available on this device.");     // Catch: Throwable -> L345
    L345:
        th = move-exception;
        r171.u(th);
        r172.shutdown();
        return;
    L354:
        sw0 r176 = (sw0) this.o;
        ((tw0) this.p).D(r176.a, r176.b, (tv1) this.q);
        return;
    L356:
        sw0 r177 = (sw0) this.o;
        ((tw0) this.p).c(r177.a, r177.b, (Exception) this.q);
        return;
    L358:
        xm0 r178 = (xm0) this.o;
        View r179 = (View) this.p;
        tm0 r180 = (tm0) this.q;
        r178.a.endViewTransition(r179);
        r180.d();
        return;
    L360:
        String r181 = (String) this.o;
        vz r182 = (vz) this.p;
        yz r183 = (yz) this.q;
        b00 r184 = b00.a;
        kd3 r185 = b00.b();
        if (r185 == null) goto L363;
        String r186 = (String) r185.n;
    L365:
        if (h12.c(r186, r181) == false) goto L384;
        monitor-enter(r184);
        a00 r187 = (a00) b00.f.remove(r182.f);     // Catch: Throwable -> L381
        monitor-exit(r184);
        if (r187 == null) goto L371;
        n61.l(r187.c);
        boolean r188 = n61.f(1, r187.a, r187.b);
    L372:
        Map r189 = lg2.X(new kd3[]{new kd3("ref", r182.c), new kd3("star", Boolean.valueOf(r188))});
        nk1 r190 = rr1.c;
        WebView r191 = hw.g;
        if (r191 == null) goto L375;
        r191.evaluateJavascript(f34.h("window.dispatchEvent(new CustomEvent(", r190.j("hm:hub-favorite"), ", {detail: ", r190.j(r189), "}));"), null);
    L375:
        Context r192 = App.a();
        HubException r193 = r183.c;
        if (r193 == null) goto L379;
        String r194 = r193.getMessage();
        if (r194 == null) goto L379;
    L380:
        Toast.makeText(r192, r192.getString(R.string.homemusic_hub_action_failed, new Object[]{r194}), 1).show();
        return;
    L379:
        r194 = "";
        goto L380
    L371:
        r188 = r182.e;
    L381:
        th = move-exception;
        throw th;
    L384:
        return;
    L363:
        r186 = null;
        goto L365
    L385:
        WorkDatabase r195 = (WorkDatabase) this.o;
        String r196 = (String) this.p;
        sc5 r197 = (sc5) this.q;
        fd5 r198 = r195.A();
        r198.getClass();
        w24 r199 = w24.b(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        r199.h(1, r196);
        WorkDatabase_Impl r200 = r198.a;
        r200.b();
        Cursor r201 = xl.H(r200, r199);
        ArrayList r202 = new ArrayList(r201.getCount());     // Catch: Throwable -> L391
    L388:
        if (r201.moveToNext() == false) goto L393;
        r202.add(r201.getString(0));     // Catch: Throwable -> L391
        goto L388
    L393:
        r201.close();
        r199.j();
        int r203 = r202.size();
        int r204 = 0;
    L394:
        if (r204 >= r203) goto L396;
        Object r205 = r202.get(r204);
        r204 = r204 + 1;
        wr1.h(r197, (String) r205);
        goto L394
    L396:
        return;
    L391:
        th = move-exception;
        r201.close();
        r199.j();
        throw th;
    L399:
        MediaService r206 = (MediaService) this.o;
        List r207 = (List) this.p;
        qi3 r208 = (qi3) this.q;
        if (r206.D == true) goto L412;
        Iterator r209 = r207.iterator();
    L404:
        if (r209.hasNext() == false) goto L559;
        kd3 r210 = (kd3) r209.next();
        int r211 = ((Number) r210.n).intValue();
        Object r212 = r210.o;
        r212.getClass();
        gn2 r213 = (gn2) r212;
        if (r211 <= r208.o0()) goto L404;
        if (r211 >= r208.Q0()) goto L404;
        if (h12.c(r208.Y(r211).a, r213.a) == false) goto L404;
        r208.z0(r211, r213);
        goto L404
    L559:
        return;
    L412:
        return;
    L413:
        AudioTrack r214 = (AudioTrack) this.o;
        Handler r215 = (Handler) this.p;
        tc2 r216 = (tc2) this.q;
        int r217 = 9;
        r214.flush();     // Catch: Throwable -> L429
        r214.release();     // Catch: Throwable -> L429
        if (r215.getLooper().getThread().isAlive() == false) goto L418;
        r215.post(new a0(r217, r216));
    L418:
        Object r218 = an.r;
        monitor-enter(r218);
        int r219 = an.t - 1;     // Catch: Throwable -> L423
        an.t = r219;     // Catch: Throwable -> L423
        if (r219 != 0) goto L425;
        ScheduledExecutorService r220 = an.s;     // Catch: Throwable -> L423
        r220.getClass();     // Catch: Throwable -> L423
        r220.shutdown();     // Catch: Throwable -> L423
        an.s = null;     // Catch: Throwable -> L423
    L425:
        monitor-exit(r218);     // Catch: Throwable -> L423
        return;
    L423:
        th = move-exception;
        throw th;
    L429:
        th = move-exception;
        if (r215.getLooper().getThread().isAlive() == false) goto L434;
        r215.post(new a0(r217, r216));
    L434:
        monitor-enter(an.r);
        int r221 = an.t - 1;     // Catch: Throwable -> L438
        an.t = r221;     // Catch: Throwable -> L438
        if (r221 != 0) goto L440;
        ScheduledExecutorService r222 = an.s;     // Catch: Throwable -> L438
        r222.getClass();     // Catch: Throwable -> L438
        r222.shutdown();     // Catch: Throwable -> L438
        an.s = null;     // Catch: Throwable -> L438
    L440:
        throw th;
    L438:
        th = move-exception;
        throw th;
    L444:
        xc5 r223 = (xc5) this.o;
        tb1 r224 = (tb1) this.p;
        ej0 r225 = (ej0) this.q;
        qm r226 = (qm) r223.p;
        String r227 = f35.a;
        r226.y(r224, r225);
        return;
    L446:
        ArrayList r228 = (ArrayList) this.o;
        s24 r229 = (s24) ((ss0) this.p).n;
        int[] r230 = (int[]) this.q;
        int r231 = r228.size();
        int r232 = 0;
    L447:
        if (r232 >= r231) goto L455;
        Object r233 = r228.get(r232);
        r232 = r232 + 1;
        w6 r234 = (w6) r233;
        String r235 = r234.a;
        String r236 = r234.b;
        int r237 = ((Integer) xl.E(r229, true, false, new ps0(0, r235, r236))).intValue();
        if (r237 > 0) goto L450;
        if (((Integer) xl.E(r229, false, true, new qs0(r234.c, r235, r236, 0))).intValue() > 0) goto L453;
        Log.w("AlbumArtistBackfill", "Album " + r235 + " changed no row as " + r236);
        goto L447
    L453:
        r230[0] = r230[0] + 1;
        goto L447
    L450:
        Log.w("AlbumArtistBackfill", "Left album " + r235 + " alone, " + r237 + " unfilled rows under it are not filed as " + r236);
        goto L447
    }

    public /* synthetic */ v6(lo2 r1, sk2 r2, String r3, Bundle r4) {
        this.n = 29;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    public /* synthetic */ v6(Object r1, Object r2, Object r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }
}
