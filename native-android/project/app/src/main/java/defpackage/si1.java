package defpackage;

import android.app.Application;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.database.converter.StringListConverter$fromString$listType$1;
import com.eddyizm.tempus.interfaces.MediaIndexCallback;
import com.eddyizm.tempus.interfaces.PlaylistCallback;
import com.eddyizm.tempus.radiobrowser.RadioBrowserCountry;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.textfield.TextInputEditText;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class si1 implements be0, zy3, PointerInputEventHandler, eh2, rm, er2, ou2, MediaIndexCallback, PlaylistCallback, Callback, f4 {
    public final /* synthetic */ int n;
    public Object o;

    public si1(int r4) {
        this.n = r4;
        switch(r4) {
            case 3: goto L16;
            case 5: goto L14;
            case 11: goto L12;
            case 23: goto L10;
            case 25: goto L8;
            case 27: goto L6;
            default: goto L4;
        };
    L4:
        this.o = new ConcurrentHashMap();
        return;
    L6:
        this.o = new SparseArray();
        return;
    L8:
        this.o = new nk1();
        return;
    L10:
        this.o = new Region();
        return;
    L12:
        this.o = new rw2(500);
        return;
    L14:
        this.o = new LinkedHashMap(0, 0.75f, true);
        return;
    L16:
        this.o = yw1.j();
    }

    private final void J(Call r1, Throwable r2) {
    }

    private final void K(qu2 r1) {
    }

    public void C(b6 r3) {
        RecyclerView r2 = (RecyclerView) this.o;
        int r0 = r3.a;
        if (r0 != 1) goto L5;
        r2.A.Z(r3.b, r3.d);
        return;
    L5:
        if (r0 != 2) goto L7;
        r2.A.c0(r3.b, r3.d);
        return;
    L7:
        if (r0 != 4) goto L9;
        r2.A.d0(r3.b, r3.d);
        return;
    L9:
        if (r0 == 8) goto L11;
        return;
    L11:
        r2.A.b0(r3.b, r3.d);
    }

    public cx3 D(int r7) {
        RecyclerView r6 = (RecyclerView) this.o;
        int r0 = r6.s.k();
        int r2 = 0;
        cx3 r3 = null;
    L3:
        if (r2 >= r0) goto L16;
        cx3 r4 = RecyclerView.N(r6.s.j(r2));
        if (r4 == null) goto L15;
        if (r4.j() == true) goto L15;
        if (r4.c != r7) goto L15;
        ew4 r5 = r6.s;
        if (((ArrayList) r5.r).contains(r4.a) == false) goto L14;
        r3 = r4;
        goto L15
    L14:
        r3 = r4;
    L15:
        r2 = r2 + 1;
    L16:
        if (r3 == null) goto L23;
        ew4 r8 = r6.s;
        if (((ArrayList) r8.r).contains(r3.a) == true) goto L21;
        return r3;
    L21:
        if (RecyclerView.Q0 == false) goto L23;
        Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
    L23:
        return null;
    }

    public List E(String r2) {
        if (r2 != null) goto L5;
        return null;
    L5:
        Type r0 = new StringListConverter$fromString$listType$1().getType();
        return (List) ((nk1) this.o).f(r2, r0);
    }

    public void F(int r8, int r9, Object r10) {
        RecyclerView r7 = (RecyclerView) this.o;
        int r0 = r7.s.k();
        int r11 = r9 + r8;
        int r1 = 0;
    L4:
        if (r1 >= r0) goto L24;
        View r4 = r7.s.j(r1);
        cx3 r5 = RecyclerView.N(r4);
        if (r5 == null) goto L23;
        if (r5.q() == true) goto L23;
        int r6 = r5.c;
        if (r6 < r8) goto L23;
        if (r6 >= r11) goto L23;
        r5.a(2);
        if (r10 != null) goto L17;
        r5.a(1024);
    L22:
        ((nw3) r4.getLayoutParams()).c = true;
        goto L23
    L17:
        if ((1024 & r5.j) != 0) goto L22;
        if (r5.k != null) goto L21;
        ArrayList r2 = new ArrayList();
        r5.k = r2;
        r5.l = Collections.unmodifiableList(r2);
    L21:
        r5.k.add(r10);
    L23:
        r1 = r1 + 1;
        goto L4
    L24:
        hm2 r12 = r7.p;
        ArrayList r3 = (ArrayList) r12.f;
        int r13 = r3.size() - 1;
    L25:
        if (r13 < 0) goto L34;
        cx3 r14 = (cx3) r3.get(r13);
        if (r14 == null) goto L33;
        int r15 = r14.c;
        if (r15 < r8) goto L33;
        if (r15 >= r11) goto L33;
        r14.a(2);
        r12.g(r13);
    L33:
        r13 = r13 - 1;
        goto L25
    L34:
        r7.y0 = true;
    }

    public void G(int r12, int r13) {
        RecyclerView r11 = (RecyclerView) this.o;
        int r0 = r11.s.k();
        int r2 = 0;
    L4:
        if (r2 >= r0) goto L16;
        cx3 r7 = RecyclerView.N(r11.s.j(r2));
        if (r7 == null) goto L15;
        if (r7.q() == true) goto L15;
        if (r7.c < r12) goto L15;
        if (RecyclerView.Q0 == false) goto L14;
        Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + r2 + " holder " + r7 + " now at position " + (r7.c + r13));
    L14:
        r7.n(r13, false);
        r11.u0.f = true;
    L15:
        r2 = r2 + 1;
        goto L4
    L16:
        ArrayList r1 = (ArrayList) r11.p.f;
        int r3 = r1.size();
        int r8 = 0;
    L17:
        if (r8 >= r3) goto L27;
        cx3 r9 = (cx3) r1.get(r8);
        if (r9 == null) goto L26;
        if (r9.c < r12) goto L26;
        if (RecyclerView.Q0 == false) goto L25;
        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + r8 + " holder " + r9 + " now at position " + (r9.c + r13));
    L25:
        r9.n(r13, false);
    L26:
        r8 = r8 + 1;
        goto L17
    L27:
        r11.requestLayout();
        r11.x0 = true;
    }

    public void H(int r14, int r15) {
        RecyclerView r13 = (RecyclerView) this.o;
        int r0 = r13.s.k();
        int r1 = -1;
        if (r14 >= r15) goto L5;
        int r3 = r14;
        int r4 = r15;
        int r5 = -1;
    L6:
        int r7 = 0;
    L8:
        if (r7 >= r0) goto L24;
        cx3 r10 = RecyclerView.N(r13.s.j(r7));
        if (r10 == null) goto L23;
        int r11 = r10.c;
        if (r11 < r3) goto L23;
        if (r11 > r4) goto L23;
        if (RecyclerView.Q0 == false) goto L19;
        Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + r7 + " holder " + r10);
    L19:
        if (r10.c != r14) goto L21;
        r10.n(r15 - r14, false);
    L22:
        r13.u0.f = true;
        goto L23
    L21:
        r10.n(r5, false);
    L23:
        r7 = r7 + 1;
        goto L8
    L24:
        ArrayList r2 = (ArrayList) r13.p.f;
        if (r14 >= r15) goto L27;
        int r6 = r14;
        int r8 = r15;
    L28:
        int r9 = r2.size();
        int r12 = 0;
    L29:
        if (r12 >= r9) goto L43;
        cx3 r16 = (cx3) r2.get(r12);
        if (r16 == null) goto L42;
        int r17 = r16.c;
        if (r17 < r6) goto L42;
        if (r17 > r8) goto L42;
        if (r17 != r14) goto L38;
        r16.n(r15 - r14, false);
    L40:
        if (RecyclerView.Q0 == false) goto L42;
        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + r12 + " holder " + r16);
        goto L42
    L38:
        r16.n(r1, false);
    L42:
        r12 = r12 + 1;
        goto L29
    L43:
        r13.requestLayout();
        r13.x0 = true;
        return;
    L27:
        r8 = r14;
        r6 = r15;
        r1 = 1;
        goto L28
    L5:
        r4 = r14;
        r3 = r15;
        r5 = 1;
        goto L6
    }

    public void I(Bundle r2, Bundle r3) {
        Bundle r0 = new Bundle(r2);
        r0.putAll(r3);
        ((lb4) this.o).l(new ab4(-1, r0));
    }

    public void L(k02 r4) {
        ((Region) this.o).set(r4.a, r4.b, r4.c, r4.d);
    }

    @Override // defpackage.rm
    public void a(long r4) {
        bk2 r3 = (bk2) this.o;
        r3.g1 = true;
        xc5 r5 = r3.V0;
        Handler r0 = (Handler) r5.o;
        if (r0 == null) goto L6;
        r0.post(new mm(r5, r4, 0));
        return;
    }

    @Override // defpackage.zy3
    public void accept(Object r3, Object r4) {
        GetCredentialRequest r2 = (GetCredentialRequest) this.o;
        t02 r0 = new t02((cr4) r4);
        fu1 r5 = (fu1) ((hu1) ((sv1) r3).e());
        Parcel r6 = Parcel.obtain();
        r6.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int r1 = bi5.a;
        r6.writeStrongBinder(r0);
        r6.writeInt(1);
        r2.writeToParcel(r6, 0);
        Parcel r7 = Parcel.obtain();
        r5.e.transact(1, r6, r7, 0);     // Catch: Throwable -> L6
        r7.readException();     // Catch: Throwable -> L6
        r6.recycle();
        r7.recycle();
        return;
    L6:
        th = move-exception;
        r6.recycle();
        r7.recycle();
        throw th;
    }

    @Override // defpackage.rm
    public void b(int r4) {
        bk2 r3 = (bk2) this.o;
        if (Build.VERSION.SDK_INT < 35) goto L7;
        ns3 r0 = r3.X0;
        if (r0 == null) goto L7;
        r0.f(r4);
    L7:
        xc5 r5 = r3.V0;
        Handler r1 = (Handler) r5.o;
        if (r1 == null) goto L11;
        r1.post(new ul(r4, 1, r5));
        return;
    }

    @Override // defpackage.rm
    public void d(boolean r4) {
        xc5 r3 = ((bk2) this.o).V0;
        Handler r0 = (Handler) r3.o;
        if (r0 == null) goto L6;
        r0.post(new pm(r3, r4, 0));
        return;
    }

    @Override // defpackage.rm
    public void f(pa r4) {
        xc5 r3 = ((bk2) this.o).V0;
        Handler r0 = (Handler) r3.o;
        if (r0 == null) goto L6;
        r0.post(new nm(r3, r4, 0));
        return;
    }

    @Override // defpackage.rm
    public void g(Exception r4) {
        l93.G("MediaCodecAudioRenderer", "Audio sink error", r4);
        xc5 r3 = ((bk2) this.o).V0;
        Handler r0 = (Handler) r3.o;
        if (r0 == null) goto L6;
        r0.post(new jm(r3, r4, 1));
        return;
    }

    @Override // defpackage.f4
    public boolean h(View r4) {
        SwipeDismissBehavior r3 = (SwipeDismissBehavior) this.o;
        boolean r1 = false;
        if (r3.w(r4) == false) goto L18;
        WeakHashMap r0 = j65.a;
        if (r4.getLayoutDirection() != 1) goto L7;
        r1 = true;
    L7:
        int r2 = r3.r;
        if (r2 != 0) goto L10;
        if (r1 == false) goto L10;
    L12:
        int r5 = -r4.getWidth();
    L14:
        r4.offsetLeftAndRight(r5);
        r4.setAlpha(0.0f);
        zg5 r6 = r3.o;
        if (r6 == null) goto L17;
        r6.y(r4);
    L17:
        return true;
    L10:
        if (r2 != 1) goto L13;
        if (r1 == false) goto L12;
    L13:
        r5 = r4.getWidth();
        goto L14
    L18:
        return false;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public Object invoke(sn3 r4, vd0 r5) {
        Object r3 = te5.j(new p(r4, (lm0) this.o, null, 10), r5);
        if (r3 != xe0.n) goto L6;
        return r3;
    L6:
        return j15.a;
    }

    @Override // defpackage.rm
    public void j(pa r4) {
        xc5 r3 = ((bk2) this.o).V0;
        Handler r0 = (Handler) r3.o;
        if (r0 == null) goto L6;
        r0.post(new nm(r3, r4, 1));
        return;
    }

    @Override // defpackage.ou2
    public boolean m(qu2 r2, MenuItem r3) {
        switch(this.n) {
            case 12: goto L5;
            default: goto L4;
        };
    L4:
        return false;
    L5:
        q33 r1 = ((BottomNavigationView) this.o).r;
        if (r1 != null) goto L8;
        return false;
    L8:
        if (r1.a(r3) == true) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // defpackage.rm
    public void n() {
        ((bk2) this.o).f1 = true;
    }

    @Override // defpackage.rm
    public void o() {
        k41 r1 = ((bk2) this.o).V;
        if (r1 == null) goto L6;
        r1.a.g0 = true;
        return;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r2, Throwable r3) {
        switch(this.n) {
            case 16: goto L8;
            case 17: goto L4;
            case 18: goto L10;
            case 19: goto L6;
            default: goto L4;
        };
    L4:
        ((mb4) this.o).onError(new Exception(r3.getMessage()));
        return;
    L6:
        ((gu3) this.o).g.k("Network error: " + r3.getMessage());
        return;
    L8:
        Application r1 = ((um3) this.o).b;
        r1.getClass();
        Toast.makeText(r1, "Network error: " + r3.getMessage(), 1).show();
        return;
    }

    @Override // com.eddyizm.tempus.interfaces.MediaIndexCallback
    public void onRecovery(int r2) {
        xk3 r1 = (xk3) this.o;
        int r0 = r1.d();
        lo r3 = r1.u;
        if (r0 >= r2) goto L6;
        ((TextView) r3.k).setAlpha(0.2f);
        ((TextView) r3.j).setAlpha(0.2f);
        ((ConstraintLayout) r3.m).setAlpha(0.2f);
        return;
    L6:
        ((TextView) r3.k).setAlpha(1.0f);
        ((TextView) r3.j).setAlpha(1.0f);
        ((ConstraintLayout) r3.m).setAlpha(1.0f);
    }

    @Override // com.eddyizm.tempus.interfaces.PlaylistCallback
    public void onRenamed(String r2) {
        PlaylistPageFragment r1 = (PlaylistPageFragment) this.o;
        r1.n0.e.setName(r2);
        yd1 r0 = r1.l0;
        if (r0 == null) goto L6;
        r0.a.setTitle(r2);
        r1.l0.j.setText(r2);
        return;
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r5, Response r6) {
        switch(this.n) {
            case 16: goto L52;
            case 17: goto L4;
            case 18: goto L29;
            case 19: goto L17;
            default: goto L4;
        };
    L4:
        mb4 r4 = (mb4) this.o;
        if (r6.isSuccessful() == true) goto L7;
        return;
    L7:
        if (r6.body() != null) goto L9;
        return;
    L9:
        if (((ApiResponse) r6.body()).getSubsonicResponse() != null) goto L11;
        return;
    L11:
        if (((ApiResponse) r6.body()).getSubsonicResponse().getError() == null) goto L14;
        r4.onError(new Exception(((ApiResponse) r6.body()).getSubsonicResponse().getError().getMessage()));
        return;
    L14:
        if (((ApiResponse) r6.body()).getSubsonicResponse().getScanStatus() == null) goto L83;
        r4.onSuccess(((ApiResponse) r6.body()).getSubsonicResponse().getScanStatus().isScanning(), ((ApiResponse) r6.body()).getSubsonicResponse().getScanStatus().getCount().longValue());
        return;
    L83:
        return;
    L17:
        gu3 r7 = (gu3) this.o;
        if (r6.isSuccessful() == true) goto L20;
    L27:
        r7.g.k("HTTP error: " + r6.code());
        return;
    L20:
        if (r6.body() == null) goto L27;
        ApiResponse r8 = (ApiResponse) r6.body();
        String r9 = r8.getSubsonicResponse().getStatus();
        if ("ok".equals(r9) == false) goto L25;
        r7.f.k(Boolean.TRUE);
        return;
    L25:
        if ("failed".equals(r9) == false) goto L85;
        gu3.c(r7, r8);
        return;
    L85:
        return;
    L29:
        eu3 r10 = (eu3) this.o;
        ArrayList r11 = r10.K0;
        if (r10.y() == true) goto L32;
        return;
    L32:
        if (r10.J0 != null) goto L35;
        return;
    L35:
        if (r6.isSuccessful() == true) goto L37;
        return;
    L37:
        if (r6.body() == null) goto L89;
        r11.clear();
        Iterator r12 = ((List) r6.body()).iterator();
    L40:
        if (r12.hasNext() == false) goto L44;
        RadioBrowserCountry r0 = (RadioBrowserCountry) r12.next();
        if (r0.stationCount <= 0) goto L40;
        r11.add(r0.name);
        goto L40
    L44:
        Collections.sort(r11, String.CASE_INSENSITIVE_ORDER);
        if (((ListView) r10.J0.g).getVisibility() == 0) goto L47;
        return;
    L47:
        if (((TextInputEditText) r10.J0.e).getText() == null) goto L49;
        String r13 = ((TextInputEditText) r10.J0.e).getText().toString();
    L50:
        r10.o0(r13);
        return;
    L49:
        r13 = "";
        goto L50
    L89:
        return;
    L52:
        um3 r14 = (um3) this.o;
        if (r6.code() != 501) goto L56;
        Application r15 = r14.b;
        r15.getClass();
        Toast.makeText(r15, "Podcasts are not supported by this server", 1).show();
        return;
    L56:
        if (r6.isSuccessful() == true) goto L58;
    L62:
        r14.getClass();
        String r16 = "HTTP error: " + r6.code();
        if (r6.errorBody() != null) goto L72;
    L70:
        Application r17 = r14.b;
        r17.getClass();
        Toast.makeText(r17, r16, 1).show();
        return;
    L72:
        String r18 = r6.errorBody().string();     // Catch: IOException -> L68
        if (r18.isEmpty() == true) goto L70;
        r16 = r16 + " - " + r18;     // Catch: IOException -> L68
    L68:
        e = move-exception;
        Log.e("PodcastChannelBottomSheetViewModel", "Error reading error body", e);
        goto L70
    L58:
        if (r6.body() == null) goto L62;
        if ("ok".equals(((ApiResponse) r6.body()).getSubsonicResponse().getStatus()) == false) goto L93;
        Application r19 = r14.b;
        r19.getClass();
        Toast.makeText(r19, "Podcast channel deleted", 0).show();
        return;
    }

    @Override // defpackage.be0
    public void p(gr1 r6, List r7) {
        r6.getClass();
        CookieManager r0 = CookieManager.getInstance();     // Catch: Throwable -> L5
    L7:
        Iterator r8 = r7.iterator();
    L9:
        if (r8.hasNext() == false) goto L20;
        ae0 r1 = (ae0) r8.next();
        if (r0 != null) goto L12;
        ConcurrentHashMap r2 = (ConcurrentHashMap) this.o;
        String r3 = r6.d;
        Object r4 = r2.get(r3);
        if (r4 != null) goto L19;
        r4 = new ConcurrentHashMap();
        Object r5 = r2.putIfAbsent(r3, r4);
        if (r5 == null) goto L19;
        r4 = r5;
    L19:
        ((Map) r4).put(r1.a, r1);
        goto L9
    L12:
        r0.setCookie(r6.i, r1.toString());
        goto L9
    L20:
        return;
    L5:
        th = move-exception;
        Log.w("HubClient", "WebView cookie store unavailable", th);
        r0 = null;
        goto L7
    }

    @Override // defpackage.rm
    public void q(int r9, long r10, long r12) {
        xc5 r1 = ((bk2) this.o).V0;
        Handler r8 = (Handler) r1.o;
        if (r8 == null) goto L6;
        r8.post(new lm(r1, r9, r10, r12, 0));
        return;
    }

    @Override // defpackage.rm
    public void s() {
        ((bk2) this.o).t();
    }

    @Override // defpackage.rm
    public void u() {
        ((bk2) this.o).d1 = true;
    }

    @Override // defpackage.be0
    public List w(gr1 r9) {
        r9.getClass();
        String r0 = r9.d;
        ArrayList r1 = null;
        CookieManager r2 = CookieManager.getInstance();     // Catch: Throwable -> L5
    L8:
        if (r2 != null) goto L40;
        Map r8 = (Map) ((ConcurrentHashMap) this.o).get(r0);
        if (r8 == null) goto L37;
        Collection r10 = r8.values();
        if (r10 == null) goto L37;
        r1 = new ArrayList();
        Iterator r11 = r10.iterator();
    L15:
        if (r11.hasNext() == false) goto L37;
        Object r3 = r11.next();
        ae0 r4 = (ae0) r3;
        String r5 = r4.d;
        if (r4.i == false) goto L19;
        boolean r6 = h12.c(r0, r5);
    L20:
        if (r6 == false) goto L15;
        String r7 = r4.e;
        String r12 = r9.b();
        if (r12.equals(r7) == true) goto L33;
        if (xm4.k0(r12, r7, false) == false) goto L15;
        if (xm4.e0(r7, "/", false) == true) goto L33;
        if (r12.charAt(r7.length()) != '/') goto L15;
    L33:
        if (r4.f == false) goto L36;
        if (r9.f() == false) goto L15;
    L36:
        r1.add(r3);
        goto L15
    L19:
        Pattern r13 = ae0.k;
        r6 = l93.E(r0, r5);
    L37:
        if (r1 == null) goto L43;
        return r1;
    L43:
        return u01.n;
    L40:
        String r14 = r2.getCookie(r9.i);
        if (r14 == null) goto L43;
        List r15 = qm4.D0(r14, new char[]{';'});
        ArrayList r16 = new ArrayList();
        Iterator r17 = r15.iterator();
    L46:
        if (r17.hasNext() == false) goto L50;
        String r18 = (String) r17.next();
        Pattern r19 = ae0.k;
        ae0 r20 = l93.T(r9, qm4.K0(r18).toString());
        if (r20 == null) goto L46;
        r16.add(r20);
        goto L46
    L50:
        return r16;
    L5:
        th = move-exception;
        Log.w("HubClient", "WebView cookie store unavailable", th);
        r2 = null;
        goto L8
    }

    @Override // defpackage.rm
    public void x() {
        k41 r0 = ((bk2) this.o).V;
        if (r0 == null) goto L6;
        r0.a();
        return;
    }

    @Override // defpackage.ou2
    public void y(qu2 r4) {
        switch(this.n) {
            case 12: goto L11;
            default: goto L4;
        };
    L4:
        cv4 r3 = (cv4) this.o;
        boolean r0 = r3.d.a.p();
        Window.Callback r5 = r3.e;
        if (r0 == false) goto L8;
        r5.onPanelClosed(108, r4);
        return;
    L8:
        if (r5.onPreparePanel(0, null, r4) == false) goto L13;
        r5.onMenuOpened(108, r4);
        return;
    L13:
        return;
    }

    @Override // defpackage.er2
    public void z(int r3, String r4, jn2 r5) {
        pn2 r2 = (pn2) this.o;
        int r6 = 4;
        if (r5 == null) goto L13;
        Bundle r7 = r5.a;
        if (r7 == null) goto L13;
        String r1 = f35.a;
        if (r4 == null) goto L11;
        bq4 r8 = r2.n;
        r8.getClass();
        r8.p(r4, r7);
        ((pn2) r8.q).t.post(new pb0(r8, r4, r7, r6));
        return;
    L11:
        kf2.n("parentId cannot be null in notifyChildrenChanged");
        return;
    L13:
        if (r4 == null) goto L16;
        bq4 r9 = r2.n;
        r9.getClass();
        r9.p(r4, null);
        ((pn2) r9.q).t.post(new pb0(r9, r4, null, r6));
        return;
    L16:
        kf2.n("parentId cannot be null in notifyChildrenChanged");
    }

    public /* synthetic */ si1(int r1, boolean r2) {
        this.n = r1;
    }

    public /* synthetic */ si1(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    public si1(lj2 r1, va4 r2, Bundle r3, lb4 r4) {
        this.n = 7;
        this.o = r4;
    }
}
