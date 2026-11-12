package defpackage;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ur1 {
    public static final ExecutorService a = null;

    static {
        a = Executors.newSingleThreadExecutor();
    }

    public static MainActivity a(Context r1) {
    L3:
        if ((r1 instanceof ContextWrapper) == false) goto L9;
        if ((r1 instanceof MainActivity) == true) goto L7;
        r1 = ((ContextWrapper) r1).getBaseContext();
        goto L3
    L7:
        return (MainActivity) r1;
    L9:
        return null;
    }

    public static final boolean b(Child r2) {
        if (r2 != null) goto L4;
        return false;
    L4:
        if (r2.getId().length() > 0) goto L6;
        return false;
    L6:
        if (h12.c(r2.getType(), "podcast") == false) goto L8;
        return false;
    L8:
        if (h12.c(r2.getType(), WaveOrigin.RADIO) == true) goto L15;
        return true;
    L15:
        return false;
    }

    public static final void c(MainActivity r6, Child r7) {
        r7.getClass();
        String r1 = r7.getId();
        rs1 r0 = rs1.a;
        String r3 = rs1.c(r1);
        bl2 r2 = r6.P;
        if (r2 == null) goto L6;
        r2.f(new k6(28, r1, r2), gq0.n);
    L6:
        fx3 r4 = new fx3();
        t6 r5 = new t6(r1, r7, r3, r4, 6);
        a.execute(r5);
        View r8 = r6.findViewById(R.id.content);
        if (r8 != null) goto L9;
        return;
    L9:
        int[] r9 = qg4.E;
        qg4 r10 = qg4.h(r8, r8.getResources().getText(app.homemusic.R.string.homemusic_disliked), 0);
        r10.e(r6.u());
        r10.i(app.homemusic.R.string.homemusic_dislike_undo, new j8(12, r4, r1));
        r10.j();
    }

    public static void d(String r8) {
        rs1.j(ih3.c(PlayEvent.Companion, PlayEvent.UNDISLIKE, r8, rs1.f(), System.currentTimeMillis(), null, 16368));
    }
}
