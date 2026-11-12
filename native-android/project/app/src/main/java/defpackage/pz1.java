package defpackage;

import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.Rating;
import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.interfaces.ScanCallback;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class pz1 implements y14, eg1, kg1, lm3, Callback, cq0, u55, ScanCallback, c11, y34, ck2, ci, ou2 {
    public final /* synthetic */ int n;
    public Object o;

    public pz1(int r2) {
        this.n = r2;
        switch(r2) {
            case 7: goto L18;
            case 15: goto L16;
            case 19: goto L14;
            case 20: goto L12;
            default: goto L4;
        };
    L4:
        wf2 r3 = new wf2();
        this.o = r3;
        if (r3.o == false) goto L8;
        return;
    L8:
        if (r3.p == false) goto L10;
        po3.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
    L10:
        r3.a();
        r3.p = true;
        return;
    L12:
        this.o = AppDatabase.y().G();
        return;
    L14:
        this.o = new LinkedHashMap();
        return;
    L16:
        this.o = new xe2(null);
        return;
    L18:
        this.o = new Bundle();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.util.ArrayList A(defpackage.pz1 r22, java.lang.String r23) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR (r2v0 ?? I:java.util.ArrayList) =  A[DECLARE_VAR, MD:():void (c)] (LINE:7) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR in method: pz1.A(pz1, java.lang.String):java.util.ArrayList, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:348)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.ArgType.getPrimitiveType()" because "type" is null
            	at jadx.core.codegen.ClassGen.useType(ClassGen.java:564)
            	at jadx.core.codegen.InsnGen.useType(InsnGen.java:269)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:166)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:159)
            	at jadx.core.codegen.InsnGen.assignVar(InsnGen.java:152)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:299)
            	... 11 more
            */
        /*
            Method dump skipped, instruction units count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz1.A(pz1, java.lang.String):java.util.ArrayList");
    }

    private final void w(Call r1, Throwable r2) {
    }

    private final void x() {
    }

    public gp3 B(rf2 r42, ra r43) {
        xe2 r1 = (xe2) this.o;
        List r3 = (List) r42.n;
        xe2 r2 = new xe2(r3.size());
        int r4 = r3.size();
        int r6 = 0;
    L3:
        if (r6 >= r4) goto L14;
        qn3 r7 = (qn3) r3.get(r6);
        long r8 = r7.a;
        pn3 r10 = (pn3) r1.b(r8);
        if (r10 != null) goto L7;
        long r11 = r7.b;
        long r25 = r11;
        long r27 = r7.d;
        boolean r29 = false;
    L8:
        long r12 = r7.a;
        int r15 = r6;
        List r39 = r3;
        int r40 = r4;
        r2.f(r12, new on3(r12, r7.b, r7.d, r7.e, r7.f, r25, r27, r29, r7.g, r7.i, r7.j, r7.k, r7.l, r7.m));
        boolean r5 = r7.e;
        if (r5 == false) goto L11;
        r1.f(r8, new pn3(r7.b, r7.c, r5));
    L12:
        r6 = r15 + 1;
        r3 = r39;
        r4 = r40;
        goto L3
    L11:
        r1.g(r8);
        goto L12
    L7:
        long r13 = r10.a;
        boolean r14 = r10.c;
        r25 = r13;
        r29 = r14;
        r27 = r43.E(r10.b);
        goto L8
    L14:
        return new gp3(11, r2, r42);
    }

    public void C(String r3, Bitmap r4) {
        Integer r0 = (Integer) eo2.q.get(r3);
        if (r0 != null) goto L5;
    L9:
        ((Bundle) this.o).putParcelable(r3, r4);
        return;
    L5:
        if (r0.intValue() == 2) goto L9;
        kf2.n(xa3.h("The ", r3, " key cannot be used to put a Bitmap"));
    }

    public void D(String r2, long r3) {
        Integer r0 = (Integer) eo2.q.get(r2);
        if (r0 != null) goto L5;
    L9:
        ((Bundle) this.o).putLong(r2, r3);
        return;
    L5:
        if (r0.intValue() == 0) goto L9;
        kf2.n(xa3.h("The ", r2, " key cannot be used to put a long"));
    }

    public void E(String r7, mu3 r8) {
        float r0 = r8.o;
        Integer r1 = (Integer) eo2.q.get(r7);
        if (r1 != null) goto L5;
    L9:
        Bundle r6 = (Bundle) this.o;
        if (r8.p != null) goto L35;
        boolean r2 = r8.c();
        int r3 = r8.n;
        if (r2 == false) goto L34;
        boolean r4 = true;
        switch(r3) {
            case 1: goto L29;
            case 2: goto L24;
            case 3: goto L22;
            case 4: goto L22;
            case 5: goto L22;
            case 6: goto L17;
            default: goto L15;
        };
    L15:
        Object r9 = null;
    L36:
        r6.putParcelable(r7, (Parcelable) r9);
        return;
    L22:
        r8.p = Rating.newStarRating(r3, r8.b());
        goto L35
    L29:
        if (r3 == 1) goto L32;
    L30:
        r4 = false;
    L33:
        r8.p = Rating.newHeartRating(r4);
        goto L35
    L32:
        if (r0 != 1.0f) goto L30;
    L17:
        if (r3 == 6) goto L19;
    L20:
        r0 = -1.0f;
    L21:
        r8.p = Rating.newPercentageRating(r0);
        goto L35
    L19:
        if (r8.c() == true) goto L21;
    L24:
        if (r3 == 2) goto L27;
    L25:
        r4 = false;
    L28:
        r8.p = Rating.newThumbRating(r4);
        goto L35
    L27:
        if (r0 != 1.0f) goto L25;
    L34:
        r8.p = Rating.newUnratedRating(r3);
    L35:
        r9 = r8.p;
        goto L36
    L5:
        if (r1.intValue() == 3) goto L9;
        kf2.n(xa3.h("The ", r7, " key cannot be used to put a Rating"));
    }

    public void F(String r3, String r4) {
        Integer r0 = (Integer) eo2.q.get(r3);
        if (r0 != null) goto L5;
    L9:
        ((Bundle) this.o).putCharSequence(r3, r4);
        return;
    L5:
        if (r0.intValue() == 1) goto L9;
        kf2.n(xa3.h("The ", r3, " key cannot be used to put a String"));
    }

    public void G(CharSequence r3, String r4) {
        Integer r0 = (Integer) eo2.q.get(r4);
        if (r0 != null) goto L5;
    L9:
        ((Bundle) this.o).putCharSequence(r4, r3);
        return;
    L5:
        if (r0.intValue() == 1) goto L9;
        kf2.n(xa3.h("The ", r4, " key cannot be used to put a CharSequence"));
    }

    public Object H(y00 r21, gf1 r22) {
        if (((rp) this.o) != null) goto L6;
        oo3.b("Called runAndWatch on a manager that has been disposed of");
    L6:
        rp r2 = (rp) this.o;
        if ((r2 instanceof jf4) == false) goto L36;
        jf4 r3 = (jf4) r2;
        y94 r4 = r3.f;
        if (r4 == null) goto L36;
        if (r4.equals(r21) == true) goto L36;
        kz2 r5 = new kz2();
        y94 r6 = r3.f;
        if (r6 != null) goto L16;
        oo3.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
    L16:
        x03 r7 = r3.d;
        ArrayList r8 = r5.c;
        if (r7 != null) goto L19;
        Object r9 = r3.b;
        r9.getClass();
        r8.add(new hz2(r9, r6));
    L35:
        r5.f();
        r3.h();
        this.o = r5;
        goto L36
    L19:
        Object[] r10 = r7.b;
        long[] r11 = r7.a;
        int r12 = r11.length - 2;
        if (r12 < 0) goto L35;
        int r13 = 0;
    L22:
        long r14 = r11[r13];
        if (((((~r14) << 7) & r14) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L33;
        int r15 = 8;
        int r16 = 8 - ((~(r13 - r12)) >>> 31);
        int r17 = 0;
    L25:
        if (r17 >= r16) goto L32;
        if ((r14 & 255) >= 128) goto L30;
        r8.add(new hz2(r10[(r13 << 3) + r17], r6));
    L30:
        r14 = r14 >> r15;
        r17 = r17 + 1;
        r15 = r15;
        goto L25
    L32:
        if (r16 != r15) goto L35;
    L33:
        if (r13 == r12) goto L35;
        r13 = r13 + 1;
    L36:
        rp r0 = (rp) this.o;
        r0.getClass();
        ch4 r18 = jh4.j().u(r0.m(r21));
        r0.e(r21);
        ch4 r1 = r18.j();     // Catch: Throwable -> L42
        Object r19 = r22.invoke();     // Catch: Throwable -> L44
        ch4.q(r1);     // Catch: Throwable -> L42
        r18.c();
        r0.f();
        return r19;
    L44:
        th = move-exception;
        ch4.q(r1);     // Catch: Throwable -> L42
        throw th;     // Catch: Throwable -> L42
    L42:
        th = move-exception;
        r18.c();
        throw th;
    }

    public void I(String r2, Bundle r3) {
        if (r2 != null) goto L5;
    L12:
        ((MediaController.TransportControls) this.o).sendCustomAction(r2, r3);
        return;
    L5:
        if (r2.equals("android.support.v4.media.session.action.FOLLOW") == false) goto L7;
    L9:
        if (r3 != null) goto L11;
    L14:
        kf2.n(xa3.h("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", r2, "."));
        return;
    L11:
        if (r3.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE") == false) goto L14;
    L7:
        if (r2.equals("android.support.v4.media.session.action.UNFOLLOW") == true) goto L9;
        goto L9
    }

    public void J(float r3) {
        if (r3 == 0.0f) goto L6;
        Bundle r0 = new Bundle();
        r0.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", r3);
        I("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", r0);
        return;
    L6:
        kf2.n("speed must not be zero");
    }

    @Override // defpackage.u55
    public int a(View r1) {
        nw3 r0 = (nw3) r1.getLayoutParams();
        return mw3.A(r1) - ((ViewGroup.MarginLayoutParams) r0).leftMargin;
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object r2) {
        Map.Entry r3 = (Map.Entry) r2;
        jg2 r1 = (jg2) this.o;
        r1.getClass();
        r3.getClass();
        return new hg2(r3, r1);
    }

    @Override // defpackage.y34
    public x34 b(String r1) {
        r1.getClass();
        return new po4(((so4) this.o).z());
    }

    @Override // defpackage.ck2
    public void c(Bundle r1) {
        ((MediaCodec) this.o).setParameters(r1);
    }

    @Override // defpackage.u55
    public int d() {
        return ((mw3) this.o).F();
    }

    @Override // defpackage.ck2
    public void e(int r8, fg0 r9, long r10, int r12) {
        ((MediaCodec) this.o).queueSecureInputBuffer(r8, 0, r9.i, r10, r12);
    }

    @Override // defpackage.ck2
    public void f(int r8, int r9, int r10, long r11) {
        ((MediaCodec) this.o).queueInputBuffer(r8, 0, r9, r11, r10);
    }

    @Override // defpackage.ck2
    public void flush() {
    }

    @Override // defpackage.lm3
    public void g() {
        int r1 = 0;
        switch(this.n) {
            case 12: goto L9;
            default: goto L4;
        };
    L4:
        MainActivity r3 = (MainActivity) this.o;
        if (r3.R == null) goto L15;
        Toast.makeText(r3, R.string.song_bottom_sheet_undo_failure, 0).show();
        return;
    L15:
        return;
    L9:
        sl3 r0 = (sl3) this.o;
        if (r0.y() == true) goto L12;
        return;
    L12:
        if (r0.n() == null) goto L17;
        r0.X().runOnUiThread(new rl3(this, r1));
        return;
    }

    @Override // defpackage.kg1
    public void h(Object r1) {
        ((lb4) this.o).l(((cw2) r1).a);
    }

    @Override // defpackage.c11
    public boolean i(Object r5, File r6, db3 r7) {
        InputStream r8 = (InputStream) r5;
        qj0 r4 = (qj0) this.o;
        byte[] r0 = (byte[]) r4.d(65536, byte[].class);
        FileOutputStream r2 = null;
        FileOutputStream r3 = new FileOutputStream(r6);     // Catch: Throwable -> L14 IOException -> L16
    L41:
        int r9 = r8.read(r0);     // Catch: Throwable -> L7 IOException -> L9
        if (r9 == (-1)) goto L11;
        r3.write(r0, 0, r9);     // Catch: Throwable -> L7 IOException -> L9
        goto L41
    L11:
        r3.close();     // Catch: Throwable -> L7 IOException -> L9
        r3.close();     // Catch: IOException -> L29
    L13:
        r4.h(r0);
        return true;
    L9:
        e = e;
        r2 = r3;
    L19:
        if (Log.isLoggable("StreamEncoder", 3) == false) goto L21;
        Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);     // Catch: Throwable -> L14
    L21:
        if (r2 != null) goto L32;
    L23:
        r4.h(r0);
        return false;
    L32:
        r2.close();     // Catch: IOException -> L31
    L7:
        th = th;
        r2 = r3;
    L25:
        if (r2 != null) goto L37;
    L27:
        r4.h(r0);
        throw th;
    L37:
        r2.close();     // Catch: IOException -> L30
    L16:
        e = e;
    L14:
        th = th;
        goto L25
    }

    @Override // defpackage.ck2
    public void j() {
    }

    @Override // defpackage.u55
    public int k() {
        mw3 r1 = (mw3) this.o;
        return r1.n - r1.G();
    }

    @Override // defpackage.ou2
    public boolean m(qu2 r1, MenuItem r2) {
        return false;
    }

    public void n(jw2 r4) {
        r4.getClass();
        int r0 = r4.a;
        int r1 = r4.b;
        LinkedHashMap r3 = (LinkedHashMap) this.o;
        Integer r2 = Integer.valueOf(r0);
        Object r5 = r3.get(r2);
        if (r5 != null) goto L5;
        r5 = new TreeMap();
        r3.put(r2, r5);
    L5:
        TreeMap r6 = (TreeMap) r5;
        if (r6.containsKey(Integer.valueOf(r1)) == false) goto L8;
        Log.w("ROOM", "Overriding migration " + r6.get(Integer.valueOf(r1)) + " with " + r4);
    L8:
        r6.put(Integer.valueOf(r1), r4);
    }

    @Override // defpackage.kg1
    public void o(Throwable r1) {
        ((lb4) this.o).m(r1);
    }

    @Override // com.eddyizm.tempus.interfaces.ScanCallback
    public void onError(Exception r2) {
        ((vb4) this.o).h0("scan_library").x(r2.getMessage());
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r2, Throwable r3) {
        switch(this.n) {
            case 13: goto L8;
            case 14: goto L6;
            default: goto L4;
        };
    L4:
        ((gu3) this.o).g.k("Network error: " + r3.getMessage());
        return;
    L6:
        Log.e("PodcastChannelPageViewModel", "downloadPodcastEpisode network error", r3);
        return;
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r3, Response r4) {
        switch(this.n) {
            case 13: goto L31;
            case 14: goto L20;
            default: goto L4;
        };
    L4:
        gu3 r2 = (gu3) this.o;
        if (r4.code() != 501) goto L8;
        Application r5 = r2.b;
        r5.getClass();
        r2.g.k(r5.getString(R.string.radio_dialog_not_supported_snackbar));
        return;
    L8:
        if (r4.isSuccessful() == true) goto L10;
    L17:
        r2.g.k("HTTP error: " + r4.code());
        return;
    L10:
        if (r4.body() == null) goto L17;
        ApiResponse r6 = (ApiResponse) r4.body();
        String r7 = r6.getSubsonicResponse().getStatus();
        if ("ok".equals(r7) == false) goto L15;
        r2.f.k(Boolean.TRUE);
        return;
    L15:
        if ("failed".equals(r7) == false) goto L36;
        gu3.c(r2, r6);
        return;
    L36:
        return;
    L20:
        if (r4.isSuccessful() == true) goto L22;
    L28:
        Log.e("PodcastChannelPageViewModel", "downloadPodcastEpisode failed with code: " + r4.code());
        return;
    L22:
        if (r4.body() == null) goto L28;
        if (((ApiResponse) r4.body()).getSubsonicResponse() == null) goto L28;
        if ("ok".equals(((ApiResponse) r4.body()).getSubsonicResponse().getStatus()) == false) goto L28;
        Log.d("PodcastChannelPageViewModel", "downloadPodcastEpisode successful for id: " + ((PodcastEpisode) this.o).getId());
        return;
    L31:
        if (mm3.f(r4) == false) goto L39;
        ((mm3) this.o).g();
        return;
    }

    @Override // defpackage.lm3
    public void onSuccess() {
        switch(this.n) {
            case 12: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        sl3 r0 = (sl3) this.o;
        if (r0.y() == true) goto L8;
        return;
    L8:
        if (r0.n() == null) goto L12;
        r0.X().runOnUiThread(new rl3(this, 1));
        return;
    }

    @Override // defpackage.cq0
    public boolean p(float r4) {
        RecyclerView r3 = (RecyclerView) this.o;
        if (r3.A.e() == false) goto L6;
        int r0 = (int) r4;
        int r5 = 0;
    L9:
        if (r5 != 0) goto L12;
        if (r0 != 0) goto L12;
        return false;
    L12:
        r3.r0();
        return r3.J(r5, r0, 0, Integer.MAX_VALUE);
    L6:
        if (r3.A.d() == false) goto L8;
        r5 = (int) r4;
        r0 = 0;
        goto L9
    L8:
        r5 = 0;
        r0 = 0;
        goto L9
    }

    @Override // defpackage.u55
    public View q(int r1) {
        return ((mw3) this.o).u(r1);
    }

    @Override // defpackage.u55
    public int r(View r1) {
        nw3 r0 = (nw3) r1.getLayoutParams();
        return mw3.B(r1) + ((ViewGroup.MarginLayoutParams) r0).rightMargin;
    }

    @Override // defpackage.cq0
    public float s() {
        RecyclerView r1 = (RecyclerView) this.o;
        if (r1.A.e() == false) goto L8;
        float r2 = r1.p0;
    L6:
        return -r2;
    L8:
        if (r1.A.d() == false) goto L10;
        r2 = r1.o0;
        goto L6
    L10:
        return 0.0f;
    }

    @Override // defpackage.ck2
    public void shutdown() {
    }

    @Override // defpackage.ck2
    public void start() {
    }

    @Override // defpackage.cq0
    public void t() {
        ((RecyclerView) this.o).r0();
    }

    public void u(StringBuilder r4, Iterator r5) {
        uc0 r3 = (uc0) this.o;
        if (r5.hasNext() == false) goto L8;
        Map.Entry r0 = (Map.Entry) r5.next();
        r4.append(r3.c(r0.getKey()));
        r4.append("=");
        r4.append(r3.c(r0.getValue()));
    L6:
        if (r5.hasNext() == false) goto L10;
        r4.append(r3.o);
        Map.Entry r1 = (Map.Entry) r5.next();
        r4.append(r3.c(r1.getKey()));
        r4.append("=");
        r4.append(r3.c(r1.getValue()));
        goto L6
    L10:
        return;
    }

    public void v() {
        TypedValue r0 = new TypedValue();
        df r4 = (df) this.o;
        Resources.Theme r1 = r4.getTheme();
        r1.resolveAttribute(R.attr.windowSplashScreenBackground, r0, true);
        if (r1.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, r0, true) == false) goto L5;
        r1.getDrawable(r0.resourceId);
    L5:
        r1.resolveAttribute(R.attr.splashScreenIconSize, r0, true);
        if (r1.resolveAttribute(R.attr.postSplashScreenTheme, r0, true) == false) goto L11;
        int r2 = r0.resourceId;
        if (r2 == 0) goto L12;
        r4.setTheme(r2);
        return;
    L12:
        return;
    }

    @Override // defpackage.ou2
    public void y(qu2 r3) {
        Toolbar r2 = (Toolbar) this.o;
        y4 r0 = r2.n.G;
        if (r0 != null) goto L5;
    L7:
        Iterator r1 = ((CopyOnWriteArrayList) r2.T.p).iterator();
    L9:
        if (r1.hasNext() == false) goto L11;
        ((cd1) r1.next()).a.s();
    L11:
        si1 r4 = r2.e0;
        if (r4 == null) goto L16;
        r4.y(r3);
        return;
    L16:
        return;
    L5:
        if (r0.k() == false) goto L7;
        goto L7
    }

    @Override // defpackage.ci
    public Object z(q64 r8, Float r9, Float r10, if1 r11, vg4 r12) {
        float r2 = r9.floatValue();
        float r13 = r10.floatValue();
        xd r3 = j51.a(0.0f, r13, 28);
        float r14 = Math.abs(r2);
        Object r7 = su3.d(r8, Math.signum(r13) * r14, r2, r3, (ck4) this.o, r11, r12);
        if (r7 != xe0.n) goto L6;
        return r7;
    L6:
        return (ud) r7;
    }

    @Override // com.eddyizm.tempus.interfaces.ScanCallback
    public void onSuccess(boolean r2, long r3) {
        vb4 r1 = (vb4) this.o;
        r1.h0("scan_library").x(r1.t(R.string.settings_scan_result, new Object[]{Long.valueOf(r3)}));
        if (r2 == false) goto L6;
        vb4.k0(r1);
        return;
    }

    public /* synthetic */ pz1(int r1, boolean r2) {
        this.n = r1;
    }

    public pz1(so4 r2) {
        this.n = 26;
        r2.getClass();
        this.o = r2;
    }

    public pz1(View r2) {
        this.n = 0;
        this.o = r2;
        wc r3 = new wc(8, this);
        rr2.K(b92.n, r3);
    }

    public /* synthetic */ pz1(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    public pz1(PlayerControllerFragment r1, bj2 r2) {
        this.n = 11;
        this.o = r1;
    }
}
