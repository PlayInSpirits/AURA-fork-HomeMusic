/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.eddyizm.tempus.model.HomeSector;
import com.eddyizm.tempus.viewmodel.b;
import defpackage.cp1;
import defpackage.dw3;
import defpackage.jb2;
import defpackage.kc1;
import defpackage.q40;
import defpackage.tc1;
import defpackage.ud3;
import defpackage.zd0;
import java.util.ArrayList;
import java.util.List;

public final class zo1
implements Runnable {
    public final int n;
    public final cp1 o;

    public zo1(cp1 cp12, int n16) {
        this.n = n16;
        this.o = cp12;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void run() {
        int n16;
        Object object;
        ArrayList<View> arrayList;
        Object object2;
        int n17;
        int n18;
        block57: {
            n18 = this.n;
            n17 = 0;
            object2 = this.o;
            switch (n18) {
                default: {
                    if (((kc1)object2).T == null) return;
                    if (((cp1)object2).l0 == null) return;
                    if (!ud3.V()) return;
                    ((cp1)object2).n0.g(((kc1)object2).v());
                    return;
                }
                case 6: {
                    ((cp1)object2).j0();
                    return;
                }
                case 5: {
                    ((cp1)object2).j0();
                    return;
                }
                case 4: {
                    ((cp1)object2).j0();
                    return;
                }
                case 3: {
                    if (((cp1)object2).G0 == null) return;
                    if (((cp1)object2).l0 == null) {
                        return;
                    }
                    List list = q40.K0(ud3.A().values(), new jb2(1));
                    boolean bl5 = list.isEmpty();
                    tc1 tc12 = ((cp1)object2).l0;
                    if (bl5) {
                        tc12.m.setVisibility(8);
                        return;
                    }
                    tc12.m.setVisibility(0);
                    object2 = ((cp1)object2).G0;
                    ((zd0)object2).r = list;
                    ((dw3)object2).d();
                    return;
                }
                case 2: {
                    if (((kc1)object2).T == null) return;
                    if (((cp1)object2).l0 == null) return;
                    b b16 = ((cp1)object2).n0;
                    if (b16 == null) return;
                    b16.A.k(ud3.s());
                    return;
                }
                case 1: {
                    tc1 tc13 = ((cp1)object2).l0;
                    if (tc13 == null) return;
                    tc13.w.setVisibility(0);
                    return;
                }
                case 0: 
            }
            ((cp1)object2).I0 = false;
            if (((cp1)object2).l0 == null) return;
            if (((cp1)object2).n0.D == null) {
                return;
            }
            arrayList = new ArrayList<View>();
            if (((cp1)object2).l0.H.getVisibility() == 0) {
                arrayList.add(((cp1)object2).l0.H);
            }
            if (((cp1)object2).l0.z.getVisibility() == 0) {
                arrayList.add(((cp1)object2).l0.z);
            }
            if (((cp1)object2).l0.D.getVisibility() == 0) {
                arrayList.add(((cp1)object2).l0.D);
            }
            if ((object = ((cp1)object2).H0) != null) {
                arrayList.add((View)object);
            }
            block45: for (Object object3 : ((cp1)object2).n0.D) {
                if (!((HomeSector)object3).isVisible()) continue;
                object3 = ((HomeSector)object3).getId();
                object3.getClass();
                n16 = ((String)object3).hashCode();
                n18 = -1;
                switch (n16) {
                    default: {
                        break;
                    }
                    case 2113438488: {
                        if (!((String)object3).equals("HOME_SECTOR_MADE_FOR_YOU")) break;
                        n18 = 15;
                        break;
                    }
                    case 1893512951: {
                        if (!((String)object3).equals("HOME_SECTOR_RADIO_STATION")) break;
                        n18 = 14;
                        break;
                    }
                    case 1871209635: {
                        if (!((String)object3).equals("HOME_SECTOR_LAST_PLAYED")) break;
                        n18 = 13;
                        break;
                    }
                    case 1651435997: {
                        if (!((String)object3).equals("HOME_SECTOR_STARRED_ALBUMS")) break;
                        n18 = 12;
                        break;
                    }
                    case 1618036502: {
                        if (!((String)object3).equals("HOME_SECTOR_MOST_PLAYED")) break;
                        n18 = 11;
                        break;
                    }
                    case 835285363: {
                        if (!((String)object3).equals("HOME_SECTOR_PINNED_PLAYLISTS")) break;
                        n18 = 10;
                        break;
                    }
                    case 588550171: {
                        if (!((String)object3).equals("HOME_SECTOR_TOP_SONGS")) break;
                        n18 = 9;
                        break;
                    }
                    case 432127394: {
                        if (!((String)object3).equals("HOME_SECTOR_RECENTLY_ADDED")) break;
                        n18 = 8;
                        break;
                    }
                    case -157044973: {
                        if (!((String)object3).equals("HOME_SECTOR_STARRED_ARTISTS")) break;
                        n18 = 7;
                        break;
                    }
                    case -566475945: {
                        if (!((String)object3).equals("HOME_SECTOR_DISCOVERY")) break;
                        n18 = 6;
                        break;
                    }
                    case -696297063: {
                        if (!((String)object3).equals("HOME_SECTOR_BEST_OF")) break;
                        n18 = 5;
                        break;
                    }
                    case -780460034: {
                        if (!((String)object3).equals("HOME_SECTOR_SHARED")) break;
                        n18 = 4;
                        break;
                    }
                    case -1592116610: {
                        if (!((String)object3).equals("HOME_SECTOR_FLASHBACK")) break;
                        n18 = 3;
                        break;
                    }
                    case -1789557476: {
                        if (!((String)object3).equals("HOME_SECTOR_CONTINUE_LISTENING")) break;
                        n18 = 2;
                        break;
                    }
                    case -2006276604: {
                        if (!((String)object3).equals("HOME_SECTOR_NEW_RELEASES")) break;
                        n18 = 1;
                        break;
                    }
                    case -2094083455: {
                        if (!((String)object3).equals("HOME_SECTOR_STARRED_TRACKS")) break;
                        n18 = 0;
                    }
                }
                switch (n18) {
                    default: {
                        continue block45;
                    }
                    case 15: {
                        arrayList.add(((cp1)object2).l0.x);
                        continue block45;
                    }
                    case 14: {
                        arrayList.add(((cp1)object2).l0.t);
                        continue block45;
                    }
                    case 13: {
                        arrayList.add(((cp1)object2).l0.v);
                        continue block45;
                    }
                    case 12: {
                        arrayList.add(((cp1)object2).l0.f0);
                        continue block45;
                    }
                    case 11: {
                        arrayList.add(((cp1)object2).l0.r);
                        continue block45;
                    }
                    case 10: {
                        arrayList.add(((cp1)object2).l0.P);
                        continue block45;
                    }
                    case 9: {
                        arrayList.add(((cp1)object2).l0.p);
                        continue block45;
                    }
                    case 8: {
                        arrayList.add(((cp1)object2).l0.u);
                        continue block45;
                    }
                    case 7: {
                        arrayList.add(((cp1)object2).l0.j0);
                        continue block45;
                    }
                    case 6: {
                        arrayList.add(((cp1)object2).l0.n);
                        continue block45;
                    }
                    case 5: {
                        arrayList.add(((cp1)object2).l0.l);
                        continue block45;
                    }
                    case 4: {
                        arrayList.add(((cp1)object2).l0.a0);
                        continue block45;
                    }
                    case 3: {
                        arrayList.add(((cp1)object2).l0.o);
                        continue block45;
                    }
                    case 2: {
                        arrayList.add(((cp1)object2).l0.m);
                        continue block45;
                    }
                    case 1: {
                        arrayList.add(((cp1)object2).l0.s);
                        continue block45;
                    }
                    case 0: 
                }
                arrayList.add(((cp1)object2).l0.n0);
            }
            arrayList.add(((cp1)object2).l0.w);
            object2 = ((cp1)object2).l0.q;
            if (((ViewGroup)object2).getChildCount() == arrayList.size()) {
                n18 = 0;
                while (n18 < arrayList.size()) {
                    if (((ViewGroup)object2).getChildAt(n18) == arrayList.get(n18)) {
                        ++n18;
                        continue;
                    }
                    break block57;
                }
                return;
            }
        }
        ((ViewGroup)object2).removeAllViews();
        n16 = arrayList.size();
        n18 = n17;
        while (n18 < n16) {
            object = arrayList.get(n18);
            ++n18;
            ((ViewGroup)object2).addView((View)object);
        }
    }
}

