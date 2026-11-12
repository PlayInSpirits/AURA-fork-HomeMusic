package defpackage;

import android.os.Build;
import android.util.SparseArray;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import com.eddyizm.tempus.ui.login.LoginActivity;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
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
import java.util.Iterator;
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
    public static final t71 s = null;
    public static boolean t = true;
    public boolean n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;

    static {
        s = new t71();
    }

    public jw(k51 r1, tb1 r2, iu4 r3, xn4 r4, boolean r5) {
        this.o = r1;
        this.p = r2;
        this.q = r3;
        this.r = r4;
        this.n = r5;
    }

    public static int o(wx r4, int r5) {
        int r0 = r4.a * 31;
        int r1 = r4.b.hashCode() + r0;
        yj0 r6 = r4.e;
        if (r5 >= 2) goto L6;
        long r7 = nd0.a(r6);
        return (r1 * 31) + ((int) (r7 ^ (r7 >>> 32)));
    L6:
        int r8 = r6.hashCode();
        return r8 + (r1 * 31);
    }

    public static wx t(int r4, DataInputStream r5) {
        int r0 = r5.readInt();
        String r1 = r5.readUTF();
        if (r4 >= 2) goto L5;
        long r6 = r5.readLong();
        xc5 r2 = new xc5(5);
        r2.m(Long.valueOf(r6), "exo_len");
        yj0 r7 = yj0.c.b(r2);
    L7:
        return new wx(r0, r1, r7);
    L5:
        r7 = ml3.f(r5);
        goto L7
    }

    public void a() {
        hx r0 = (hx) this.r;
        monitor-enter(r0);
    L14:
        th = move-exception;
        throw th;
    L5:
        if (this.n == false) goto L9;
        monitor-exit(r0);
        return;
    L9:
        this.n = true;     // Catch: Throwable -> L14
        monitor-exit(r0);
        xe5.b((of4) this.p);
        ((ll) this.o).a();     // Catch: IOException -> L17
        return;
    }

    @Override // defpackage.xx
    public void b(HashMap r8) {
        gp3 r0 = (gp3) this.q;
        DataOutputStream r1 = null;
        el r2 = r0.y();     // Catch: Throwable -> L6
        z14 r3 = (z14) this.r;     // Catch: Throwable -> L6
        if (r3 != null) goto L8;
        this.r = new z14(r2);     // Catch: Throwable -> L6
    L9:
        DataOutputStream r4 = new DataOutputStream((z14) this.r);     // Catch: Throwable -> L6
        r4.writeInt(2);     // Catch: Throwable -> L15
        r4.writeInt(0);     // Catch: Throwable -> L15
        r4.writeInt(r8.size());     // Catch: Throwable -> L15
        Iterator r9 = r8.values().iterator();     // Catch: Throwable -> L15
        int r5 = 0;
    L13:
        if (r9.hasNext() == false) goto L17;
        wx r6 = (wx) r9.next();     // Catch: Throwable -> L15
        r4.writeInt(r6.a);     // Catch: Throwable -> L15
        r4.writeUTF(r6.b);     // Catch: Throwable -> L15
        ml3.g(r6.e, r4);     // Catch: Throwable -> L15
        r5 = r5 + o(r6, 2);     // Catch: Throwable -> L15
        goto L13
    L17:
        r4.writeInt(r5);     // Catch: Throwable -> L15
        r4.close();     // Catch: Throwable -> L15
        ((File) r0.p).delete();     // Catch: Throwable -> L15
        String r10 = f35.a;
        this.n = false;
        return;
    L15:
        th = th;
        r1 = r4;
    L20:
        f35.h(r1);
        throw th;
    L8:
        r3.b(r2);     // Catch: Throwable -> L6
    L6:
        th = th;
        goto L20
    }

    @Override // defpackage.xx
    public void c(wx r1, boolean r2) {
        this.n = true;
    }

    public void d(e93 r3) {
        hk5 r1 = new hk5(dr4.a, r3);
        ((mf4) this.p).i(r1);
        v();
    }

    @Override // defpackage.xx
    public void e(wx r1) {
        this.n = true;
    }

    @Override // defpackage.xx
    public boolean f() {
        gp3 r1 = (gp3) this.q;
        if (((File) r1.o).exists() == false) goto L5;
        return true;
    L5:
        if (((File) r1.p).exists() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // defpackage.xx
    public void g(HashMap r2) {
        if (this.n == true) goto L5;
        return;
    L5:
        b(r2);
    }

    @Override // defpackage.xx
    public void h(long r1) {
    }

    @Override // defpackage.xx
    public void i(HashMap r12, SparseArray r13) {
        boolean r1 = true;
        rr2.w(!this.n);
        Cipher r0 = (Cipher) this.o;
        gp3 r2 = (gp3) this.q;
        File r3 = (File) r2.o;
        File r4 = (File) r2.o;
        File r5 = (File) r2.p;
        if (r3.exists() == false) goto L5;
    L8:
        DataInputStream r6 = null;
    L53:
        th = th;
    L54:
        if (r6 == null) goto L56;
        f35.h(r6);
    L56:
        throw th;
    L10:
        if (r5.exists() == false) goto L12;
        r4.delete();     // Catch: Throwable -> L53 IOException -> L61
        r5.renameTo(r4);     // Catch: Throwable -> L53 IOException -> L61
    L12:
        BufferedInputStream r7 = new BufferedInputStream(new FileInputStream(r4));     // Catch: Throwable -> L53 IOException -> L61
        DataInputStream r8 = new DataInputStream(r7);     // Catch: Throwable -> L53 IOException -> L61
        goto L57
    L68:
        int r9 = r8.readInt();     // Catch: Throwable -> L27 IOException -> L29
        if (r9 >= 0) goto L16;
    L22:
        f35.h(r8);
    L59:
        r12.clear();
        r13.clear();
        r4.delete();
        r5.delete();
        return;
    L16:
        if (r9 > 2) goto L22;
        if ((r8.readInt() & 1) == 0) goto L35;
        if (r0 == null) goto L22;
        byte[] r10 = new byte[16];     // Catch: Throwable -> L27 IOException -> L29
        r8.readFully(r10);     // Catch: Throwable -> L27 IOException -> L29
        IvParameterSpec r11 = new IvParameterSpec(r10);     // Catch: Throwable -> L27 IOException -> L29
        SecretKeySpec r14 = (SecretKeySpec) this.p;     // Catch: Throwable -> L27 IOException -> L29 InvalidAlgorithmParameterException -> L30 InvalidKeyException -> L32
        String r15 = f35.a;     // Catch: Throwable -> L27 IOException -> L29 InvalidAlgorithmParameterException -> L30 InvalidKeyException -> L32
        r0.init(2, r14, r11);     // Catch: Throwable -> L27 IOException -> L29 InvalidAlgorithmParameterException -> L30 InvalidKeyException -> L32
        DataInputStream r16 = new DataInputStream(new CipherInputStream(r7, r0));     // Catch: Throwable -> L27 IOException -> L29
    L66:
        int r17 = r16.readInt();     // Catch: Throwable -> L39 IOException -> L41
        int r18 = 0;
        int r19 = 0;
    L37:
        if (r18 >= r17) goto L42;
        wx r20 = t(r9, r16);     // Catch: Throwable -> L39 IOException -> L41
        String r21 = r20.b;     // Catch: Throwable -> L39 IOException -> L41
        r12.put(r21, r20);     // Catch: Throwable -> L39 IOException -> L41
        r13.put(r20.a, r21);     // Catch: Throwable -> L39 IOException -> L41
        r19 = r19 + o(r20, r9);     // Catch: Throwable -> L39 IOException -> L41
        r18 = r18 + 1;     // Catch: Throwable -> L39 IOException -> L41
        goto L37
    L42:
        int r22 = r16.readInt();     // Catch: Throwable -> L39 IOException -> L41
    L44:
        if (r16.read() == (-1)) goto L47;
        r1 = false;
    L47:
        if (r22 != r19) goto L52;
        if (r1 == false) goto L52;
        f35.h(r16);
        return;
    L52:
        f35.h(r16);
    L41:
        r6 = r16;
    L39:
        th = move-exception;
        r6 = r16;
        th = th;
        goto L54
    L30:
        e = e;
    L34:
        throw new IllegalStateException(e);     // Catch: Throwable -> L27 IOException -> L29
    L32:
        e = e;
        goto L34
    L35:
        r16 = r8;
    L29:
        r6 = r8;
    L27:
        th = th;
        r6 = r8;
    L57:
        if (r6 == null) goto L59;
        f35.h(r6);
        goto L59
    L5:
        if (r5.exists() == true) goto L8;
    }

    @Override // defpackage.xx
    public void j() {
        gp3 r1 = (gp3) this.q;
        ((File) r1.o).delete();
        ((File) r1.p).delete();
    }

    public void k(cg0 r3) {
        hk5 r1 = new hk5(dr4.a, r3);
        ((mf4) this.p).i(r1);
        v();
    }

    public void l() {
        TabLayout r1 = (TabLayout) this.o;
        ViewPager2 r0 = (ViewPager2) this.p;
        if (this.n == true) goto L13;
        dw3 r2 = r0.getAdapter();
        this.r = r2;
        if (r2 == null) goto L11;
        this.n = true;
        nq4 r3 = new nq4(r1);
        ((ArrayList) r0.p.b).add(r3);
        is1 r4 = new is1(1, r0);
        ArrayList r5 = r1.a0;
        if (r5.contains(r4) == true) goto L9;
        r5.add(r4);
    L9:
        ce1 r6 = new ce1(2, this);
        ((dw3) this.r).n.registerObserver(r6);
        r();
        r1.j(r0.getCurrentItem(), 0.0f, true, true, true);
        return;
    L11:
        kf2.o("TabLayoutMediator attached before ViewPager2 has an adapter");
        return;
    L13:
        kf2.o("TabLayoutMediator is already attached");
    }

    public sj1 m() {
        Object r0 = this.p;
        monitor-enter(r0);
        ra r1 = (ra) this.o;     // Catch: Throwable -> L9
        int r2 = Build.VERSION.SDK_INT;     // Catch: Throwable -> L9
        if (r2 < 29) goto L7;
        z9.b(r1);     // Catch: Throwable -> L9
    L7:
        if (r2 < 29) goto L12;
        uj1 r5 = new zj1();     // Catch: Throwable -> L9
    L19:
        sj1 r3 = new sj1(r5);     // Catch: Throwable -> L9
        monitor-exit(r0);
        return r3;
    L12:
        if (t == true) goto L24;
        uj1 r4 = new bk1(q((ra) this.o));     // Catch: Throwable -> L9
    L18:
        r5 = r4;
        goto L19
    L24:
        r4 = new xj1((ra) this.o, new nz(), new mz());     // Catch: Throwable -> L15
    L16:
        t = false;     // Catch: Throwable -> L9
        r4 = new bk1(q((ra) this.o));     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    public Object n() {
        Object r0 = this.o;
        monitor-enter(r0);
        ji2.o("Task is not yet complete", this.n);     // Catch: Throwable -> L9
        Exception r1 = (Exception) this.r;     // Catch: Throwable -> L9
        if (r1 != null) goto L12;
        Object r3 = this.q;     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return r3;
    L12:
        throw new RuntimeExecutionException(r1);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r4, Throwable r5) {
        k03 r6 = (k03) this.o;
        if (this.n == false) goto L6;
        new Thread(new qo2((mm3) this.r, (String) this.p, r6, 7)).start();
        return;
    L6:
        r6.k(null);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r6, Response r7) {
        mm3 r8 = (mm3) this.r;
        k03 r0 = (k03) this.o;
        if (r7.isSuccessful() == true) goto L5;
    L23:
        r0.k(null);
        return;
    L5:
        if (r7.body() == null) goto L23;
        SubsonicResponse r9 = ((ApiResponse) r7.body()).getSubsonicResponse();
        if (r9.getPlaylist() == null) goto L14;
        List<Child> r5 = r9.getPlaylist().getEntries();
        if (r5 != null) goto L11;
        r5 = new ArrayList();
    L11:
        r0.k(r5);
        new Thread(new qo2(r8, r9.getPlaylist(), new ArrayList(r5), 11)).start();
        return;
    L14:
        if (r9.getError() != null) goto L16;
    L21:
        r0.k(null);
        return;
    L16:
        if (r9.getError().getCode() == null) goto L21;
        if (r9.getError().getCode().intValue() != 70) goto L21;
        new Thread(new qo2(r8, (String) this.p, (Runnable) this.q, 9)).start();
        r0.k(null);
    }

    public boolean p() {
        Object r0 = this.o;
        monitor-enter(r0);
        boolean r2 = false;
        if (this.n == true) goto L7;
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L11
        return r2;
    L7:
        if (((Exception) this.r) != null) goto L9;
        r2 = true;
    L11:
        th = move-exception;
        throw th;
    }

    public qv0 q(ra r4) {
        w65 r0 = (w65) this.q;
        if (r0 != null) goto L6;
        w65 r1 = new w65(r4.getContext());
        r1.setClipChildren(false);
        r1.setClipToPadding(false);
        r1.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        r4.addView(r1, -1);
        this.q = r1;
        return r1;
    L6:
        return r0;
    }

    public void r() {
        TabLayout r0 = (TabLayout) this.o;
        r0.h();
        dw3 r1 = (dw3) this.r;
        if (r1 == null) goto L32;
        int r2 = r1.a();
        int r3 = 0;
    L6:
        if (r3 >= r2) goto L24;
        kq4 r5 = r0.g();
        cn r6 = (cn) this.q;
        switch(r6.n) {
            case 15: goto L22;
            default: goto L9;
        };
    L9:
        LoginActivity r7 = (LoginActivity) r6.o;
        int r8 = LoginActivity.R;
        if (r3 == 0) goto L20;
        if (r3 != 1) goto L13;
        String r4 = r7.getString(R.string.la_tab_permission);
    L21:
        r5.a(r4);
    L23:
        r0.a(r5, false);
        r3 = r3 + 1;
        goto L6
    L13:
        if (r3 != 2) goto L15;
        r4 = r7.getString(R.string.la_tab_themes);
        goto L21
    L15:
        if (r3 == 3) goto L17;
        r4 = "";
        goto L21
    L17:
        r4 = r7.getString(R.string.la_tab_server);
        goto L21
    L20:
        r4 = r7.getString(R.string.la_tab_greeter);
        goto L21
    L22:
        r5.a((String) ((lo1) r6.o).A.get(r3));
        goto L23
    L24:
        if (r2 <= 0) goto L33;
        int r9 = Math.min(((ViewPager2) this.p).getCurrentItem(), r0.getTabCount() - 1);
        if (r9 == r0.getSelectedTabPosition()) goto L34;
        r0.i(r0.f(r9), true);
        return;
    L34:
        return;
    L33:
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int s(rf2 r19, ra r20, boolean r21) {
        cm1 r0 = (cm1) this.p;
        fm1 r2 = (fm1) this.r;
        if (this.n == false) goto L48;
        return 0;
    L48:
        this.n = true;     // Catch: Throwable -> L14
        gp3 r5 = ((pz1) this.q).B(r19, r20);     // Catch: Throwable -> L14
        xe2 r6 = (xe2) r5.o;     // Catch: Throwable -> L14
        int r7 = r6.h();     // Catch: Throwable -> L14
        int r8 = 0;
    L7:
        if (r8 >= r7) goto L17;
        on3 r9 = (on3) r6.i(r8);     // Catch: Throwable -> L14
        if (r9.d == true) goto L16;
        if (r9.h == true) goto L16;
        r8 = r8 + 1;     // Catch: Throwable -> L14
    L16:
        Object[] r10 = false;
    L18:
        int r11 = r6.h();     // Catch: Throwable -> L14
        int r12 = 0;
    L19:
        if (r12 >= r11) goto L28;
        on3 r13 = (on3) r6.i(r12);     // Catch: Throwable -> L14
        if (r10 == false) goto L23;
    L24:
        ((c72) this.o).z(r13.c, (fm1) this.r, r13.i, true);     // Catch: Throwable -> L14
        if (r2.n.h() == true) goto L27;
        r0.a(r13.a, r2, gi1.g(r13));     // Catch: Throwable -> L14
        r2.clear();     // Catch: Throwable -> L14
    L27:
        r12 = r12 + 1;     // Catch: Throwable -> L14
        goto L19
    L23:
        if (gi1.g(r13) == false) goto L27;
    L28:
        boolean r1 = r0.b(r5, r21);     // Catch: Throwable -> L14
        int r3 = r6.h();     // Catch: Throwable -> L14
        int r14 = 0;
    L29:
        if (r14 >= r3) goto L36;
        on3 r15 = (on3) r6.i(r14);     // Catch: Throwable -> L14
        if (g83.b(gi1.S(r15, true), 0) == true) goto L35;
        if (r15.c() == false) goto L35;
        int r4 = 1;
    L37:
        int r16 = r6.h();     // Catch: Throwable -> L14
        int r17 = 0;
    L38:
        if (r17 >= r16) goto L43;
        if (((on3) r6.i(r17)).c() == true) goto L41;
        r17 = r17 + 1;
        goto L38
    L41:
        int r18 = 1;
    L44:
        int r22 = ((r1 ? 1 : 0) | (r4 << 1)) | (r18 << 2);
        this.n = false;
        return r22;
    L43:
        r18 = 0;
    L35:
        r14 = r14 + 1;     // Catch: Throwable -> L14
        goto L29
    L36:
        r4 = 0;
        goto L37
    L17:
        r10 = true;
    L14:
        th = move-exception;
        this.n = false;
        throw th;
    }

    public void u() {
        if (this.n == false) goto L28;
        Object r0 = this.o;
        monitor-enter(r0);
        boolean r1 = this.n;     // Catch: Throwable -> L25
        monitor-exit(r0);     // Catch: Throwable -> L25
        if (r1 == false) goto L24;
        Object r2 = this.o;
        monitor-enter(r2);
        Exception r3 = (Exception) this.r;     // Catch: Throwable -> L20
        monitor-exit(r2);     // Catch: Throwable -> L20
        if (r3 == null) goto L15;
        String r4 = "failure";
    L33:
        throw new DuplicateTaskCompletionException("Complete with: ".concat(r4), r3);
    L15:
        if (p() == false) goto L17;
        r4 = "result ".concat(String.valueOf(n()));
        goto L33
    L17:
        r4 = "unknown issue";
    L20:
        th = move-exception;
        throw th;
    L24:
        throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
    L25:
        th = move-exception;
        throw th;
    }

    public void v() {
        Object r0 = this.o;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (this.n == true) goto L10;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L10:
        monitor-exit(r0);     // Catch: Throwable -> L8
        ((mf4) this.p).j(this);
    }

    public jw(TabLayout r1, ViewPager2 r2, cn r3) {
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }
}
