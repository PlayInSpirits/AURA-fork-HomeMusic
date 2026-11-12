package com.eddyizm.tempus.subsonic.models;

import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class License {
    public static final int $stable = 8;
    private String email;
    private boolean isValid;
    private Date licenseExpires;
    private Date trialExpires;

    public License() {
    }

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

    public final void setEmail(String r1) {
        this.email = r1;
    }

    public final void setLicenseExpires(Date r1) {
        this.licenseExpires = r1;
    }

    public final void setTrialExpires(Date r1) {
        this.trialExpires = r1;
    }

    public final void setValid(boolean r1) {
        this.isValid = r1;
    }
}
