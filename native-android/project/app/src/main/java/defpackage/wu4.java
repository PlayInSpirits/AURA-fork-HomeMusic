package defpackage;

import android.os.Handler;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wu4 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ wu4(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r2 = 4;
        switch(this.n) {
            case 0: goto L53;
            case 1: goto L33;
            case 2: goto L27;
            case 3: goto L13;
            case 4: goto L10;
            case 5: goto L8;
            case 6: goto L6;
            default: goto L4;
        };
    L4:
        ((rf5) this.o).l.a(new ka0(4));
        return;
    L6:
        me r5 = ((gf5) ((h45) this.o).o).f;
        r5.a0(r5.getClass().getName().concat(" disconnecting because it was signed out."));
        return;
    L8:
        ((gf5) this.o).e();
        return;
    L10:
        ((o65) this.o).p(0);
        return;
    L33:
        cv4 r6 = (cv4) this.o;
        Window.Callback r0 = r6.e;
        Menu r7 = r6.u0();
        if ((r7 instanceof qu2) == false) goto L36;
        qu2 r3 = (qu2) r7;
    L37:
        if (r3 == null) goto L55;
        r3.y();
    L55:
        r7.clear();     // Catch: Throwable -> L44
        if (r0.onCreatePanelMenu(0, r7) == true) goto L42;
    L46:
        r7.clear();     // Catch: Throwable -> L44
    L47:
        if (r3 == null) goto L60;
        r3.x();
        return;
    L60:
        return;
    L42:
        if (r0.onPreparePanel(0, null, r7) == true) goto L47;
    L44:
        th = move-exception;
        if (r3 == null) goto L52;
        r3.x();
    L52:
        throw th;
    L36:
        r3 = null;
        goto L37
    L53:
        ((Toolbar) this.o).v();
        return;
    L13:
        if (((s25) this.o).A == true) goto L16;
        return;
    L16:
        if (((s25) this.o).C == false) goto L18;
    L20:
        s25 r1 = (s25) this.o;
        Handler r4 = r1.y;
        if (r1.B == false) goto L23;
        long r8 = s25.F;
    L24:
        r4.postDelayed(this, r8);
        return;
    L23:
        r8 = s25.G;
        goto L24
    L18:
        if (((s25) this.o).x.isShutdown() == true) goto L20;
        ((s25) this.o).C = true;
        s25 r9 = (s25) this.o;
        r9.x.execute(new r25(r9, 1));
        goto L20
    L27:
        if (((q25) this.o).C == false) goto L29;
        return;
    L29:
        if (((q25) this.o).M == false) goto L59;
        q25 r10 = (q25) this.o;
        r10.l.execute(new o25(r10, r2));
        Handler r11 = ((q25) this.o).n;
        Set r12 = q25.Q;
        r11.postDelayed(this, 2000);
        return;
    }
}
