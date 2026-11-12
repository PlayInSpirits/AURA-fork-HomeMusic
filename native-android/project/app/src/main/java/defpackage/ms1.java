package defpackage;

import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubTracks$Item;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ms1 {
    public static final ExecutorService a = null;
    public static volatile int b;

    static {
        a = Executors.newFixedThreadPool(4);
    }

    public static void a(final MainActivity r8, final List r9, int r10, final String r11) {
        r8.getClass();
        r9.getClass();
        if (r9.isEmpty() == false) goto L5;
        return;
    L5:
        final int r4 = gb.m(r10, 0, r9.size() - 1);
        b++;
        final int r5 = b;
        io1.a.execute(new ks1(r9, r4, r5, r8, r11));
    }

    public static ArrayList b(List r11) {
        r11.getClass();
        Iterator r0 = r11.iterator();
    L4:
        if (r0.hasNext() == false) goto L33;
        HubTracks$Item r1 = (HubTracks$Item) r0.next();
        String r2 = r1.getRef();
        if (r2 == null) goto L4;
        if (qm4.u0(r2) == true) goto L4;
        String r3 = r1.getSongId();
        if (r3 == null) goto L4;
        if (qm4.u0(r3) == true) goto L4;
        String r4 = xa3.g("hub:", r1.getRef());
        String r5 = r1.getSongId();
        HashMap r6 = n61.a;
        monitor-enter(n61.class);
        if (r5 == null) goto L31;
    L25:
        th = move-exception;
        throw th;
    L19:
        if (n61.a.containsKey(n61.e(1, r5)) == true) goto L31;
        String r7 = n61.e(1, r4);     // Catch: Throwable -> L25
        String r8 = "SONG:" + r5;     // Catch: Throwable -> L25
        if (n61.e(1, r5).equals(r7) == true) goto L27;
        n61.c.put(r8, r7);     // Catch: Throwable -> L25
    L27:
        monitor-exit(n61.class);
    L31:
        monitor-exit(n61.class);
        goto L4
    L33:
        int r9 = 0;
        gp3 r10 = App.f(false).c();
        ArrayList r12 = new ArrayList(r40.k0(r11, 10));
        Iterator r13 = r11.iterator();
    L34:
        String r14 = null;
        if (r13.hasNext() == false) goto L45;
        HubTracks$Item r15 = (HubTracks$Item) r13.next();
        String r16 = r15.getSongId();
        if (r16 != null) goto L39;
    L41:
        if (r14 != null) goto L43;
        ConcurrentHashMap r17 = ot1.a;
        Object r18 = CompletableFuture.completedFuture(ot1.b(r15));
    L44:
        r12.add(r18);
        goto L34
    L43:
        r18 = a.submit(new ei0(2, r10, r14));
        goto L44
    L39:
        if (qm4.u0(r16) == true) goto L41;
        r14 = r16;
        goto L41
    L45:
        ArrayList r19 = new ArrayList(r40.k0(r12, 10));
        int r20 = r12.size();
        int r21 = 0;
    L46:
        if (r21 >= r20) goto L70;
        Object r22 = r12.get(r21);
        r21 = r21 + 1;
        int r23 = r9 + 1;
        if (r9 < 0) goto L68;
        Object r24 = (Child) ((Future) r22).get(30, TimeUnit.SECONDS);     // Catch: Throwable -> L52
    L55:
        if ((r24 instanceof s14) == false) goto L57;
        r24 = null;
    L57:
        Child r25 = (Child) r24;
        if (r25 != null) goto L67;
        Object r26 = r11.get(r9);
        if (((HubTracks$Item) r26).getSongId() != null) goto L63;
        r26 = null;
    L63:
        HubTracks$Item r27 = (HubTracks$Item) r26;
        if (r27 == null) goto L66;
        ConcurrentHashMap r28 = ot1.a;
        r25 = ot1.b(r27);
        goto L67
    L66:
        r25 = null;
    L67:
        r19.add(r25);
        r9 = r23;
    L52:
        th = move-exception;
        r24 = new s14(th);
        goto L55
    L68:
        gb.c0();
        throw null;
    L70:
        return r19;
    }
}
