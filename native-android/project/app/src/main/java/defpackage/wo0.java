package defpackage;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ImageDecoder;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.AudioFormat;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.FrameLayout;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.media3.common.ParserException;
import androidx.work.impl.WorkDatabase_Impl;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Bookmarks;
import com.eddyizm.tempus.subsonic.models.Child;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class wo0 implements Callback, kg1, vf0, bi0, hu0, zn4 {
    public static final int[] p = null;
    public Object n;
    public Object o;

    static {
        p = new int[]{R.attr.indeterminateDrawable, R.attr.progressDrawable};
    }

    public wo0(pn4 r29, int r30) {
        TimeUnit r4 = TimeUnit.SECONDS;
        TimeUnit r7 = TimeUnit.MINUTES;
        String r11 = "https://localhost/rest/";
        String r12 = "";
        switch(r30) {
            case 20: goto L33;
            default: goto L4;
        };
    L4:
        this.n = r29;
        ok1 r5 = new ok1();
        r5.a(Date.class, new r01());
        r5.a(Bookmarks.class, new lt());
        r5.j = true;
        ArrayList r3 = r5.e;
        int r6 = r3.size();
        ArrayList r15 = r5.f;
        ArrayList r2 = new ArrayList((r15.size() + r6) + 3);
        r2.addAll(r3);
        Collections.reverse(r2);
        ArrayList r8 = new ArrayList(r15);
        Collections.reverse(r8);
        r2.addAll(r8);
        int r9 = r5.g;
        int r10 = r5.h;
        ak0 r13 = bk0.b;
        boolean r16 = gk4.a;
        if (r9 == 2) goto L14;
        if (r10 == 2) goto L14;
        dz4 r14 = r13.a(r9, r10);
        if (r16 == false) goto L10;
        dz4 r17 = gk4.c.a(r9, r10);
        dz4 r18 = gk4.b.a(r9, r10);
    L11:
        r2.add(r14);
        if (r16 == false) goto L14;
        r2.add(r17);
        r2.add(r18);
        goto L14
    L10:
        r18 = null;
        r17 = null;
    L14:
        u21 r19 = r5.a;
        int r20 = r5.c;
        HashMap r21 = new HashMap(r5.d);
        boolean r110 = r5.i;
        boolean r111 = r5.j;
        boolean r112 = r5.k;
        int r22 = r5.b;
        new ArrayList(r3);
        new ArrayList(r15);
        nk1 r113 = new nk1(r19, r20, r21, r110, r111, r112, r22, r2, r5.l, r5.m, new ArrayList(r5.n));
        Retrofit.Builder r23 = new Retrofit.Builder();
        String r1 = r29.j();
        if (r1 == null) goto L17;
        String r24 = qm4.K0(r1).toString();
    L18:
        if (r24 == null) goto L70;
        r12 = r24;
    L70:
        fr1 r25 = new fr1();     // Catch: IllegalArgumentException -> L23
        r25.e(null, r12);     // Catch: IllegalArgumentException -> L23
        gr1 r114 = r25.b();     // Catch: IllegalArgumentException -> L23
    L24:
        if (r114 != null) goto L26;
    L28:
        Retrofit.Builder r26 = r23.baseUrl(r11).addConverterFactory(GsonConverterFactory.create(r113));
        cx r27 = new cx();
        rx r28 = new rx(r27);
        r27.a = 2592000;
        n83 r31 = new n83();
        r31.a(2, r7);
        r31.b(20, r4);
        r31.z = ze5.b(30, r4);
        r31.A = ze5.b(30, r4);
        dr1 r32 = new dr1();
        r32.b = cr1.n;
        r31.c.add(r32);
        r31.c.add(r28);
        File r33 = App.a().getCacheDir();
        r33.getClass();
        r31.l = new hx(r33);
        SSLSocketFactory r34 = x30.b;
        if (r34 == null) goto L31;
        r31.c(r34, x30.a);
    L31:
        Retrofit r35 = r26.client(new o83(r31)).build();
        r35.getClass();
        this.o = (hn3) r35.create(hn3.class);
        return;
    L26:
        if (r114.d.length() <= 0) goto L28;
        r11 = r12;
    L23:
        r114 = null;
        goto L24
    L17:
        r24 = null;
        goto L18
    L33:
        this.n = r29;
        ok1 r36 = new ok1();
        r36.a(Date.class, new r01());
        r36.a(Bookmarks.class, new lt());
        r36.j = true;
        ArrayList r37 = r36.e;
        int r38 = r37.size();
        ArrayList r39 = r36.f;
        ArrayList r40 = new ArrayList((r39.size() + r38) + 3);
        r40.addAll(r37);
        Collections.reverse(r40);
        ArrayList r41 = new ArrayList(r39);
        Collections.reverse(r41);
        r40.addAll(r41);
        int r42 = r36.g;
        int r43 = r36.h;
        ak0 r115 = bk0.b;
        boolean r116 = gk4.a;
        if (r42 == 2) goto L43;
        if (r43 == 2) goto L43;
        dz4 r117 = r115.a(r42, r43);
        if (r116 == false) goto L39;
        dz4 r118 = gk4.c.a(r42, r43);
        dz4 r44 = gk4.b.a(r42, r43);
    L40:
        r40.add(r117);
        if (r116 == false) goto L43;
        r40.add(r118);
        r40.add(r44);
        goto L43
    L39:
        r44 = null;
        r118 = null;
    L43:
        u21 r45 = r36.a;
        int r46 = r36.c;
        HashMap r119 = new HashMap(r36.d);
        boolean r120 = r36.i;
        boolean r121 = r36.j;
        boolean r122 = r36.k;
        int r47 = r36.b;
        new ArrayList(r37);
        new ArrayList(r39);
        nk1 r123 = new nk1(r45, r46, r119, r120, r121, r122, r47, r40, r36.l, r36.m, new ArrayList(r36.n));
        Retrofit.Builder r48 = new Retrofit.Builder();
        String r49 = r29.j();
        if (r49 == null) goto L46;
        String r50 = qm4.K0(r49).toString();
    L47:
        if (r50 == null) goto L68;
        r12 = r50;
    L68:
        fr1 r51 = new fr1();     // Catch: IllegalArgumentException -> L54
        gr1 r52 = null;
        r51.e(null, r12);     // Catch: IllegalArgumentException -> L65
        gr1 r124 = r51.b();     // Catch: IllegalArgumentException -> L65
    L56:
        if (r124 != null) goto L58;
    L60:
        Retrofit.Builder r53 = r48.baseUrl(r11).addConverterFactory(GsonConverterFactory.create(r123));
        cx r54 = new cx();
        rx r55 = new rx(r54);
        r54.a = 2592000;
        n83 r56 = new n83();
        r56.a(2, r7);
        r56.b(20, r4);
        r56.z = ze5.b(30, r4);
        r56.A = ze5.b(30, r4);
        dr1 r57 = new dr1();
        r57.b = cr1.n;
        r56.c.add(r57);
        r56.c.add(r55);
        File r58 = App.a().getCacheDir();
        r58.getClass();
        r56.l = new hx(r58);
        SSLSocketFactory r59 = x30.b;
        if (r59 == null) goto L63;
        r56.c(r59, x30.a);
    L63:
        Retrofit r60 = r53.client(new o83(r56)).build();
        r60.getClass();
        this.o = (hd4) r60.create(hd4.class);
        return;
    L58:
        if (r124.d.length() <= 0) goto L60;
        r11 = r12;
    L55:
        r124 = r52;
    L54:
        r52 = null;
        goto L55
    L46:
        r50 = null;
        goto L47
    }

    public static ld d(ImageDecoder.Source r1, int r2, int r3, db3 r4) {
        Drawable r5 = i3.g(r1, new im0(r2, r3, r4));
        if (i3.w(r5) == false) goto L6;
        int r6 = 0;
        return new ld(r6, i3.f(r5));
    L6:
        tb4.d(r5, "Received unexpected drawable type for animated image, failing: ");
        return null;
    }

    public pz1 A() {
        MediaController.TransportControls r2 = ((xk2) this.n).a.getTransportControls();
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return new al2(6, r2);
    L7:
        return new pz1(6, r2);
    }

    public boolean B(os2 r2, String r3) {
        int r0 = r2.b;
        Context r1 = (Context) this.n;
        if (r0 >= 0) goto L8;
        if (r1.getPackageManager().checkPermission(r3, r2.a) == 0) goto L13;
        return false;
    L13:
        return true;
    L8:
        if (r1.checkPermission(r3, r0, r2.c) != 0) goto L14;
        return true;
    L14:
        return false;
    }

    public void C(AttributeSet r9, int r10) {
        AbsSeekBar r0 = (AbsSeekBar) this.n;
        jv3 r11 = jv3.f(r0.getContext(), r9, p, r10);
        Drawable r1 = r11.d(0);
        if (r1 != null) goto L5;
    L12:
        Drawable r2 = r11.d(1);
        if (r2 == null) goto L15;
        r0.setProgressDrawable(J(r2, false));
    L15:
        r11.g();
        return;
    L5:
        if ((r1 instanceof AnimationDrawable) == false) goto L11;
        AnimationDrawable r3 = (AnimationDrawable) r1;
        int r4 = r3.getNumberOfFrames();
        AnimationDrawable r5 = new AnimationDrawable();
        r5.setOneShot(r3.isOneShot());
        int r6 = 0;
    L8:
        if (r6 >= r4) goto L10;
        Drawable r7 = J(r3.getFrame(r6), true);
        r7.setLevel(10000);
        r5.addFrame(r7, r3.getDuration(r6));
        r6 = r6 + 1;
        goto L8
    L10:
        r5.setLevel(10000);
        r1 = r5;
    L11:
        r0.setIndeterminateDrawable(r1);
        goto L12
    }

    public void D() {
        String r0 = (String) this.n;
        if (((FileChannel) this.o) != null) goto L22;
        File r1 = new File(r0);     // Catch: Throwable -> L8
        File r2 = r1.getParentFile();     // Catch: Throwable -> L8
        if (r2 == null) goto L10;
        r2.mkdirs();     // Catch: Throwable -> L8
    L10:
        FileChannel r3 = new FileOutputStream(r1).getChannel();     // Catch: Throwable -> L8
        this.o = r3;     // Catch: Throwable -> L8
        if (r3 == null) goto L21;
        r3.lock();     // Catch: Throwable -> L8
        return;
    L21:
        return;
    L8:
        th = move-exception;
        FileChannel r4 = (FileChannel) this.o;
        if (r4 == null) goto L17;
        r4.close();
    L17:
        this.o = null;
        mj0.j(xa3.h("Unable to lock file: '", r0, "'."), th);
        return;
    }

    @Override // defpackage.hu0
    public void E(zs r1, Bitmap r2) {
        IOException r0 = ((n21) this.o).o;
        if (r0 == null) goto L7;
        if (r2 == null) goto L8;
        r1.d(r2);
        throw r0;
    L8:
        throw r0;
    }

    public void F(Object r5) {
        GetCredentialException r6 = (GetCredentialException) r5;
        nc1 r0 = (nc1) this.o;
        r6.getClass();
        Log.w("HomeGoogleSignIn", "Google sign-in failed: " + r6.a(), r6);
        jj1 r4 = (jj1) this.n;
        if ((r6 instanceof GetCredentialCancellationException) == false) goto L6;
        String r7 = null;
    L18:
        r4.v(r7);
        return;
    L6:
        if ((r6 instanceof NoCredentialException) == false) goto L9;
        r7 = r0.getString(app.homemusic.R.string.homemusic_google_no_account);
        goto L18
    L9:
        if ((r6 instanceof GetCredentialProviderConfigurationException) == false) goto L11;
    L17:
        r7 = r0.getString(app.homemusic.R.string.homemusic_google_unavailable);
        goto L18
    L11:
        if ((r6 instanceof GetCredentialUnsupportedException) == true) goto L17;
        Object r1 = r6.o;
        if (r1 != null) goto L16;
        r1 = r6.a();
    L16:
        r7 = r0.getString(app.homemusic.R.string.homemusic_google_failed, new Object[]{r1});
        goto L18
    }

    public void G(Object r5) {
        mh1 r6 = (mh1) r5;
        nc1 r0 = (nc1) this.o;
        jj1 r4 = (jj1) this.n;
        r6.getClass();
        b3 r7 = r6.a;
        if ((r7 instanceof tg0) == true) goto L5;
    L15:
        r4.v(r0.getString(app.homemusic.R.string.homemusic_google_failed, new Object[]{(String) r7.a}));
        return;
    L5:
        if (((String) r7.a).equals("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL") == false) goto L15;
        kj1 r8 = kb4.p((Bundle) r7.b);     // Catch: GoogleIdTokenParsingException -> L9
        r4.g(r8.d, r8.c);     // Catch: GoogleIdTokenParsingException -> L9
        return;
    L9:
        e = move-exception;
        Log.w("HomeGoogleSignIn", "Bad Google credential", e);
        String r9 = e.getMessage();
        if (r9 != null) goto L13;
        r9 = "?";
    L13:
        r4.v(r0.getString(app.homemusic.R.string.homemusic_google_failed, new Object[]{r9}));
    }

    public void H(va1 r4) {
        ok r0 = (ok) this.o;
        c05 r3 = (c05) this.n;
        int r1 = r4.b;
        if (r1 != 0) goto L6;
        int r2 = 6;
        r0.execute(new lg1(r2, r3, r4.a));
        return;
    L6:
        r0.execute(new rq(r1, 1, r3));
    }

    public void I(pm2 r5) {
        xk2 r4 = (xk2) this.n;
        if ((r4.a.getFlags() & 4) == 0) goto L6;
        Bundle r0 = new Bundle();
        r0.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", uc5.j(r5, MediaDescriptionCompat.CREATOR));
        r4.a.sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", r0, null);
        return;
    L6:
        er1.l("This session doesn't support queue management operations");
    }

    public Drawable J(Drawable r8, boolean r9) {
        if ((r8 instanceof LayerDrawable) == false) goto L19;
        LayerDrawable r10 = (LayerDrawable) r8;
        int r11 = r10.getNumberOfLayers();
        Drawable[] r0 = new Drawable[r11];
        int r2 = 0;
        int r3 = 0;
    L5:
        if (r3 >= r11) goto L14;
        int r4 = r10.getId(r3);
        Drawable r5 = r10.getDrawable(r3);
        if (r4 != 16908301) goto L9;
    L12:
        boolean r6 = true;
    L13:
        r0[r3] = J(r5, r6);
        r3 = r3 + 1;
        goto L5
    L9:
        if (r4 == 16908303) goto L12;
        r6 = false;
        goto L13
    L14:
        LayerDrawable r7 = new LayerDrawable(r0);
    L15:
        if (r2 >= r11) goto L17;
        r7.setId(r2, r10.getId(r2));
        r7.setLayerGravity(r2, r10.getLayerGravity(r2));
        r7.setLayerWidth(r2, r10.getLayerWidth(r2));
        r7.setLayerHeight(r2, r10.getLayerHeight(r2));
        r7.setLayerInsetLeft(r2, r10.getLayerInsetLeft(r2));
        r7.setLayerInsetRight(r2, r10.getLayerInsetRight(r2));
        r7.setLayerInsetTop(r2, r10.getLayerInsetTop(r2));
        r7.setLayerInsetBottom(r2, r10.getLayerInsetBottom(r2));
        r7.setLayerInsetStart(r2, r10.getLayerInsetStart(r2));
        r7.setLayerInsetEnd(r2, r10.getLayerInsetEnd(r2));
        r2 = r2 + 1;
        goto L15
    L17:
        return r7;
    L19:
        if ((r8 instanceof BitmapDrawable) == false) goto L28;
        BitmapDrawable r12 = (BitmapDrawable) r8;
        Bitmap r1 = r12.getBitmap();
        if (((Bitmap) this.o) != null) goto L23;
        this.o = r1;
    L23:
        ShapeDrawable r13 = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
        r13.getPaint().setShader(new BitmapShader(r1, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
        r13.getPaint().setColorFilter(r12.getPaint().getColorFilter());
        if (r9 == true) goto L26;
        return r13;
    L26:
        return new ClipDrawable(r13, 3, 1);
    L28:
        return r8;
    }

    public void a(pm2 r5, int r6) {
        xk2 r4 = (xk2) this.n;
        if ((r4.a.getFlags() & 4) == 0) goto L6;
        Bundle r0 = new Bundle();
        r0.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", uc5.j(r5, MediaDescriptionCompat.CREATOR));
        r0.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", r6);
        r4.a.sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", r0, null);
        return;
    L6:
        er1.l("This session doesn't support queue management operations");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // defpackage.zn4
    public void c(byte[] r19, int r20, int r21, yn4 r22, wc0 r23) {
        wo0 r0 = this;
        be3 r2 = (be3) r0.n;
        r2.L(r20 + r21, r19);
        r2.N(r20);
        ArrayList r1 = new ArrayList();
        y95.d(r2);     // Catch: ParserException -> L228
    L5:
        if (TextUtils.isEmpty(r2.n(StandardCharsets.UTF_8)) == false) goto L5;
        ArrayList r3 = new ArrayList();
    L8:
        boolean r4 = false;
        int r5 = -1;
        int r7 = 0;
        byte r6 = -1;
    L9:
        int r9 = 1;
        if (r6 != (-1)) goto L21;
        r7 = r2.b;
        String r8 = r2.n(StandardCharsets.UTF_8);
        if (r8 == null) goto L13;
        if ("STYLE".equals(r8) == true) goto L16;
        if (r8.startsWith("NOTE") == true) goto L19;
        r6 = 3;
        goto L9
    L19:
        r6 = 1;
        goto L9
    L16:
        r6 = 2;
        goto L9
    L13:
        r6 = 0;
        goto L9
    L21:
        r2.N(r7);
        if (r6 == 0) goto L226;
        if (r6 == 1) goto L25;
        String r10 = null;
        if (r6 != 2) goto L211;
        if (r3.isEmpty() == false) goto L208;
        r2.n(StandardCharsets.UTF_8);
        p95 r11 = (p95) r0.o;
        be3 r12 = r11.a;
        StringBuilder r13 = r11.b;
        r13.setLength(0);
        int r14 = r2.b;
    L33:
        if (TextUtils.isEmpty(r2.n(StandardCharsets.UTF_8)) == false) goto L33;
        r12.L(r2.b, r2.a);
        r12.N(r14);
        ArrayList r15 = new ArrayList();
    L35:
        p95.c(r12);
        if (r12.a() >= 5) goto L39;
    L37:
        String r16 = r10;
    L62:
        if (r16 == null) goto L205;
        if ("{".equals(p95.b(r12, r13)) == false) goto L205;
        q95 r17 = new q95();
        r17.a = "";
        r17.b = "";
        r17.c = Collections.EMPTY_SET;
        r17.d = "";
        r17.e = r10;
        r17.g = r4;
        r17.i = r4;
        r17.j = r5;
        r17.k = r5;
        r17.l = r5;
        r17.m = r5;
        r17.n = r5;
        r17.p = r5;
        r17.q = r4;
        if (r16.isEmpty() == true) goto L86;
        int r18 = r16.indexOf(91);
        if (r18 == r5) goto L75;
        Matcher r110 = p95.c.matcher(r16.substring(r18));
        if (r110.matches() == false) goto L74;
        String r111 = r110.group(r9);
        r111.getClass();
        r17.d = r111;
    L74:
        r16 = r16.substring(r4 ? 1 : 0, r18);
    L75:
        String r112 = f35.a;
        String[] r24 = r16.split("\\.", r5);
        String r113 = r24[r4 ? 1 : 0];
        int r114 = r113.indexOf(35);
        if (r114 == r5) goto L78;
        r17.b = r113.substring(r4 ? 1 : 0, r114);
        r17.a = r113.substring(r114 + 1);
    L80:
        if (r24.length <= r9) goto L86;
        int r115 = r24.length;
        if (r115 > r24.length) goto L84;
        ?? r116 = r9;
    L85:
        rr2.l(r116);
        r17.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(r24, r9, r115)));
        goto L86
    L84:
        r116 = r4 ? 1 : 0;
        goto L85
    L78:
        r17.b = r113;
    L86:
        ?? r25 = r4 ? 1 : 0;
        String r117 = r10;
    L88:
        if (r25 != 0) goto L201;
        int r26 = r12.b;
        r117 = p95.b(r12, r13);
        if (r117 != null) goto L92;
    L95:
        ?? r118 = r9;
    L96:
        if (r118 != 0) goto L198;
        r12.N(r26);
        p95.c(r12);
        String r27 = p95.a(r12, r13);
        if (r27.isEmpty() == true) goto L198;
        if (":".equals(p95.b(r12, r13)) == false) goto L198;
        p95.c(r12);
        StringBuilder r28 = new StringBuilder();
        boolean r29 = false;
    L105:
        if (r29 == true) goto L117;
        int r30 = r12.b;
        String r31 = p95.b(r12, r13);
        if (r31 == null) goto L108;
        if ("}".equals(r31) == false) goto L112;
    L116:
        r12.N(r30);
        r29 = true;
        goto L105
    L112:
        if (";".equals(r31) == true) goto L116;
        r28.append(r31);
        goto L105
    L108:
        String r32 = null;
    L118:
        if (r32 != null) goto L120;
    L121:
        int r33 = 1;
    L200:
        r9 = r33;
        r25 = r118;
        r4 = false;
        goto L88
    L120:
        if (r32.isEmpty() == true) goto L121;
        int r34 = r12.b;
        String r35 = p95.b(r12, r13);
        if (";".equals(r35) == true) goto L129;
        if ("}".equals(r35) == false) goto L121;
        r12.N(r34);
    L129:
        if ("color".equals(r27) == false) goto L131;
        int r36 = 1;
        r17.f = d50.a(r32, true);
        r17.g = true;
    L170:
        r33 = r36;
        goto L200
    L131:
        r36 = 1;
        if ("background-color".equals(r27) == false) goto L135;
        r17.h = d50.a(r32, true);
        r17.i = true;
        goto L170
    L135:
        if ("ruby-position".equals(r27) == false) goto L143;
        if ("over".equals(r32) == false) goto L140;
        r17.p = 1;
        goto L170
    L140:
        if ("under".equals(r32) == false) goto L121;
        r17.p = 2;
        r33 = 1;
        goto L200
    L143:
        if ("text-combine-upright".equals(r27) == false) goto L153;
        if ("all".equals(r32) == false) goto L147;
    L150:
        boolean r37 = true;
    L151:
        r17.q = r37;
        goto L121
    L147:
        if (r32.startsWith("digits") == true) goto L150;
        r37 = false;
        goto L151
    L153:
        if ("text-decoration".equals(r27) == false) goto L158;
        if ("underline".equals(r32) == false) goto L121;
        r36 = 1;
        r17.k = 1;
        goto L170
    L158:
        if ("font-family".equals(r27) == false) goto L161;
        r17.e = rr2.U(r32);
        goto L121
    L161:
        if ("font-weight".equals(r27) == true) goto L163;
        r36 = 1;
        if ("font-style".equals(r27) == false) goto L172;
        if ("italic".equals(r32) == false) goto L170;
        r17.m = 1;
        goto L170
    L172:
        if ("font-size".equals(r27) == false) goto L121;
        Matcher r38 = p95.d.matcher(rr2.U(r32));
        if (r38.matches() == true) goto L176;
        l93.q0("WebvttCssParser", "Invalid font-size: '" + r32 + "'.");
        goto L121
    L176:
        String r39 = r38.group(2);
        r39.getClass();
        switch(r39.hashCode()) {
            case 37: goto L188;
            case 3240: goto L184;
            case 3592: goto L180;
            default: goto L178;
        };
    L178:
        byte r40 = -1;
    L191:
        switch(r40) {
            case 0: goto L196;
            case 1: goto L195;
            case 2: goto L194;
            default: goto L192;
        };
    L194:
        r33 = 1;
        r17.n = 1;
    L197:
        String r41 = r38.group(r33);
        r41.getClass();
        r17.o = Float.parseFloat(r41);
        goto L200
    L195:
        r33 = 1;
        r17.n = 2;
        goto L197
    L196:
        r33 = 1;
        r17.n = 3;
        goto L197
    L192:
        tb4.a();
        return;
    L180:
        if (r39.equals("px") == false) goto L178;
        r40 = 2;
        goto L191
    L184:
        if (r39.equals("em") == false) goto L178;
        r40 = 1;
        goto L191
    L188:
        if (r39.equals("%") == false) goto L178;
        r40 = 0;
        goto L191
    L163:
        if ("bold".equals(r32) == false) goto L121;
        r36 = 1;
        r17.l = 1;
        goto L170
    L117:
        r32 = r28.toString();
    L198:
        r33 = r9;
        goto L200
    L92:
        if ("}".equals(r117) == true) goto L95;
        r118 = r4;
        goto L96
    L201:
        int r42 = r9;
        if ("}".equals(r117) == false) goto L204;
        r15.add(r17);
    L204:
        r9 = r42;
        r4 = false;
        r5 = -1;
        r10 = null;
    L205:
        r1.addAll(r15);
    L206:
        r0 = this;
        goto L8
    L39:
        if ("::cue".equals(r12.y(5, StandardCharsets.UTF_8)) == false) goto L37;
        int r43 = r12.b;
        String r119 = p95.b(r12, r13);
        if (r119 == null) goto L37;
        if ("{".equals(r119) == false) goto L48;
        r12.N(r43);
        r16 = "";
        goto L62
    L48:
        if ("(".equals(r119) == false) goto L58;
        int r44 = r12.b;
        int r120 = r12.c;
        int r121 = r4 ? 1 : 0;
    L50:
        if (r44 >= r120) goto L57;
        if (r121 != 0) goto L57;
        int r122 = r44 + 1;
        if (((char) r12.a[r44]) != ')') goto L55;
        int r45 = r9;
    L56:
        r121 = r45;
        r44 = r122;
        goto L50
    L55:
        r45 = r4 ? 1 : 0;
    L57:
        r16 = r12.y((r44 - 1) - r12.b, StandardCharsets.UTF_8).trim();
    L60:
        if (")".equals(p95.b(r12, r13)) == true) goto L62;
    L58:
        r16 = r10;
        goto L60
    L208:
        kf2.n("A style block was found after the first cue.");
        return;
    L211:
        if (r6 != 3) goto L206;
        Pattern r46 = w95.a;
        Charset r47 = StandardCharsets.UTF_8;
        String r48 = r2.n(r47);
        if (r48 != null) goto L215;
        r95 r49 = null;
    L224:
        if (r49 == null) goto L206;
        r3.add(r49);
        goto L206
    L215:
        Pattern r50 = w95.a;
        Matcher r51 = r50.matcher(r48);
        if (r51.matches() == false) goto L218;
        r49 = w95.d(null, r51, r2, r1);
        goto L224
    L218:
        r49 = null;
        String r52 = r2.n(r47);
        if (r52 == null) goto L224;
        Matcher r53 = r50.matcher(r52);
        if (r53.matches() == false) goto L224;
        r49 = w95.d(r48.trim(), r53, r2, r1);
    L25:
        if (TextUtils.isEmpty(r2.n(StandardCharsets.UTF_8)) == true) goto L8;
    L226:
        gb.d0(new i61(r3), r22, r23);
        return;
    L228:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    public void e(boolean r3) {
        kc1 r0 = ((ld1) this.o).x;
        if (r0 == null) goto L5;
        r0.q().n.e(true);
    L5:
        Iterator r2 = ((CopyOnWriteArrayList) this.n).iterator();
    L7:
        if (r2.hasNext() == false) goto L12;
        yc1 r1 = (yc1) r2.next();
        if (r3 == true) goto L10;
        rf2 r4 = r1.a;
        goto L7
    L10:
        r1.getClass();
        goto L7
    }

    public void f(boolean r3) {
        ld1 r0 = (ld1) this.o;
        nc1 r1 = r0.v.B;
        kc1 r2 = r0.x;
        if (r2 == null) goto L5;
        r2.q().n.f(true);
    L5:
        Iterator r4 = ((CopyOnWriteArrayList) this.n).iterator();
    L7:
        if (r4.hasNext() == false) goto L12;
        yc1 r5 = (yc1) r4.next();
        if (r3 == true) goto L10;
        rf2 r6 = r5.a;
        goto L7
    L10:
        r5.getClass();
        goto L7
    }

    public void g(boolean r3) {
        kc1 r0 = ((ld1) this.o).x;
        if (r0 == null) goto L5;
        r0.q().n.g(true);
    L5:
        Iterator r2 = ((CopyOnWriteArrayList) this.n).iterator();
    L7:
        if (r2.hasNext() == false) goto L12;
        yc1 r1 = (yc1) r2.next();
        if (r3 == true) goto L10;
        rf2 r4 = r1.a;
        goto L7
    L10:
        r1.getClass();
        goto L7
    }

    @Override // defpackage.kg1
    public void h(Object r5) {
        List r6 = (List) r5;
        r6.getClass();
        MediaService r0 = (MediaService) this.n;
        r0.B.post(new v6(r0, r6, (qi3) this.o, 3));
    }

    public void i(boolean r3) {
        kc1 r0 = ((ld1) this.o).x;
        if (r0 == null) goto L5;
        r0.q().n.i(true);
    L5:
        Iterator r2 = ((CopyOnWriteArrayList) this.n).iterator();
    L7:
        if (r2.hasNext() == false) goto L12;
        yc1 r1 = (yc1) r2.next();
        if (r3 == true) goto L10;
        rf2 r4 = r1.a;
        goto L7
    L10:
        r1.getClass();
        goto L7
    }

    public void j(boolean r3) {
        kc1 r0 = ((ld1) this.o).x;
        if (r0 == null) goto L5;
        r0.q().n.j(true);
    L5:
        Iterator r2 = ((CopyOnWriteArrayList) this.n).iterator();
    L7:
        if (r2.hasNext() == false) goto L12;
        yc1 r1 = (yc1) r2.next();
        if (r3 == true) goto L10;
        rf2 r4 = r1.a;
        goto L7
    L10:
        r1.getClass();
        goto L7
    }

    public void k(boolean r3) {
        kc1 r0 = ((ld1) this.o).x;
        if (r0 == null) goto L5;
        r0.q().n.k(true);
    L5:
        Iterator r2 = ((CopyOnWriteArrayList) this.n).iterator();
    L7:
        if (r2.hasNext() == false) goto L12;
        yc1 r1 = (yc1) r2.next();
        if (r3 == true) goto L10;
        rf2 r4 = r1.a;
        goto L7
    L10:
        r1.getClass();
        goto L7
    }

    public void l(boolean r3) {
        ld1 r0 = (ld1) this.o;
        nc1 r1 = r0.v.B;
        kc1 r2 = r0.x;
        if (r2 == null) goto L5;
        r2.q().n.l(true);
    L5:
        Iterator r4 = ((CopyOnWriteArrayList) this.n).iterator();
    L7:
        if (r4.hasNext() == false) goto L12;
        yc1 r5 = (yc1) r4.next();
        if (r3 == true) goto L10;
        rf2 r6 = r5.a;
        goto L7
    L10:
        r5.getClass();
        goto L7
    }

    @Override // defpackage.bi0
    public ci0 m() {
        return new p04(((rm2) this.n).m(), (mj0) this.o);
    }

    public void n(boolean r3) {
        kc1 r0 = ((ld1) this.o).x;
        if (r0 == null) goto L5;
        r0.q().n.n(true);
    L5:
        Iterator r2 = ((CopyOnWriteArrayList) this.n).iterator();
    L7:
        if (r2.hasNext() == false) goto L12;
        yc1 r1 = (yc1) r2.next();
        if (r3 == true) goto L10;
        rf2 r4 = r1.a;
        goto L7
    L10:
        r1.getClass();
        goto L7
    }

    @Override // defpackage.kg1
    public void o(Throwable r2) {
        r2.getClass();
        Log.e("BaseMediaService", "updateMediaItems failed", r2);
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r1, Throwable r2) {
        ((k03) this.n).k(kb4.Z((String) this.o, null));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r3, Response r4) {
        List<Child> r0 = null;
        if (r4.isSuccessful() == true) goto L5;
    L11:
        List<Child> r5 = null;
    L12:
        k03 r1 = (k03) this.n;
        String r2 = (String) this.o;
        if (r4.isSuccessful() == false) goto L17;
        if (r5 == null) goto L16;
        r0 = r5;
        goto L17
    L16:
        r0 = new ArrayList();
    L17:
        r1.k(kb4.Z(r2, r0));
        return;
    L5:
        if (r4.body() == null) goto L11;
        if (((ApiResponse) r4.body()).getSubsonicResponse() == null) goto L11;
        if (((ApiResponse) r4.body()).getSubsonicResponse().getTopSongs() == null) goto L11;
        r5 = ((ApiResponse) r4.body()).getSubsonicResponse().getTopSongs().getSongs();
        goto L12
    }

    public void p(boolean r3) {
        kc1 r0 = ((ld1) this.o).x;
        if (r0 == null) goto L5;
        r0.q().n.p(true);
    L5:
        Iterator r2 = ((CopyOnWriteArrayList) this.n).iterator();
    L7:
        if (r2.hasNext() == false) goto L12;
        yc1 r1 = (yc1) r2.next();
        if (r3 == true) goto L10;
        rf2 r4 = r1.a;
        goto L7
    L10:
        r1.getClass();
        goto L7
    }

    public void q(boolean r3) {
        kc1 r0 = ((ld1) this.o).x;
        if (r0 == null) goto L5;
        r0.q().n.q(true);
    L5:
        Iterator r2 = ((CopyOnWriteArrayList) this.n).iterator();
    L7:
        if (r2.hasNext() == false) goto L12;
        yc1 r1 = (yc1) r2.next();
        if (r3 == true) goto L10;
        rf2 r4 = r1.a;
        goto L7
    L10:
        r1.getClass();
        goto L7
    }

    public void r(boolean r3) {
        kc1 r0 = ((ld1) this.o).x;
        if (r0 == null) goto L5;
        r0.q().n.r(true);
    L5:
        Iterator r2 = ((CopyOnWriteArrayList) this.n).iterator();
    L7:
        if (r2.hasNext() == false) goto L12;
        yc1 r1 = (yc1) r2.next();
        if (r3 == true) goto L10;
        rf2 r4 = r1.a;
        goto L7
    L10:
        r1.getClass();
        goto L7
    }

    public void s(boolean r3) {
        kc1 r0 = ((ld1) this.o).x;
        if (r0 == null) goto L5;
        r0.q().n.s(true);
    L5:
        Iterator r2 = ((CopyOnWriteArrayList) this.n).iterator();
    L7:
        if (r2.hasNext() == false) goto L12;
        yc1 r1 = (yc1) r2.next();
        if (r3 == true) goto L10;
        rf2 r4 = r1.a;
        goto L7
    L10:
        r1.getClass();
        goto L7
    }

    public void t(kc1 r8, View r9, boolean r10) {
        kc1 r0 = ((ld1) this.o).x;
        if (r0 == null) goto L5;
        r0.q().n.t(r8, r9, true);
    L5:
        Iterator r1 = ((CopyOnWriteArrayList) this.n).iterator();
    L7:
        if (r1.hasNext() == false) goto L27;
        yc1 r2 = (yc1) r1.next();
        if (r10 == true) goto L10;
        rf2 r3 = r2.a;
        ld1 r4 = (ld1) this.o;
        if (r8 != ((kc1) r3.n)) goto L7;
        wo0 r5 = r4.n;
        CopyOnWriteArrayList r6 = (CopyOnWriteArrayList) r5.n;
        monitor-enter(r6);
        int r7 = ((CopyOnWriteArrayList) r5.n).size();     // Catch: Throwable -> L20
        int r11 = 0;
    L16:
        if (r11 >= r7) goto L23;
        if (((yc1) ((CopyOnWriteArrayList) r5.n).get(r11)).a == r3) goto L19;
        r11 = r11 + 1;     // Catch: Throwable -> L20
        goto L16
    L19:
        ((CopyOnWriteArrayList) r5.n).remove(r11);     // Catch: Throwable -> L20
    L23:
        monitor-exit(r6);     // Catch: Throwable -> L20
        ee1.p(r9, (FrameLayout) r3.o);
    L20:
        th = move-exception;
        throw th;
    L10:
        r2.getClass();
        goto L7
    }

    public void u(boolean r3) {
        kc1 r0 = ((ld1) this.o).x;
        if (r0 == null) goto L5;
        r0.q().n.u(true);
    L5:
        Iterator r2 = ((CopyOnWriteArrayList) this.n).iterator();
    L7:
        if (r2.hasNext() == false) goto L12;
        yc1 r1 = (yc1) r2.next();
        if (r3 == true) goto L10;
        rf2 r4 = r1.a;
        goto L7
    L10:
        r1.getClass();
        goto L7
    }

    public zl v(tb1 r7, il r8) {
        r7.getClass();
        int r0 = r7.G;
        r8.getClass();
        int r1 = Build.VERSION.SDK_INT;
        if (r1 < 29) goto L54;
        if (r0 == (-1)) goto L54;
        Context r2 = (Context) this.n;
        Boolean r3 = (Boolean) this.o;
        boolean r4 = false;
        if (r3 == null) goto L10;
        boolean r6 = r3.booleanValue();
    L20:
        String r5 = r7.n;
        r5.getClass();
        int r9 = lw2.c(r5, r7.k);
        if (r9 == 0) goto L52;
        if (r1 < f35.r(r9)) goto L52;
        int r10 = f35.s(r7.F);
        if (r10 == 0) goto L28;
        AudioFormat r11 = new AudioFormat.Builder().setSampleRate(r0).setChannelMask(r10).setEncoding(r9).build();     // Catch: IllegalArgumentException -> L49
        if (r1 < 31) goto L44;
        int r12 = hd0.b(r11, r8.c());
        if (r12 == 0) goto L35;
        yl r13 = new yl();
        if (r1 > 32) goto L39;
    L41:
        r13.a = true;
        r13.b = r4;
        r13.c = r6;
        return r13.a();
    L39:
        if (r12 != 2) goto L41;
        r4 = true;
        goto L41
    L35:
        return zl.d;
    L44:
        if (kz.s(r11, r8.c()) == false) goto L46;
        yl r14 = new yl();
        r14.a = true;
        r14.c = r6;
        return r14.a();
    L46:
        return zl.d;
    L50:
        return zl.d;
    L28:
        return zl.d;
    L52:
        return zl.d;
    L10:
        if (r2 == null) goto L18;
        String r15 = xl.n(r2).getParameters("offloadVariableRateSupported");
        if (r15 != null) goto L14;
    L16:
        boolean r16 = false;
    L17:
        this.o = Boolean.valueOf(r16);
    L19:
        r6 = ((Boolean) this.o).booleanValue();
        goto L20
    L14:
        if (r15.equals("offloadVariableRateSupported=1") == false) goto L16;
        r16 = true;
        goto L17
    L18:
        this.o = Boolean.FALSE;
    L54:
        return zl.d;
    }

    public ArrayList w(String r3) {
        w24 r1 = w24.b(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        r1.h(1, r3);
        WorkDatabase_Impl r2 = (WorkDatabase_Impl) this.n;
        r2.b();
        Cursor r4 = xl.H(r2, r1);
        ArrayList r5 = new ArrayList(r4.getCount());     // Catch: Throwable -> L8
    L5:
        if (r4.moveToNext() == false) goto L10;
        r5.add(r4.getString(0));     // Catch: Throwable -> L8
        goto L5
    L10:
        r4.close();
        r1.j();
        return r5;
    L8:
        th = move-exception;
        r4.close();
        r1.j();
        throw th;
    }

    @Override // defpackage.hu0
    public void x() {
        aw3 r1 = (aw3) this.n;
        monitor-enter(r1);
        r1.p = r1.n.length;     // Catch: Throwable -> L7
        monitor-exit(r1);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public fg4 y() {
        MediaController.PlaybackInfo r9 = ((xk2) this.n).a.getPlaybackInfo();
        String r0 = null;
        if (r9 == null) goto L9;
        int r2 = r9.getPlaybackType();
        il r3 = il.b(r9.getAudioAttributes());
        int r4 = r9.getVolumeControl();
        int r5 = r9.getMaxVolume();
        int r6 = r9.getCurrentVolume();
        if (Build.VERSION.SDK_INT < 30) goto L8;
        r0 = l3.q(r9);
    L8:
        return new fg4(r2, r3, r4, r5, r6, r0);
    L9:
        return null;
    }

    public ei3 z() {
        xk2 r3 = (xk2) this.n;
        qu1 r0 = r3.e.a();
        if (r0 != null) goto L15;
    L10:
        PlaybackState r4 = r3.a.getPlaybackState();
        if (r4 != null) goto L17;
        return null;
    L17:
        return ei3.a(r4);
    L15:
        return r0.g();
    L6:
        e = move-exception;
        l93.G("MediaControllerCompat", "Dead object in getPlaybackState.", e);
        goto L10
    }

    public /* synthetic */ wo0(Object r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    public wo0(AbsSeekBar r1) {
        this.n = r1;
    }

    public wo0(Context r1) {
        if (r1 != null) goto L5;
        Context r2 = null;
    L6:
        this.n = r2;
        return;
    L5:
        r2 = r1.getApplicationContext();
        goto L6
    }

    public wo0(int r2) {
        switch(r2) {
            case 23: goto L5;
            default: goto L3;
        };
    L3:
        this.n = new xi4(15);
        this.o = new fg4(16);
        return;
    L5:
        this.n = new be3();
        this.o = new p95();
    }

    public wo0(Context r3, pr2 r4) {
        this.o = Collections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT < 29) goto L6;
        this.n = new yk2(r3, r4);
        return;
    L6:
        this.n = new xk2(r3, r4);
    }
}
