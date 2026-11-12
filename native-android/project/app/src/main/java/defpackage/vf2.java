package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.eddyizm.tempus.App;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class vf2 extends hd {
    public final xi4 c;
    public final k03 d;

    public vf2(Application r2) {
        super(r2);
        this.d = new k03(ud3.k());
        this.c = new xi4(18);
    }

    public static boolean c() {
        rq r1 = new rq(new vs3().a);
        Thread r0 = new Thread(r1);
        r0.start();
        r0.join();     // Catch: InterruptedException -> L5
        int r2 = r1.o;     // Catch: InterruptedException -> L5
    L7:
        if (r2 == 0) goto L12;
        return true;
    L12:
        return false;
    L5:
        e = move-exception;
        e.printStackTrace();
        r2 = 0;
        goto L7
    }

    public final void d(String r3) {
        String r0 = ud3.E();
        if (r0 != null) goto L5;
        String r1 = null;
    L6:
        if (r1 == null) goto L12;
        App.b().getClass();
        SharedPreferences.Editor r2 = App.c().edit();
        if (r3 != null) goto L11;
        r3 = "default";
    L11:
        r2.putString(r1, r3).apply();
    L12:
        this.d.k(ud3.k());
        return;
    L5:
        r1 = "active_music_folder_id_".concat(r0);
        goto L6
    }
}
