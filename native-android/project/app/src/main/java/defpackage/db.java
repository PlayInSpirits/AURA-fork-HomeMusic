package defpackage;

import android.content.ClipData;
import android.media.AudioProfile;
import android.view.ContentInfo;
import android.view.ScrollCaptureSession;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class db {
    public static /* bridge */ /* synthetic */ AudioProfile d(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ ContentInfo.Builder e(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession h(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ViewTranslationRequest.Builder l(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse n(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ void p() {
    }
}
