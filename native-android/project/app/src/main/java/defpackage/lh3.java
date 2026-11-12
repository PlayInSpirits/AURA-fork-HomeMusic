package defpackage;

import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.PlayEventStore$load$loaded$parsed$1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lh3 {
    public final File a;
    public final nk1 b;
    public ArrayList c;

    public lh3(File r1) {
        this.a = r1;
        this.b = new nk1();
    }

    public final List a() {
        ArrayList r0 = this.c;
        if (r0 == null) goto L5;
        return r0;
    L5:
        File r1 = this.a;
        File r2 = new File(r1.getPath() + ".bak");
        if (r1.exists() == true) goto L15;
        if (r2.exists() == false) goto L15;
        if (r2.renameTo(r1) == true) goto L15;
        kf2.o("Check failed.");
        return null;
    L15:
        if (r1.exists() == true) goto L17;
        ArrayList r3 = new ArrayList();
    L20:
        this.c = r3;
        return r3;
    L17:
        List r4 = (List) this.b.f(ji2.H(r1), new PlayEventStore$load$loaded$parsed$1().getType());
        if (r4 == null) goto L22;
        r3 = new ArrayList(r4);
        goto L20
    L22:
        kf2.n("Listening outbox is not a JSON array");
        return null;
    }

    public final synchronized void b(Map r9) {
        monitor-enter(this);
        List r0 = a();     // Catch: Throwable -> L9
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L9
        Iterator r2 = r0.iterator();     // Catch: Throwable -> L9
    L5:
        if (r2.hasNext() == false) goto L11;
        Object r3 = r2.next();     // Catch: Throwable -> L9
        if (r9.containsKey(((PlayEvent) r3).getEventId()) == false) goto L5;
        r1.add(r3);     // Catch: Throwable -> L9
        goto L5
    L11:
        ArrayList r4 = new ArrayList(r40.k0(r1, 10));     // Catch: Throwable -> L9
        int r5 = r1.size();     // Catch: Throwable -> L9
        int r6 = 0;
        int r7 = 0;
    L12:
        if (r7 >= r5) goto L14;
        Object r8 = r1.get(r7);     // Catch: Throwable -> L9
        r7 = r7 + 1;     // Catch: Throwable -> L9
        r4.add(((PlayEvent) r8).getRejected());     // Catch: Throwable -> L9
        goto L12
    L14:
        int r10 = r1.size();     // Catch: Throwable -> L9
        int r11 = 0;
    L15:
        if (r11 >= r10) goto L32;
        Object r12 = r1.get(r11);     // Catch: Throwable -> L9
        r11 = r11 + 1;     // Catch: Throwable -> L9
        PlayEvent r13 = (PlayEvent) r12;     // Catch: Throwable -> L9
        r13.setRejected((String) r9.get(r13.getEventId()));     // Catch: Throwable -> L9
        goto L15
    L32:
        d(r0);     // Catch: Throwable -> L9 Exception -> L21
        monitor-exit(this);
        return;
    L21:
        e = move-exception;
        int r14 = r1.size();     // Catch: Throwable -> L9
        int r15 = 0;
    L23:
        if (r15 >= r14) goto L29;
        Object r16 = r1.get(r15);     // Catch: Throwable -> L9
        r15 = r15 + 1;     // Catch: Throwable -> L9
        int r17 = r6 + 1;     // Catch: Throwable -> L9
        if (r6 < 0) goto L27;
        ((PlayEvent) r16).setRejected((String) r4.get(r6));     // Catch: Throwable -> L9
        r6 = r17;
        goto L23
    L27:
        gb.c0();     // Catch: Throwable -> L9
        throw null;     // Catch: Throwable -> L9
    L29:
        throw e;     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    public final synchronized void c(List r4) {
        monitor-enter(this);
        HashSet r0 = new HashSet();     // Catch: Throwable -> L7
        Iterator r5 = r4.iterator();     // Catch: Throwable -> L7
    L5:
        if (r5.hasNext() == false) goto L9;
        r0.add(((PlayEvent) r5.next()).getEventId());     // Catch: Throwable -> L7
        goto L5
    L9:
        ArrayList r1 = new ArrayList(a());     // Catch: Throwable -> L7
        if (v40.p0(r1, new kh3(r0, 0)) == false) goto L12;
        d(r1);     // Catch: Throwable -> L7
        this.c = r1;     // Catch: Throwable -> L7
    L12:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final void d(List r6) {
        File r0 = this.a;
        File r1 = r0.getParentFile();
        if (r1 != null) goto L5;
    L11:
        File r2 = new File(r0.getPath() + ".tmp");
        FileOutputStream r3 = new FileOutputStream(r2);
        String r5 = this.b.j(r6);     // Catch: Throwable -> L45
        r5.getClass();     // Catch: Throwable -> L45
        byte[] r7 = r5.getBytes(w10.a);     // Catch: Throwable -> L45
        r7.getClass();     // Catch: Throwable -> L45
        r3.write(r7);     // Catch: Throwable -> L45
        r3.getFD().sync();     // Catch: Throwable -> L45
        r3.close();
        if (r2.renameTo(r0) == true) goto L55;
        File r8 = new File(r0.getPath() + ".bak");
        if (r8.exists() == true) goto L19;
    L23:
        boolean r9 = r0.exists();
        if (r9 == false) goto L31;
        if (r0.renameTo(r8) == true) goto L31;
        kf2.o("Check failed.");
        return;
    L31:
        if (r2.renameTo(r0) == true) goto L39;
        if (r9 == true) goto L34;
    L37:
        mj0.i("Could not replace listening outbox");
        return;
    L34:
        if (r8.renameTo(r0) == true) goto L37;
        kf2.o("Check failed.");
        return;
    L39:
        if (r9 == true) goto L41;
        return;
    L41:
        if (r8.delete() == true) goto L56;
        kf2.o("Check failed.");
        return;
    L56:
        return;
    L19:
        if (r8.delete() == true) goto L23;
        kf2.o("Check failed.");
        return;
    L55:
        return;
    L45:
        th = move-exception;
        throw th;     // Catch: Throwable -> L47
    L47:
        th = move-exception;
        q05.h(r3, th);
        throw th;
    L5:
        if (r1.exists() == true) goto L11;
        if (r1.mkdirs() == true) goto L11;
        kf2.o("Check failed.");
    }
}
