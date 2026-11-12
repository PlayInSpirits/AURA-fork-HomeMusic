package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.impl.WorkDatabase_Impl;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class bq4 implements qd3, zn4 {
    public static final md3 r = new md3();
    public final Object n;
    public Object o;
    public Object p;
    public Object q;

    /* JADX WARN: Code duplicated, block: B:90:0x024b  */
    public bq4(he heVar, zs4 zs4Var, List list, oo0 oo0Var, ha1 ha1Var, boolean z) {
        int i;
        List list2;
        ArrayList arrayList;
        he heVar2 = heVar;
        this.n = heVar2;
        this.o = list;
        final int i2 = 0;
        gf1 gf1Var = new gf1(this) { // from class: dz2
            public final /* synthetic */ bq4 o;

            {
                this.o = this;
            }

            @Override // defpackage.gf1
            public final Object invoke() {
                int i3 = i2;
                Object obj = null;
                int i4 = 1;
                bq4 bq4Var = this.o;
                switch (i3) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) bq4Var.q;
                        if (!arrayList2.isEmpty()) {
                            Object obj2 = arrayList2.get(0);
                            float fB = ((pd3) obj2).a.b();
                            int size = arrayList2.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList2.get(i4);
                                    float fB2 = ((pd3) obj3).a.b();
                                    if (Float.compare(fB, fB2) < 0) {
                                        obj2 = obj3;
                                        fB = fB2;
                                    }
                                    if (i4 != size) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        pd3 pd3Var = (pd3) obj;
                        return Float.valueOf(pd3Var != null ? pd3Var.a.b() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) bq4Var.q;
                        if (!arrayList3.isEmpty()) {
                            Object obj4 = arrayList3.get(0);
                            float fC = ((pd3) obj4).a.v.c();
                            int size2 = arrayList3.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList3.get(i4);
                                    float fC2 = ((pd3) obj5).a.v.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i4 != size2) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        pd3 pd3Var2 = (pd3) obj;
                        return Float.valueOf(pd3Var2 != null ? pd3Var2.a.v.c() : 0.0f);
                }
            }
        };
        b92 b92Var = b92.n;
        rr2.K(b92Var, gf1Var);
        final int i3 = 1;
        this.p = rr2.K(b92Var, new gf1(this) { // from class: dz2
            public final /* synthetic */ bq4 o;

            {
                this.o = this;
            }

            @Override // defpackage.gf1
            public final Object invoke() {
                int i4 = i3;
                Object obj = null;
                int i5 = 1;
                bq4 bq4Var = this.o;
                switch (i4) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) bq4Var.q;
                        if (!arrayList2.isEmpty()) {
                            Object obj2 = arrayList2.get(0);
                            float fB = ((pd3) obj2).a.b();
                            int size = arrayList2.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList2.get(i5);
                                    float fB2 = ((pd3) obj3).a.b();
                                    if (Float.compare(fB, fB2) < 0) {
                                        obj2 = obj3;
                                        fB = fB2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        pd3 pd3Var = (pd3) obj;
                        return Float.valueOf(pd3Var != null ? pd3Var.a.b() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) bq4Var.q;
                        if (!arrayList3.isEmpty()) {
                            Object obj4 = arrayList3.get(0);
                            float fC = ((pd3) obj4).a.v.c();
                            int size2 = arrayList3.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList3.get(i5);
                                    float fC2 = ((pd3) obj5).a.v.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        pd3 pd3Var2 = (pd3) obj;
                        return Float.valueOf(pd3Var2 != null ? pd3Var2.a.v.c() : 0.0f);
                }
            }
        });
        sd3 sd3Var = zs4Var.b;
        int i4 = ie.a;
        ArrayList arrayList2 = heVar2.q;
        String str = heVar2.o;
        u01 u01Var = u01.n;
        List listK0 = arrayList2 != null ? q40.K0(arrayList2, new ca1(11)) : u01Var;
        ArrayList arrayList3 = new ArrayList();
        ii iiVar = new ii();
        int size = listK0.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            ge geVar = (ge) listK0.get(i5);
            sd3 sd3VarA = sd3Var.a((sd3) geVar.a);
            int i7 = geVar.b;
            int i8 = geVar.c;
            if (i7 > i8) {
                dz1.a("Reversed range is not supported");
            }
            while (i6 < i7 && !iiVar.isEmpty()) {
                ge geVar2 = (ge) iiVar.last();
                listK0 = listK0;
                int i9 = geVar2.c;
                u01Var = u01Var;
                Object obj = geVar2.a;
                if (i7 < i9) {
                    arrayList3.add(new ge(i6, i7, obj));
                    i6 = i7;
                } else {
                    int i10 = size;
                    arrayList3.add(new ge(i6, i9, obj));
                    i6 = geVar2.c;
                    while (!iiVar.isEmpty() && i6 == ((ge) iiVar.last()).c) {
                        iiVar.removeLast();
                    }
                    size = i10;
                }
            }
            List list3 = listK0;
            u01 u01Var2 = u01Var;
            int i11 = size;
            if (i6 < i7) {
                arrayList3.add(new ge(i6, i7, sd3Var));
                i6 = i7;
            }
            ge geVar3 = (ge) iiVar.g();
            if (geVar3 != null) {
                int i12 = geVar3.c;
                Object obj2 = geVar3.a;
                int i13 = geVar3.b;
                if (i13 == i7 && i12 == i8) {
                    iiVar.removeLast();
                    iiVar.addLast(new ge(i7, i8, ((sd3) obj2).a(sd3VarA)));
                } else if (i13 == i12) {
                    arrayList3.add(new ge(i13, i12, obj2));
                    iiVar.removeLast();
                    iiVar.addLast(new ge(i7, i8, sd3VarA));
                } else {
                    if (i12 < i8) {
                        nz2.c();
                        throw null;
                    }
                    iiVar.addLast(new ge(i7, i8, ((sd3) obj2).a(sd3VarA)));
                }
            } else {
                iiVar.addLast(new ge(i7, i8, sd3VarA));
            }
            i5++;
            listK0 = list3;
            u01Var = u01Var2;
            size = i11;
        }
        u01 u01Var3 = u01Var;
        while (i6 <= str.length() && !iiVar.isEmpty()) {
            ge geVar4 = (ge) iiVar.last();
            Object obj3 = geVar4.a;
            int i14 = geVar4.c;
            arrayList3.add(new ge(i6, i14, obj3));
            while (!iiVar.isEmpty() && i14 == ((ge) iiVar.last()).c) {
                iiVar.removeLast();
            }
            i6 = i14;
        }
        if (i6 < str.length()) {
            arrayList3.add(new ge(i6, str.length(), sd3Var));
        }
        if (arrayList3.isEmpty()) {
            i = 0;
            arrayList3.add(new ge(0, 0, sd3Var));
        } else {
            i = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i15 = i;
        while (i15 < size2) {
            ge geVar5 = (ge) arrayList3.get(i15);
            int i16 = geVar5.b;
            int i17 = geVar5.c;
            String strSubstring = i16 != i17 ? str.substring(i16, i17) : "";
            if (i16 == i17 || (list2 = heVar2.n) == null) {
                arrayList = null;
            } else if (i16 != 0 || i17 < str.length()) {
                arrayList = new ArrayList(list2.size());
                int size3 = list2.size();
                int i18 = 0;
                while (i18 < size3) {
                    int i19 = size3;
                    ge geVar6 = (ge) list2.get(i18);
                    int i20 = i18;
                    Object obj4 = geVar6.a;
                    int i21 = geVar6.b;
                    int i22 = size2;
                    if (!(((fe) obj4) instanceof sd3)) {
                        int i23 = geVar6.c;
                        if (ie.a(i16, i17, i21, i23)) {
                            arrayList.add(new ge(gb.m(i21, i16, i17) - i16, gb.m(i23, i16, i17) - i16, (fe) geVar6.a, geVar6.d));
                        }
                    }
                    i18 = i20 + 1;
                    size3 = i19;
                    size2 = i22;
                    arrayList3 = arrayList3;
                    i15 = i15;
                }
            } else {
                arrayList = new ArrayList(list2.size());
                int size4 = list2.size();
                int i24 = 0;
                while (i24 < size4) {
                    int i25 = size4;
                    Object obj5 = list2.get(i24);
                    int i26 = i24;
                    if (!(((fe) ((ge) obj5).a) instanceof sd3)) {
                        arrayList.add(obj5);
                    }
                    i24 = i26 + 1;
                    size4 = i25;
                }
            }
            int i27 = size2;
            ArrayList arrayList5 = arrayList3;
            int i28 = i15;
            he heVar3 = new he(strSubstring, arrayList == null ? u01Var3 : arrayList);
            sd3 sd3Var2 = (sd3) geVar5.a;
            zs4 zs4Var2 = new zs4(zs4Var.a, sd3Var.a(sd3Var2.b == 0 ? new sd3(sd3Var2.a, sd3Var.b, sd3Var2.c, sd3Var2.d, sd3Var2.e, sd3Var2.f, sd3Var2.g, sd3Var2.h, sd3Var2.i) : sd3Var2));
            List list4 = heVar3.n;
            List list5 = list4 == null ? u01Var3 : list4;
            List list6 = (List) this.o;
            ArrayList arrayList6 = new ArrayList(list6.size());
            int size5 = list6.size();
            int i29 = 0;
            while (i29 < size5) {
                ge geVar7 = (ge) list6.get(i29);
                int i30 = geVar7.b;
                int i31 = geVar7.c;
                if (ie.a(i16, i17, i30, i31)) {
                    if (i16 > i30 || i31 > i17) {
                        dz1.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList6.add(new ge(i30 - i16, i31 - i16, geVar7.a));
                }
                i29++;
                list6 = list6;
            }
            arrayList4.add(new pd3(new mc(strSubstring, zs4Var2, list5, arrayList6, ha1Var, oo0Var, z), i16, i17));
            i15 = i28 + 1;
            heVar2 = heVar;
            str = str;
            size2 = i27;
            arrayList3 = arrayList5;
        }
        this.q = arrayList4;
    }

    public static bq4 m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_library_album, viewGroup, false);
        int i = R.id.album_cover_image_view;
        ImageView imageView = (ImageView) uo.s(viewInflate, R.id.album_cover_image_view);
        if (imageView != null) {
            i = R.id.album_name_label;
            TextView textView = (TextView) uo.s(viewInflate, R.id.album_name_label);
            if (textView != null) {
                i = R.id.artist_name_label;
                TextView textView2 = (TextView) uo.s(viewInflate, R.id.artist_name_label);
                if (textView2 != null) {
                    return new bq4((ConstraintLayout) viewInflate, imageView, textView, textView2);
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.qd3
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((pd3) arrayList.get(i)).a.a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    @Override // defpackage.zn4
    public void c(byte[] bArr, int i, int i2, yn4 yn4Var, wc0 wc0Var) {
        int[] iArr;
        ig0 ig0Var;
        int i3;
        int i4;
        int iA;
        int i5;
        int i6;
        int iD;
        bg3 bg3Var = (bg3) this.p;
        be3 be3Var = (be3) this.o;
        be3 be3Var2 = (be3) this.n;
        be3Var2.L(i + i2, bArr);
        be3Var2.N(i);
        if (((Inflater) this.q) == null) {
            this.q = new Inflater();
        }
        Inflater inflater = (Inflater) this.q;
        String str = f35.a;
        if (be3Var2.a() > 0 && be3Var2.j() == 120 && f35.K(be3Var2, be3Var, inflater)) {
            be3Var2.L(be3Var.c, be3Var.a);
        }
        int i7 = 0;
        bg3Var.d = 0;
        int[] iArr2 = bg3Var.b;
        be3 be3Var3 = bg3Var.a;
        bg3Var.e = 0;
        bg3Var.f = 0;
        bg3Var.g = 0;
        bg3Var.h = 0;
        bg3Var.i = 0;
        be3Var3.K(0);
        bg3Var.c = false;
        ArrayList arrayList = new ArrayList();
        while (be3Var2.a() >= 3) {
            int i8 = be3Var2.c;
            int iA2 = be3Var2.A();
            int iH = be3Var2.H();
            int i9 = be3Var2.b + iH;
            if (i9 > i8) {
                be3Var2.N(i8);
                i3 = i7;
                iArr = iArr2;
                ig0Var = null;
            } else {
                char c = 128;
                if (iA2 != 128) {
                    switch (iA2) {
                        case 20:
                            if (iH % 5 == 2) {
                                be3Var2.O(2);
                                Arrays.fill(iArr2, i7);
                                int i10 = iH / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iA3 = be3Var2.A();
                                    char c2 = c;
                                    double dA = be3Var2.A();
                                    double dA2 = be3Var2.A() - 128;
                                    int[] iArr3 = iArr2;
                                    double dA3 = be3Var2.A() - 128;
                                    iArr3[iA3] = f35.j((int) ((dA3 * 1.772d) + dA), 0, 255) | (be3Var2.A() << 24) | (f35.j((int) ((1.402d * dA2) + dA), 0, 255) << 16) | (f35.j((int) ((dA - (0.34414d * dA3)) - (dA2 * 0.71414d)), 0, 255) << 8);
                                    i11++;
                                    c = c2;
                                    iArr2 = iArr3;
                                }
                                iArr = iArr2;
                                bg3Var.c = true;
                            } else {
                                iArr = iArr2;
                            }
                            break;
                        case 21:
                            if (iH >= 4) {
                                be3Var2.O(3);
                                int i12 = iH - 4;
                                if (((128 & be3Var2.A()) != 0 ? 1 : i7) == 0) {
                                    i5 = be3Var3.b;
                                    i6 = be3Var3.c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        be3Var2.k(be3Var3.a, i5, iMin);
                                        be3Var3.N(i5 + iMin);
                                    }
                                } else if (i12 >= 7 && (iD = be3Var2.D()) >= 4) {
                                    bg3Var.h = be3Var2.H();
                                    bg3Var.i = be3Var2.H();
                                    be3Var3.K(iD - 4);
                                    i12 = iH - 11;
                                    i5 = be3Var3.b;
                                    i6 = be3Var3.c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        be3Var2.k(be3Var3.a, i5, iMin2);
                                        be3Var3.N(i5 + iMin2);
                                    }
                                }
                            }
                            iArr = iArr2;
                            break;
                        case 22:
                            if (iH >= 19) {
                                bg3Var.d = be3Var2.H();
                                bg3Var.e = be3Var2.H();
                                be3Var2.O(11);
                                bg3Var.f = be3Var2.H();
                                bg3Var.g = be3Var2.H();
                            }
                            iArr = iArr2;
                            break;
                        default:
                            iArr = iArr2;
                            break;
                    }
                    i3 = 0;
                    ig0Var = null;
                } else {
                    iArr = iArr2;
                    if (bg3Var.d == 0 || bg3Var.e == 0 || bg3Var.h == 0 || bg3Var.i == 0 || (i4 = be3Var3.c) == 0 || be3Var3.b != i4 || !bg3Var.c) {
                        ig0Var = null;
                    } else {
                        be3Var3.N(0);
                        int i13 = bg3Var.h * bg3Var.i;
                        int[] iArr4 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iA4 = be3Var3.A();
                            if (iA4 != 0) {
                                iA = i14 + 1;
                                iArr4[i14] = iArr[iA4];
                            } else {
                                int iA5 = be3Var3.A();
                                if (iA5 != 0) {
                                    iA = ((iA5 & 64) == 0 ? iA5 & 63 : ((iA5 & 63) << 8) | be3Var3.A()) + i14;
                                    Arrays.fill(iArr4, i14, iA, (iA5 & 128) == 0 ? iArr[0] : iArr[be3Var3.A()]);
                                }
                            }
                            i14 = iA;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr4, bg3Var.h, bg3Var.i, Bitmap.Config.ARGB_8888);
                        float f = bg3Var.f;
                        float f2 = bg3Var.d;
                        float f3 = f / f2;
                        float f4 = bg3Var.g;
                        float f5 = bg3Var.e;
                        ig0Var = new ig0(null, null, null, bitmapCreateBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, bg3Var.h / f2, bg3Var.i / f5, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    }
                    i3 = 0;
                    bg3Var.d = 0;
                    bg3Var.e = 0;
                    bg3Var.f = 0;
                    bg3Var.g = 0;
                    bg3Var.h = 0;
                    bg3Var.i = 0;
                    be3Var3.K(0);
                    bg3Var.c = false;
                }
                be3Var2.N(i9);
            }
            if (ig0Var != null) {
                arrayList.add(ig0Var);
            }
            i7 = i3;
            iArr2 = iArr;
        }
        wc0Var.accept(new lg0(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // defpackage.qd3
    public float d() {
        return ((Number) ((r72) this.p).getValue()).floatValue();
    }

    public void e(v33 v33Var) {
        if (((LinkedHashSet) this.q).add(v33Var)) {
            ((w33) this.o).a(this, v33Var, -1);
        }
    }

    public void f(s83 s83Var, int i) {
        if (i != 1 && i != 0) {
            kf2.e(f34.f(i, "Unsupported priority value: "));
        } else if (((LinkedHashSet) this.q).add(s83Var)) {
            ((w33) this.o).a(this, s83Var, i);
        }
    }

    public void g(v33 v33Var, t33 t33Var) {
        w33 w33Var = (w33) this.o;
        w33Var.getClass();
        if (w33Var.g != 0) {
            return;
        }
        u83 u83VarC = w33Var.c(-1);
        w33Var.f = u83VarC;
        w33Var.g = -1;
        w33Var.h = v33Var;
        if (t33Var != null) {
            if (u83VarC != null) {
                u83VarC.d.getClass();
            }
            nl4 nl4Var = w33Var.a;
            y33 y33Var = new y33(t33Var);
            nl4Var.getClass();
            nl4Var.j(null, y33Var);
        }
    }

    public void h(Runnable runnable) {
        ((ia4) this.n).execute(runnable);
    }

    public jo4 i(d5 d5Var) {
        ArrayList arrayList = (ArrayList) this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jo4 jo4Var = (jo4) arrayList.get(i);
            if (jo4Var != null && jo4Var.b == d5Var) {
                return jo4Var;
            }
        }
        jo4 jo4Var2 = new jo4((Context) this.o, d5Var);
        arrayList.add(jo4Var2);
        return jo4Var2;
    }

    public ms2 j() {
        oj2 oj2Var = ((pn2) this.q).s;
        if (oj2Var != null) {
            return oj2Var.d;
        }
        kf2.o("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        return null;
    }

    public zp4 k(rc5 rc5Var) {
        rc5Var.getClass();
        String str = rc5Var.a;
        int i = rc5Var.b;
        w24 w24VarB = w24.b(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        w24VarB.h(1, str);
        w24VarB.c(2, i);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.n;
        workDatabase_Impl.b();
        Cursor cursorH = xl.H(workDatabase_Impl, w24VarB);
        try {
            return cursorH.moveToFirst() ? new zp4(cursorH.getString(e35.x(cursorH, "work_spec_id")), cursorH.getInt(e35.x(cursorH, "generation")), cursorH.getInt(e35.x(cursorH, "system_id"))) : null;
        } finally {
            cursorH.close();
            w24VarB.j();
        }
    }

    public x65 l(i30 i30Var, String str) {
        x65 x65Var;
        x65 x65VarA;
        synchronized (((xi4) this.q)) {
            try {
                x65Var = (x65) ((e75) this.n).a.get(str);
                if (i30Var.d(x65Var)) {
                    b75 b75Var = (b75) this.o;
                    if (b75Var instanceof k54) {
                        k54 k54Var = (k54) b75Var;
                        x65Var.getClass();
                        ea2 ea2Var = k54Var.d;
                        if (ea2Var != null) {
                            rm3 rm3Var = k54Var.e;
                            rm3Var.getClass();
                            te5.c(x65Var, rm3Var, ea2Var);
                        }
                    }
                    x65Var.getClass();
                } else {
                    f03 f03Var = new f03((tf0) this.p);
                    f03Var.a.put(d75.a, str);
                    b75 b75Var2 = (b75) this.o;
                    b75Var2.getClass();
                    try {
                        try {
                            x65VarA = b75Var2.c(i30Var, f03Var);
                        } catch (AbstractMethodError unused) {
                            Class cls = i30Var.n;
                            cls.getClass();
                            x65VarA = b75Var2.a(cls);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class cls2 = i30Var.n;
                        cls2.getClass();
                        x65VarA = b75Var2.b(cls2, f03Var);
                    }
                    x65Var = x65VarA;
                    e75 e75Var = (e75) this.n;
                    e75Var.getClass();
                    x65Var.getClass();
                    x65 x65Var2 = (x65) e75Var.a.put(str, x65Var);
                    if (x65Var2 != null) {
                        x65Var2.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return x65Var;
    }

    public void n(zp4 zp4Var) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.n;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((vo0) this.o).m(zp4Var);
            workDatabase_Impl.t();
        } finally {
            workDatabase_Impl.o();
        }
    }

    public void o(oj2 oj2Var, String str, Bundle bundle) {
        int i;
        int i2;
        List<ld3> list = (List) oj2Var.f.get(str);
        if (list != null) {
            for (ld3 ld3Var : list) {
                Bundle bundle2 = (Bundle) ld3Var.b;
                int i3 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i4 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE", -1);
                int i5 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                int i6 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                int i7 = Integer.MAX_VALUE;
                int i8 = 0;
                if (i3 == -1 || i5 == -1) {
                    i = Integer.MAX_VALUE;
                    i2 = 0;
                } else {
                    i2 = i3 * i5;
                    i = (i5 + i2) - 1;
                }
                if (i4 != -1 && i6 != -1) {
                    i8 = i6 * i4;
                    i7 = (i6 + i8) - 1;
                }
                if (i >= i8 && i7 >= i2) {
                    ((pn2) this.q).g(str, oj2Var, (Bundle) ld3Var.b, bundle);
                }
            }
        }
    }

    public void p(String str, Bundle bundle) {
        qj2 qj2Var = (qj2) this.o;
        qj2Var.getClass();
        qj2Var.notifyChildrenChanged(str);
    }

    public boolean q(d5 d5Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.n).onActionItemClicked(i(d5Var), new xu2((Context) this.o, (oo4) menuItem));
    }

    public void r() {
        qj2 qj2Var = new qj2(this, (pn2) this.q);
        this.o = qj2Var;
        qj2Var.onCreate();
    }

    public boolean s(d5 d5Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.n;
        jo4 jo4VarI = i(d5Var);
        yd4 yd4Var = (yd4) this.q;
        Menu jv2Var = (Menu) yd4Var.get(menu);
        if (jv2Var == null) {
            jv2Var = new jv2((Context) this.o, (qu2) menu);
            yd4Var.put(menu, jv2Var);
        }
        return callback.onCreateActionMode(jo4VarI, jv2Var);
    }

    public /* synthetic */ bq4(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.n = constraintLayout;
        this.o = imageView;
        this.p = textView;
        this.q = textView2;
    }

    public bq4(WorkDatabase_Impl workDatabase_Impl) {
        this.n = workDatabase_Impl;
        this.o = new vo0(workDatabase_Impl, 2);
        this.p = new aq4(workDatabase_Impl, 0);
        this.q = new aq4(workDatabase_Impl, 1);
    }

    public bq4(e75 e75Var, b75 b75Var, tf0 tf0Var) {
        e75Var.getClass();
        b75Var.getClass();
        tf0Var.getClass();
        this.n = e75Var;
        this.o = b75Var;
        this.p = tf0Var;
        this.q = new xi4(13);
    }

    public bq4(ExecutorService executorService) {
        this.p = new Handler(Looper.getMainLooper());
        this.q = new vc5(this);
        ia4 ia4Var = new ia4(executorService, 0);
        this.n = ia4Var;
        this.o = kb4.w(ia4Var);
    }

    public /* synthetic */ bq4(ViewGroup viewGroup, View view, View view2, ViewGroup viewGroup2, View view3) {
        this.n = view;
        this.o = view2;
        this.p = viewGroup2;
        this.q = view3;
    }

    public bq4(int i) {
        switch (i) {
            case 12:
                this.n = new oi(0);
                this.o = new SparseArray();
                this.p = new xe2((Object) null);
                this.q = new oi(0);
                break;
            default:
                this.n = new be3();
                this.o = new be3();
                this.p = new bg3();
                break;
        }
    }

    public bq4(ss2 ss2Var) {
        this.n = ss2Var;
        this.o = new w33();
        new LinkedHashSet();
        this.p = new LinkedHashSet();
        this.q = new LinkedHashSet();
    }

    public bq4(Context context, ActionMode.Callback callback) {
        this.o = context;
        this.n = callback;
        this.p = new ArrayList();
        this.q = new yd4(0);
    }

    public bq4(List list, ArrayList arrayList) {
        this.n = list;
        this.p = new SparseBooleanArray();
        this.o = new oi(0);
        int size = list.size();
        int i = Integer.MIN_VALUE;
        nd3 nd3Var = null;
        for (int i2 = 0; i2 < size; i2++) {
            nd3 nd3Var2 = (nd3) list.get(i2);
            int i3 = nd3Var2.e;
            if (i3 > i) {
                nd3Var = nd3Var2;
                i = i3;
            }
        }
        this.q = nd3Var;
    }

    public bq4(pn2 pn2Var) {
        this.q = pn2Var;
        this.n = new ArrayList();
    }

    public bq4(AudioTrack audioTrack, zh0 zh0Var) {
        this.n = audioTrack;
        this.o = zh0Var;
        Handler handlerP = f35.p(null);
        this.p = handlerP;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: wm
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                bq4 bq4Var = this.a;
                if (((wm) bq4Var.q) == null) {
                    return;
                }
                uo.t().execute(new k6(7, bq4Var, audioRouting));
            }
        };
        this.q = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerP);
    }
}
