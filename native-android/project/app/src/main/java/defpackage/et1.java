package defpackage;

import android.content.Context;
import android.view.View;
import com.eddyizm.tempus.homemusic.SmartContexts;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class et1 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ et1(Object obj, Object obj2, Object obj3, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        final int i2 = 1;
        Object obj = this.q;
        Object obj2 = this.p;
        Object obj3 = this.o;
        final int i3 = 0;
        switch (i) {
            case 0:
                d7 d7Var = (d7) obj2;
                View view2 = (View) obj;
                Child child = (Child) ((ad2) obj3).d();
                if (child != null) {
                    SmartSession smartSession = a.b;
                    if (h12.c(smartSession != null ? smartSession.getContext() : null, SmartContexts.LIKED)) {
                        if (!n61.f(1, child.getId(), child.getStarred() != null)) {
                            d7Var.accept(child);
                        }
                    }
                    Context context = view2.getContext();
                    context.getClass();
                    String id = child.getId();
                    id.getClass();
                    SmartSession smartSession2 = a.b;
                    if (smartSession2 != null && smartSession2.isRec(id)) {
                        io1.a.execute(new ct1(smartSession2, id, context.getApplicationContext(), i3));
                    }
                    break;
                }
                break;
            case 1:
                SongBottomSheetDialog songBottomSheetDialog = (SongBottomSheetDialog) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                if (ud3.o() == null) {
                    Download download = new Download(songBottomSheetDialog.D0);
                    download.setPlaylistId(str);
                    download.setPlaylistName(str2);
                    au0.w(songBottomSheetDialog.Z()).b(gi1.G(songBottomSheetDialog.D0), download, false);
                } else {
                    i51.b(songBottomSheetDialog.Z(), songBottomSheetDialog.D0, str, str2, false);
                }
                songBottomSheetDialog.h0();
                break;
            case 2:
                zk4 zk4Var = (zk4) obj3;
                final Context context2 = (Context) obj2;
                final f9 f9Var = (f9) obj;
                bl4 bl4Var = (bl4) zk4Var.C0;
                nc1 nc1VarX = zk4Var.X();
                bl4Var.c.getClass();
                rv2.o(-1, false).e(nc1VarX, new d8(25, bl4Var));
                bl4Var.d.e(zk4Var, new a83() { // from class: yk4
                    @Override // defpackage.a83
                    public final void b(Object obj4) {
                        int i4 = i3;
                        f9 f9Var2 = f9Var;
                        Context context3 = context2;
                        List list = (List) obj4;
                        switch (i4) {
                            case 0:
                                if (list != null && !list.isEmpty()) {
                                    au0.w(context3).a(gi1.H(list), (List) list.stream().map(new hu3(6)).collect(Collectors.toList()), false);
                                }
                                f9Var2.dismiss();
                                break;
                            case 1:
                                if (list != null && !list.isEmpty()) {
                                    au0.w(context3).a(gi1.H(list), (List) list.stream().map(new hu3(6)).collect(Collectors.toList()), false);
                                }
                                f9Var2.dismiss();
                                break;
                            default:
                                if (list != null && ud3.o() == null) {
                                    au0.w(context3).a(gi1.H(list), (List) list.stream().map(new hu3(6)).collect(Collectors.toList()), false);
                                }
                                f9Var2.dismiss();
                                break;
                        }
                    }
                });
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                zk4 zk4Var2 = (zk4) obj3;
                final Context context3 = (Context) obj2;
                final f9 f9Var2 = (f9) obj;
                cl4 cl4Var = (cl4) zk4Var2.C0;
                cl4Var.c.y(-1, false).e(zk4Var2.X(), new d8(26, cl4Var));
                cl4Var.d.e(zk4Var2, new a83() { // from class: yk4
                    @Override // defpackage.a83
                    public final void b(Object obj4) {
                        int i4 = i2;
                        f9 f9Var3 = f9Var2;
                        Context context4 = context3;
                        List list = (List) obj4;
                        switch (i4) {
                            case 0:
                                if (list != null && !list.isEmpty()) {
                                    au0.w(context4).a(gi1.H(list), (List) list.stream().map(new hu3(6)).collect(Collectors.toList()), false);
                                }
                                f9Var3.dismiss();
                                break;
                            case 1:
                                if (list != null && !list.isEmpty()) {
                                    au0.w(context4).a(gi1.H(list), (List) list.stream().map(new hu3(6)).collect(Collectors.toList()), false);
                                }
                                f9Var3.dismiss();
                                break;
                            default:
                                if (list != null && ud3.o() == null) {
                                    au0.w(context4).a(gi1.H(list), (List) list.stream().map(new hu3(6)).collect(Collectors.toList()), false);
                                }
                                f9Var3.dismiss();
                                break;
                        }
                    }
                });
                break;
            default:
                zk4 zk4Var3 = (zk4) obj3;
                final Context context4 = (Context) obj2;
                final f9 f9Var3 = (f9) obj;
                dl4 dl4Var = (dl4) zk4Var3.C0;
                nc1 nc1VarX2 = zk4Var3.X();
                dl4Var.c.getClass();
                k03 k03VarS = xi4.s(-1, false, false);
                k03 k03Var = dl4Var.d;
                Objects.requireNonNull(k03Var);
                k03VarS.e(nc1VarX2, new g7(k03Var, 0));
                final int i4 = 2;
                k03Var.e(zk4Var3.X(), new a83() { // from class: yk4
                    @Override // defpackage.a83
                    public final void b(Object obj4) {
                        int i5 = i4;
                        f9 f9Var4 = f9Var3;
                        Context context5 = context4;
                        List list = (List) obj4;
                        switch (i5) {
                            case 0:
                                if (list != null && !list.isEmpty()) {
                                    au0.w(context5).a(gi1.H(list), (List) list.stream().map(new hu3(6)).collect(Collectors.toList()), false);
                                }
                                f9Var4.dismiss();
                                break;
                            case 1:
                                if (list != null && !list.isEmpty()) {
                                    au0.w(context5).a(gi1.H(list), (List) list.stream().map(new hu3(6)).collect(Collectors.toList()), false);
                                }
                                f9Var4.dismiss();
                                break;
                            default:
                                if (list != null && ud3.o() == null) {
                                    au0.w(context5).a(gi1.H(list), (List) list.stream().map(new hu3(6)).collect(Collectors.toList()), false);
                                }
                                f9Var4.dismiss();
                                break;
                        }
                    }
                });
                break;
        }
    }
}
