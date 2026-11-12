package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rw implements t04 {
    public static final pa f = new pa(24);
    public static final qw g = new qw(0);
    public final Context a;
    public final ArrayList b;
    public final rm3 e;
    public final pa d = f;
    public final qw c = g;

    public rw(Context context, ArrayList arrayList, zs zsVar, qj0 qj0Var) {
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.e = new rm3(zsVar, qj0Var, false);
    }

    public static int d(ci1 ci1Var, int i, int i2) {
        int iMin = Math.min(ci1Var.g / i2, ci1Var.f / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbT = b11.t("Downsampling GIF, sampleSize: ", ", target dimens: [", iMax, i, "x");
            sbT.append(i2);
            sbT.append("], actual dimens: [");
            sbT.append(ci1Var.f);
            sbT.append("x");
            sbT.append(ci1Var.g);
            sbT.append("]");
            Log.v("BufferGifDecoder", sbT.toString());
        }
        return iMax;
    }

    @Override // defpackage.t04
    public final boolean a(Object obj, db3 db3Var) {
        return !((Boolean) db3Var.c(ei1.b)).booleanValue() && kb4.C(this.b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // defpackage.t04
    public final q04 b(Object obj, int i, int i2, db3 db3Var) {
        di1 di1Var;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        qw qwVar = this.c;
        synchronized (qwVar) {
            try {
                di1 di1Var2 = (di1) qwVar.a.poll();
                if (di1Var2 == null) {
                    di1Var2 = new di1();
                }
                di1Var = di1Var2;
                di1Var.b = null;
                Arrays.fill(di1Var.a, (byte) 0);
                di1Var.c = new ci1();
                di1Var.d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                di1Var.b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                di1Var.b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c(byteBuffer, i, i2, di1Var, db3Var);
        } finally {
            this.c.a(di1Var);
        }
    }

    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:568)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:594)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    public final wh1 c(ByteBuffer byteBuffer, int i, int i2, di1 di1Var, db3 db3Var) {
        StringBuilder sb;
        int i3 = ee2.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            ci1 ci1VarB = di1Var.b();
            if (ci1VarB.c > 0 && ci1VarB.b == 0) {
                Bitmap.Config config = db3Var.c(ei1.a) == vi0.o ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iD = d(ci1VarB, i, i2);
                pa paVar = this.d;
                rm3 rm3Var = this.e;
                paVar.getClass();
                vk4 vk4Var = new vk4(rm3Var, ci1VarB, byteBuffer, iD);
                vk4Var.c(config);
                vk4Var.k = (vk4Var.k + 1) % vk4Var.l.c;
                Bitmap bitmapB = vk4Var.b();
                if (bitmapB == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(ee2.a(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                wh1 wh1Var = new wh1(new vh1(new pd(2, new bi1(a.a(this.a), vk4Var, i, i2, bitmapB))), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + ee2.a(jElapsedRealtimeNanos));
                }
                return wh1Var;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(ee2.a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (!Log.isLoggable("BufferGifDecoder", 2)) {
                throw th;
            }
            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + ee2.a(jElapsedRealtimeNanos));
            throw th;
        }
    }
}
