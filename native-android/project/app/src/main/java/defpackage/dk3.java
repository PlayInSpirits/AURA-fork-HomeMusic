package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View$OnClickListener
 *  android.widget.Button
 */
import android.view.View;
import android.widget.Button;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dk3
implements if1 {
    public final int n;
    public final hk3 o;

    public /* synthetic */ dk3(hk3 hk32, int n16) {
        this.n = n16;
        this.o = hk32;
    }

    @Override
    public final Object invoke(Object object) {
        int n16 = this.n;
        int n17 = 0;
        j15 j152 = j15.a;
        hk3 hk32 = this.o;
        switch (n16) {
            default: {
                if (((v52)object).a) {
                    hk32.j0();
                } else {
                    object = hk32.r0;
                    hk32.q0.setValue(object);
                    bj2 bj22 = hk32.o0;
                    if (bj22 != null) {
                        object = bj22.K0();
                        object.getClass();
                        hk32.m0((do2)object, bj22.o0());
                    }
                }
                return j152;
            }
            case 6: {
                object = (List)object;
                if (u52.c().a) {
                    hk32.j0();
                }
                return j152;
            }
            case 5: {
                boolean bl5 = h12.c((Boolean)object, Boolean.TRUE);
                hk32.y0.setValue(bl5);
                object = hk32.o0;
                if (object != null) {
                    hk32.i0((bj2)object);
                }
                return j152;
            }
            case 4: {
                object = (List)object;
                if (object != null) {
                    ArrayList<Object> arrayList = new ArrayList<Object>(r40.k0((Iterable)object, 10));
                    Iterator iterator = object.iterator();
                    while (true) {
                        object = arrayList;
                        if (iterator.hasNext()) {
                            object = (Queue)iterator.next();
                            object.getClass();
                            arrayList.add(object);
                            continue;
                        }
                        break;
                    }
                } else {
                    object = u01.n;
                }
                hk32.r0 = object;
                if (!u52.c().a) {
                    object = hk32.o0;
                    if (object != null) {
                        hk32.i0((bj2)object);
                    } else {
                        object = hk32.r0;
                        hk32.q0.setValue(object);
                    }
                }
                return j152;
            }
            case 3: {
                object = (Child)object;
                ey ey5 = hk32.l0;
                if (ey5 != null && object != null) {
                    ((Button)ey5.e).setOnClickListener((View.OnClickListener)new ek3(hk32, (Child)object, 0));
                    ((Button)ey5.f).setOnClickListener((View.OnClickListener)new ek3(hk32, (Child)object, 1));
                    ((Button)ey5.b).setOnClickListener((View.OnClickListener)new ek3(hk32, (Child)object, 2));
                    ((Button)ey5.c).setOnClickListener((View.OnClickListener)new fk3(hk32, 0));
                    ((Button)ey5.d).setOnClickListener((View.OnClickListener)new fk3(hk32, 1));
                }
                return j152;
            }
            case 2: {
                object = (List)object;
                bl2 bl22 = hk32.n0;
                if (bl22 != null && object != null) {
                    bo2.e(bl22, (List)object, true);
                }
                return j152;
            }
            case 1: {
                n17 = (Integer)object;
                if (n17 == hk32.h0().size() && ((Boolean)hk32.x0.getValue()).booleanValue() && !u52.c().a) {
                    qi3 qi32;
                    object = is3.c;
                    if (object != null && (qi32 = ((MediaService)object).b()) != null) {
                        if (qi32.f0()) {
                            qi32.c0();
                        } else if (!a.j(qi32)) {
                            is3.e.k(Boolean.TRUE);
                            if (b.h(qi32)) {
                                io1.b.post((Runnable)new u6(14));
                            } else {
                                is3.d = false;
                                is3.a(qi32, (ao2)object);
                            }
                        }
                    }
                } else if (n17 >= 0 && n17 < hk32.h0().size()) {
                    if (u52.c().a) {
                        if (u52.k()) {
                            u52.q("select", n17, n17);
                        }
                    } else {
                        hk32.k0(n17);
                        bj2 bj23 = hk32.o0;
                        object = hk32.w0;
                        object.getClass();
                        object = n17 >= 0 && n17 < ((Object)object).length ? Integer.valueOf((int)object[n17]) : null;
                        if (bj23 != null && object != null && (Integer)object < bj23.Q0() && h12.c(bj23.Y((int)((Integer)object).intValue()).a, ((Child)hk32.h0().get(n17)).getId())) {
                            bj23.W((Integer)object);
                            bj23.m0();
                        } else if (bj23 != null && bj23.Q0() > 0) {
                            object = bj23.K0();
                            object.getClass();
                            hk32.m0((do2)object, bj23.o0());
                        } else {
                            object = hk32.n0;
                            if (object != null) {
                                bo2.q((ic2)object, hk32.h0(), n17, "queue");
                            }
                        }
                    }
                }
                return j152;
            }
            case 0: 
        }
        Child child = (Child)object;
        if (!u52.c().a && hk32.o0 == null && child != null && !hk32.h0().isEmpty()) {
            block44: {
                object = hk32.h0().iterator();
                while (object.hasNext()) {
                    if (!h12.c(((Child)object.next()).getId(), child.getId())) {
                        ++n17;
                        continue;
                    }
                    break block44;
                }
                n17 = -1;
            }
            if (n17 >= 0 && n17 != hk32.s0.g()) {
                hk32.k0(n17);
            }
        }
        return j152;
    }
}

