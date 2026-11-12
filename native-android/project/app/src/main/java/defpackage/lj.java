package defpackage;

import com.eddyizm.tempus.App;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lj implements a83 {
    public final /* synthetic */ int a;

    public /* synthetic */ lj(int i) {
        this.a = i;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        List list = (List) obj;
        switch (this.a) {
            case 0:
                break;
            default:
                int i = MainActivity.e0;
                if (list != null) {
                    App.b().getClass();
                    App.c().edit().putString("open_subsonic_extensions", new nk1().j(list)).apply();
                }
                break;
        }
    }
}
