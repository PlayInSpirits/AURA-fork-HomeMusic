package defpackage;

import com.eddyizm.tempus.App;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lj implements a83 {
    public final /* synthetic */ int a;

    public /* synthetic */ lj(int r1) {
        this.a = r1;
    }

    @Override // defpackage.a83
    public final void b(Object r3) {
        List r4 = (List) r3;
        switch(this.a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        int r2 = MainActivity.e0;
        if (r4 == null) goto L10;
        App.b().getClass();
        App.c().edit().putString("open_subsonic_extensions", new nk1().j(r4)).apply();
        return;
    L10:
        return;
    L8:
        List r5 = (List) r4.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(new mj()), new m7(12)));
    }
}
