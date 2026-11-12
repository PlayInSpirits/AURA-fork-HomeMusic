package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.eddyizm.tempus.upnp.UpnpException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o25 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ q25 o;

    public /* synthetic */ o25(q25 r1, int r2) {
        this.n = r2;
        this.o = r1;
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
        switch(this.n) {
            case 0: goto L136;
            case 1: goto L131;
            case 2: goto L129;
            case 3: goto L120;
            default: goto L4;
        };
    L4:
        q25 r6 = this.o;
        if (r6.C == false) goto L7;
        return;
    L7:
        if (r6.M == false) goto L150;
        long r9 = SystemClock.elapsedRealtime();     // Catch: Exception -> L32 UpnpException -> L34
        Map r8 = r6.j.c(r6.k);     // Catch: Exception -> L32 UpnpException -> L34
        long r11 = SystemClock.elapsedRealtime();     // Catch: Exception -> L32 UpnpException -> L34
        f25 r7 = r6.j;     // Catch: Exception -> L32 UpnpException -> L34
        g25 r5 = r6.k;     // Catch: Exception -> L32 UpnpException -> L34
        r7.getClass();     // Catch: Exception -> L32 UpnpException -> L34
        r5.getClass();     // Catch: Exception -> L32 UpnpException -> L34
        Map r2 = r7.h(f25.d(r5), "GetTransportInfo", gb.O(new kd3("InstanceID", "0")));     // Catch: Exception -> L32 UpnpException -> L34
        r6.L = 0;     // Catch: Exception -> L32 UpnpException -> L34
        if (r6.F != r6.E) goto L148;
        long r3 = r6.U1();     // Catch: Exception -> L32 UpnpException -> L34
        long r10 = Math.max(r3, r6.A);     // Catch: Exception -> L32 UpnpException -> L34
        r6.A = r10;     // Catch: Exception -> L32 UpnpException -> L34
        p25 r12 = r6.J1();     // Catch: Exception -> L32 UpnpException -> L97
        if (r12 == null) goto L23;
        gn2 r13 = r12.b;     // Catch: Exception -> L32 UpnpException -> L97
        if (r13 == null) goto L23;
        do2 r14 = r13.d;     // Catch: Exception -> L32 UpnpException -> L97
        if (r14 == null) goto L23;
        Bundle r15 = r14.I;     // Catch: Exception -> L32 UpnpException -> L97
        if (r15 == null) goto L23;
        int r4 = r15.getInt("duration", 0);     // Catch: Exception -> L32 UpnpException -> L97
    L24:
        long r16 = ((long) r4) * 1000;
        Long r17 = Long.valueOf(r16);     // Catch: Exception -> L32 UpnpException -> L34
        if (r16 > 0) goto L29;
        r17 = null;
    L29:
        if (r17 == null) goto L38;
        long r18 = r17.longValue();     // Catch: Exception -> L32 UpnpException -> L34
    L42:
        if (r6.B <= 0) goto L44;
        long r26 = Math.min(r18, r6.B / 1000);     // Catch: Exception -> L32 UpnpException -> L34
    L45:
        Set r19 = q25.Q;     // Catch: Exception -> L32 UpnpException -> L34
        Long r20 = ya4.d((String) r8.get("TrackDuration"));     // Catch: Exception -> L32 UpnpException -> L34
        if (r20 != null) goto L48;
    L53:
        Long r21 = ya4.d((String) r8.get("RelTime"));     // Catch: Exception -> L32 UpnpException -> L34
        if (r21 == null) goto L57;
        r6.b2(r21.longValue(), r9, r11);     // Catch: Exception -> L32 UpnpException -> L34
    L57:
        Set r110 = q25.Q;     // Catch: Exception -> L32 UpnpException -> L34
        if (q40.s0(r110, r2.get("CurrentTransportState")) == true) goto L70;
        String r22 = (String) r8.get("TrackURI");     // Catch: Exception -> L32 UpnpException -> L34
        if (r22 != null) goto L62;
    L67:
        long r23 = r18;
        long r24 = r10;
        if (r6.N1(r24, r23, (String) r8.get("TrackURI")) == true) goto L149;
    L71:
        String r1 = (String) r2.get("CurrentTransportState");     // Catch: Exception -> L32 UpnpException -> L34
        if (h12.c(r1, "PLAYING") == true) goto L93;
        if (h12.c(r1, "PAUSED_PLAYBACK") == true) goto L93;
        if (h12.c(r1, "TRANSITIONING") == false) goto L85;
        if (r6.s == 3) goto L81;
    L83:
        r6.s = 2;     // Catch: Exception -> L32 UpnpException -> L34
    L118:
        r6.O1();
        return;
    L81:
        if (r6.r == false) goto L83;
        r6.Y1(r6.U1());     // Catch: Exception -> L32 UpnpException -> L34
        goto L83
    L85:
        if (q40.s0(r110, r1) == false) goto L118;
        r6.S1(r24, r23, r26, r3);     // Catch: Exception -> L88 UpnpException -> L90
    L93:
        if (r6.s == 3) goto L95;
        r6.u = SystemClock.elapsedRealtime();     // Catch: Exception -> L88 UpnpException -> L90
    L95:
        r6.x = 0;     // Catch: Exception -> L88 UpnpException -> L90
        r6.J = true;     // Catch: Exception -> L88 UpnpException -> L90
        r6.s = 3;     // Catch: Exception -> L88 UpnpException -> L90
        r6.M1(h12.c(r2.get("CurrentTransportState"), "PLAYING"));     // Catch: Exception -> L88 UpnpException -> L90
    L90:
        e = e;
    L109:
        r6.L = 0;
        if (e.n == 716) goto L112;
    L117:
        Log.w(r1, "could not read the renderer's state", e);
        goto L118
    L112:
        if (r6.r == false) goto L117;
        p25 r25 = r6.J1();
        if (r25 == null) goto L116;
        r6.L1(r6.H1(r25, e));
        goto L118
    L116:
        Log.w(r1, "could not read the renderer's state", e);
    L88:
        e = e;
    L100:
        if (r6.L != 0) goto L103;
        r6.L = SystemClock.uptimeMillis();
    L103:
        if ((SystemClock.uptimeMillis() - r6.L) > q25.S) goto L106;
        Log.w(r1, "could not read the renderer's state", e);
        goto L118
    L106:
        if (r6.r == false) goto L108;
        r6.L1(r6.G1(e));
        goto L118
    L108:
        Log.w(r1, "renderer is unreachable while paused, no longer reading it", e);
        r6.D = null;
        r6.s = 1;
        r6.Z1();
        goto L118
    L149:
        return;
    L62:
        if (qm4.u0(r22) == false) goto L65;
        r22 = null;
    L65:
        if (r22 == null) goto L67;
        r6.D = r22;     // Catch: Exception -> L32 UpnpException -> L34
        goto L67
    L70:
        r23 = r18;
        r24 = r10;
        goto L71
    L48:
        if (r20.longValue() > 0) goto L51;
        r20 = null;
    L51:
        if (r20 == null) goto L53;
        r6.B = r20.longValue() * 1000;     // Catch: Exception -> L32 UpnpException -> L34
        goto L53
    L44:
        r26 = r18;
        goto L45
    L38:
        if (r6.B <= 0) goto L40;
        r18 = r6.B / 1000;     // Catch: Exception -> L32 UpnpException -> L34
        goto L42
    L40:
        r18 = 0;
    L23:
        r4 = 0;
    L97:
        e = e;
    L35:
        r1 = "UpnpPlayer";
        goto L109
    L148:
        return;
    L34:
        e = e;
    L32:
        e = e;
        r1 = "UpnpPlayer";
        goto L100
    L150:
        return;
    L120:
        q25 r0 = this.o;
        if (r0.C == true) goto L151;
        r0.F1();
        if (r0.f.isEmpty() == true) goto L125;
        return;
    L125:
        if (r0.i == true) goto L153;
        r0.D1(r0.i1(), false, false);
        return;
    L153:
        return;
    L151:
        return;
    L129:
        q25 r27 = this.o;
        r27.n.removeCallbacks(r27.O);
        return;
    L131:
        q25 r28 = this.o;
        if (r28.C == true) goto L154;
        r28.M = true;
        r28.c2();
        r28.L = 0;
        r28.n.removeCallbacks(r28.O);
        r28.n.post(r28.O);
        return;
    L154:
        return;
    L136:
        q25 r29 = this.o;
        if (r29.r == true) goto L139;
        return;
    L139:
        if (r29.C == true) goto L156;
        r29.M = true;
        r29.c2();
        r29.L = 0;
        r29.n.removeCallbacks(r29.O);
        r29.n.post(r29.O);
        return;
    }
}
