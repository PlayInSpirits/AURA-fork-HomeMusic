package com.eddyizm.tempus.subsonic.models;

import java.util.Date;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class License {
    public static final int $stable = 8;
    private String email;
    private boolean isValid;
    private Date licenseExpires;
    private Date trialExpires;

    public final String getEmail() {
        return this.email;
    }

    public final Date getLicenseExpires() {
        return this.licenseExpires;
    }

    public final Date getTrialExpires() {
        return this.trialExpires;
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setLicenseExpires(Date date) {
        this.licenseExpires = date;
    }

    public final void setTrialExpires(Date date) {
        this.trialExpires = date;
    }

    public final void setValid(boolean z) {
        this.isValid = z;
    }
}
