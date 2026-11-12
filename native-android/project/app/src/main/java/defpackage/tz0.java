package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tz0 {
    public static final Object j = null;
    public static volatile tz0 k;
    public final ReentrantReadWriteLock a;
    public final qi b;
    public volatile int c;
    public final Handler d;
    public final pz0 e;
    public final sz0 f;
    public final om0 g;
    public final int h;
    public final wk0 i;

    static {
        j = new Object();
    }

    public tz0(sa1 r6) {
        ReentrantReadWriteLock r0 = new ReentrantReadWriteLock();
        this.a = r0;
        this.c = 3;
        sz0 r1 = (sz0) r6.b;
        this.f = r1;
        int r2 = r6.a;
        this.h = r2;
        this.i = (wk0) r6.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new qi(0);
        this.g = new om0(20);
        pz0 r7 = new pz0(this);
        this.e = r7;
        r0.writeLock().lock();
        if (r2 == 0) goto L16;
    L9:
        r0.writeLock().unlock();
        if (b() != 0) goto L20;
        r1.a(new oz0(r7));     // Catch: Throwable -> L13
        return;
    L13:
        th = move-exception;
        e(th);
        return;
    L20:
        return;
    L16:
        this.c = 0;     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        this.a.writeLock().unlock();
        throw th;
    }

    public static tz0 a() {
        Object r0 = j;
        monitor-enter(r0);
        tz0 r1 = k;     // Catch: Throwable -> L12
        if (r1 == null) goto L7;
        boolean r2 = true;
    L9:
        if (r2 == false) goto L15;
        monitor-exit(r0);     // Catch: Throwable -> L12
        return r1;
    L15:
        throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");     // Catch: Throwable -> L12
    L7:
        r2 = false;
    L12:
        th = move-exception;
        throw th;
    }

    public static boolean c() {
        if (k == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final int b() {
        this.a.readLock().lock();
        int r0 = this.c;     // Catch: Throwable -> L6
        this.a.readLock().unlock();
        return r0;
    L6:
        th = move-exception;
        this.a.readLock().unlock();
        throw th;
    }

    public final void d() {
        if (this.h != 1) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L8;
        kf2.o("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        return;
    L8:
        if (b() != 1) goto L10;
        return;
    L10:
        this.a.writeLock().lock();
    L22:
        th = move-exception;
        this.a.writeLock().unlock();
        throw th;
    L12:
        if (this.c != 0) goto L15;
        this.a.writeLock().unlock();
        return;
    L15:
        this.c = 0;     // Catch: Throwable -> L22
        this.a.writeLock().unlock();
        pz0 r3 = this.e;
        tz0 r1 = r3.a;
        r1.f.a(new oz0(r3));     // Catch: Throwable -> L19
        return;
    L19:
        th = move-exception;
        r1.e(th);
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final void e(Throwable r4) {
        ArrayList r0 = new ArrayList();
        this.a.writeLock().lock();
        this.c = 2;     // Catch: Throwable -> L6
        r0.addAll(this.b);     // Catch: Throwable -> L6
        this.b.clear();     // Catch: Throwable -> L6
        this.a.writeLock().unlock();
        this.d.post(new rq(r0, this.c, r4));
        return;
    L6:
        th = move-exception;
        this.a.writeLock().unlock();
        throw th;
    }

    public final CharSequence f(int r12, int r13, int r14, CharSequence r15) {
        int r1 = 0;
        if (b() != 1) goto L5;
        boolean r0 = true;
    L6:
        q15 r3 = null;
        if (r0 == false) goto L91;
        if (r12 < 0) goto L89;
        if (r13 < 0) goto L87;
        if (r12 > r13) goto L12;
        boolean r2 = true;
    L13:
        l93.j("start should be <= than end", r2);
        if (r15 != null) goto L17;
        return null;
    L17:
        if (r12 > r15.length()) goto L19;
        boolean r4 = true;
    L20:
        l93.j("start should be < than charSequence length", r4);
        if (r13 > r15.length()) goto L23;
        boolean r5 = true;
    L24:
        l93.j("end should be < than charSequence length", r5);
        if (r15.length() == 0) goto L86;
        if (r12 == r13) goto L86;
        if (r14 == 1) goto L30;
        boolean r9 = false;
    L31:
        qp4 r6 = this.e.b;
        r6.getClass();
        boolean r11 = r15 instanceof lj4;
        if (r11 == false) goto L35;
        ((lj4) r15).a();
    L35:
        if (r11 == true) goto L97;
    L46:
        th = move-exception;
        Throwable r16 = th;
        CharSequence r7 = r15;
    L83:
        if (r11 == false) goto L100;
        ((lj4) r7).b();
        throw r16;
    L100:
        throw r16;
    L37:
        if ((r15 instanceof Spannable) == true) goto L97;
        if ((r15 instanceof Spanned) == true) goto L42;
    L49:
        if (r3 == null) goto L61;
        l05[] r17 = (l05[]) r3.o.getSpans(r12, r13, l05.class);     // Catch: Throwable -> L46
        if (r17 == null) goto L61;
        if (r17.length <= 0) goto L61;
        int r8 = r17.length;     // Catch: Throwable -> L46
    L55:
        if (r1 >= r8) goto L61;
        l05 r10 = r17[r1];     // Catch: Throwable -> L46
        int r18 = r3.o.getSpanStart(r10);     // Catch: Throwable -> L46
        int r19 = r3.o.getSpanEnd(r10);     // Catch: Throwable -> L46
        if (r18 == r13) goto L59;
        r3.removeSpan(r10);     // Catch: Throwable -> L46
    L59:
        r12 = Math.min(r18, r12);     // Catch: Throwable -> L46
        r13 = Math.max(r19, r13);     // Catch: Throwable -> L46
        r1 = r1 + 1;
    L61:
        int r20 = r12;
        int r21 = r13;
        if (r20 != r21) goto L64;
    L65:
        r7 = r15;
        if (r11 == false) goto L102;
    L77:
        ((lj4) r7).b();
        return r7;
    L102:
        return r7;
    L64:
        if (r20 >= r15.length()) goto L65;
        r7 = r15;
        q15 r110 = (q15) r6.n(r7, r20, r21, Integer.MAX_VALUE, r9, new hd5(7, r3, (om0) r6.a));     // Catch: Throwable -> L74
        if (r110 == null) goto L76;
        Spannable r111 = r110.o;     // Catch: Throwable -> L74
        if (r11 == false) goto L73;
        ((lj4) r7).b();
    L73:
        return r111;
    L76:
        if (r11 == true) goto L77;
        return r7;
    L74:
        th = th;
    L75:
        r16 = th;
    L79:
        th = th;
        r7 = r15;
        goto L75
    L42:
        if (((Spanned) r15).nextSpanTransition(r12 - 1, r13 + 1, l05.class) > r13) goto L49;
        r3 = new q15();     // Catch: Throwable -> L46
        r3.n = false;     // Catch: Throwable -> L46
        r3.o = new SpannableString(r15);     // Catch: Throwable -> L46
    L97:
        r3 = new q15((Spannable) r15);     // Catch: Throwable -> L79
        goto L49
    L30:
        r9 = true;
    L86:
        return r15;
    L23:
        r5 = false;
        goto L24
    L19:
        r4 = false;
        goto L20
    L12:
        r2 = false;
        goto L13
    L87:
        kf2.n("end cannot be negative");
        return null;
    L89:
        kf2.n("start cannot be negative");
        return null;
    L91:
        kf2.o("Not initialized yet");
        return null;
    L5:
        r0 = false;
        goto L6
    }

    public final void g(rz0 r5) {
        l93.m(r5, "initCallback cannot be null");
        this.a.writeLock().lock();
    L9:
        th = move-exception;
        this.a.writeLock().unlock();
        throw th;
    L4:
        if (this.c != 1) goto L6;
    L11:
        Handler r0 = this.d;     // Catch: Throwable -> L9
        int r2 = this.c;     // Catch: Throwable -> L9
        r0.post(new rq(Arrays.asList(new rz0[]{r5}), r2, null));     // Catch: Throwable -> L9
    L12:
        this.a.writeLock().unlock();
        return;
    L6:
        if (this.c == 2) goto L11;
        this.b.add(r5);     // Catch: Throwable -> L9
        goto L12
    }
}
