package defpackage;

import android.app.Activity;
import android.util.SparseBooleanArray;
import android.view.View;
import app.homemusic.R;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.homemusic.HubAuthOptions;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ct0 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ ct0(ft0 ft0Var, String str, et0 et0Var, int i) {
        this.n = 0;
        this.q = ft0Var;
        this.p = str;
        this.r = et0Var;
        this.o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        int i2 = 2;
        Object obj = this.r;
        Object obj2 = this.p;
        int i3 = this.o;
        Object obj3 = this.q;
        switch (i) {
            case 0:
                ft0 ft0Var = (ft0) obj3;
                String str = (String) obj2;
                View view = ((et0) obj).a;
                String str2 = (String) xl.E((s24) AppDatabase.y().C().a, true, false, new rs0(13, str));
                if (str2 != null) {
                    ft0Var.x.put(str, str2);
                    if (view.getContext() instanceof Activity) {
                        ((Activity) view.getContext()).runOnUiThread(new ul(i3, i2, ft0Var));
                    }
                }
                break;
            case 1:
                fo1 fo1Var = (fo1) obj3;
                String str3 = (String) obj2;
                HubAuthOptions hubAuthOptions = (HubAuthOptions) obj;
                boolean zC = fo1Var.c();
                uc1 uc1Var = (uc1) fo1Var.c;
                if (zC) {
                    fo1Var.r(false);
                    if (i3 == 0) {
                        fo1Var.e = str3;
                        fo1Var.i = hubAuthOptions;
                        uc1Var.r.setText(str3);
                        fo1Var.s(co1.o);
                    } else {
                        TextInputLayout textInputLayout = uc1Var.u;
                        if (i3 == 2) {
                            textInputLayout.setError(fo1Var.v(R.string.homemusic_login_server_not_music, new Object[0]));
                        } else {
                            textInputLayout.setError(fo1Var.v(R.string.homemusic_login_server_unreachable, new Object[0]));
                        }
                    }
                    break;
                }
                break;
            case 2:
                lo2 lo2Var = (lo2) obj3;
                kn2 kn2Var = (kn2) obj2;
                rm2 rm2Var = (rm2) obj;
                if (i3 == lo2Var.v) {
                    lo2Var.e(kn2Var, rm2Var, lo2Var.c(false));
                }
                break;
            default:
                List list = (List) obj2;
                fr2 fr2Var = (fr2) obj;
                tn2 tn2Var = ((ls2) ((ue1) obj3).q).g;
                if (i3 == -1) {
                    tn2Var.s.w0(list);
                } else {
                    tn2Var.s.N0(list, i3);
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                sparseBooleanArray.append(20, true);
                tn2Var.v(fr2Var, new mi3(new w71(sparseBooleanArray)));
                break;
        }
    }

    public /* synthetic */ ct0(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.n = i2;
        this.q = obj;
        this.o = i;
        this.p = obj2;
        this.r = obj3;
    }
}
