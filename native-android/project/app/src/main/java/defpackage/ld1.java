package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import app.homemusic.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ld1 {
    public final y41 A;
    public w5 B;
    public w5 C;
    public w5 D;
    public ArrayDeque E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList K;
    public ArrayList L;
    public ArrayList M;
    public od1 N;
    public final g5 O;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public a93 g;
    public ArrayList m;
    public final wo0 n;
    public final CopyOnWriteArrayList o;
    public final ad1 p;
    public final ad1 q;
    public final ad1 r;
    public final ad1 s;
    public final cd1 t;
    public int u;
    public mc1 v;
    public fu w;
    public kc1 x;
    public kc1 y;
    public final dd1 z;
    public final ArrayList a = new ArrayList();
    public final ss0 c = new ss0(5);
    public final wc1 f = new wc1(this);
    public final bd1 h = new bd1(0, this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());
    public final Map l = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v13, types: [ad1] */
    /* JADX WARN: Type inference failed for: r0v14, types: [ad1] */
    /* JADX WARN: Type inference failed for: r0v15, types: [ad1] */
    /* JADX WARN: Type inference failed for: r0v16, types: [ad1] */
    public ld1() {
        wo0 wo0Var = new wo0();
        wo0Var.n = new CopyOnWriteArrayList();
        wo0Var.o = this;
        this.n = wo0Var;
        this.o = new CopyOnWriteArrayList();
        final int i = 0;
        this.p = new xc0(this) { // from class: ad1
            public final /* synthetic */ ld1 b;

            {
                this.b = this;
            }

            @Override // defpackage.xc0
            public final void accept(Object obj) {
                int i2 = i;
                ld1 ld1Var = this.b;
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (ld1Var.K()) {
                            ld1Var.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (ld1Var.K() && num.intValue() == 80) {
                            ld1Var.l(false);
                            break;
                        }
                        break;
                    case 2:
                        pz2 pz2Var = (pz2) obj;
                        if (ld1Var.K()) {
                            boolean z = pz2Var.a;
                            ld1Var.m(false);
                        }
                        break;
                    default:
                        eg3 eg3Var = (eg3) obj;
                        if (ld1Var.K()) {
                            boolean z2 = eg3Var.a;
                            ld1Var.r(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.q = new xc0(this) { // from class: ad1
            public final /* synthetic */ ld1 b;

            {
                this.b = this;
            }

            @Override // defpackage.xc0
            public final void accept(Object obj) {
                int i3 = i2;
                ld1 ld1Var = this.b;
                switch (i3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (ld1Var.K()) {
                            ld1Var.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (ld1Var.K() && num.intValue() == 80) {
                            ld1Var.l(false);
                            break;
                        }
                        break;
                    case 2:
                        pz2 pz2Var = (pz2) obj;
                        if (ld1Var.K()) {
                            boolean z = pz2Var.a;
                            ld1Var.m(false);
                        }
                        break;
                    default:
                        eg3 eg3Var = (eg3) obj;
                        if (ld1Var.K()) {
                            boolean z2 = eg3Var.a;
                            ld1Var.r(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.r = new xc0(this) { // from class: ad1
            public final /* synthetic */ ld1 b;

            {
                this.b = this;
            }

            @Override // defpackage.xc0
            public final void accept(Object obj) {
                int i4 = i3;
                ld1 ld1Var = this.b;
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (ld1Var.K()) {
                            ld1Var.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (ld1Var.K() && num.intValue() == 80) {
                            ld1Var.l(false);
                            break;
                        }
                        break;
                    case 2:
                        pz2 pz2Var = (pz2) obj;
                        if (ld1Var.K()) {
                            boolean z = pz2Var.a;
                            ld1Var.m(false);
                        }
                        break;
                    default:
                        eg3 eg3Var = (eg3) obj;
                        if (ld1Var.K()) {
                            boolean z2 = eg3Var.a;
                            ld1Var.r(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.s = new xc0(this) { // from class: ad1
            public final /* synthetic */ ld1 b;

            {
                this.b = this;
            }

            @Override // defpackage.xc0
            public final void accept(Object obj) {
                int i5 = i4;
                ld1 ld1Var = this.b;
                switch (i5) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (ld1Var.K()) {
                            ld1Var.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (ld1Var.K() && num.intValue() == 80) {
                            ld1Var.l(false);
                            break;
                        }
                        break;
                    case 2:
                        pz2 pz2Var = (pz2) obj;
                        if (ld1Var.K()) {
                            boolean z = pz2Var.a;
                            ld1Var.m(false);
                        }
                        break;
                    default:
                        eg3 eg3Var = (eg3) obj;
                        if (ld1Var.K()) {
                            boolean z2 = eg3Var.a;
                            ld1Var.r(false);
                        }
                        break;
                }
            }
        };
        this.t = new cd1(this);
        this.u = -1;
        this.z = new dd1(this);
        this.A = new y41(14);
        this.E = new ArrayDeque();
        this.O = new g5(13, this);
    }

    public static boolean I(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean J(kc1 kc1Var) {
        if (kc1Var.P && kc1Var.Q) {
            return true;
        }
        ArrayList arrayListW = kc1Var.H.c.w();
        int size = arrayListW.size();
        boolean zJ = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListW.get(i);
            i++;
            kc1 kc1Var2 = (kc1) obj;
            if (kc1Var2 != null) {
                zJ = J(kc1Var2);
            }
            if (zJ) {
                return true;
            }
        }
        return false;
    }

    public static boolean L(kc1 kc1Var) {
        if (kc1Var == null) {
            return true;
        }
        if (kc1Var.Q) {
            return kc1Var.F == null || L(kc1Var.I);
        }
        return false;
    }

    public static boolean M(kc1 kc1Var) {
        if (kc1Var == null) {
            return true;
        }
        ld1 ld1Var = kc1Var.F;
        return kc1Var == ld1Var.y && M(ld1Var.x);
    }

    public static void e0(kc1 kc1Var) {
        if (I(2)) {
            Log.v("FragmentManager", "show: " + kc1Var);
        }
        if (kc1Var.M) {
            kc1Var.M = false;
            kc1Var.X = !kc1Var.X;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x024a A[PHI: r15
  0x024a: PHI (r15v32 int) = (r15v31 int), (r15v34 int) binds: [B:103:0x0235, B:108:0x0241] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:305:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:64:0x0186  */
    public final void A(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Object objPrevious;
        ViewGroup viewGroup;
        ArrayList arrayList3;
        Object obj;
        Object obj2;
        LinkedHashSet linkedHashSet;
        String str;
        Object objPrevious2;
        String str2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        String str3 = "FragmentNavigator";
        ss0 ss0Var = this.c;
        boolean z3 = ((po) arrayList.get(i)).p;
        ArrayList arrayList4 = this.M;
        if (arrayList4 == null) {
            this.M = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.M.addAll(ss0Var.x());
        kc1 kc1Var = this.y;
        int i5 = i;
        boolean z4 = false;
        while (i5 < i2) {
            po poVar = (po) arrayList.get(i5);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i5)).booleanValue();
            ArrayList arrayList5 = this.M;
            if (zBooleanValue) {
                str2 = str3;
                z = z3;
                i3 = i5;
                z2 = z4;
                int i6 = 1;
                ArrayList arrayList6 = poVar.a;
                int size = arrayList6.size() - 1;
                while (size >= 0) {
                    je1 je1Var = (je1) arrayList6.get(size);
                    int i7 = je1Var.a;
                    if (i7 != i6) {
                        if (i7 != 3) {
                            switch (i7) {
                                case 6:
                                    arrayList5.add(je1Var.b);
                                    break;
                                case 8:
                                    kc1Var = null;
                                    break;
                                case 9:
                                    kc1Var = je1Var.b;
                                    break;
                                case 10:
                                    je1Var.i = je1Var.h;
                                    break;
                            }
                        } else {
                            arrayList5.add(je1Var.b);
                        }
                        size--;
                        i6 = 1;
                    }
                    arrayList5.remove(je1Var.b);
                    size--;
                    i6 = 1;
                }
            } else {
                ArrayList arrayList7 = poVar.a;
                int i8 = 0;
                while (i8 < arrayList7.size()) {
                    je1 je1Var2 = (je1) arrayList7.get(i8);
                    boolean z5 = z3;
                    int i9 = je1Var2.a;
                    int i10 = i5;
                    int i11 = 1;
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 == 3 || i9 == 6) {
                                z4 = z4;
                                arrayList5.remove(je1Var2.b);
                                kc1 kc1Var2 = je1Var2.b;
                                if (kc1Var2 == kc1Var) {
                                    arrayList7.add(i8, new je1(9, kc1Var2));
                                    i8++;
                                    kc1Var = null;
                                }
                            } else if (i9 == 7) {
                                i11 = 1;
                            } else if (i9 != 8) {
                                z4 = z4;
                            } else {
                                z4 = z4;
                                arrayList7.add(i8, new je1(9, kc1Var, 0));
                                je1Var2.c = true;
                                i8++;
                                kc1Var = je1Var2.b;
                            }
                            i11 = 1;
                        } else {
                            z4 = z4;
                            kc1 kc1Var3 = je1Var2.b;
                            int i12 = kc1Var3.K;
                            int size2 = arrayList5.size() - 1;
                            boolean z6 = false;
                            while (size2 >= 0) {
                                int i13 = size2;
                                kc1 kc1Var4 = (kc1) arrayList5.get(size2);
                                String str4 = str3;
                                if (kc1Var4.K != i12) {
                                    i12 = i12;
                                } else if (kc1Var4 == kc1Var3) {
                                    i12 = i12;
                                    z6 = true;
                                } else {
                                    if (kc1Var4 == kc1Var) {
                                        arrayList7.add(i8, new je1(9, kc1Var4, 0));
                                        i8++;
                                        i4 = 0;
                                        kc1Var = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    je1 je1Var3 = new je1(3, kc1Var4, i4);
                                    je1Var3.d = je1Var2.d;
                                    je1Var3.f = je1Var2.f;
                                    je1Var3.e = je1Var2.e;
                                    je1Var3.g = je1Var2.g;
                                    arrayList7.add(i8, je1Var3);
                                    arrayList5.remove(kc1Var4);
                                    i8++;
                                    kc1Var = kc1Var;
                                }
                                size2 = i13 - 1;
                                i12 = i12;
                                str3 = str4;
                            }
                            str3 = str3;
                            i11 = 1;
                            if (z6) {
                                arrayList7.remove(i8);
                                i8--;
                            } else {
                                je1Var2.a = 1;
                                je1Var2.c = true;
                                arrayList5.add(kc1Var3);
                            }
                        }
                        i8 += i11;
                        z3 = z5;
                        i5 = i10;
                        z4 = z4;
                        str3 = str3;
                    }
                    arrayList5.add(je1Var2.b);
                    i8 += i11;
                    z3 = z5;
                    i5 = i10;
                    z4 = z4;
                    str3 = str3;
                }
                str2 = str3;
                z = z3;
                i3 = i5;
                z2 = z4;
            }
            z4 = z2 || poVar.g;
            i5 = i3 + 1;
            z3 = z;
            str3 = str2;
        }
        String str5 = str3;
        boolean z7 = z3;
        boolean z8 = z4;
        this.M.clear();
        if (!z7 && this.u >= 1) {
            for (int i14 = i; i14 < i2; i14++) {
                ArrayList arrayList8 = ((po) arrayList.get(i14)).a;
                int size3 = arrayList8.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj3 = arrayList8.get(i15);
                    i15++;
                    kc1 kc1Var5 = ((je1) obj3).b;
                    if (kc1Var5 != null && kc1Var5.F != null) {
                        ss0Var.E(f(kc1Var5));
                    }
                }
            }
        }
        String str6 = "Unknown cmd: ";
        int i16 = i;
        while (i16 < i2) {
            po poVar2 = (po) arrayList.get(i16);
            if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                poVar2.d(-1);
                ld1 ld1Var = poVar2.q;
                ArrayList arrayList9 = poVar2.a;
                for (int size4 = arrayList9.size() - 1; size4 >= 0; size4--) {
                    je1 je1Var4 = (je1) arrayList9.get(size4);
                    kc1 kc1Var6 = je1Var4.b;
                    if (kc1Var6 != null) {
                        kc1Var6.z = poVar2.t;
                        if (kc1Var6.W != null) {
                            kc1Var6.k().a = true;
                        }
                        int i17 = poVar2.f;
                        int i18 = 8194;
                        int i19 = 4097;
                        if (i17 == 4097) {
                            i19 = i18;
                        } else if (i17 != 8194) {
                            i19 = 4100;
                            if (i17 != 8197) {
                                i18 = 4099;
                                if (i17 != 4099) {
                                    i19 = i17 != 4100 ? 0 : 8197;
                                } else {
                                    i19 = i18;
                                }
                            }
                        }
                        if (kc1Var6.W != null || i19 != 0) {
                            kc1Var6.k();
                            kc1Var6.W.f = i19;
                        }
                        kc1Var6.k();
                        kc1Var6.W.getClass();
                    }
                    switch (je1Var4.a) {
                        case 1:
                            kc1Var6.b0(je1Var4.d, je1Var4.e, je1Var4.f, je1Var4.g);
                            ld1Var.Y(kc1Var6, true);
                            ld1Var.T(kc1Var6);
                            break;
                        case 2:
                        default:
                            mj0.f(je1Var4.a, str6);
                            return;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            kc1Var6.b0(je1Var4.d, je1Var4.e, je1Var4.f, je1Var4.g);
                            ld1Var.a(kc1Var6);
                            break;
                        case 4:
                            kc1Var6.b0(je1Var4.d, je1Var4.e, je1Var4.f, je1Var4.g);
                            ld1Var.getClass();
                            e0(kc1Var6);
                            break;
                        case 5:
                            kc1Var6.b0(je1Var4.d, je1Var4.e, je1Var4.f, je1Var4.g);
                            ld1Var.Y(kc1Var6, true);
                            ld1Var.H(kc1Var6);
                            break;
                        case 6:
                            kc1Var6.b0(je1Var4.d, je1Var4.e, je1Var4.f, je1Var4.g);
                            ld1Var.c(kc1Var6);
                            break;
                        case 7:
                            kc1Var6.b0(je1Var4.d, je1Var4.e, je1Var4.f, je1Var4.g);
                            ld1Var.Y(kc1Var6, true);
                            ld1Var.g(kc1Var6);
                            break;
                        case 8:
                            ld1Var.c0(null);
                            break;
                        case 9:
                            ld1Var.c0(kc1Var6);
                            break;
                        case 10:
                            ld1Var.b0(kc1Var6, je1Var4.h);
                            break;
                    }
                }
            } else {
                poVar2.d(1);
                ld1 ld1Var2 = poVar2.q;
                ArrayList arrayList10 = poVar2.a;
                int size5 = arrayList10.size();
                int i20 = 0;
                while (i20 < size5) {
                    je1 je1Var5 = (je1) arrayList10.get(i20);
                    kc1 kc1Var7 = je1Var5.b;
                    if (kc1Var7 != null) {
                        kc1Var7.z = poVar2.t;
                        if (kc1Var7.W != null) {
                            kc1Var7.k().a = false;
                        }
                        int i21 = poVar2.f;
                        if (kc1Var7.W != null || i21 != 0) {
                            kc1Var7.k();
                            kc1Var7.W.f = i21;
                        }
                        kc1Var7.k();
                        kc1Var7.W.getClass();
                    }
                    switch (je1Var5.a) {
                        case 1:
                            kc1Var7.b0(je1Var5.d, je1Var5.e, je1Var5.f, je1Var5.g);
                            ld1Var2.Y(kc1Var7, false);
                            ld1Var2.a(kc1Var7);
                            i20++;
                            str6 = str6;
                            break;
                        case 2:
                        default:
                            mj0.f(je1Var5.a, str6);
                            return;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            kc1Var7.b0(je1Var5.d, je1Var5.e, je1Var5.f, je1Var5.g);
                            ld1Var2.T(kc1Var7);
                            i20++;
                            str6 = str6;
                            break;
                        case 4:
                            kc1Var7.b0(je1Var5.d, je1Var5.e, je1Var5.f, je1Var5.g);
                            ld1Var2.H(kc1Var7);
                            i20++;
                            str6 = str6;
                            break;
                        case 5:
                            kc1Var7.b0(je1Var5.d, je1Var5.e, je1Var5.f, je1Var5.g);
                            ld1Var2.Y(kc1Var7, false);
                            e0(kc1Var7);
                            i20++;
                            str6 = str6;
                            break;
                        case 6:
                            kc1Var7.b0(je1Var5.d, je1Var5.e, je1Var5.f, je1Var5.g);
                            ld1Var2.g(kc1Var7);
                            i20++;
                            str6 = str6;
                            break;
                        case 7:
                            kc1Var7.b0(je1Var5.d, je1Var5.e, je1Var5.f, je1Var5.g);
                            ld1Var2.Y(kc1Var7, false);
                            ld1Var2.c(kc1Var7);
                            i20++;
                            str6 = str6;
                            break;
                        case 8:
                            ld1Var2.c0(kc1Var7);
                            i20++;
                            str6 = str6;
                            break;
                        case 9:
                            ld1Var2.c0(null);
                            i20++;
                            str6 = str6;
                            break;
                        case 10:
                            ld1Var2.b0(kc1Var7, je1Var5.i);
                            i20++;
                            str6 = str6;
                            break;
                    }
                }
            }
            i16++;
            str6 = str6;
        }
        boolean zBooleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z8 && (arrayList3 = this.m) != null && !arrayList3.isEmpty()) {
            LinkedHashSet<kc1> linkedHashSet2 = new LinkedHashSet();
            int size6 = arrayList.size();
            int i22 = 0;
            while (i22 < size6) {
                Object obj4 = arrayList.get(i22);
                i22++;
                po poVar3 = (po) obj4;
                HashSet hashSet = new HashSet();
                for (int i23 = 0; i23 < poVar3.a.size(); i23++) {
                    kc1 kc1Var8 = ((je1) poVar3.a.get(i23)).b;
                    if (kc1Var8 != null && poVar3.g) {
                        hashSet.add(kc1Var8);
                    }
                }
                linkedHashSet2.addAll(hashSet);
            }
            ArrayList arrayList11 = this.m;
            int size7 = arrayList11.size();
            int i24 = 0;
            while (i24 < size7) {
                Object obj5 = arrayList11.get(i24);
                i24++;
                vd1 vd1Var = (vd1) obj5;
                for (kc1 kc1Var9 : linkedHashSet2) {
                    d23 d23Var = vd1Var.a;
                    kc1Var9.getClass();
                    if (zBooleanValue2) {
                        List list = (List) d23Var.e.n.getValue();
                        ListIterator listIterator = list.listIterator(list.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                objPrevious2 = listIterator.previous();
                                linkedHashSet = linkedHashSet2;
                                ListIterator listIterator2 = listIterator;
                                if (!h12.c(((a23) objPrevious2).s, kc1Var9.L)) {
                                    linkedHashSet2 = linkedHashSet;
                                    listIterator = listIterator2;
                                }
                            } else {
                                linkedHashSet = linkedHashSet2;
                                objPrevious2 = null;
                            }
                        }
                        a23 a23Var = (a23) objPrevious2;
                        if (rd1.n()) {
                            str = str5;
                            Log.v(str, "OnBackStackChangedStarted for fragment " + kc1Var9 + " associated with entry " + a23Var);
                        } else {
                            str = str5;
                        }
                        if (a23Var != null) {
                            nl4 nl4Var = d23Var.c;
                            nl4Var.j(null, kb4.Q((Set) nl4Var.getValue(), a23Var));
                            if (!d23Var.h.g.contains(a23Var)) {
                                kf2.o("Cannot transition entry that is not in the back stack");
                                return;
                            } else {
                                a23Var.x = r92.q;
                                a23Var.e();
                            }
                        }
                        str5 = str;
                        linkedHashSet2 = linkedHashSet;
                        arrayList11 = arrayList11;
                    } else {
                        linkedHashSet = linkedHashSet2;
                        str = str5;
                    }
                    str5 = str;
                    linkedHashSet2 = linkedHashSet;
                    arrayList11 = arrayList11;
                }
            }
            LinkedHashSet<kc1> linkedHashSet3 = linkedHashSet2;
            String str7 = str5;
            ArrayList arrayList12 = this.m;
            int size8 = arrayList12.size();
            int i25 = 0;
            while (i25 < size8) {
                Object obj6 = arrayList12.get(i25);
                i25++;
                vd1 vd1Var2 = (vd1) obj6;
                for (kc1 kc1Var10 : linkedHashSet3) {
                    rd1 rd1Var = vd1Var2.b;
                    ArrayList arrayList13 = rd1Var.g;
                    kc1Var10.getClass();
                    ArrayList arrayList14 = arrayList12;
                    d23 d23Var2 = vd1Var2.a;
                    int i26 = size8;
                    int i27 = i25;
                    ArrayList arrayListG0 = q40.G0((Collection) d23Var2.e.n.getValue(), (Iterable) d23Var2.f.n.getValue());
                    ListIterator listIterator3 = arrayListG0.listIterator(arrayListG0.size());
                    while (true) {
                        if (listIterator3.hasPrevious()) {
                            Object objPrevious3 = listIterator3.previous();
                            ListIterator listIterator4 = listIterator3;
                            obj = objPrevious3;
                            if (!h12.c(((a23) objPrevious3).s, kc1Var10.L)) {
                                listIterator3 = listIterator4;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    a23 a23Var2 = (a23) obj;
                    boolean z9 = zBooleanValue2 && arrayList13.isEmpty() && kc1Var10.y;
                    int size9 = arrayList13.size();
                    vd1 vd1Var3 = vd1Var2;
                    int i28 = 0;
                    while (true) {
                        if (i28 < size9) {
                            Object obj7 = arrayList13.get(i28);
                            int i29 = i28 + 1;
                            int i30 = size9;
                            if (h12.c(((kd3) obj7).n, kc1Var10.L)) {
                                obj2 = obj7;
                            } else {
                                size9 = i30;
                                i28 = i29;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    kd3 kd3Var = (kd3) obj2;
                    if (kd3Var != null) {
                        arrayList13.remove(kd3Var);
                    }
                    if (!z9 && rd1.n()) {
                        Log.v(str7, "OnBackStackChangedCommitted for fragment " + kc1Var10 + " associated with entry " + a23Var2);
                    }
                    boolean z10 = kd3Var != null && ((Boolean) kd3Var.o).booleanValue();
                    if (!zBooleanValue2 && !z10 && a23Var2 == null) {
                        kf2.e(b11.l("The fragment ", kc1Var10, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
                        return;
                    }
                    if (a23Var2 != null) {
                        rd1Var.l(kc1Var10, a23Var2, d23Var2);
                        if (z9) {
                            if (rd1.n()) {
                                Log.v(str7, "OnBackStackChangedCommitted for fragment " + kc1Var10 + " popping associated entry " + a23Var2 + " via system back");
                            }
                            d23Var2.f(a23Var2, false);
                        }
                    }
                    arrayList12 = arrayList14;
                    size8 = i26;
                    i25 = i27;
                    vd1Var2 = vd1Var3;
                }
            }
        }
        for (int i31 = i; i31 < i2; i31++) {
            po poVar4 = (po) arrayList.get(i31);
            if (zBooleanValue2) {
                for (int size10 = poVar4.a.size() - 1; size10 >= 0; size10--) {
                    kc1 kc1Var11 = ((je1) poVar4.a.get(size10)).b;
                    if (kc1Var11 != null) {
                        f(kc1Var11).k();
                    }
                }
            } else {
                ArrayList arrayList15 = poVar4.a;
                int size11 = arrayList15.size();
                int i32 = 0;
                while (i32 < size11) {
                    Object obj8 = arrayList15.get(i32);
                    i32++;
                    kc1 kc1Var12 = ((je1) obj8).b;
                    if (kc1Var12 != null) {
                        f(kc1Var12).k();
                    }
                }
            }
        }
        O(this.u, true);
        HashSet<xm0> hashSet2 = new HashSet();
        for (int i33 = i; i33 < i2; i33++) {
            ArrayList arrayList16 = ((po) arrayList.get(i33)).a;
            int size12 = arrayList16.size();
            int i34 = 0;
            while (i34 < size12) {
                Object obj9 = arrayList16.get(i34);
                i34++;
                kc1 kc1Var13 = ((je1) obj9).b;
                if (kc1Var13 != null && (viewGroup = kc1Var13.S) != null) {
                    hashSet2.add(xm0.f(viewGroup, this));
                }
            }
        }
        for (xm0 xm0Var : hashSet2) {
            xm0Var.d = zBooleanValue2;
            synchronized (xm0Var.b) {
                try {
                    xm0Var.g();
                    ArrayList arrayList17 = xm0Var.b;
                    ListIterator listIterator5 = arrayList17.listIterator(arrayList17.size());
                    while (true) {
                        if (listIterator5.hasPrevious()) {
                            objPrevious = listIterator5.previous();
                            pj4 pj4Var = (pj4) objPrevious;
                            View view = pj4Var.c.T;
                            view.getClass();
                            char c = 4;
                            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                                int visibility = view.getVisibility();
                                if (visibility == 0) {
                                    c = 2;
                                } else if (visibility != 4) {
                                    if (visibility != 8) {
                                        throw new IllegalArgumentException("Unknown visibility " + visibility);
                                    }
                                    c = 3;
                                }
                            }
                            if (pj4Var.a != 2 || c == 2) {
                            }
                        } else {
                            objPrevious = null;
                        }
                    }
                    xm0Var.e = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            xm0Var.c();
        }
        for (int i35 = i; i35 < i2; i35++) {
            po poVar5 = (po) arrayList.get(i35);
            if (((Boolean) arrayList2.get(i35)).booleanValue() && poVar5.s >= 0) {
                poVar5.s = -1;
            }
            poVar5.getClass();
        }
        if (!z8 || this.m == null) {
            return;
        }
        for (int i36 = 0; i36 < this.m.size(); i36++) {
            ((vd1) this.m.get(i36)).getClass();
        }
    }

    public final int B(int i, String str, boolean z) {
        ArrayList arrayList = this.d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            po poVar = (po) this.d.get(size);
            if ((str != null && str.equals(poVar.i)) || (i >= 0 && i == poVar.s)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            po poVar2 = (po) this.d.get(size - 1);
            if ((str == null || !str.equals(poVar2.i)) && (i < 0 || i != poVar2.s)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final kc1 C(int i) {
        ss0 ss0Var = this.c;
        ArrayList arrayList = (ArrayList) ss0Var.n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            kc1 kc1Var = (kc1) arrayList.get(size);
            if (kc1Var != null && kc1Var.J == i) {
                return kc1Var;
            }
        }
        for (fe1 fe1Var : ((HashMap) ss0Var.o).values()) {
            if (fe1Var != null) {
                kc1 kc1Var2 = fe1Var.c;
                if (kc1Var2.J == i) {
                    return kc1Var2;
                }
            }
        }
        return null;
    }

    public final kc1 D(String str) {
        ss0 ss0Var = this.c;
        ArrayList arrayList = (ArrayList) ss0Var.n;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                kc1 kc1Var = (kc1) arrayList.get(size);
                if (kc1Var != null && str.equals(kc1Var.L)) {
                    return kc1Var;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (fe1 fe1Var : ((HashMap) ss0Var.o).values()) {
            if (fe1Var != null) {
                kc1 kc1Var2 = fe1Var.c;
                if (str.equals(kc1Var2.L)) {
                    return kc1Var2;
                }
            }
        }
        return null;
    }

    public final ViewGroup E(kc1 kc1Var) {
        ViewGroup viewGroup = kc1Var.S;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (kc1Var.K <= 0 || !this.w.I()) {
            return null;
        }
        View viewH = this.w.H(kc1Var.K);
        if (viewH instanceof ViewGroup) {
            return (ViewGroup) viewH;
        }
        return null;
    }

    public final dd1 F() {
        kc1 kc1Var = this.x;
        return kc1Var != null ? kc1Var.F.F() : this.z;
    }

    public final y41 G() {
        kc1 kc1Var = this.x;
        return kc1Var != null ? kc1Var.F.G() : this.A;
    }

    public final void H(kc1 kc1Var) {
        if (I(2)) {
            Log.v("FragmentManager", "hide: " + kc1Var);
        }
        if (kc1Var.M) {
            return;
        }
        kc1Var.M = true;
        kc1Var.X = true ^ kc1Var.X;
        d0(kc1Var);
    }

    public final boolean K() {
        kc1 kc1Var = this.x;
        if (kc1Var == null) {
            return true;
        }
        return kc1Var.y() && this.x.q().K();
    }

    public final boolean N() {
        return this.G || this.H;
    }

    public final void O(int i, boolean z) {
        mc1 mc1Var;
        if (this.v == null && i != -1) {
            kf2.o("No activity");
            return;
        }
        if (z || i != this.u) {
            this.u = i;
            ss0 ss0Var = this.c;
            HashMap map = (HashMap) ss0Var.o;
            ArrayList arrayList = (ArrayList) ss0Var.n;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                fe1 fe1Var = (fe1) map.get(((kc1) obj).r);
                if (fe1Var != null) {
                    fe1Var.k();
                }
            }
            for (fe1 fe1Var2 : map.values()) {
                if (fe1Var2 != null) {
                    fe1Var2.k();
                    kc1 kc1Var = fe1Var2.c;
                    if (kc1Var.y && !kc1Var.A()) {
                        if (kc1Var.z && !((HashMap) ss0Var.p).containsKey(kc1Var.r)) {
                            ss0Var.G(kc1Var.r, fe1Var2.o());
                        }
                        ss0Var.F(fe1Var2);
                    }
                }
            }
            f0();
            if (this.F && (mc1Var = this.v) != null && this.u == 7) {
                mc1Var.E.invalidateOptionsMenu();
                this.F = false;
            }
        }
    }

    public final void P() {
        if (this.v == null) {
            return;
        }
        this.G = false;
        this.H = false;
        this.N.g = false;
        for (kc1 kc1Var : this.c.x()) {
            if (kc1Var != null) {
                kc1Var.H.P();
            }
        }
    }

    public final boolean Q() {
        return R(-1, 0);
    }

    public final boolean R(int i, int i2) {
        y(false);
        x(true);
        kc1 kc1Var = this.y;
        if (kc1Var != null && i < 0 && kc1Var.m().Q()) {
            return true;
        }
        boolean zS = S(this.K, this.L, null, i, i2);
        if (zS) {
            this.b = true;
            try {
                U(this.K, this.L);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        h0();
        u();
        ((HashMap) this.c.o).values().removeAll(Collections.singleton(null));
        return zS;
    }

    public final boolean S(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int iB = B(i, str, (i2 & 1) != 0);
        if (iB < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= iB; size--) {
            arrayList.add((po) this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void T(kc1 kc1Var) {
        if (I(2)) {
            Log.v("FragmentManager", "remove: " + kc1Var + " nesting=" + kc1Var.E);
        }
        boolean zA = kc1Var.A();
        if (kc1Var.N && zA) {
            return;
        }
        ss0 ss0Var = this.c;
        synchronized (((ArrayList) ss0Var.n)) {
            ((ArrayList) ss0Var.n).remove(kc1Var);
        }
        kc1Var.x = false;
        if (J(kc1Var)) {
            this.F = true;
        }
        kc1Var.y = true;
        d0(kc1Var);
    }

    public final void U(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            kf2.o("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((po) arrayList.get(i)).p) {
                if (i2 != i) {
                    A(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((po) arrayList.get(i2)).p) {
                        i2++;
                    }
                }
                A(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            A(arrayList, arrayList2, i2, size);
        }
    }

    public final void V(Bundle bundle) {
        wo0 wo0Var;
        Bundle bundle2;
        fe1 fe1Var;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.v.B.getClassLoader());
                this.k.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.v.B.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        ss0 ss0Var = this.c;
        HashMap map2 = (HashMap) ss0Var.p;
        HashMap map3 = (HashMap) ss0Var.o;
        map2.clear();
        map2.putAll(map);
        nd1 nd1Var = (nd1) bundle.getParcelable("state");
        if (nd1Var == null) {
            return;
        }
        map3.clear();
        ArrayList arrayList = nd1Var.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            wo0Var = this.n;
            int i2 = 2;
            if (i >= size) {
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            Bundle bundleG = ss0Var.G((String) obj, null);
            if (bundleG != null) {
                kc1 kc1Var = (kc1) this.N.b.get(((be1) bundleG.getParcelable("state")).o);
                if (kc1Var != null) {
                    if (I(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + kc1Var);
                    }
                    fe1Var = new fe1(wo0Var, ss0Var, kc1Var, bundleG);
                    bundle2 = bundleG;
                } else {
                    i2 = 2;
                    bundle2 = bundleG;
                    fe1Var = new fe1(this.n, this.c, this.v.B.getClassLoader(), F(), bundleG);
                }
                kc1 kc1Var2 = fe1Var.c;
                kc1Var2.o = bundle2;
                kc1Var2.F = this;
                if (I(i2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + kc1Var2.r + "): " + kc1Var2);
                }
                fe1Var.m(this.v.B.getClassLoader());
                ss0Var.E(fe1Var);
                fe1Var.e = this.u;
            }
        }
        od1 od1Var = this.N;
        od1Var.getClass();
        ArrayList arrayList2 = new ArrayList(od1Var.b.values());
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            kc1 kc1Var3 = (kc1) obj2;
            if (map3.get(kc1Var3.r) == null) {
                if (I(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + kc1Var3 + " that was not found in the set of active Fragments " + nd1Var.n);
                }
                this.N.f(kc1Var3);
                kc1Var3.F = this;
                fe1 fe1Var2 = new fe1(wo0Var, ss0Var, kc1Var3);
                fe1Var2.e = 1;
                fe1Var2.k();
                kc1Var3.y = true;
                fe1Var2.k();
            }
        }
        ArrayList arrayList3 = nd1Var.o;
        ((ArrayList) ss0Var.n).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList3.get(i4);
                i4++;
                String str3 = (String) obj3;
                kc1 kc1VarT = ss0Var.t(str3);
                if (kc1VarT == null) {
                    kf2.o(xa3.h("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (I(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + kc1VarT);
                }
                ss0Var.o(kc1VarT);
            }
        }
        if (nd1Var.p != null) {
            this.d = new ArrayList(nd1Var.p.length);
            int i5 = 0;
            while (true) {
                qo[] qoVarArr = nd1Var.p;
                if (i5 >= qoVarArr.length) {
                    break;
                }
                qo qoVar = qoVarArr[i5];
                ArrayList arrayList4 = qoVar.o;
                po poVar = new po(this);
                qoVar.a(poVar);
                poVar.s = qoVar.t;
                for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                    String str4 = (String) arrayList4.get(i6);
                    if (str4 != null) {
                        ((je1) poVar.a.get(i6)).b = ss0Var.t(str4);
                    }
                }
                poVar.d(1);
                if (I(2)) {
                    StringBuilder sbJ = f34.j(i5, "restoreAllState: back stack #", " (index ");
                    sbJ.append(poVar.s);
                    sbJ.append("): ");
                    sbJ.append(poVar);
                    Log.v("FragmentManager", sbJ.toString());
                    PrintWriter printWriter = new PrintWriter(new fe2());
                    poVar.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(poVar);
                i5++;
            }
        } else {
            this.d = null;
        }
        this.i.set(nd1Var.q);
        String str5 = nd1Var.r;
        if (str5 != null) {
            kc1 kc1VarT2 = ss0Var.t(str5);
            this.y = kc1VarT2;
            q(kc1VarT2);
        }
        ArrayList arrayList5 = nd1Var.s;
        if (arrayList5 != null) {
            for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                this.j.put((String) arrayList5.get(i7), (ro) nd1Var.t.get(i7));
            }
        }
        this.E = new ArrayDeque(nd1Var.u);
    }

    public final Bundle W() {
        int i;
        ArrayList arrayList;
        qo[] qoVarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            xm0 xm0Var = (xm0) it.next();
            if (xm0Var.e) {
                if (I(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                xm0Var.e = false;
                xm0Var.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((xm0) it2.next()).e();
        }
        y(true);
        this.G = true;
        this.N.g = true;
        ss0 ss0Var = this.c;
        ss0Var.getClass();
        HashMap map = (HashMap) ss0Var.o;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (fe1 fe1Var : map.values()) {
            if (fe1Var != null) {
                kc1 kc1Var = fe1Var.c;
                ss0Var.G(kc1Var.r, fe1Var.o());
                arrayList2.add(kc1Var.r);
                if (I(2)) {
                    Log.v("FragmentManager", "Saved state of " + kc1Var + ": " + kc1Var.o);
                }
            }
        }
        HashMap map2 = (HashMap) this.c.p;
        if (!map2.isEmpty()) {
            ss0 ss0Var2 = this.c;
            synchronized (((ArrayList) ss0Var2.n)) {
                try {
                    if (((ArrayList) ss0Var2.n).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) ss0Var2.n).size());
                        ArrayList arrayList3 = (ArrayList) ss0Var2.n;
                        int size2 = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj = arrayList3.get(i2);
                            i2++;
                            kc1 kc1Var2 = (kc1) obj;
                            arrayList.add(kc1Var2.r);
                            if (I(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + kc1Var2.r + "): " + kc1Var2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList4 = this.d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                qoVarArr = null;
            } else {
                qoVarArr = new qo[size];
                for (i = 0; i < size; i++) {
                    qoVarArr[i] = new qo((po) this.d.get(i));
                    if (I(2)) {
                        StringBuilder sbJ = f34.j(i, "saveAllState: adding back stack #", ": ");
                        sbJ.append(this.d.get(i));
                        Log.v("FragmentManager", sbJ.toString());
                    }
                }
            }
            nd1 nd1Var = new nd1();
            nd1Var.r = null;
            ArrayList arrayList5 = new ArrayList();
            nd1Var.s = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            nd1Var.t = arrayList6;
            nd1Var.n = arrayList2;
            nd1Var.o = arrayList;
            nd1Var.p = qoVarArr;
            nd1Var.q = this.i.get();
            kc1 kc1Var3 = this.y;
            if (kc1Var3 != null) {
                nd1Var.r = kc1Var3.r;
            }
            arrayList5.addAll(this.j.keySet());
            arrayList6.addAll(this.j.values());
            nd1Var.u = new ArrayList(this.E);
            bundle.putParcelable("state", nd1Var);
            for (String str : this.k.keySet()) {
                bundle.putBundle(xa3.g("result_", str), (Bundle) this.k.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(xa3.g("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (I(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void X() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.v.C.removeCallbacks(this.O);
                    this.v.C.post(this.O);
                    h0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Y(kc1 kc1Var, boolean z) {
        ViewGroup viewGroupE = E(kc1Var);
        if (viewGroupE == null || !(viewGroupE instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupE).setDrawDisappearingViewsLast(!z);
    }

    public final void Z(String str, Bundle bundle) {
        hd1 hd1Var = (hd1) this.l.get(str);
        if (hd1Var == null || hd1Var.n.h.compareTo(r92.q) < 0) {
            this.k.put(str, bundle);
        } else {
            hd1Var.d(str, bundle);
        }
        if (I(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public final fe1 a(kc1 kc1Var) {
        String str = kc1Var.a0;
        if (str != null) {
            he1.c(kc1Var, str);
        }
        if (I(2)) {
            Log.v("FragmentManager", "add: " + kc1Var);
        }
        fe1 fe1VarF = f(kc1Var);
        kc1Var.F = this;
        ss0 ss0Var = this.c;
        ss0Var.E(fe1VarF);
        if (!kc1Var.N) {
            ss0Var.o(kc1Var);
            kc1Var.y = false;
            if (kc1Var.T == null) {
                kc1Var.X = false;
            }
            if (J(kc1Var)) {
                this.F = true;
            }
        }
        return fe1VarF;
    }

    public final void a0(String str, le1 le1Var, zd1 zd1Var) {
        le1Var.e();
        ea2 ea2Var = le1Var.r;
        if (ea2Var.h == r92.n) {
            return;
        }
        ed1 ed1Var = new ed1(this, str, zd1Var, ea2Var);
        hd1 hd1Var = (hd1) this.l.put(str, new hd1(ea2Var, zd1Var, ed1Var));
        if (hd1Var != null) {
            hd1Var.n.f(hd1Var.p);
        }
        if (I(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + ea2Var + " and listener " + zd1Var);
        }
        ea2Var.a(ed1Var);
    }

    public final void b(mc1 mc1Var, fu fuVar, kc1 kc1Var) {
        if (this.v != null) {
            kf2.o("Already attached");
            return;
        }
        this.v = mc1Var;
        this.w = fuVar;
        this.x = kc1Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.o;
        if (kc1Var != null) {
            copyOnWriteArrayList.add(new fd1(kc1Var));
        } else if (mc1Var != null) {
            copyOnWriteArrayList.add(mc1Var);
        }
        if (this.x != null) {
            h0();
        }
        if (mc1Var != null) {
            a93 a93VarI = mc1Var.E.i();
            this.g = a93VarI;
            a93VarI.a(kc1Var != null ? kc1Var : mc1Var, this.h);
        }
        int i = 0;
        if (kc1Var != null) {
            od1 od1Var = kc1Var.F.N;
            HashMap map = od1Var.c;
            od1 od1Var2 = (od1) map.get(kc1Var.r);
            if (od1Var2 == null) {
                od1Var2 = new od1(od1Var.e);
                map.put(kc1Var.r, od1Var2);
            }
            this.N = od1Var2;
        } else if (mc1Var != null) {
            e75 e75VarD = mc1Var.E.d();
            sf0 sf0Var = sf0.b;
            sf0Var.getClass();
            bq4 bq4Var = new bq4(e75VarD, od1.h, sf0Var);
            i30 i30VarA = kx3.a(od1.class);
            String strB = i30VarA.b();
            if (strB == null) {
                kf2.n("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.N = (od1) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        } else {
            this.N = new od1(false);
        }
        this.N.g = N();
        this.c.q = this.N;
        mc1 mc1Var2 = this.v;
        if (mc1Var2 != null && kc1Var == null) {
            rm3 rm3VarF = mc1Var2.f();
            rm3VarF.L("android:support:fragments", new cs0(1, this));
            Bundle bundleA = rm3VarF.A("android:support:fragments");
            if (bundleA != null) {
                V(bundleA);
            }
        }
        mc1 mc1Var3 = this.v;
        if (mc1Var3 != null) {
            j70 j70Var = mc1Var3.E.u;
            String strConcat = "FragmentManager:".concat(kc1Var != null ? b11.q(new StringBuilder(), kc1Var.r, ":") : "");
            this.B = j70Var.c(strConcat.concat("StartActivityForResult"), new q5(2), new hg3(19, this));
            this.C = j70Var.c(strConcat.concat("StartIntentSenderForResult"), new q5(3), new zg5(this));
            this.D = j70Var.c(strConcat.concat("RequestPermissions"), new q5(i), new zh0(25, this));
        }
        mc1 mc1Var4 = this.v;
        if (mc1Var4 != null) {
            nc1 nc1Var = mc1Var4.E;
            ad1 ad1Var = this.p;
            ad1Var.getClass();
            nc1Var.v.add(ad1Var);
        }
        mc1 mc1Var5 = this.v;
        if (mc1Var5 != null) {
            nc1 nc1Var2 = mc1Var5.E;
            ad1 ad1Var2 = this.q;
            ad1Var2.getClass();
            nc1Var2.w.add(ad1Var2);
        }
        mc1 mc1Var6 = this.v;
        if (mc1Var6 != null) {
            nc1 nc1Var3 = mc1Var6.E;
            ad1 ad1Var3 = this.r;
            ad1Var3.getClass();
            nc1Var3.y.add(ad1Var3);
        }
        mc1 mc1Var7 = this.v;
        if (mc1Var7 != null) {
            nc1 nc1Var4 = mc1Var7.E;
            ad1 ad1Var4 = this.s;
            ad1Var4.getClass();
            nc1Var4.z.add(ad1Var4);
        }
        mc1 mc1Var8 = this.v;
        if (mc1Var8 == null || kc1Var != null) {
            return;
        }
        nc1 nc1Var5 = mc1Var8.E;
        cd1 cd1Var = this.t;
        cd1Var.getClass();
        r20 r20Var = nc1Var5.p;
        ((CopyOnWriteArrayList) r20Var.p).add(cd1Var);
        ((Runnable) r20Var.o).run();
    }

    public final void b0(kc1 kc1Var, r92 r92Var) {
        if (kc1Var == this.c.t(kc1Var.r) && (kc1Var.G == null || kc1Var.F == this)) {
            kc1Var.b0 = r92Var;
        } else {
            tb4.h("Fragment ", kc1Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void c(kc1 kc1Var) {
        if (I(2)) {
            Log.v("FragmentManager", "attach: " + kc1Var);
        }
        if (kc1Var.N) {
            kc1Var.N = false;
            if (kc1Var.x) {
                return;
            }
            this.c.o(kc1Var);
            if (I(2)) {
                Log.v("FragmentManager", "add from attach: " + kc1Var);
            }
            if (J(kc1Var)) {
                this.F = true;
            }
        }
    }

    public final void c0(kc1 kc1Var) {
        if (kc1Var != null) {
            if (kc1Var != this.c.t(kc1Var.r) || (kc1Var.G != null && kc1Var.F != this)) {
                tb4.h("Fragment ", kc1Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        kc1 kc1Var2 = this.y;
        this.y = kc1Var;
        q(kc1Var2);
        q(this.y);
    }

    public final void d() {
        this.b = false;
        this.L.clear();
        this.K.clear();
    }

    public final void d0(kc1 kc1Var) {
        ViewGroup viewGroupE = E(kc1Var);
        if (viewGroupE != null) {
            hc1 hc1Var = kc1Var.W;
            if ((hc1Var == null ? 0 : hc1Var.e) + (hc1Var == null ? 0 : hc1Var.d) + (hc1Var == null ? 0 : hc1Var.c) + (hc1Var == null ? 0 : hc1Var.b) > 0) {
                if (viewGroupE.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupE.setTag(R.id.visible_removing_fragment_view_tag, kc1Var);
                }
                kc1 kc1Var2 = (kc1) viewGroupE.getTag(R.id.visible_removing_fragment_view_tag);
                hc1 hc1Var2 = kc1Var.W;
                boolean z = hc1Var2 != null ? hc1Var2.a : false;
                if (kc1Var2.W == null) {
                    return;
                }
                kc1Var2.k().a = z;
            }
        }
    }

    public final HashSet e() {
        xm0 xm0Var;
        HashSet hashSet = new HashSet();
        ArrayList arrayListV = this.c.v();
        int size = arrayListV.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListV.get(i);
            i++;
            ViewGroup viewGroup = ((fe1) obj).c.S;
            if (viewGroup != null) {
                G().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof xm0) {
                    xm0Var = (xm0) tag;
                } else {
                    xm0Var = new xm0(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, xm0Var);
                }
                hashSet.add(xm0Var);
            }
        }
        return hashSet;
    }

    public final fe1 f(kc1 kc1Var) {
        String str = kc1Var.r;
        ss0 ss0Var = this.c;
        fe1 fe1Var = (fe1) ((HashMap) ss0Var.o).get(str);
        if (fe1Var != null) {
            return fe1Var;
        }
        fe1 fe1Var2 = new fe1(this.n, ss0Var, kc1Var);
        fe1Var2.m(this.v.B.getClassLoader());
        fe1Var2.e = this.u;
        return fe1Var2;
    }

    public final void f0() {
        ArrayList arrayListV = this.c.v();
        int size = arrayListV.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListV.get(i);
            i++;
            fe1 fe1Var = (fe1) obj;
            kc1 kc1Var = fe1Var.c;
            if (kc1Var.U) {
                if (this.b) {
                    this.J = true;
                } else {
                    kc1Var.U = false;
                    fe1Var.k();
                }
            }
        }
    }

    public final void g(kc1 kc1Var) {
        if (I(2)) {
            Log.v("FragmentManager", "detach: " + kc1Var);
        }
        if (kc1Var.N) {
            return;
        }
        kc1Var.N = true;
        if (kc1Var.x) {
            if (I(2)) {
                Log.v("FragmentManager", "remove from detach: " + kc1Var);
            }
            ss0 ss0Var = this.c;
            synchronized (((ArrayList) ss0Var.n)) {
                ((ArrayList) ss0Var.n).remove(kc1Var);
            }
            kc1Var.x = false;
            if (J(kc1Var)) {
                this.F = true;
            }
            d0(kc1Var);
        }
    }

    public final void g0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new fe2());
        mc1 mc1Var = this.v;
        if (mc1Var == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            mc1Var.E.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final void h(boolean z, Configuration configuration) {
        if (z && this.v != null) {
            g0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (kc1 kc1Var : this.c.x()) {
            if (kc1Var != null) {
                kc1Var.onConfigurationChanged(configuration);
                if (z) {
                    kc1Var.H.h(true, configuration);
                }
            }
        }
    }

    public final void h0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.h.c(true);
                    return;
                }
                bd1 bd1Var = this.h;
                ArrayList arrayList = this.d;
                bd1Var.c((arrayList != null ? arrayList.size() : 0) > 0 && M(this.x));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean i() {
        if (this.u >= 1) {
            for (kc1 kc1Var : this.c.x()) {
                if (kc1Var != null) {
                    if (!kc1Var.M ? kc1Var.H.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        boolean zJ;
        boolean z;
        if (this.u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (kc1 kc1Var : this.c.x()) {
            if (kc1Var != null && L(kc1Var)) {
                if (kc1Var.M) {
                    zJ = false;
                } else {
                    if (kc1Var.P && kc1Var.Q) {
                        kc1Var.G(menu, menuInflater);
                        z = true;
                    } else {
                        z = false;
                    }
                    zJ = z | kc1Var.H.j(menu, menuInflater);
                }
                if (zJ) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(kc1Var);
                    z2 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                kc1 kc1Var2 = (kc1) this.e.get(i);
                if (arrayList == null || !arrayList.contains(kc1Var2)) {
                    kc1Var2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z2;
    }

    public final void k() throws Exception {
        boolean zIsChangingConfigurations = true;
        this.I = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((xm0) it.next()).e();
        }
        mc1 mc1Var = this.v;
        ss0 ss0Var = this.c;
        if (mc1Var != null) {
            zIsChangingConfigurations = ((od1) ss0Var.q).f;
        } else {
            nc1 nc1Var = mc1Var.B;
            if (nc1Var != null) {
                zIsChangingConfigurations = true ^ nc1Var.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((ro) it2.next()).n;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((od1) ss0Var.q).d((String) obj, false);
                }
            }
        }
        t(-1);
        mc1 mc1Var2 = this.v;
        if (mc1Var2 != null) {
            nc1 nc1Var2 = mc1Var2.E;
            ad1 ad1Var = this.q;
            ad1Var.getClass();
            nc1Var2.w.remove(ad1Var);
        }
        mc1 mc1Var3 = this.v;
        if (mc1Var3 != null) {
            nc1 nc1Var3 = mc1Var3.E;
            ad1 ad1Var2 = this.p;
            ad1Var2.getClass();
            nc1Var3.v.remove(ad1Var2);
        }
        mc1 mc1Var4 = this.v;
        if (mc1Var4 != null) {
            nc1 nc1Var4 = mc1Var4.E;
            ad1 ad1Var3 = this.r;
            ad1Var3.getClass();
            nc1Var4.y.remove(ad1Var3);
        }
        mc1 mc1Var5 = this.v;
        if (mc1Var5 != null) {
            nc1 nc1Var5 = mc1Var5.E;
            ad1 ad1Var4 = this.s;
            ad1Var4.getClass();
            nc1Var5.z.remove(ad1Var4);
        }
        mc1 mc1Var6 = this.v;
        if (mc1Var6 != null && this.x == null) {
            nc1 nc1Var6 = mc1Var6.E;
            cd1 cd1Var = this.t;
            cd1Var.getClass();
            r20 r20Var = nc1Var6.p;
            ((CopyOnWriteArrayList) r20Var.p).remove(cd1Var);
            if (((HashMap) r20Var.q).remove(cd1Var) == null) {
                ((Runnable) r20Var.o).run();
            } else {
                kf2.k();
            }
        }
        this.v = null;
        this.w = null;
        this.x = null;
        if (this.g != null) {
            this.h.b();
            this.g = null;
        }
        w5 w5Var = this.B;
        if (w5Var != null) {
            w5Var.b();
            this.C.b();
            this.D.b();
        }
    }

    public final void l(boolean z) {
        if (z && this.v != null) {
            g0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (kc1 kc1Var : this.c.x()) {
            if (kc1Var != null) {
                kc1Var.R = true;
                if (z) {
                    kc1Var.H.l(true);
                }
            }
        }
    }

    public final void m(boolean z) {
        if (z && this.v != null) {
            g0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (kc1 kc1Var : this.c.x()) {
            if (kc1Var != null && z) {
                kc1Var.H.m(true);
            }
        }
    }

    public final void n() {
        ArrayList arrayListW = this.c.w();
        int size = arrayListW.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListW.get(i);
            i++;
            kc1 kc1Var = (kc1) obj;
            if (kc1Var != null) {
                kc1Var.z();
                kc1Var.H.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.u >= 1) {
            for (kc1 kc1Var : this.c.x()) {
                if (kc1Var != null) {
                    if (kc1Var.M ? false : (kc1Var.P && kc1Var.Q && kc1Var.N(menuItem)) ? true : kc1Var.H.o(menuItem)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.u < 1) {
            return;
        }
        for (kc1 kc1Var : this.c.x()) {
            if (kc1Var != null && !kc1Var.M) {
                kc1Var.H.p();
            }
        }
    }

    public final void q(kc1 kc1Var) {
        if (kc1Var != null) {
            if (kc1Var != this.c.t(kc1Var.r)) {
                return;
            }
            kc1Var.F.getClass();
            boolean zM = M(kc1Var);
            Boolean bool = kc1Var.w;
            if (bool == null || bool.booleanValue() != zM) {
                kc1Var.w = Boolean.valueOf(zM);
                md1 md1Var = kc1Var.H;
                md1Var.h0();
                md1Var.q(md1Var.y);
            }
        }
    }

    public final void r(boolean z) {
        if (z && this.v != null) {
            g0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (kc1 kc1Var : this.c.x()) {
            if (kc1Var != null && z) {
                kc1Var.H.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.u < 1) {
            return false;
        }
        boolean z = false;
        for (kc1 kc1Var : this.c.x()) {
            if (kc1Var != null && L(kc1Var)) {
                if (kc1Var.M ? false : kc1Var.H.s() | (kc1Var.P && kc1Var.Q)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void t(int i) {
        try {
            this.b = true;
            for (fe1 fe1Var : ((HashMap) this.c.o).values()) {
                if (fe1Var != null) {
                    fe1Var.e = i;
                }
            }
            O(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((xm0) it.next()).e();
            }
            this.b = false;
            y(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        kc1 kc1Var = this.x;
        if (kc1Var != null) {
            sb.append(kc1Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.x)));
            sb.append("}");
        } else {
            mc1 mc1Var = this.v;
            if (mc1Var != null) {
                sb.append(mc1Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.J) {
            this.J = false;
            f0();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        ss0 ss0Var = this.c;
        ArrayList arrayList = (ArrayList) ss0Var.n;
        String str3 = str + "    ";
        HashMap map = (HashMap) ss0Var.o;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (fe1 fe1Var : map.values()) {
                printWriter.print(str);
                if (fe1Var != null) {
                    kc1 kc1Var = fe1Var.c;
                    printWriter.println(kc1Var);
                    kc1Var.j(str3, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                kc1 kc1Var2 = (kc1) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(kc1Var2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                kc1 kc1Var3 = (kc1) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(kc1Var3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                po poVar = (po) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(poVar.toString());
                poVar.h(str2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (id1) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.w);
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.G);
        printWriter.print(" mStopped=");
        printWriter.print(this.H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.I);
        if (this.F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.F);
        }
    }

    public final void w(id1 id1Var, boolean z) {
        if (!z) {
            if (this.v == null) {
                if (this.I) {
                    kf2.o("FragmentManager has been destroyed");
                    return;
                } else {
                    kf2.o("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (N()) {
                kf2.o("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.v == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(id1Var);
                    X();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z) {
        if (this.b) {
            kf2.o("FragmentManager is already executing transactions");
            return;
        }
        if (this.v == null) {
            if (this.I) {
                kf2.o("FragmentManager has been destroyed");
                return;
            } else {
                kf2.o("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.v.C.getLooper()) {
            kf2.o("Must be called from main thread of fragment host");
            return;
        }
        if (!z && N()) {
            kf2.o("Can not perform this action after onSaveInstanceState");
        } else if (this.K == null) {
            this.K = new ArrayList();
            this.L = new ArrayList();
        }
    }

    public final boolean y(boolean z) {
        boolean zA;
        ArrayList arrayList;
        x(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.K;
            ArrayList arrayList3 = this.L;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            zA |= ((id1) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                            throw th;
                        }
                        arrayList.clear();
                        this.v.C.removeCallbacks(this.O);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.v.C.removeCallbacks(this.O);
                        throw th;
                    }
                }
            }
            if (!zA) {
                h0();
                u();
                ((HashMap) this.c.o).values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.b = true;
            try {
                U(this.K, this.L);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
    }

    public final void z(po poVar, boolean z) {
        if (z && (this.v == null || this.I)) {
            return;
        }
        x(z);
        poVar.a(this.K, this.L);
        this.b = true;
        try {
            U(this.K, this.L);
            d();
            h0();
            u();
            ((HashMap) this.c.o).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }
}
