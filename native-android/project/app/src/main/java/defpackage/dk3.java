package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dk3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ hk3 o;

    public /* synthetic */ dk3(hk3 hk3Var, int i) {
        this.n = i;
        this.o = hk3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [u01] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList] */
    @Override // defpackage.if1
    public final Object invoke(Object obj) throws JSONException {
        qi3 qi3VarB;
        ?? arrayList;
        int i = this.n;
        final int i2 = 1;
        final int i3 = 0;
        j15 j15Var = j15.a;
        final hk3 hk3Var = this.o;
        switch (i) {
            case 0:
                Child child = (Child) obj;
                if (!u52.c().a && hk3Var.o0 == null && child != null && !hk3Var.h0().isEmpty()) {
                    Iterator it = hk3Var.h0().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                        } else if (!h12.c(((Child) it.next()).getId(), child.getId())) {
                            i3++;
                        }
                    }
                    if (i3 >= 0 && i3 != hk3Var.s0.g()) {
                        hk3Var.k0(i3);
                    }
                }
                break;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == hk3Var.h0().size() && ((Boolean) hk3Var.x0.getValue()).booleanValue() && !u52.c().a) {
                    MediaService mediaService = is3.c;
                    if (mediaService != null && (qi3VarB = mediaService.b()) != null) {
                        if (qi3VarB.f0()) {
                            qi3VarB.c0();
                        } else if (!a.j(qi3VarB)) {
                            is3.e.k(Boolean.TRUE);
                            if (b.h(qi3VarB)) {
                                io1.b.post(new u6(14));
                            } else {
                                is3.d = false;
                                is3.a(qi3VarB, mediaService);
                            }
                        }
                    }
                } else if (iIntValue >= 0 && iIntValue < hk3Var.h0().size()) {
                    if (!u52.c().a) {
                        hk3Var.k0(iIntValue);
                        bj2 bj2Var = hk3Var.o0;
                        int[] iArr = hk3Var.w0;
                        iArr.getClass();
                        Integer numValueOf = (iIntValue < 0 || iIntValue >= iArr.length) ? null : Integer.valueOf(iArr[iIntValue]);
                        if (bj2Var != null && numValueOf != null && numValueOf.intValue() < bj2Var.Q0() && h12.c(bj2Var.Y(numValueOf.intValue()).a, ((Child) hk3Var.h0().get(iIntValue)).getId())) {
                            bj2Var.W(numValueOf.intValue());
                            bj2Var.m0();
                        } else if (bj2Var == null || bj2Var.Q0() <= 0) {
                            bl2 bl2Var = hk3Var.n0;
                            if (bl2Var != null) {
                                bo2.q(bl2Var, hk3Var.h0(), iIntValue, "queue");
                            }
                        } else {
                            do2 do2VarK0 = bj2Var.K0();
                            do2VarK0.getClass();
                            hk3Var.m0(do2VarK0, bj2Var.o0());
                        }
                    } else if (u52.k()) {
                        u52.q("select", iIntValue, iIntValue);
                    }
                }
                break;
            case 2:
                List list = (List) obj;
                bl2 bl2Var2 = hk3Var.n0;
                if (bl2Var2 != null && list != null) {
                    bo2.e(bl2Var2, list, true);
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                final Child child2 = (Child) obj;
                ey eyVar = hk3Var.l0;
                if (eyVar != null && child2 != null) {
                    ((Button) eyVar.e).setOnClickListener(new View.OnClickListener() { // from class: ek3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = i3;
                            Child child3 = child2;
                            hk3 hk3Var2 = hk3Var;
                            switch (i4) {
                                case 0:
                                    if (ud3.o() == null) {
                                        au0.w(hk3Var2.Z()).b(gi1.G(child3), new Download(child3), false);
                                        return;
                                    } else {
                                        i51.a(hk3Var2.Z(), child3);
                                        return;
                                    }
                                case 1:
                                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                                    arrayList2.add(child3);
                                    Bundle bundle = new Bundle();
                                    bundle.putParcelableArrayList("TRACKS_OBJECT", arrayList2);
                                    fl3 fl3Var = new fl3();
                                    fl3Var.c0(bundle);
                                    fl3Var.m0(hk3Var2.X().k(), null);
                                    return;
                                default:
                                    aj3 aj3Var = hk3Var2.m0;
                                    if (aj3Var == null) {
                                        h12.Q("playerBottomSheetViewModel");
                                        throw null;
                                    }
                                    le1 le1VarV = hk3Var2.v();
                                    k03 k03Var = aj3Var.q;
                                    k03Var.k(Collections.EMPTY_LIST);
                                    aj3Var.c.o(child3.getId(), fb0.p, 20).e(le1VarV, new g7(k03Var, 0));
                                    k03Var.e(hk3Var2.v(), new ht1(new dk3(hk3Var2, 2), 1));
                                    return;
                            }
                        }
                    });
                    ((Button) eyVar.f).setOnClickListener(new View.OnClickListener() { // from class: ek3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = i2;
                            Child child3 = child2;
                            hk3 hk3Var2 = hk3Var;
                            switch (i4) {
                                case 0:
                                    if (ud3.o() == null) {
                                        au0.w(hk3Var2.Z()).b(gi1.G(child3), new Download(child3), false);
                                        return;
                                    } else {
                                        i51.a(hk3Var2.Z(), child3);
                                        return;
                                    }
                                case 1:
                                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                                    arrayList2.add(child3);
                                    Bundle bundle = new Bundle();
                                    bundle.putParcelableArrayList("TRACKS_OBJECT", arrayList2);
                                    fl3 fl3Var = new fl3();
                                    fl3Var.c0(bundle);
                                    fl3Var.m0(hk3Var2.X().k(), null);
                                    return;
                                default:
                                    aj3 aj3Var = hk3Var2.m0;
                                    if (aj3Var == null) {
                                        h12.Q("playerBottomSheetViewModel");
                                        throw null;
                                    }
                                    le1 le1VarV = hk3Var2.v();
                                    k03 k03Var = aj3Var.q;
                                    k03Var.k(Collections.EMPTY_LIST);
                                    aj3Var.c.o(child3.getId(), fb0.p, 20).e(le1VarV, new g7(k03Var, 0));
                                    k03Var.e(hk3Var2.v(), new ht1(new dk3(hk3Var2, 2), 1));
                                    return;
                            }
                        }
                    });
                    final int i4 = 2;
                    ((Button) eyVar.b).setOnClickListener(new View.OnClickListener() { // from class: ek3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i5 = i4;
                            Child child3 = child2;
                            hk3 hk3Var2 = hk3Var;
                            switch (i5) {
                                case 0:
                                    if (ud3.o() == null) {
                                        au0.w(hk3Var2.Z()).b(gi1.G(child3), new Download(child3), false);
                                        return;
                                    } else {
                                        i51.a(hk3Var2.Z(), child3);
                                        return;
                                    }
                                case 1:
                                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                                    arrayList2.add(child3);
                                    Bundle bundle = new Bundle();
                                    bundle.putParcelableArrayList("TRACKS_OBJECT", arrayList2);
                                    fl3 fl3Var = new fl3();
                                    fl3Var.c0(bundle);
                                    fl3Var.m0(hk3Var2.X().k(), null);
                                    return;
                                default:
                                    aj3 aj3Var = hk3Var2.m0;
                                    if (aj3Var == null) {
                                        h12.Q("playerBottomSheetViewModel");
                                        throw null;
                                    }
                                    le1 le1VarV = hk3Var2.v();
                                    k03 k03Var = aj3Var.q;
                                    k03Var.k(Collections.EMPTY_LIST);
                                    aj3Var.c.o(child3.getId(), fb0.p, 20).e(le1VarV, new g7(k03Var, 0));
                                    k03Var.e(hk3Var2.v(), new ht1(new dk3(hk3Var2, 2), 1));
                                    return;
                            }
                        }
                    });
                    ((Button) eyVar.c).setOnClickListener(new fk3(hk3Var, i3));
                    ((Button) eyVar.d).setOnClickListener(new fk3(hk3Var, i2));
                }
                break;
            case 4:
                List<Queue> list2 = (List) obj;
                if (list2 != null) {
                    arrayList = new ArrayList(r40.k0(list2, 10));
                    for (Queue queue : list2) {
                        queue.getClass();
                        arrayList.add(queue);
                    }
                } else {
                    arrayList = u01.n;
                }
                hk3Var.r0 = arrayList;
                if (!u52.c().a) {
                    bj2 bj2Var2 = hk3Var.o0;
                    if (bj2Var2 != null) {
                        hk3Var.i0(bj2Var2);
                    } else {
                        hk3Var.q0.setValue(hk3Var.r0);
                    }
                }
                break;
            case 5:
                hk3Var.y0.setValue(Boolean.valueOf(h12.c((Boolean) obj, Boolean.TRUE)));
                bj2 bj2Var3 = hk3Var.o0;
                if (bj2Var3 != null) {
                    hk3Var.i0(bj2Var3);
                }
                break;
            case 6:
                if (u52.c().a) {
                    hk3Var.j0();
                }
                break;
            default:
                if (((v52) obj).a) {
                    hk3Var.j0();
                } else {
                    hk3Var.q0.setValue(hk3Var.r0);
                    bj2 bj2Var4 = hk3Var.o0;
                    if (bj2Var4 != null) {
                        do2 do2VarK1 = bj2Var4.K0();
                        do2VarK1.getClass();
                        hk3Var.m0(do2VarK1, bj2Var4.o0());
                    }
                }
                break;
        }
        return j15Var;
    }
}
