package defpackage;

import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.SmartPlan;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nh3 {
    public final lh3 a;
    public final q b;
    public final gf1 c;
    public final gf1 d;
    public final gf1 e;
    public final gf1 f;
    public int g;

    public nh3(lh3 r1, q r2, na r3, na r4, na r5, na r6) {
        r1.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
    }

    public final synchronized Long a() {
        monitor-enter(this);
        final boolean r0 = ((Boolean) this.c.invoke()).booleanValue();     // Catch: Throwable -> L17
        final boolean r1 = ((Boolean) this.d.invoke()).booleanValue();     // Catch: Throwable -> L17
        final boolean r2 = ((Boolean) this.f.invoke()).booleanValue();     // Catch: Throwable -> L17
        int r3 = SmartPlan.MAX_QUEUE;
    L4:
        lh3 r4 = this.a;     // Catch: Throwable -> L17
        final String r5 = (String) this.e.invoke();     // Catch: Throwable -> L17
        monitor-enter(r4);     // Catch: Throwable -> L17
        List r6 = fa4.f0(fa4.e0(new h71(new w40(0, r4.a()), true, new jh3(r0, r1, r2, r5)), r3));     // Catch: Throwable -> L56
        monitor-exit(r4);     // Catch: Throwable -> L17
        if (r6.isEmpty() == true) goto L10;
        int r7 = ((mh3) this.b.invoke(r6)).ordinal();     // Catch: Throwable -> L17
        if (r7 != 0) goto L27;
        this.g = 0;     // Catch: Throwable -> L17
        this.a.c(r6);     // Catch: Throwable -> L17
        goto L4
    L27:
        if (r7 != 1) goto L29;
        this.g = 0;     // Catch: Throwable -> L17
        goto L4
    L29:
        if (r7 == 2) goto L47;
        if (r7 != 3) goto L33;
        if (r6.size() <= 1) goto L43;
        r3 = r6.size() / 2;     // Catch: Throwable -> L17
        if (r3 >= 1) goto L4;
        r3 = 1;
        goto L4
    L43:
        lh3 r8 = this.a;     // Catch: Throwable -> L17
        Map r9 = Collections.singletonMap(((PlayEvent) q40.I0(r6)).getEventId(), "Server rejected single event as too large (413)");     // Catch: Throwable -> L17
        r9.getClass();     // Catch: Throwable -> L17
        r8.b(r9);     // Catch: Throwable -> L17
        goto L4
    L33:
        if (r7 == 4) goto L47;
        if (r7 != 5) goto L40;
        this.g++;     // Catch: Throwable -> L17
        monitor-exit(this);
        return 21600000L;
    L40:
        throw new NoWhenBranchMatchedException();     // Catch: Throwable -> L17
    L47:
        int r10 = this.g;     // Catch: Throwable -> L17
        this.g = r10 + 1;     // Catch: Throwable -> L17
        long r11 = 30000 << gb.m(r10, 0, 10);     // Catch: Throwable -> L17
        if (r11 <= 1800000) goto L50;
        r11 = 1800000;
    L50:
        Long r12 = Long.valueOf(r11);     // Catch: Throwable -> L17
        monitor-exit(this);
        return r12;
    L10:
        this.g = 0;     // Catch: Throwable -> L17
        lh3 r13 = this.a;     // Catch: Throwable -> L17
        monitor-enter(r13);     // Catch: Throwable -> L17
        int r14 = r13.a().size();     // Catch: Throwable -> L22
        monitor-exit(r13);     // Catch: Throwable -> L17
        if (r14 <= 0) goto L19;
        Long r15 = 300000L;     // Catch: Throwable -> L17
    L20:
        monitor-exit(this);
        return r15;
    L19:
        r15 = null;
        goto L20
    L22:
        th = move-exception;
        throw th;     // Catch: Throwable -> L17
    L56:
        th = move-exception;
        throw th;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        throw th;
    }
}
