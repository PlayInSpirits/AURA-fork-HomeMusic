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
    public static final ExecutorService a = Executors.newSingleThreadExecutor();

    public static MainActivity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof MainActivity) {
                return (MainActivity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static final boolean b(Child child) {
        return (child == null || child.getId().length() <= 0 || h12.c(child.getType(), "podcast") || h12.c(child.getType(), WaveOrigin.RADIO)) ? false : true;
    }

    public static final void c(MainActivity mainActivity, Child child) {
        child.getClass();
        String id = child.getId();
        rs1 rs1Var = rs1.a;
        String strC = rs1.c(id);
        bl2 bl2Var = mainActivity.P;
        if (bl2Var != null) {
            bl2Var.f(new k6(28, id, bl2Var), gq0.n);
        }
        fx3 fx3Var = new fx3();
        a.execute(new t6(id, child, strC, fx3Var, 6));
        View viewFindViewById = mainActivity.findViewById(R.id.content);
        if (viewFindViewById == null) {
            return;
        }
        int[] iArr = qg4.E;
        qg4 qg4VarH = qg4.h(viewFindViewById, viewFindViewById.getResources().getText(app.homemusic.R.string.homemusic_disliked), 0);
        qg4VarH.e(mainActivity.u());
        qg4VarH.i(app.homemusic.R.string.homemusic_dislike_undo, new j8(12, fx3Var, id));
        qg4VarH.j();
    }

    public static void d(String str) {
        rs1.j(ih3.c(PlayEvent.Companion, PlayEvent.UNDISLIKE, str, rs1.f(), System.currentTimeMillis(), null, 16368));
    }
}
