package defpackage;

import android.util.Log;
import com.eddyizm.tempus.homemusic.HubException;
import com.eddyizm.tempus.homemusic.HubPlayEventsResult;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.SmartSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q extends ig1 implements if1 {
    public final /* synthetic */ int n;

    public /* synthetic */ q(int r2, Object r3, Class r4, String r5, String r6, int r7, int r8) {
        this.n = r8;
        super(r2, r7, r4, r3, r5, r6);
    }

    @Override // defpackage.if1
    public final Object invoke(Object r21) {
        int r1 = this.n;
        vd0 r2 = null;
        int r3 = 0;
        int r4 = 1;
        j15 r5 = j15.a;
        switch(r1) {
            case 0: goto L114;
            case 1: goto L112;
            case 2: goto L110;
            case 3: goto L35;
            case 4: goto L34;
            case 5: goto L32;
            case 6: goto L6;
            default: goto L4;
        };
    L4:
        ((u22) this.receiver).s((Throwable) r21);
        return r5;
    L6:
        Set r6 = (Set) r21;
        r6.getClass();
        s12 r0 = (s12) this.receiver;
        ReentrantLock r7 = r0.d;
        r7.lock();
        List r8 = q40.Q0(r0.c.values());     // Catch: Throwable -> L28
        r7.unlock();
        Iterator r9 = r8.iterator();
    L10:
        if (r9.hasNext() == false) goto L27;
        d83 r10 = (d83) r9.next();
        r10.getClass();
        int[] r11 = r10.b;
        int r12 = r11.length;
        Set r13 = z01.n;
        if (r12 == 0) goto L25;
        if (r12 == 1) goto L22;
        fb4 r14 = new fb4();
        int r15 = r11.length;
        int r16 = 0;
        int r17 = 0;
    L15:
        if (r16 >= r15) goto L20;
        int r18 = r17 + 1;
        if (r6.contains(Integer.valueOf(r11[r16])) == false) goto L19;
        r14.add(r10.c[r17]);
    L19:
        r16 = r16 + 1;
        r17 = r18;
        goto L15
    L20:
        r13 = kb4.l(r14);
        goto L25
    L22:
        if (r6.contains(Integer.valueOf(r11[0])) == false) goto L25;
        r13 = r10.d;
    L25:
        if (r13.isEmpty() == true) goto L10;
        r10.a.a(r13);
        goto L10
    L27:
        return r5;
    L28:
        th = move-exception;
        r7.unlock();
        throw th;
    L35:
        mh3 r19 = mh3.r;
        List r20 = (List) r21;
        r20.getClass();
        ((rs1) this.receiver).getClass();
        ArrayList r22 = new ArrayList();     // Catch: HubException -> L42 IOException -> L85
        Iterator r23 = r20.iterator();     // Catch: HubException -> L42 IOException -> L85
    L38:
        if (r23.hasNext() == false) goto L44;
        String r24 = ((PlayEvent) r23.next()).getAccount();     // Catch: HubException -> L42 IOException -> L85
        if (r24 == null) goto L38;
        r22.add(r24);     // Catch: HubException -> L42 IOException -> L85
        goto L38
    L44:
        List r25 = q40.t0(r22);     // Catch: HubException -> L42 IOException -> L85
        if (r25.isEmpty() == false) goto L47;
        HubPlayEventsResult r26 = rr1.r(r20);     // Catch: HubException -> L42 IOException -> L85
    L48:
        List<Map<String, Object>> r27 = r26.getRejected();     // Catch: HubException -> L42 IOException -> L85
        if (r27 == null) goto L174;
        if (r27.isEmpty() == true) goto L174;
        List<Map<String, Object>> r28 = r26.getRejected();     // Catch: HubException -> L42 IOException -> L85
        r28.getClass();     // Catch: HubException -> L42 IOException -> L85
        int r29 = lg2.W(r40.k0(r28, 10));     // Catch: HubException -> L42 IOException -> L85
        if (r29 >= 16) goto L56;
        r29 = 16;
    L56:
        LinkedHashMap r30 = new LinkedHashMap(r29);     // Catch: HubException -> L42 IOException -> L85
        Iterator<T> r31 = r28.iterator();     // Catch: HubException -> L42 IOException -> L85
    L58:
        if (r31.hasNext() == false) goto L76;
        Map r32 = (Map) r31.next();     // Catch: HubException -> L42 IOException -> L85
        Object r33 = r32.get("index");     // Catch: HubException -> L42 IOException -> L85
        if ((r33 instanceof Number) == false) goto L62;
        Number r34 = (Number) r33;     // Catch: HubException -> L42 IOException -> L85
    L63:
        if (r34 == null) goto L75;
        PlayEvent r35 = (PlayEvent) q40.y0(r20, r34.intValue());     // Catch: HubException -> L42 IOException -> L85
        if (r35 == null) goto L73;
        String r36 = r35.getEventId();     // Catch: HubException -> L42 IOException -> L85
        Object r37 = r32.get("detail");     // Catch: HubException -> L42 IOException -> L85
        if (r37 == null) goto L70;
        String r38 = r37.toString();     // Catch: HubException -> L42 IOException -> L85
        if (r38 == null) goto L70;
    L71:
        r30.put(r36, r38);     // Catch: HubException -> L42 IOException -> L85
    L70:
        r38 = "Hub rejected event";
        goto L71
    L73:
        throw new IOException("Hub returned out of range rejection index");     // Catch: HubException -> L42 IOException -> L85
    L75:
        throw new IOException("Hub returned invalid rejection index");     // Catch: HubException -> L42 IOException -> L85
    L62:
        r34 = null;
        goto L63
    L76:
        Log.w("HubPlays", "Hub rejected " + r30.size() + " of " + r20.size() + "; quarantined");     // Catch: HubException -> L42 IOException -> L85
        rp4 r39 = rs1.b;     // Catch: HubException -> L42 IOException -> L85
        ((lh3) r39.getValue()).b(r30);     // Catch: HubException -> L42 IOException -> L85
        lh3 r40 = (lh3) r39.getValue();     // Catch: HubException -> L42 IOException -> L85
        ArrayList r41 = new ArrayList();     // Catch: HubException -> L42 IOException -> L85
        Iterator r42 = r20.iterator();     // Catch: HubException -> L42 IOException -> L85
    L78:
        if (r42.hasNext() == false) goto L82;
        Object r43 = r42.next();     // Catch: HubException -> L42 IOException -> L85
        if (r30.containsKey(((PlayEvent) r43).getEventId()) == true) goto L78;
        r41.add(r43);     // Catch: HubException -> L42 IOException -> L85
        goto L78
    L82:
        r40.c(r41);     // Catch: HubException -> L42 IOException -> L85
        return mh3.o;
    L174:
        return mh3.n;
    L47:
        rr1 r44 = rr1.a;     // Catch: HubException -> L42 IOException -> L85
        r26 = (HubPlayEventsResult) rr1.B((String) q40.I0(r25), new km0(r20, r4));     // Catch: HubException -> L42 IOException -> L85
    L42:
        e = move-exception;
        int r45 = e.n;
        if (r45 != 404) goto L91;
        mh3 r46 = mh3.s;
    L89:
        r19 = r46;
    L109:
        return r19;
    L91:
        if (r45 != 413) goto L93;
        Log.w("HubPlays", "play event batch too large; splitting or retaining single event");
        r46 = mh3.q;
        goto L89
    L93:
        if (r45 == 0) goto L109;
        if (r45 == 401) goto L109;
        if (r45 == 403) goto L109;
        if (r45 == 408) goto L109;
        if (r45 == 429) goto L109;
        if (400 > r45) goto L109;
        if (r45 >= 500) goto L109;
        r46 = mh3.p;
    L85:
        rr1.m();
        goto L109
    L110:
        ic.a((ic) this.receiver, (jz) r21);
        return r5;
    L112:
        ic.a((ic) this.receiver, (jz) r21);
        return r5;
    L114:
        boolean r47 = ((Boolean) r21).booleanValue();
        u30 r48 = (u30) this.receiver;
        m03 r49 = r48.O;
        if (r47 == false) goto L118;
        r48.x0();
    L141:
        return r5;
    L118:
        if (r48.D == null) goto L140;
        Object[] r50 = r49.c;
        long[] r51 = r49.a;
        int r52 = r51.length - 2;
        if (r52 < 0) goto L137;
        int r110 = 0;
    L122:
        long r111 = r51[r110];
        if (((((~r111) << 7) & r111) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L134;
        int r112 = 8;
        int r113 = 8 - ((~(r110 - r52)) >>> 31);
        int r114 = 0;
    L125:
        if (r114 >= r113) goto L131;
        if ((r111 & 255) >= 128) goto L130;
        fu.G(r48.e0(), null, null, new v(r48, (bq3) r50[(r110 << 3) + r114], r2, r3), 3);
    L130:
        r111 = r111 >> r112;
        r114 = r114 + 1;
        r112 = r112;
        r50 = r50;
        goto L125
    L131:
        Object[] r115 = r50;
        if (r113 != r112) goto L137;
    L135:
        if (r110 == r52) goto L137;
        r110 = r110 + 1;
        r50 = r115;
        goto L122
    L134:
        r115 = r50;
    L137:
        bq3 r53 = r48.P;
        if (r53 == null) goto L140;
        fu.G(r48.e0(), null, null, new v(r48, r53, r2, 1), 3);
    L140:
        r49.a();
        r48.P = null;
        goto L141
    L32:
        return Boolean.valueOf(((SmartSession) this.receiver).isListed((String) r21));
    L34:
        return Boolean.valueOf(((SmartSession) this.receiver).isListed((String) r21));
    }
}
