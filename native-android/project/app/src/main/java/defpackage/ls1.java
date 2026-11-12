package defpackage;

import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.HubTracks$Item;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ls1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ ls1(int r2, MainActivity r3, Child r4, ArrayList r5, List r6, String r7) {
        this.n = 0;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [u01] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean r2 = false;
        switch(this.n) {
            case 0: goto L35;
            default: goto L4;
        };
    L4:
        kt2 r4 = (kt2) this.p;
        fr2 r1 = (fr2) this.q;
        va4 r5 = (va4) this.r;
        String r6 = r5.b;
        tn2 r7 = (tn2) this.s;
        int r8 = this.o;
        ju1 r0 = (ju1) this.t;
        na4 r10 = r4.f;
        if (r10.F(r1) == false) goto L118;
        j60 r9 = j60.d(r5);     // Catch: RuntimeException -> L32
        Object r11 = r9.j;
        int r12 = r9.b;
        if (r9.b() == true) goto L11;
        l93.q0("MediaSessionStub", "Can't execute predefined custom command: " + r6);
        kt2.P0(r7, r1, r8, new ab4(-6));
        return;
    L11:
        va4 r13 = r9.a;
        if (r13 != null) goto L14;
        al3 r3 = r7.s;
        if (r12 == 1) goto L20;
    L19:
        boolean r14 = false;
    L25:
        if (r14 == false) goto L28;
        r4.M0(r1, r8);
    L31:
        r10.s(r1);
        return;
    L28:
        if (r12 != 31) goto L30;
        r11.getClass();
        r4.O0(r1, r8, 31, new at2(new ef0(29, new ts2((gn2) r11, true, 0), new zr2(20)), 1));
        goto L31
    L30:
        r4.O0(r1, r8, r12, kt2.Q0(new et2(r9)));
        goto L31
    L20:
        if (r11 == null) goto L22;
        r14 = ((Boolean) r11).booleanValue();
        goto L25
    L22:
        if (r3.q() == true) goto L19;
        r14 = true;
        goto L25
    L14:
        if (r13.a != 40010) goto L16;
        r2 = true;
    L16:
        rr2.w(r2);
        r4.U(r0, r8, null, 40010, new at2(new et2(r9), 1));
        return;
    L32:
        e = move-exception;
        l93.r0("MediaSessionStub", "Failed to convert predefined custom command: " + r6, e);
        kt2.P0(r7, r1, r8, new ab4(-3));
        return;
    L118:
        return;
    L35:
        int r15 = this.o;
        MainActivity r16 = (MainActivity) this.p;
        Child r17 = (Child) this.q;
        ArrayList r18 = (ArrayList) this.r;
        List r19 = (List) this.s;
        String r20 = (String) this.t;
        if (r15 == ms1.b) goto L38;
        return;
    L38:
        if (r16.isFinishing() == false) goto L40;
        return;
    L40:
        if (r16.isDestroyed() == true) goto L122;
        if (r17 != null) goto L44;
        Toast.makeText(r16, R.string.homemusic_play_failed, 0).show();
        return;
    L44:
        rs1 r21 = rs1.a;
        r19.getClass();
        ArrayList r22 = new ArrayList();
        Iterator r23 = r19.iterator();
    L45:
        int r110 = 10;
        if (r23.hasNext() == false) goto L74;
        HubTracks$Item r24 = (HubTracks$Item) r23.next();
        String r111 = r24.getContext();
        if (r111 != null) goto L50;
    L72:
        ?? r112 = u01.n;
    L73:
        v40.n0(r112, r22);
        goto L45
    L50:
        if (qm4.u0(r111) == false) goto L53;
        r111 = null;
    L53:
        if (r111 == null) goto L72;
        String r113 = qm4.J0(128, r111);
        String r114 = r24.getSongId();
        if (r114 != null) goto L57;
    L59:
        r114 = null;
    L60:
        String r25 = r24.getRef();
        if (r25 != null) goto L63;
    L68:
        String r115 = null;
    L69:
        ArrayList r26 = ti.i0(new String[]{r114, r115});
        r112 = new ArrayList(r40.k0(r26, 10));
        int r116 = r26.size();
        int r117 = 0;
    L70:
        if (r117 >= r116) goto L73;
        Object r118 = r26.get(r117);
        r117 = r117 + 1;
        r112.add(new kd3((String) r118, r113));
        goto L70
    L63:
        if (qm4.u0(r25) == false) goto L66;
        r25 = null;
    L66:
        if (r25 == null) goto L68;
        r115 = "hub:".concat(r25);
        goto L69
    L57:
        if (qm4.u0(r114) == true) goto L59;
    L74:
        Map r27 = lg2.Z(r22);
        String r28 = UUID.randomUUID().toString();
        r28.getClass();
        k62 r29 = new k62(r28, gi1.b0(r20));
        ArrayList r30 = new ArrayList();
        Iterator r31 = r19.iterator();
    L76:
        if (r31.hasNext() == false) goto L102;
        HubTracks$Item r119 = (HubTracks$Item) r31.next();
        ux3 r120 = k62.c;
        String r121 = r119.getLaunchId();
        String r122 = r119.getLaunchOrigin();
        if (r122 != null) goto L80;
        r122 = r20;
    L80:
        k62 r123 = gi1.P(r121, r122);
        if (r123 != null) goto L83;
        r123 = r29;
    L83:
        String r124 = r119.getSongId();
        if (r124 != null) goto L86;
    L88:
        r124 = null;
    L89:
        String r125 = r119.getRef();
        if (r125 != null) goto L92;
    L97:
        String r126 = null;
    L98:
        ArrayList r127 = ti.i0(new String[]{r124, r126});
        ArrayList r128 = new ArrayList(r40.k0(r127, r110));
        int r32 = r127.size();
        int r129 = 0;
    L99:
        if (r129 >= r32) goto L101;
        Object r130 = r127.get(r129);
        r129 = r129 + 1;
        r128.add(new kd3((String) r130, r123));
        goto L99
    L101:
        v40.n0(r128, r30);
        r110 = 10;
        goto L76
    L92:
        if (qm4.u0(r125) == false) goto L95;
        r125 = null;
    L95:
        if (r125 == null) goto L97;
        r126 = "hub:".concat(r125);
        goto L98
    L86:
        if (qm4.u0(r124) == true) goto L88;
    L102:
        Map r33 = lg2.Z(r30);
        rs1.m = new kd3(r18, r27);
        rs1.p = r33;
        bl2 r34 = r16.P;
        int r35 = r18.indexOf(r17);
        if (r35 >= 0) goto L105;
        int r36 = 0;
    L106:
        bo2.o(r34, r18, r36);
        ((au) r16.V.n).d(true);
        return;
    L105:
        r36 = r35;
        goto L106
    }

    public /* synthetic */ ls1(kt2 r2, fr2 r3, va4 r4, tn2 r5, int r6, ju1 r7) {
        this.n = 1;
        this.p = r2;
        this.q = r3;
        this.r = r4;
        this.s = r5;
        this.o = r6;
        this.t = r7;
    }
}
