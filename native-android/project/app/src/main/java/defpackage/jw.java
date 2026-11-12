package defpackage;

import android.os.Build;
import android.util.SparseArray;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import com.eddyizm.tempus.ui.login.LoginActivity;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.material.tabs.TabLayout;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jw implements rj1, xx, Callback {
    public static final t71 s = new t71();
    public static boolean t = true;
    public boolean n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;

    public jw(k51 k51Var, tb1 tb1Var, iu4 iu4Var, xn4 xn4Var, boolean z) {
        this.o = k51Var;
        this.p = tb1Var;
        this.q = iu4Var;
        this.r = xn4Var;
        this.n = z;
    }

    public static int o(wx wxVar, int i) {
        int iHashCode = wxVar.b.hashCode() + (wxVar.a * 31);
        yj0 yj0Var = wxVar.e;
        if (i < 2) {
            long jA = nd0.a(yj0Var);
            return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
        }
        return yj0Var.hashCode() + (iHashCode * 31);
    }

    public static wx t(int i, DataInputStream dataInputStream) throws IOException {
        yj0 yj0VarF;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            xc5 xc5Var = new xc5(5);
            xc5Var.m(Long.valueOf(j), "exo_len");
            yj0VarF = yj0.c.b(xc5Var);
        } else {
            yj0VarF = ml3.f(dataInputStream);
        }
        return new wx(i2, utf, yj0VarF);
    }

    public void a() {
        synchronized (((hx) this.r)) {
            if (this.n) {
                return;
            }
            this.n = true;
            xe5.b((of4) this.p);
            try {
                ((ll) this.o).a();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.xx
    public void b(HashMap map) throws Throwable {
        gp3 gp3Var = (gp3) this.q;
        DataOutputStream dataOutputStream = null;
        try {
            el elVarY = gp3Var.y();
            z14 z14Var = (z14) this.r;
            if (z14Var == null) {
                this.r = new z14(elVarY);
            } else {
                z14Var.b(elVarY);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream((z14) this.r);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(map.size());
                int iO = 0;
                for (wx wxVar : map.values()) {
                    dataOutputStream2.writeInt(wxVar.a);
                    dataOutputStream2.writeUTF(wxVar.b);
                    ml3.g(wxVar.e, dataOutputStream2);
                    iO += o(wxVar, 2);
                }
                dataOutputStream2.writeInt(iO);
                dataOutputStream2.close();
                ((File) gp3Var.p).delete();
                String str = f35.a;
                this.n = false;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                f35.h(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.xx
    public void c(wx wxVar, boolean z) {
        this.n = true;
    }

    public void d(e93 e93Var) {
        ((mf4) this.p).i(new hk5(dr4.a, e93Var));
        v();
    }

    @Override // defpackage.xx
    public void e(wx wxVar) {
        this.n = true;
    }

    @Override // defpackage.xx
    public boolean f() {
        gp3 gp3Var = (gp3) this.q;
        return ((File) gp3Var.o).exists() || ((File) gp3Var.p).exists();
    }

    @Override // defpackage.xx
    public void g(HashMap map) throws Throwable {
        if (this.n) {
            b(map);
        }
    }

    @Override // defpackage.xx
    public void h(long j) {
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    @Override // defpackage.xx
    public void i(HashMap map, SparseArray sparseArray) throws Throwable {
        DataInputStream dataInputStream;
        rr2.w(!this.n);
        Cipher cipher = (Cipher) this.o;
        gp3 gp3Var = (gp3) this.q;
        File file = (File) gp3Var.o;
        File file2 = (File) gp3Var.o;
        File file3 = (File) gp3Var.p;
        if (file.exists() || file3.exists()) {
            DataInputStream dataInputStream2 = null;
            try {
                if (file3.exists()) {
                    file2.delete();
                    file3.renameTo(file2);
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                DataInputStream dataInputStream3 = new DataInputStream(bufferedInputStream);
                try {
                    int i = dataInputStream3.readInt();
                    if (i < 0 || i > 2) {
                        f35.h(dataInputStream3);
                    } else {
                        if ((dataInputStream3.readInt() & 1) == 0) {
                            dataInputStream = dataInputStream3;
                        } else if (cipher == null) {
                            f35.h(dataInputStream3);
                        } else {
                            byte[] bArr = new byte[16];
                            dataInputStream3.readFully(bArr);
                            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                            try {
                                SecretKeySpec secretKeySpec = (SecretKeySpec) this.p;
                                String str = f35.a;
                                cipher.init(2, secretKeySpec, ivParameterSpec);
                                dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        }
                        try {
                            int i2 = dataInputStream.readInt();
                            int iO = 0;
                            for (int i3 = 0; i3 < i2; i3++) {
                                wx wxVarT = t(i, dataInputStream);
                                String str2 = wxVarT.b;
                                map.put(str2, wxVarT);
                                sparseArray.put(wxVarT.a, str2);
                                iO += o(wxVarT, i);
                            }
                            int i4 = dataInputStream.readInt();
                            boolean z = dataInputStream.read() == -1;
                            if (i4 == iO && z) {
                                f35.h(dataInputStream);
                                return;
                            }
                            f35.h(dataInputStream);
                        } catch (IOException unused) {
                            dataInputStream2 = dataInputStream;
                            if (dataInputStream2 != null) {
                                f35.h(dataInputStream2);
                            }
                        } catch (Throwable th) {
                            dataInputStream2 = dataInputStream;
                            th = th;
                            if (dataInputStream2 != null) {
                                f35.h(dataInputStream2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException unused2) {
                    dataInputStream2 = dataInputStream3;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream2 = dataInputStream3;
                }
            } catch (IOException unused3) {
            } catch (Throwable th3) {
                th = th3;
            }
            map.clear();
            sparseArray.clear();
            file2.delete();
            file3.delete();
        }
    }

    @Override // defpackage.xx
    public void j() {
        gp3 gp3Var = (gp3) this.q;
        ((File) gp3Var.o).delete();
        ((File) gp3Var.p).delete();
    }

    public void k(cg0 cg0Var) {
        ((mf4) this.p).i(new hk5(dr4.a, cg0Var));
        v();
    }

    public void l() {
        TabLayout tabLayout = (TabLayout) this.o;
        ViewPager2 viewPager2 = (ViewPager2) this.p;
        if (this.n) {
            kf2.o("TabLayoutMediator is already attached");
            return;
        }
        dw3 adapter = viewPager2.getAdapter();
        this.r = adapter;
        if (adapter == null) {
            kf2.o("TabLayoutMediator attached before ViewPager2 has an adapter");
            return;
        }
        this.n = true;
        ((ArrayList) viewPager2.p.b).add(new nq4(tabLayout));
        is1 is1Var = new is1(1, viewPager2);
        ArrayList arrayList = tabLayout.a0;
        if (!arrayList.contains(is1Var)) {
            arrayList.add(is1Var);
        }
        ((dw3) this.r).n.registerObserver(new ce1(2, this));
        r();
        tabLayout.j(viewPager2.getCurrentItem(), 0.0f, true, true, true);
    }

    public sj1 m() {
        uj1 bk1Var;
        uj1 zj1Var;
        sj1 sj1Var;
        synchronized (this.p) {
            try {
                ra raVar = (ra) this.o;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    raVar.getUniqueDrawingId();
                }
                if (i >= 29) {
                    zj1Var = new zj1();
                } else {
                    if (t) {
                        try {
                            bk1Var = new xj1((ra) this.o, new nz(), new mz());
                        } catch (Throwable unused) {
                            t = false;
                            bk1Var = new bk1(q((ra) this.o));
                        }
                    } else {
                        bk1Var = new bk1(q((ra) this.o));
                    }
                    zj1Var = bk1Var;
                }
                sj1Var = new sj1(zj1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return sj1Var;
    }

    public Object n() {
        Object obj;
        synchronized (this.o) {
            try {
                ji2.o("Task is not yet complete", this.n);
                Exception exc = (Exception) this.r;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        k03 k03Var = (k03) this.o;
        if (this.n) {
            new Thread(new qo2((mm3) this.r, (String) this.p, k03Var, 7)).start();
        } else {
            k03Var.k(null);
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        mm3 mm3Var = (mm3) this.r;
        k03 k03Var = (k03) this.o;
        if (!response.isSuccessful() || response.body() == null) {
            k03Var.k(null);
            return;
        }
        SubsonicResponse subsonicResponse = ((ApiResponse) response.body()).getSubsonicResponse();
        if (subsonicResponse.getPlaylist() != null) {
            List<Child> entries = subsonicResponse.getPlaylist().getEntries();
            if (entries == null) {
                entries = new ArrayList<>();
            }
            k03Var.k(entries);
            new Thread(new qo2(mm3Var, subsonicResponse.getPlaylist(), new ArrayList(entries), 11)).start();
            return;
        }
        if (subsonicResponse.getError() == null || subsonicResponse.getError().getCode() == null || subsonicResponse.getError().getCode().intValue() != 70) {
            k03Var.k(null);
        } else {
            new Thread(new qo2(mm3Var, (String) this.p, (Runnable) this.q, 9)).start();
            k03Var.k(null);
        }
    }

    public boolean p() {
        boolean z;
        synchronized (this.o) {
            z = false;
            if (this.n && ((Exception) this.r) == null) {
                z = true;
            }
        }
        return z;
    }

    public qv0 q(ra raVar) {
        w65 w65Var = (w65) this.q;
        if (w65Var != null) {
            return w65Var;
        }
        w65 w65Var2 = new w65(raVar.getContext());
        w65Var2.setClipChildren(false);
        w65Var2.setClipToPadding(false);
        w65Var2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        raVar.addView(w65Var2, -1);
        this.q = w65Var2;
        return w65Var2;
    }

    public void r() {
        String string;
        TabLayout tabLayout = (TabLayout) this.o;
        tabLayout.h();
        dw3 dw3Var = (dw3) this.r;
        if (dw3Var != null) {
            int iA = dw3Var.a();
            int i = 0;
            while (i < iA) {
                kq4 kq4VarG = tabLayout.g();
                cn cnVar = (cn) this.q;
                switch (cnVar.n) {
                    case 15:
                        kq4VarG.a((String) ((lo1) cnVar.o).A.get(i));
                        break;
                    default:
                        LoginActivity loginActivity = (LoginActivity) cnVar.o;
                        int i2 = LoginActivity.R;
                        if (i == 0) {
                            string = loginActivity.getString(R.string.la_tab_greeter);
                        } else if (i == 1) {
                            string = loginActivity.getString(R.string.la_tab_permission);
                        } else if (i != 2) {
                            string = i != 3 ? "" : loginActivity.getString(R.string.la_tab_server);
                        } else {
                            string = loginActivity.getString(R.string.la_tab_themes);
                        }
                        kq4VarG.a(string);
                        break;
                }
                tabLayout.a(kq4VarG, false);
                i++;
            }
            if (iA > 0) {
                int iMin = Math.min(((ViewPager2) this.p).getCurrentItem(), tabLayout.getTabCount() - 1);
                if (iMin != tabLayout.getSelectedTabPosition()) {
                    tabLayout.i(tabLayout.f(iMin), true);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int s(rf2 rf2Var, ra raVar, boolean z) {
        int i;
        Object[] objArr;
        int i2;
        int i3;
        cm1 cm1Var = (cm1) this.p;
        fm1 fm1Var = (fm1) this.r;
        if (this.n) {
            return 0;
        }
        try {
            this.n = true;
            gp3 gp3VarB = ((pz1) this.q).B(rf2Var, raVar);
            xe2 xe2Var = (xe2) gp3VarB.o;
            int iH = xe2Var.h();
            while (true) {
                if (i >= iH) {
                    objArr = true;
                    break;
                }
                on3 on3Var = (on3) xe2Var.i(i);
                i = (on3Var.d || on3Var.h) ? 0 : i + 1;
                objArr = false;
                break;
            }
            int iH2 = xe2Var.h();
            for (int i4 = 0; i4 < iH2; i4++) {
                on3 on3Var2 = (on3) xe2Var.i(i4);
                if (objArr != false || gi1.g(on3Var2)) {
                    ((c72) this.o).z(on3Var2.c, (fm1) this.r, on3Var2.i, true);
                    if (!fm1Var.n.h()) {
                        cm1Var.a(on3Var2.a, fm1Var, gi1.g(on3Var2));
                        fm1Var.clear();
                    }
                }
            }
            boolean zB = cm1Var.b(gp3VarB, z);
            int iH3 = xe2Var.h();
            int i5 = 0;
            while (true) {
                if (i5 >= iH3) {
                    i2 = 0;
                    break;
                }
                on3 on3Var3 = (on3) xe2Var.i(i5);
                if (!g83.b(gi1.S(on3Var3, true), 0L) && on3Var3.c()) {
                    i2 = 1;
                    break;
                }
                i5++;
            }
            int iH4 = xe2Var.h();
            for (int i6 = 0; i6 < iH4; i6++) {
                if (((on3) xe2Var.i(i6)).c()) {
                    i3 = 1;
                    return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
                }
            }
            i3 = 0;
            return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
        } finally {
            this.n = false;
        }
    }

    public void u() {
        boolean z;
        Exception exc;
        String strConcat;
        if (this.n) {
            synchronized (this.o) {
                z = this.n;
            }
            if (!z) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            synchronized (this.o) {
                exc = (Exception) this.r;
            }
            if (exc == null) {
                strConcat = p() ? "result ".concat(String.valueOf(n())) : "unknown issue";
            } else {
                strConcat = "failure";
            }
        }
    }

    public void v() {
        synchronized (this.o) {
            try {
                if (this.n) {
                    ((mf4) this.p).j(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public jw(TabLayout tabLayout, ViewPager2 viewPager2, cn cnVar) {
        this.o = tabLayout;
        this.p = viewPager2;
        this.q = cnVar;
    }
}
