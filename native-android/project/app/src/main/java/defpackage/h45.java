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
    public void accept(Object obj, Object obj2) {
        int i = this.n;
        Object obj3 = this.o;
        switch (i) {
            case 5:
                jg5 jg5Var = new jg5((cr4) obj2, 0);
                ah5 ah5Var = (ah5) ((vg5) obj).e();
                Parcel parcelM = ah5Var.m();
                int i2 = pg5.a;
                parcelM.writeStrongBinder(jg5Var);
                pg5.c(parcelM, (r44) obj3);
                ah5Var.U(parcelM, 2);
                return;
            default:
                yi5 yi5Var = new yi5((cr4) obj2);
                sk5 sk5Var = (sk5) ((ok5) obj).e();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(sk5Var.f);
                int i3 = ai5.a;
                parcelObtain.writeStrongBinder(yi5Var);
                parcelObtain.writeInt(1);
                ((xr3) obj3).writeToParcel(parcelObtain, 0);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    sk5Var.e.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
        }
    }

    @Override // defpackage.o95
    public String[] b() {
        return ((WebViewProviderFactoryBoundaryInterface) this.o).getSupportedFeatures();
    }

    @Override // defpackage.o95
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) fu.j(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.o).createWebView(webView));
    }

    @Override // defpackage.za3
    public void e(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.o)) {
            ((ByteBuffer) this.o).position(0);
            messageDigest.update(((ByteBuffer) this.o).putLong(l.longValue()).array());
        }
    }

    @Override // defpackage.de
    public c81 get(int i) {
        return (d81) this.o;
    }

    @Override // defpackage.o95
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) fu.j(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.o).getStatics());
    }

    @Override // defpackage.f4
    public boolean h(View view) {
        ss0 ss0Var = (ss0) this.o;
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = (ViewPager2) ss0Var.q;
        if (viewPager2.E) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }

    public /* synthetic */ h45(dj1 dj1Var, h2 h2Var, int i) {
        this.n = i;
        this.o = h2Var;
    }

    public /* synthetic */ h45(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    public h45(float f) {
        this.n = 0;
        this.o = new d81(f);
    }
}
