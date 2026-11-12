package defpackage;

import android.os.Parcel;
import android.view.View;
import android.webkit.WebView;
import androidx.viewpager2.widget.ViewPager2;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h45 implements de, za3, f4, o95, zy3 {
    public final /* synthetic */ int n;
    public final Object o;

    public h45() {
        this.n = 1;
        this.o = ByteBuffer.allocate(8);
    }

    @Override // defpackage.zy3
    public void accept(Object r4, Object r5) {
        int r0 = this.n;
        Object r3 = this.o;
        switch(r0) {
            case 5: goto L11;
            default: goto L4;
        };
    L4:
        yi5 r1 = new yi5((cr4) r5);
        sk5 r6 = (sk5) ((ok5) r4).e();
        Parcel r7 = Parcel.obtain();
        r7.writeInterfaceToken(r6.f);
        int r2 = ai5.a;
        r7.writeStrongBinder(r1);
        r7.writeInt(1);
        ((xr3) r3).writeToParcel(r7, 0);
        Parcel r8 = Parcel.obtain();
        r6.e.transact(1, r7, r8, 0);     // Catch: Throwable -> L8
        r8.readException();     // Catch: Throwable -> L8
        r7.recycle();
        r8.recycle();
        return;
    L8:
        th = move-exception;
        r7.recycle();
        r8.recycle();
        throw th;
    L11:
        jg5 r9 = new jg5((cr4) r5, 0);
        ah5 r10 = (ah5) ((vg5) r4).e();
        Parcel r11 = r10.m();
        int r12 = pg5.a;
        r11.writeStrongBinder(r9);
        pg5.c(r11, (r44) r3);
        r10.U(r11, 2);
    }

    @Override // defpackage.o95
    public String[] b() {
        return ((WebViewProviderFactoryBoundaryInterface) this.o).getSupportedFeatures();
    }

    @Override // defpackage.o95
    public WebViewProviderBoundaryInterface createWebView(WebView r1) {
        return (WebViewProviderBoundaryInterface) fu.j(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.o).createWebView(r1));
    }

    @Override // defpackage.za3
    public void e(byte[] r3, Object r4, MessageDigest r5) {
        Long r6 = (Long) r4;
        r5.update(r3);
        ByteBuffer r7 = (ByteBuffer) this.o;
        monitor-enter(r7);
        ((ByteBuffer) this.o).position(0);     // Catch: Throwable -> L7
        r5.update(((ByteBuffer) this.o).putLong(r6.longValue()).array());     // Catch: Throwable -> L7
        monitor-exit(r7);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.de
    public c81 get(int r1) {
        return (d81) this.o;
    }

    @Override // defpackage.o95
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) fu.j(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.o).getStatics());
    }

    @Override // defpackage.f4
    public boolean h(View r3) {
        ss0 r2 = (ss0) this.o;
        int r4 = ((ViewPager2) r3).getCurrentItem() - 1;
        ViewPager2 r5 = (ViewPager2) r2.q;
        if (r5.E == false) goto L5;
        r5.d(r4, true);
    L5:
        return true;
    }

    public /* synthetic */ h45(dj1 r1, h2 r2, int r3) {
        this.n = r3;
        this.o = r2;
    }

    public /* synthetic */ h45(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    public h45(float r2) {
        this.n = 0;
        this.o = new d81(r2);
    }
}
