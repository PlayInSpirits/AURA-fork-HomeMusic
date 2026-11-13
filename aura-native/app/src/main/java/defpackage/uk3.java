package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class uk3 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk3 b;

    public /* synthetic */ uk3(wk3 wk3Var, int i) {
        this.a = i;
        this.b = wk3Var;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int i = this.a;
        boolean z = false;
        wk3 wk3Var = this.b;
        switch (i) {
            case 0:
                wk3Var.w0.d();
                break;
            case 1:
                List list = (List) obj;
                if (list != null) {
                    wk3Var.x0 = (List) list.stream().map(new bi2(27)).collect(Collectors.toList());
                    if (!u52.c().a) {
                        yk3 yk3Var = wk3Var.w0;
                        yk3Var.s = new ArrayList(wk3Var.x0);
                        yk3Var.d();
                    }
                    wk3Var.j0();
                    break;
                }
                break;
            case 2:
                List list2 = (List) obj;
                if (u52.c().a) {
                    yk3 yk3Var2 = wk3Var.w0;
                    yk3Var2.s = new ArrayList(list2);
                    yk3Var2.d();
                    wk3Var.j0();
                    break;
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (!((v52) obj).a) {
                    yk3 yk3Var3 = wk3Var.w0;
                    yk3Var3.s = new ArrayList(wk3Var.x0);
                    yk3Var3.d();
                }
                wk3Var.j0();
                break;
            case 4:
                String str = (String) obj;
                if (!u52.c().a) {
                    if (wk3Var.w0 != null) {
                        Boolean bool = (Boolean) wk3Var.u0.c.d();
                        yk3 yk3Var4 = wk3Var.w0;
                        if (bool != null && bool.booleanValue()) {
                            z = true;
                        }
                        yk3Var4.q(str, z);
                        break;
                    }
                } else {
                    wk3Var.j0();
                    break;
                }
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                if (!u52.c().a) {
                    if (wk3Var.w0 != null) {
                        String str2 = (String) wk3Var.u0.b.d();
                        yk3 yk3Var5 = wk3Var.w0;
                        if (bool2 != null && bool2.booleanValue()) {
                            z = true;
                        }
                        yk3Var5.q(str2, z);
                        break;
                    }
                } else {
                    wk3Var.j0();
                    break;
                }
                break;
        }
    }
}
