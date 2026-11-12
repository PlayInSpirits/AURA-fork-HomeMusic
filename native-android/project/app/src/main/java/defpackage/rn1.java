package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.View;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubAppRelease;
import com.eddyizm.tempus.homemusic.HubUpdatePatch;
import com.eddyizm.tempus.homemusic.HubUpdater;
import com.eddyizm.tempus.lan.LanReceiverService;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.LibraryFragment;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rn1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ rn1(Object obj, Object obj2, Object obj3, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 0;
        switch (this.n) {
            case 0:
                l92 l92Var = (l92) this.o;
                LibraryFragment libraryFragment = (LibraryFragment) this.p;
                l92 l92Var2 = (l92) this.q;
                App.b().getClass();
                App.c().edit().putBoolean("music_directory_section_visibility", false).apply();
                l92Var.run();
                View view = libraryFragment.T;
                if (view == null) {
                    return;
                }
                nc1 nc1VarE = libraryFragment.e();
                MainActivity mainActivity = nc1VarE instanceof MainActivity ? (MainActivity) nc1VarE : null;
                int[] iArr = qg4.E;
                qg4 qg4VarH = qg4.h(view, view.getResources().getText(R.string.homemusic_folders_hidden), 0);
                qg4VarH.e(mainActivity != null ? mainActivity.u() : null);
                qg4VarH.i(R.string.homemusic_undo, new p6(17, l92Var2));
                qg4VarH.j();
                return;
            case 1:
                Context context = (Context) this.o;
                ArrayList arrayList = (ArrayList) this.p;
                rm3 rm3Var = (rm3) this.q;
                context.getClass();
                if (!arrayList.isEmpty()) {
                    if (ud3.o() == null) {
                        eu0 eu0VarW = au0.w(context);
                        ArrayList arrayListH = gi1.H(arrayList);
                        ArrayList arrayList2 = new ArrayList(r40.k0(arrayList, 10));
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            arrayList2.add(new Download((Child) obj));
                        }
                        eu0VarW.f(arrayListH, arrayList2);
                    } else {
                        int size2 = arrayList.size();
                        while (i2 < size2) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            g51.b((Child) obj2);
                        }
                    }
                }
                rm3Var.z();
                return;
            case 2:
                HubUpdater.offer$lambda$2((Activity) this.o, (HubAppRelease) this.p, (HubUpdatePatch) this.q, dialogInterface, i);
                return;
            default:
                SharedPreferences sharedPreferences = (SharedPreferences) this.o;
                h62 h62Var = (h62) this.p;
                String str = (String) this.q;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                boolean z = LanReceiverService.y;
                Context context2 = h62Var.t0;
                if (context2 == null) {
                    h12.Q("app");
                    throw null;
                }
                editorEdit.putStringSet("trusted", kb4.K(kb4.a0(context2), str)).remove("peer-" + str).apply();
                h62Var.o0();
                return;
        }
    }
}
