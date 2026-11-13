package com.eddyizm.tempus.model;

import defpackage.f34;
import defpackage.h12;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class DownloadStack {
    public static final int $stable = 8;
    private String id;
    private String view;

    public DownloadStack(String str, String str2) {
        str.getClass();
        this.id = str;
        this.view = str2;
    }

    public static /* synthetic */ DownloadStack copy$default(DownloadStack downloadStack, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = downloadStack.id;
        }
        if ((i & 2) != 0) {
            str2 = downloadStack.view;
        }
        return downloadStack.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.view;
    }

    public final DownloadStack copy(String str, String str2) {
        str.getClass();
        return new DownloadStack(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadStack)) {
            return false;
        }
        DownloadStack downloadStack = (DownloadStack) obj;
        return h12.c(this.id, downloadStack.id) && h12.c(this.view, downloadStack.view);
    }

    public final String getId() {
        return this.id;
    }

    public final String getView() {
        return this.view;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.view;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setId(String str) {
        str.getClass();
        this.id = str;
    }

    public final void setView(String str) {
        this.view = str;
    }

    public String toString() {
        return f34.h("DownloadStack(id=", this.id, ", view=", this.view, ")");
    }
}
