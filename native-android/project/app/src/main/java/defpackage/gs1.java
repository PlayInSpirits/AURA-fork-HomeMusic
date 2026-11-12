package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.HubFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gs1 extends WebChromeClient {
    public final /* synthetic */ HubFragment a;

    public gs1(HubFragment hubFragment) {
        this.a = hubFragment;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        webView.getClass();
        valueCallback.getClass();
        fileChooserParams.getClass();
        HubFragment hubFragment = this.a;
        ValueCallback valueCallback2 = hubFragment.r0;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        hubFragment.r0 = valueCallback;
        Intent intentAddCategory = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE");
        intentAddCategory.getClass();
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        acceptTypes.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : acceptTypes) {
            str.getClass();
            v40.n0(qm4.D0(str, new char[]{','}), arrayList);
        }
        ArrayList arrayList2 = new ArrayList(r40.k0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String lowerCase = qm4.K0((String) obj).toString().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            arrayList2.add(lowerCase);
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            if (((String) obj2).length() > 0) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList3.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            String mimeTypeFromExtension = (String) obj3;
            if (xm4.k0(mimeTypeFromExtension, ".", false)) {
                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mimeTypeFromExtension.substring(1));
            }
            if (mimeTypeFromExtension != null) {
                arrayList4.add(mimeTypeFromExtension);
            }
        }
        List listT0 = q40.t0(arrayList4);
        if (listT0.isEmpty()) {
            intentAddCategory.setType("*/*");
        } else if (listT0.size() == 1) {
            intentAddCategory.setType((String) listT0.get(0));
        } else {
            intentAddCategory.setType("*/*");
            intentAddCategory.putExtra("android.intent.extra.MIME_TYPES", (String[]) listT0.toArray(new String[0])).getClass();
        }
        if (fileChooserParams.getMode() == 1) {
            intentAddCategory.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        try {
            hubFragment.s0.a(Intent.createChooser(intentAddCategory, hubFragment.s(R.string.homemusic_pick_files)));
            return true;
        } catch (ActivityNotFoundException unused) {
            hubFragment.r0 = null;
            valueCallback.onReceiveValue(null);
            return false;
        }
    }
}
