package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.viewmodel.b;
import java.util.List;
import java.util.stream.Collectors;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xo1 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp1 b;

    public /* synthetic */ xo1(cp1 cp1Var, int i) {
        this.a = i;
        this.b = cp1Var;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int i = this.a;
        cp1 cp1Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (cp1Var.v0 != null) {
                    Boolean bool = (Boolean) cp1Var.p0.c.d();
                    cp1Var.v0.s(str, bool != null && bool.booleanValue());
                }
                break;
            case 1:
                List list = (List) obj;
                tc1 tc1Var = cp1Var.l0;
                if (list != null) {
                    if (tc1Var != null) {
                        tc1Var.j0.setVisibility(!list.isEmpty() ? 0 : 8);
                    }
                    tc1 tc1Var2 = cp1Var.l0;
                    if (tc1Var2 != null) {
                        tc1Var2.b.setVisibility(list.isEmpty() ? 8 : 0);
                    }
                    tc1 tc1Var3 = cp1Var.l0;
                    if (tc1Var3 != null) {
                        RecyclerView recyclerView = tc1Var3.i0;
                        cp1Var.Z();
                        recyclerView.setLayoutManager(new GridLayoutManager(g12.y(list.size(), 5), 0));
                    }
                    b8 b8Var = cp1Var.x0;
                    b8Var.s = list;
                    ((o7) b8Var.v).filter(b8Var.u);
                    b8Var.d();
                } else if (tc1Var != null) {
                    tc1Var.j0.setVisibility(8);
                }
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                if (cp1Var.v0 != null) {
                    cp1Var.v0.s((String) cp1Var.p0.b.d(), bool2 != null && bool2.booleanValue());
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                List list2 = (List) obj;
                tc1 tc1Var4 = cp1Var.l0;
                if (list2 != null) {
                    if (tc1Var4 != null) {
                        tc1Var4.P.setVisibility(list2.isEmpty() ? 8 : 0);
                    }
                    tc1 tc1Var5 = cp1Var.l0;
                    if (tc1Var5 != null) {
                        RecyclerView recyclerView2 = tc1Var5.O;
                        cp1Var.Z();
                        recyclerView2.setLayoutManager(new GridLayoutManager(g12.y(list2.size(), 5), 0));
                    }
                    cp1Var.D0.p(list2);
                } else if (tc1Var4 != null) {
                    tc1Var4.P.setVisibility(8);
                }
                break;
            case 4:
                List list3 = (List) obj;
                tc1 tc1Var6 = cp1Var.l0;
                if (list3 != null) {
                    if (tc1Var6 != null) {
                        tc1Var6.r.setVisibility(list3.isEmpty() ? 8 : 0);
                    }
                    cp1Var.A0.p(list3);
                } else if (tc1Var6 != null) {
                    tc1Var6.r.setVisibility(8);
                }
                break;
            case 5:
                List list4 = (List) obj;
                tc1 tc1Var7 = cp1Var.l0;
                if (list4 != null) {
                    if (tc1Var7 != null) {
                        tc1Var7.s.setVisibility(list4.isEmpty() ? 8 : 0);
                    }
                    tc1 tc1Var8 = cp1Var.l0;
                    if (tc1Var8 != null) {
                        RecyclerView recyclerView3 = tc1Var8.N;
                        cp1Var.Z();
                        recyclerView3.setLayoutManager(new GridLayoutManager(g12.y(list4.size(), 5), 0));
                    }
                    b8 b8Var2 = cp1Var.B0;
                    b8Var2.s = list4;
                    ((o7) b8Var2.v).filter(b8Var2.u);
                    b8Var2.d();
                } else if (tc1Var7 != null) {
                    tc1Var7.s.setVisibility(8);
                }
                break;
            case 6:
                b bVar = cp1Var.n0;
                le1 le1VarV = cp1Var.v();
                boolean zE = bVar.e();
                rv2 rv2Var = bVar.d;
                if (zE) {
                    if (!bVar.d("HOME_SECTOR_DISCOVERY")) {
                        bVar.c.getClass();
                        xi4.q(10, null, null).e(le1VarV, bVar.h(bVar.l));
                    }
                    if (!bVar.d("HOME_SECTOR_NEW_RELEASES")) {
                        bVar.f(le1VarV);
                    }
                    if (!bVar.d("HOME_SECTOR_MOST_PLAYED")) {
                        rv2Var.getClass();
                        rv2.m("frequent", 20, null, null).e(le1VarV, bVar.h(bVar.t));
                    }
                    if (!bVar.d("HOME_SECTOR_LAST_PLAYED")) {
                        rv2Var.getClass();
                        rv2.m("recent", 20, null, null).e(le1VarV, bVar.h(bVar.u));
                    }
                    if (!bVar.d("HOME_SECTOR_RECENTLY_ADDED")) {
                        rv2Var.getClass();
                        rv2.m("newest", 20, null, null).e(le1VarV, bVar.h(bVar.w));
                    }
                    if (!bVar.d("HOME_SECTOR_FLASHBACK")) {
                        rv2Var.n().e(le1VarV, bVar.h(bVar.v));
                    }
                    break;
                }
                break;
            case 7:
                List list5 = (List) obj;
                e03.o(list5);
                tc1 tc1Var9 = cp1Var.l0;
                if (list5 != null) {
                    if (tc1Var9 != null) {
                        tc1Var9.n.setVisibility(list5.isEmpty() ? 8 : 0);
                    }
                    vq0 vq0Var = cp1Var.q0;
                    vq0Var.r = list5;
                    vq0Var.d();
                } else if (tc1Var9 != null) {
                    tc1Var9.n.setVisibility(8);
                }
                break;
            case 8:
                List list6 = (List) obj;
                tc1 tc1Var10 = cp1Var.l0;
                if (list6 != null) {
                    if (tc1Var10 != null) {
                        tc1Var10.n0.setVisibility(list6.isEmpty() ? 8 : 0);
                    }
                    tc1 tc1Var11 = cp1Var.l0;
                    if (tc1Var11 != null) {
                        RecyclerView recyclerView4 = tc1Var11.m0;
                        cp1Var.Z();
                        recyclerView4.setLayoutManager(new GridLayoutManager(g12.y(list6.size(), 5), 0));
                    }
                    cp1Var.u0.r(list6);
                    cp1Var.h0();
                } else if (tc1Var10 != null) {
                    tc1Var10.n0.setVisibility(8);
                }
                break;
            case 9:
                List list7 = (List) obj;
                e03.o(list7);
                tc1 tc1Var12 = cp1Var.l0;
                if (list7 != null) {
                    if (tc1Var12 != null) {
                        tc1Var12.x.setVisibility(list7.isEmpty() ? 8 : 0);
                    }
                    s6 s6Var = cp1Var.r0;
                    s6Var.r = list7;
                    s6Var.d();
                } else if (tc1Var12 != null) {
                    tc1Var12.x.setVisibility(8);
                }
                break;
            case 10:
                List list8 = (List) obj;
                tc1 tc1Var13 = cp1Var.l0;
                if (list8 != null) {
                    if (tc1Var13 != null) {
                        tc1Var13.l.setVisibility(list8.isEmpty() ? 8 : 0);
                    }
                    vi viVar = cp1Var.t0;
                    viVar.u = list8;
                    viVar.d();
                } else if (tc1Var13 != null) {
                    tc1Var13.l.setVisibility(8);
                }
                break;
            case 11:
                List list9 = (List) obj;
                tc1 tc1Var14 = cp1Var.l0;
                if (list9 != null) {
                    if (tc1Var14 != null) {
                        tc1Var14.v.setVisibility(list9.isEmpty() ? 8 : 0);
                    }
                    cp1Var.z0.p(list9);
                } else if (tc1Var14 != null) {
                    tc1Var14.v.setVisibility(8);
                }
                break;
            case 12:
                List list10 = (List) obj;
                tc1 tc1Var15 = cp1Var.l0;
                if (list10 != null) {
                    if (tc1Var15 != null) {
                        tc1Var15.a0.setVisibility(list10.isEmpty() ? 8 : 0);
                    }
                    tc1 tc1Var16 = cp1Var.l0;
                    if (tc1Var16 != null) {
                        RecyclerView recyclerView5 = tc1Var16.Z;
                        cp1Var.Z();
                        recyclerView5.setLayoutManager(new GridLayoutManager(g12.y(list10.size(), 10), 0));
                    }
                    uc4 uc4Var = cp1Var.E0;
                    uc4Var.s = list10;
                    uc4Var.d();
                } else if (tc1Var15 != null) {
                    tc1Var15.a0.setVisibility(8);
                }
                break;
            case 13:
                List list11 = (List) obj;
                tc1 tc1Var17 = cp1Var.l0;
                if (list11 != null) {
                    if (tc1Var17 != null) {
                        tc1Var17.t.setVisibility(!list11.isEmpty() ? 0 : 8);
                    }
                    tc1 tc1Var18 = cp1Var.l0;
                    if (tc1Var18 != null) {
                        tc1Var18.d.setVisibility(list11.isEmpty() ? 8 : 0);
                    }
                    vi viVar2 = cp1Var.s0;
                    viVar2.u = list11;
                    viVar2.d();
                } else if (tc1Var17 != null) {
                    tc1Var17.t.setVisibility(8);
                }
                break;
            case 14:
                List list12 = (List) obj;
                if (list12 == null || list12.isEmpty()) {
                    tc1 tc1Var19 = cp1Var.l0;
                    if (tc1Var19 != null) {
                        tc1Var19.p.setVisibility(8);
                    }
                    tc1 tc1Var20 = cp1Var.l0;
                    if (tc1Var20 != null) {
                        tc1Var20.c.setVisibility(8);
                    }
                } else {
                    tc1 tc1Var21 = cp1Var.l0;
                    if (tc1Var21 != null) {
                        tc1Var21.p.setVisibility(0);
                    }
                    tc1 tc1Var22 = cp1Var.l0;
                    if (tc1Var22 != null) {
                        tc1Var22.c.setVisibility(0);
                    }
                    tc1 tc1Var23 = cp1Var.l0;
                    if (tc1Var23 != null) {
                        RecyclerView recyclerView6 = tc1Var23.q0;
                        cp1Var.Z();
                        recyclerView6.setLayoutManager(new GridLayoutManager(g12.y(list12.size(), 5), 0));
                    }
                    cp1Var.v0.r((List) list12.stream().map(new m7(25)).collect(Collectors.toList()));
                    cp1Var.i0();
                }
                break;
            case 15:
                List list13 = (List) obj;
                tc1 tc1Var24 = cp1Var.l0;
                if (list13 != null) {
                    if (tc1Var24 != null) {
                        tc1Var24.u.setVisibility(list13.isEmpty() ? 8 : 0);
                    }
                    cp1Var.y0.p(list13);
                } else if (tc1Var24 != null) {
                    tc1Var24.u.setVisibility(8);
                }
                break;
            case WaveRetry.MAX_FAILURES /* 16 */:
                List list14 = (List) obj;
                tc1 tc1Var25 = cp1Var.l0;
                if (list14 != null) {
                    if (tc1Var25 != null) {
                        tc1Var25.o.setVisibility(list14.isEmpty() ? 8 : 0);
                    }
                    uc4 uc4Var2 = cp1Var.C0;
                    uc4Var2.s = list14;
                    uc4Var2.d();
                } else if (tc1Var25 != null) {
                    tc1Var25.o.setVisibility(8);
                }
                break;
            case 17:
                String str2 = (String) obj;
                if (cp1Var.u0 != null) {
                    Boolean bool3 = (Boolean) cp1Var.p0.c.d();
                    cp1Var.u0.s(str2, bool3 != null && bool3.booleanValue());
                }
                break;
            case 18:
                Boolean bool4 = (Boolean) obj;
                if (cp1Var.u0 != null) {
                    cp1Var.u0.s((String) cp1Var.p0.b.d(), bool4 != null && bool4.booleanValue());
                }
                break;
            case 19:
                List list15 = (List) obj;
                e03.o(list15);
                if (list15 != null && !list15.isEmpty()) {
                    bo2.o(cp1Var.F0, list15, 0);
                    ((au) cp1Var.m0.V.n).d(true);
                    break;
                }
                break;
            case 20:
                List list16 = (List) obj;
                e03.o(list16);
                if (!list16.isEmpty()) {
                    bo2.o(cp1Var.F0, list16, 0);
                    ((au) cp1Var.m0.V.n).d(true);
                }
                break;
            case 21:
                List list17 = (List) obj;
                e03.o(list17);
                if (list17 != null && !list17.isEmpty()) {
                    bo2.o(cp1Var.F0, list17, 0);
                    ((au) cp1Var.m0.V.n).d(true);
                    break;
                }
                break;
            default:
                List list18 = (List) obj;
                tc1 tc1Var26 = cp1Var.l0;
                if (list18 != null) {
                    if (tc1Var26 != null) {
                        tc1Var26.f0.setVisibility(list18.isEmpty() ? 8 : 0);
                    }
                    cp1Var.w0.p(list18);
                } else if (tc1Var26 != null) {
                    tc1Var26.f0.setVisibility(8);
                }
                break;
        }
    }
}
