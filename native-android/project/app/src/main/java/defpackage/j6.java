package defpackage;

import android.net.Uri;
import android.webkit.CookieManager;
import com.eddyizm.tempus.homemusic.HubException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.CipherInputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j6 implements ci0 {
    public final /* synthetic */ int n;
    public final ci0 o;
    public final Object p;
    public Object q;
    public Object r;

    public j6(ci0 ci0Var) {
        this.n = 1;
        this.o = ci0Var;
        this.p = new ArrayList();
    }

    public static ii0 o(ii0 ii0Var, String str, boolean z) throws HubException, UnsupportedEncodingException {
        Object s14Var;
        String strC = rr1.c();
        boolean zC = h12.c(ii0Var.a.getScheme(), "homemusic-hub");
        String str2 = strC + "/api/listen/stream?ref=" + URLEncoder.encode(str, "UTF-8") + (z ? "&q=mobile" : "") + (zC ? "&full=1" : "");
        HashMap map = new HashMap(ii0Var.e);
        try {
            s14Var = CookieManager.getInstance().getCookie(str2);
        } catch (Throwable th) {
            s14Var = new s14(th);
        }
        if (s14Var instanceof s14) {
            s14Var = null;
        }
        String str3 = (String) s14Var;
        if (str3 != null) {
            map.put("Cookie", str3);
        }
        hi0 hi0VarA = ii0Var.a();
        hi0VarA.a = Uri.parse(str2);
        hi0VarA.e = map;
        return hi0VarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0198  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v14 java.lang.Object, still in use, count: 2, list:
          (r5v14 java.lang.Object) from 0x017b: PHI (r5 I:??) = (r5v8 java.lang.Object), (r5v14 java.lang.Object) binds: [B:67:0x017a, B:66:0x0179] A[DONT_GENERATE, DONT_INLINE]
          (r5v14 java.lang.Object) from 0x0169: CHECK_CAST (java.util.Map$Entry) (r5v14 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.ci0
    public final long b(defpackage.ii0 r19) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6.b(ii0):long");
    }

    @Override // defpackage.ci0
    public final void c(rw4 rw4Var) {
        int i = this.n;
        ci0 ci0Var = this.o;
        switch (i) {
            case 0:
                rw4Var.getClass();
                ci0Var.c(rw4Var);
                break;
            default:
                rw4Var.getClass();
                ci0Var.c(rw4Var);
                ((ArrayList) this.p).add(rw4Var);
                break;
        }
    }

    @Override // defpackage.ci0
    public final void close() {
        switch (this.n) {
            case 0:
                if (((CipherInputStream) this.r) != null) {
                    this.r = null;
                    this.o.close();
                    return;
                }
                return;
            default:
                try {
                    ci0 ci0Var = (ci0) this.q;
                    if (ci0Var != null) {
                        ci0Var.close();
                        break;
                    }
                    return;
                } finally {
                    this.q = null;
                    String str = (String) this.r;
                    if (str != null) {
                        ConcurrentHashMap concurrentHashMap = ot1.a;
                        ot1.a(str);
                    }
                    this.r = null;
                }
        }
    }

    @Override // defpackage.ci0
    public final Map j() {
        Map mapJ;
        switch (this.n) {
            case 0:
                return this.o.j();
            default:
                ci0 ci0Var = (ci0) this.q;
                return (ci0Var == null || (mapJ = ci0Var.j()) == null) ? v01.n : mapJ;
        }
    }

    @Override // defpackage.ci0
    public final Uri m() {
        switch (this.n) {
            case 0:
                return this.o.m();
            default:
                ci0 ci0Var = (ci0) this.q;
                if (ci0Var != null) {
                    return ci0Var.m();
                }
                return null;
        }
    }

    @Override // defpackage.wh0
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.n) {
            case 0:
                ((CipherInputStream) this.r).getClass();
                int i3 = ((CipherInputStream) this.r).read(bArr, i, i2);
                if (i3 < 0) {
                    return -1;
                }
                return i3;
            default:
                bArr.getClass();
                ci0 ci0Var = (ci0) this.q;
                if (ci0Var != null) {
                    return ci0Var.read(bArr, i, i2);
                }
                kf2.o("not opened");
                return 0;
        }
    }

    public j6(ci0 ci0Var, byte[] bArr, byte[] bArr2) {
        this.n = 0;
        this.o = ci0Var;
        this.p = bArr;
        this.q = bArr2;
    }
}
