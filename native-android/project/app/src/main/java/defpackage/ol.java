package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ol extends AudioDeviceCallback {
    public final /* synthetic */ ql a;

    public ol(ql r1) {
        this.a = r1;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] r3) {
        ql r2 = this.a;
        r2.a(nl.b(r2.a, r2.i, r2.h));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] r3) {
        ql r2 = this.a;
        if (f35.m(r3, r2.h) == false) goto L5;
        r2.h = null;
    L5:
        r2.a(nl.b(r2.a, r2.i, r2.h));
    }
}
