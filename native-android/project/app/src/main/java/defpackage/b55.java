package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b55 implements t04 {
    public static final ab3 d = null;
    public static final ab3 e = null;
    public static final xi4 f = null;
    public static final List g = null;
    public final y45 a;
    public final zs b;
    public final xi4 c;

    static {
        d = new ab3("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new h45());
        e = new ab3("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new oz4(2));
        f = new xi4(29);
        g = Collections.unmodifiableList(Arrays.asList(new String[]{"TP1A", "TD1A.220804.031"}));
    }

    public b55(zs r1, y45 r2) {
        this.b = r1;
        this.a = r2;
        this.c = f;
    }

    @Override // defpackage.t04
    public final boolean a(Object r1, db3 r2) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.t04
    public final q04 b(Object r16, int r17, int r18, db3 r19) {
        TimeUnit r9 = TimeUnit.DAYS;
        long r3 = ((Long) r19.c(d)).longValue();
        if (r3 < 0) goto L5;
    L9:
        int r2 = (Integer) r19.c(e);
        if (r2 != null) goto L12;
        r2 = 2;
    L12:
        gu0 r1 = (gu0) r19.c(gu0.g);
        if (r1 != null) goto L15;
        r1 = gu0.f;
    L15:
        gu0 r8 = r1;
        this.c.getClass();
        Integer r4 = r2;
        MediaMetadataRetriever r5 = new MediaMetadataRetriever();
        boolean r13 = false;
        this.a.f(r5, r16);     // Catch: Throwable -> L41
        Bitmap r6 = c(r16, r5, r3, r4.intValue(), r17, r18, r8);     // Catch: Throwable -> L41
        if (Build.VERSION.SDK_INT >= 29) goto L20;
        r5.release();
    L40:
        return at.c(this.b, r6);
    L20:
        if ((r5 instanceof AutoCloseable) == false) goto L23;
        r5.close();
        goto L40
    L23:
        if ((r5 instanceof ExecutorService) == false) goto L37;
        ExecutorService r7 = (ExecutorService) r5;
        if (r7 == ForkJoinPool.commonPool()) goto L40;
        boolean r10 = r7.isTerminated();
        if (r10 == true) goto L40;
        r7.shutdown();
    L30:
        if (r10 == true) goto L35;
        r10 = r7.awaitTermination(1, r9);     // Catch: InterruptedException -> L33
    L33:
        if (r13 == true) goto L30;
        r7.shutdownNow();
        r13 = true;
        goto L30
    L35:
        if (r13 == false) goto L40;
        Thread.currentThread().interrupt();
        goto L40
    L37:
        r5.release();
    L41:
        th = move-exception;
        if (Build.VERSION.SDK_INT >= 29) goto L45;
        r5.release();
    L63:
        throw th;
    L45:
        if ((r5 instanceof AutoCloseable) == false) goto L47;
        r5.close();
        goto L63
    L47:
        if ((r5 instanceof ExecutorService) == false) goto L60;
        ExecutorService r11 = (ExecutorService) r5;
        if (r11 == ForkJoinPool.commonPool()) goto L63;
        boolean r12 = r11.isTerminated();
        if (r12 == true) goto L63;
        r11.shutdown();
    L53:
        if (r12 == true) goto L58;
        r12 = r11.awaitTermination(1, r9);     // Catch: InterruptedException -> L56
    L56:
        if (r13 == true) goto L53;
        r11.shutdownNow();
        r13 = true;
        goto L53
    L58:
        if (r13 == false) goto L63;
        Thread.currentThread().interrupt();
        goto L63
    L60:
        r5.release();
        goto L63
    L5:
        if (r3 == (-1)) goto L9;
        kf2.n(b11.k("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", r3));
        return null;
    }

    public final Bitmap c(Object r14, MediaMetadataRetriever r15, long r16, int r18, int r19, int r20, gu0 r21) {
        String r0 = Build.DEVICE;
        Bitmap r8 = null;
        if (r0 == null) goto L35;
        if (r0.matches(".+_cheets|cheets_.+") == false) goto L35;
    L21:
        th = th;
        MediaExtractor r5 = null;
    L93:
    L27:
        th = move-exception;
        if (r5 == null) goto L33;
        r5.release();
    L33:
        throw th;
    L24:
        if (Log.isLoggable("VideoDecoder", 3) == false) goto L29;
        Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);     // Catch: Throwable -> L27
    L29:
        if (r5 == null) goto L35;
    L20:
        r5.release();
        goto L35
    L8:
        if ("video/webm".equals(r15.extractMetadata(12)) == false) goto L35;
        r5 = new MediaExtractor();     // Catch: Throwable -> L21
        this.a.c(r5, r14);     // Catch: Throwable -> L18
        int r1 = r5.getTrackCount();     // Catch: Throwable -> L18
        int r6 = 0;
    L12:
        if (r6 >= r1) goto L20;
        if ("video/x-vnd.on2.vp8".equals(r5.getTrackFormat(r6).getString("mime")) == true) goto L16;
        r6 = r6 + 1;
        goto L12
    L16:
        r5.release();
        kf2.o("Cannot decode VP8 video on CrOS.");
        return null;
    L18:
        th = th;
    L35:
        if (Build.VERSION.SDK_INT >= 27) goto L37;
    L53:
        if (r8 != null) goto L56;
        r8 = r15.getFrameAtTime(r16, r18);
    L56:
        if (Build.MODEL.startsWith("Pixel") == true) goto L58;
    L65:
        int r2 = Build.VERSION.SDK_INT;
        if (r2 < 30) goto L83;
        if (r2 >= 33) goto L83;
    L87:
        String r3 = r15.extractMetadata(36);     // Catch: NumberFormatException -> L80
        String r4 = r15.extractMetadata(35);     // Catch: NumberFormatException -> L80
        int r7 = Integer.parseInt(r3);     // Catch: NumberFormatException -> L80
        int r9 = Integer.parseInt(r4);     // Catch: NumberFormatException -> L80
        if (r7 == 7) goto L72;
        if (r7 != 6) goto L83;
    L72:
        if (r9 != 6) goto L83;
        if (Math.abs(Integer.parseInt(r15.extractMetadata(24))) != 180) goto L83;
        if (Log.isLoggable("VideoDecoder", 3) == false) goto L79;
        Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
    L79:
        Matrix r10 = new Matrix();
        r10.postRotate(180.0f, r8.getWidth() / 2.0f, r8.getHeight() / 2.0f);
        r8 = Bitmap.createBitmap(r8, 0, 0, r8.getWidth(), r8.getHeight(), r10, true);
    L81:
        if (Log.isLoggable("VideoDecoder", 3) == false) goto L83;
        Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
    L83:
        if (r8 == null) goto L86;
        return r8;
    L86:
        throw new a55("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    L58:
        if (Build.VERSION.SDK_INT != 33) goto L65;
        Iterator r11 = g.iterator();
    L61:
        if (r11.hasNext() == false) goto L83;
        if (Build.ID.startsWith((String) r11.next()) == false) goto L61;
    L37:
        if (r19 == Integer.MIN_VALUE) goto L53;
        if (r20 == Integer.MIN_VALUE) goto L53;
        if (r21 == gu0.e) goto L53;
        int r12 = Integer.parseInt(r15.extractMetadata(18));     // Catch: Throwable -> L49
        int r13 = Integer.parseInt(r15.extractMetadata(19));     // Catch: Throwable -> L49
        int r17 = Integer.parseInt(r15.extractMetadata(24));     // Catch: Throwable -> L49
        if (r17 != 90) goto L45;
    L46:
        r13 = r12;
        r12 = r13;
    L47:
        float r22 = r21.b(r12, r13, r19, r20);     // Catch: Throwable -> L49
        r8 = un.a(r15, r16, r18, Math.round(r12 * r22), Math.round(r22 * r13));     // Catch: Throwable -> L49
        goto L53
    L45:
        if (r17 != 270) goto L47;
    L49:
        th = move-exception;
        if (Log.isLoggable("VideoDecoder", 3) == false) goto L53;
        Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
        goto L53
    }
}
