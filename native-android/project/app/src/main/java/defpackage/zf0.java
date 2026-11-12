package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.navigation.fragment.NavHostFragment;
import androidx.work.Worker;
import app.homemusic.R;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zf0 extends q42 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zf0(int i, Object obj) {
        super(0);
        this.n = i;
        this.o = obj;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x029b A[Catch: all -> 0x0230, TRY_LEAVE, TryCatch #10 {all -> 0x0230, blocks: (B:44:0x0168, B:96:0x0237, B:125:0x029b, B:131:0x02ba, B:122:0x0295, B:92:0x022f, B:88:0x0226, B:149:0x02f2, B:150:0x02f5, B:142:0x02d5, B:145:0x02e8, B:146:0x02ef, B:153:0x02fa, B:154:0x0310, B:85:0x0221, B:45:0x0171, B:47:0x017a, B:50:0x018b, B:76:0x0210, B:72:0x0209, B:79:0x0214, B:80:0x0219, B:119:0x0290), top: B:267:0x0168, inners: #2, #12, #13 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:184:0x038f  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:192:0x03d7 A[LOOP:4: B:191:0x03d5->B:192:0x03d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:195:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:197:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:202:0x0424  */
    /* JADX WARN: Code duplicated, block: B:212:0x0465  */
    /* JADX WARN: Code duplicated, block: B:215:0x0480  */
    /* JADX WARN: Code duplicated, block: B:217:0x0490  */
    /* JADX WARN: Code duplicated, block: B:219:0x0494  */
    /* JADX WARN: Code duplicated, block: B:220:0x0499  */
    /* JADX WARN: Code duplicated, block: B:222:0x049c  */
    /* JADX WARN: Code duplicated, block: B:223:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:225:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:304:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0417 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x03f9 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:197:0x03fb, please report this as an issue */
    @Override // defpackage.gf1
    public final Object invoke() throws Throwable {
        int i;
        Bundle bundleA;
        Bundle bundleA2;
        int i2;
        rp4 rp4Var;
        Bundle bundle;
        int i3;
        Bundle bundle2;
        LinkedHashMap linkedHashMap;
        int[] intArray;
        ArrayList<String> stringArrayList;
        ArrayList<String> stringArrayList2;
        int size;
        int i4;
        String str;
        Parcelable[] parcelableArray;
        ii iiVar;
        int i5;
        int length;
        int i6;
        int i7;
        ea2 ea2VarH;
        r32 r32Var;
        int i8;
        xu3 xu3Var;
        Throwable th;
        kd3 kd3Var;
        Throwable th2;
        Throwable th3;
        kd3 kd3Var2;
        int i9 = this.n;
        j15 j15Var = j15.a;
        int i10 = 2;
        int i11 = -1;
        boolean z = false;
        Object obj = this.o;
        switch (i9) {
            case 0:
                ((wo0) obj).F(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
                return j15Var;
            case 1:
                rq1 rq1Var = (rq1) obj;
                rq1Var.getClass();
                try {
                    rq1Var.J.s(2, 0, false);
                    break;
                } catch (IOException e) {
                    rq1Var.f(e);
                }
                return j15Var;
            case 2:
                a23 a23Var = (a23) obj;
                Context applicationContext = a23Var.n.getApplicationContext();
                return new k54(applicationContext instanceof Application ? (Application) applicationContext : null, a23Var, a23Var.c());
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                v23 v23Var = (v23) obj;
                return new w23(v23Var.a, v23Var.u);
            case 4:
                return new n23((String) obj, null, null);
            case 5:
                NavHostFragment navHostFragment = (NavHostFragment) obj;
                Context contextN = navHostFragment.n();
                if (contextN != null) {
                    v23 v23Var2 = new v23(contextN);
                    ba2 ba2Var = v23Var2.n;
                    if (navHostFragment != ba2Var) {
                        pd1 pd1Var = v23Var2.r;
                        if (ba2Var != null && (ea2VarH = ba2Var.h()) != null) {
                            ea2VarH.f(pd1Var);
                        }
                        v23Var2.n = navHostFragment;
                        navHostFragment.c0.a(pd1Var);
                    }
                    e75 e75VarD = navHostFragment.d();
                    if (h12.c(v23Var2.o, su3.s(e75VarD))) {
                        Context contextZ = navHostFragment.Z();
                        ld1 ld1VarM = navHostFragment.m();
                        ld1VarM.getClass();
                        tp0 tp0Var = new tp0(contextZ, ld1VarM);
                        u43 u43Var = v23Var2.u;
                        u43Var.a(tp0Var);
                        Context contextZ2 = navHostFragment.Z();
                        ld1 ld1VarM2 = navHostFragment.m();
                        ld1VarM2.getClass();
                        i = navHostFragment.J;
                        if (i != 0) {
                            i = R.id.nav_host_fragment_container;
                        } else {
                            i = R.id.nav_host_fragment_container;
                        }
                        u43Var.a(new rd1(contextZ2, ld1VarM2, i));
                        bundleA = ((rm3) navHostFragment.g0.p).A("android-support-nav:fragment:navControllerState");
                        if (bundleA != null) {
                            bundleA.setClassLoader(contextN.getClassLoader());
                            v23Var2.d = bundleA.getBundle("android-support-nav:controller:navigatorState");
                            v23Var2.e = bundleA.getParcelableArray("android-support-nav:controller:backStack");
                            linkedHashMap = v23Var2.m;
                            linkedHashMap.clear();
                            intArray = bundleA.getIntArray("android-support-nav:controller:backStackDestIds");
                            stringArrayList = bundleA.getStringArrayList("android-support-nav:controller:backStackIds");
                            if (intArray != null) {
                                length = intArray.length;
                                i6 = 0;
                                i7 = 0;
                                while (i6 < length) {
                                    v23Var2.l.put(Integer.valueOf(intArray[i6]), stringArrayList.get(i7));
                                    i6++;
                                    i7++;
                                }
                            }
                            stringArrayList2 = bundleA.getStringArrayList("android-support-nav:controller:backStackStates");
                            if (stringArrayList2 != null) {
                                size = stringArrayList2.size();
                                i4 = 0;
                                while (i4 < size) {
                                    String str2 = stringArrayList2.get(i4);
                                    i4++;
                                    str = str2;
                                    parcelableArray = bundleA.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                                    if (parcelableArray != null) {
                                        str.getClass();
                                        iiVar = new ii(parcelableArray.length);
                                        i5 = 0;
                                        while (i5 < parcelableArray.length) {
                                            int i12 = i5 + 1;
                                            Parcelable parcelable = parcelableArray[i5];
                                            parcelable.getClass();
                                            iiVar.addLast((c23) parcelable);
                                            i5 = i12;
                                        }
                                        linkedHashMap.put(str, iiVar);
                                    }
                                }
                            }
                            v23Var2.f = bundleA.getBoolean("android-support-nav:controller:deepLinkHandled");
                        }
                        ((rm3) navHostFragment.g0.p).L("android-support-nav:fragment:navControllerState", new cs0(i10, v23Var2));
                        bundleA2 = ((rm3) navHostFragment.g0.p).A("android-support-nav:fragment:graphId");
                        if (bundleA2 != null) {
                            navHostFragment.n0 = bundleA2.getInt("android-support-nav:fragment:graphId");
                        }
                        ((rm3) navHostFragment.g0.p).L("android-support-nav:fragment:graphId", new cs0(3, navHostFragment));
                        i2 = navHostFragment.n0;
                        rp4Var = v23Var2.B;
                        if (i2 != 0) {
                            v23Var2.v(((w23) rp4Var.getValue()).b(i2), null);
                        } else {
                            bundle = navHostFragment.s;
                            if (bundle != null) {
                                i3 = bundle.getInt("android-support-nav:fragment:graphId");
                            } else {
                                i3 = 0;
                            }
                            if (bundle != null) {
                                bundle2 = bundle.getBundle("android-support-nav:fragment:startDestinationArgs");
                            } else {
                                bundle2 = null;
                            }
                            if (i3 != 0) {
                                v23Var2.v(((w23) rp4Var.getValue()).b(i3), bundle2);
                            }
                        }
                        return v23Var2;
                    }
                    if (v23Var2.g.isEmpty()) {
                        v23Var2.o = su3.s(e75VarD);
                        Context contextZ3 = navHostFragment.Z();
                        ld1 ld1VarM3 = navHostFragment.m();
                        ld1VarM3.getClass();
                        tp0 tp0Var2 = new tp0(contextZ3, ld1VarM3);
                        u43 u43Var2 = v23Var2.u;
                        u43Var2.a(tp0Var2);
                        Context contextZ4 = navHostFragment.Z();
                        ld1 ld1VarM4 = navHostFragment.m();
                        ld1VarM4.getClass();
                        i = navHostFragment.J;
                        if (i != 0 || i == -1) {
                            i = R.id.nav_host_fragment_container;
                        }
                        u43Var2.a(new rd1(contextZ4, ld1VarM4, i));
                        bundleA = ((rm3) navHostFragment.g0.p).A("android-support-nav:fragment:navControllerState");
                        if (bundleA != null) {
                            bundleA.setClassLoader(contextN.getClassLoader());
                            v23Var2.d = bundleA.getBundle("android-support-nav:controller:navigatorState");
                            v23Var2.e = bundleA.getParcelableArray("android-support-nav:controller:backStack");
                            linkedHashMap = v23Var2.m;
                            linkedHashMap.clear();
                            intArray = bundleA.getIntArray("android-support-nav:controller:backStackDestIds");
                            stringArrayList = bundleA.getStringArrayList("android-support-nav:controller:backStackIds");
                            if (intArray != null && stringArrayList != null) {
                                length = intArray.length;
                                i6 = 0;
                                i7 = 0;
                                while (i6 < length) {
                                    v23Var2.l.put(Integer.valueOf(intArray[i6]), stringArrayList.get(i7));
                                    i6++;
                                    i7++;
                                }
                            }
                            stringArrayList2 = bundleA.getStringArrayList("android-support-nav:controller:backStackStates");
                            if (stringArrayList2 != null) {
                                size = stringArrayList2.size();
                                i4 = 0;
                                while (i4 < size) {
                                    String str3 = stringArrayList2.get(i4);
                                    i4++;
                                    str = str3;
                                    parcelableArray = bundleA.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                                    if (parcelableArray != null) {
                                        str.getClass();
                                        iiVar = new ii(parcelableArray.length);
                                        i5 = 0;
                                        while (i5 < parcelableArray.length) {
                                            int i13 = i5 + 1;
                                            try {
                                                Parcelable parcelable2 = parcelableArray[i5];
                                                parcelable2.getClass();
                                                iiVar.addLast((c23) parcelable2);
                                                i5 = i13;
                                            } catch (ArrayIndexOutOfBoundsException e2) {
                                                kf2.m(e2.getMessage());
                                            }
                                        }
                                        linkedHashMap.put(str, iiVar);
                                    }
                                }
                            }
                            v23Var2.f = bundleA.getBoolean("android-support-nav:controller:deepLinkHandled");
                        }
                        ((rm3) navHostFragment.g0.p).L("android-support-nav:fragment:navControllerState", new cs0(i10, v23Var2));
                        bundleA2 = ((rm3) navHostFragment.g0.p).A("android-support-nav:fragment:graphId");
                        if (bundleA2 != null) {
                            navHostFragment.n0 = bundleA2.getInt("android-support-nav:fragment:graphId");
                        }
                        ((rm3) navHostFragment.g0.p).L("android-support-nav:fragment:graphId", new cs0(3, navHostFragment));
                        i2 = navHostFragment.n0;
                        rp4Var = v23Var2.B;
                        if (i2 != 0) {
                            v23Var2.v(((w23) rp4Var.getValue()).b(i2), null);
                        } else {
                            bundle = navHostFragment.s;
                            if (bundle != null) {
                                i3 = bundle.getInt("android-support-nav:fragment:graphId");
                            } else {
                                i3 = 0;
                            }
                            if (bundle != null) {
                                bundle2 = bundle.getBundle("android-support-nav:fragment:startDestinationArgs");
                            } else {
                                bundle2 = null;
                            }
                            if (i3 != 0) {
                                v23Var2.v(((w23) rp4Var.getValue()).b(i3), bundle2);
                            }
                        }
                        return v23Var2;
                    }
                    kf2.o("ViewModelStore should be set before setGraph call");
                } else {
                    kf2.o("NavController cannot be created before the fragment is attached");
                }
                return null;
            case 6:
                y04 y04Var = (y04) obj;
                ClassLoader classLoader = y04Var.c;
                b71 b71Var = y04Var.d;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList = new ArrayList();
                int size2 = list.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = list.get(i14);
                    i14++;
                    URL url = (URL) obj2;
                    url.getClass();
                    if (h12.c(url.getProtocol(), "file")) {
                        String str4 = ge3.o;
                        kd3Var2 = new kd3(b71Var, tv1.A(new File(url.toURI())));
                    } else {
                        kd3Var2 = null;
                    }
                    if (kd3Var2 != null) {
                        arrayList.add(kd3Var2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                int size3 = list2.size();
                int i15 = 0;
                while (i15 < size3) {
                    int i16 = i15 + 1;
                    URL url2 = (URL) list2.get(i15);
                    url2.getClass();
                    String string = url2.toString();
                    string.getClass();
                    if (xm4.k0(string, "jar:file:", z)) {
                        boolean z2 = true;
                        int iLastIndexOf = string.lastIndexOf("!", string.length() - 1);
                        if (iLastIndexOf != i11) {
                            String str5 = ge3.o;
                            ge3 ge3VarA = tv1.A(new File(URI.create(string.substring(4, iLastIndexOf))));
                            r32 r32VarI = b71Var.i(ge3VarA);
                            try {
                                long size4 = r32VarI.size();
                                long j = size4 - 22;
                                if (j < 0) {
                                    throw new IOException("not a zip: size=" + r32VarI.size());
                                }
                                long jMax = Math.max(size4 - 65558, 0L);
                                long j2 = 0;
                                long j3 = j;
                                while (true) {
                                    xu3 xu3Var2 = new xu3(r32VarI.b(j3));
                                    try {
                                        if (xu3Var2.f() == 101010256) {
                                            int iN = xu3Var2.n() & 65535;
                                            int iN2 = xu3Var2.n() & 65535;
                                            long j4 = j3;
                                            long jN = xu3Var2.n() & 65535;
                                            r32 r32Var2 = r32VarI;
                                            if (jN == (xu3Var2.n() & 65535) && iN == 0 && iN2 == 0) {
                                                try {
                                                    xu3Var2.skip(4L);
                                                    long jF = ((long) xu3Var2.f()) & 4294967295L;
                                                    int iN3 = xu3Var2.n() & 65535;
                                                    pu puVar = new pu(iN3, jN, jF);
                                                    xu3Var2.q(iN3);
                                                    try {
                                                        xu3Var2.close();
                                                        long j5 = j4 - 20;
                                                        if (j5 > 0) {
                                                            r32Var = r32Var2;
                                                            try {
                                                                xu3 xu3Var3 = new xu3(r32Var.b(j5));
                                                                try {
                                                                    if (xu3Var3.f() == 117853008) {
                                                                        int iF = xu3Var3.f();
                                                                        long j6 = xu3Var3.j();
                                                                        if (xu3Var3.f() != 1 || iF != 0) {
                                                                            throw new IOException("unsupported zip: spanned");
                                                                        }
                                                                        xu3 xu3Var4 = new xu3(r32Var.b(j6));
                                                                        try {
                                                                            int iF2 = xu3Var4.f();
                                                                            if (iF2 != 101075792) {
                                                                                throw new IOException("bad zip: expected " + gb.B(101075792) + " but was " + gb.B(iF2));
                                                                            }
                                                                            xu3Var4.skip(12L);
                                                                            int iF3 = xu3Var4.f();
                                                                            int iF4 = xu3Var4.f();
                                                                            long j7 = xu3Var4.j();
                                                                            if (j7 != xu3Var4.j() || iF3 != 0 || iF4 != 0) {
                                                                                throw new IOException("unsupported zip: spanned");
                                                                            }
                                                                            xu3Var4.skip(8L);
                                                                            pu puVar2 = new pu(iN3, j7, xu3Var4.j());
                                                                            try {
                                                                                xu3Var4.close();
                                                                                th3 = null;
                                                                            } catch (Throwable th4) {
                                                                                th3 = th4;
                                                                            }
                                                                            puVar = puVar2;
                                                                            if (th3 != null) {
                                                                                throw th3;
                                                                            }
                                                                        } catch (Throwable th5) {
                                                                            try {
                                                                                xu3Var4.close();
                                                                            } catch (Throwable th6) {
                                                                                j51.d(th5, th6);
                                                                            }
                                                                            th3 = th5;
                                                                        }
                                                                    }
                                                                    try {
                                                                        xu3Var3.close();
                                                                        th2 = null;
                                                                    } catch (Throwable th7) {
                                                                        th2 = th7;
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    try {
                                                                        xu3Var3.close();
                                                                    } catch (Throwable th9) {
                                                                        j51.d(th8, th9);
                                                                    }
                                                                    th2 = th8;
                                                                }
                                                                if (th2 != null) {
                                                                    throw th2;
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                            }
                                                        } else {
                                                            r32Var = r32Var2;
                                                        }
                                                        pu puVar3 = puVar;
                                                        ArrayList arrayList3 = new ArrayList();
                                                        xu3 xu3Var5 = new xu3(r32Var.b(puVar3.b));
                                                        try {
                                                            long j8 = puVar3.a;
                                                            while (j2 < j8) {
                                                                ne5 ne5VarV = gb.V(xu3Var5);
                                                                i8 = i16;
                                                                xu3Var = xu3Var5;
                                                                try {
                                                                    if (ne5VarV.h >= puVar3.b) {
                                                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                                                    }
                                                                    ge3 ge3Var = y04.f;
                                                                    if (hh3.d(ne5VarV.a)) {
                                                                        arrayList3.add(ne5VarV);
                                                                    }
                                                                    j2++;
                                                                    i16 = i8;
                                                                    xu3Var5 = xu3Var;
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                    Throwable th12 = th;
                                                                    try {
                                                                        xu3Var.close();
                                                                    } catch (Throwable th13) {
                                                                        j51.d(th12, th13);
                                                                    }
                                                                    th = th12;
                                                                    if (th == null) {
                                                                        throw th;
                                                                    }
                                                                    oe5 oe5Var = new oe5(ge3VarA, b71Var, gb.g(arrayList3));
                                                                    try {
                                                                        r32Var.close();
                                                                        break;
                                                                    } catch (Throwable unused) {
                                                                    }
                                                                    kd3Var = new kd3(oe5Var, y04.f);
                                                                    if (kd3Var != null) {
                                                                        arrayList2.add(kd3Var);
                                                                    }
                                                                    i15 = i8;
                                                                    i11 = -1;
                                                                    z = false;
                                                                }
                                                                break;
                                                            }
                                                            i8 = i16;
                                                            try {
                                                                xu3Var5.close();
                                                                th = null;
                                                            } catch (Throwable th14) {
                                                                th = th14;
                                                            }
                                                        } catch (Throwable th15) {
                                                            th = th15;
                                                            i8 = i16;
                                                            xu3Var = xu3Var5;
                                                        }
                                                        if (th == null) {
                                                            throw th;
                                                        }
                                                        oe5 oe5Var2 = new oe5(ge3VarA, b71Var, gb.g(arrayList3));
                                                        r32Var.close();
                                                        kd3Var = new kd3(oe5Var2, y04.f);
                                                    } catch (Throwable th16) {
                                                        th = th16;
                                                        r32Var = r32Var2;
                                                    }
                                                } catch (Throwable th17) {
                                                    th = th17;
                                                }
                                                break;
                                            } else {
                                                try {
                                                    throw new IOException("unsupported zip: spanned");
                                                } catch (Throwable th18) {
                                                    th = th18;
                                                }
                                            }
                                        } else {
                                            long j9 = j3;
                                            int i17 = i16;
                                            boolean z3 = z2;
                                            r32 r32Var3 = r32VarI;
                                            xu3Var2.close();
                                            j3 = j9 - 1;
                                            if (j3 < jMax) {
                                                throw new IOException("not a zip: end of central directory signature not found");
                                            }
                                            i16 = i17;
                                            r32VarI = r32Var3;
                                            z2 = z3;
                                        }
                                    } catch (Throwable th19) {
                                        th = th19;
                                    }
                                    xu3Var2.close();
                                    throw th;
                                }
                            } catch (Throwable th20) {
                                th = th20;
                                r32Var = r32VarI;
                            }
                            Throwable th21 = th;
                            if (r32Var == null) {
                                throw th21;
                            }
                            try {
                                r32Var.close();
                                throw th21;
                            } catch (Throwable th22) {
                                j51.d(th21, th22);
                                throw th21;
                            }
                        }
                        i8 = i16;
                        kd3Var = null;
                    } else {
                        i8 = i16;
                        kd3Var = null;
                    }
                    if (kd3Var != null) {
                        arrayList2.add(kd3Var);
                    }
                    i15 = i8;
                    i11 = -1;
                    z = false;
                }
                return q40.G0(arrayList, arrayList2);
            case 7:
                return ((r21) ((y10) obj).f).i();
            case 8:
                return new tc0[((p81[]) obj).length];
            default:
                return ((Worker) obj).d();
        }
    }
}
