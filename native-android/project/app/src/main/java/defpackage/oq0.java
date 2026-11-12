package defpackage;

import android.app.Dialog;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Directory;
import com.eddyizm.tempus.ui.fragment.DirectoryFragment;
import com.eddyizm.tempus.ui.fragment.IndexFragment;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oq0 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractList b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ oq0(Object r1, AbstractList r2, Serializable r3, Object r4, int r5) {
        this.a = r5;
        this.d = r1;
        this.b = r2;
        this.c = r3;
        this.e = r4;
    }

    @Override // defpackage.a83
    public final void b(Object r8) {
        switch(this.a) {
            case 0: goto L33;
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        gl3 r0 = (gl3) this.d;
        AbstractList r1 = this.b;
        String r2 = (String) this.c;
        Dialog r7 = (Dialog) this.e;
        List r9 = (List) r8;
        if (r9 == null) goto L7;
        r0.getClass();
        r1.removeAll(hw.P(new nz2(14), r9));
    L7:
        r0.c.a(r2, new ArrayList(r1), (Boolean) r0.d.d());
        r7.dismiss();
        return;
    L9:
        IndexFragment r3 = (IndexFragment) this.d;
        ArrayList r4 = (ArrayList) this.b;
        AtomicInteger r5 = (AtomicInteger) this.c;
        tx1 r6 = (tx1) this.e;
        Directory r10 = (Directory) r8;
        if (r10 == null) goto L30;
        if (r10.getChildren() == null) goto L30;
        Iterator<Child> r11 = r10.getChildren().iterator();
    L15:
        if (r11.hasNext() == false) goto L30;
        Child r12 = r11.next();
        if (r12.isDir() == true) goto L18;
        if (r12.isVideo() == true) goto L15;
        monitor-enter(r4);
        r4.add(r12);     // Catch: Throwable -> L25
        monitor-exit(r4);     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        throw th;
    L18:
        String r13 = r12.getId();
        r5.incrementAndGet();
        r3.q0.getClass();
        om0.W(r13).e(r3.v(), new oq0(r3, r4, r5, r6, 1));
    L30:
        if (r5.decrementAndGet() != 0) goto L77;
        r6.run();
        return;
    L77:
        return;
    L33:
        DirectoryFragment r14 = (DirectoryFragment) this.d;
        ArrayList r15 = (ArrayList) this.b;
        AtomicInteger r16 = (AtomicInteger) this.c;
        mq0 r17 = (mq0) this.e;
        Directory r18 = (Directory) r8;
        if (r18 == null) goto L54;
        if (r18.getChildren() == null) goto L54;
        Iterator<Child> r19 = r18.getChildren().iterator();
    L39:
        if (r19.hasNext() == false) goto L54;
        Child r20 = r19.next();
        if (r20.isDir() == true) goto L42;
        if (r20.isVideo() == true) goto L39;
        monitor-enter(r15);
        r15.add(r20);     // Catch: Throwable -> L49
        monitor-exit(r15);     // Catch: Throwable -> L49
    L49:
        th = move-exception;
        throw th;
    L42:
        String r21 = r20.getId();
        r16.incrementAndGet();
        r14.q0.getClass();
        om0.W(r21).e(r14.v(), new oq0(r14, r15, r16, r17, 0));
    L54:
        if (r16.decrementAndGet() != 0) goto L78;
        r17.run();
        return;
    }
}
