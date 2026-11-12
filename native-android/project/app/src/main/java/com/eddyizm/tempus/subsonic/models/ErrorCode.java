package com.eddyizm.tempus.subsonic.models;

import defpackage.a21;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ErrorCode {
    public static final int $stable = 0;
    public static final a21 Companion = new a21();
    private static int DATA_NOT_FOUND = 70;
    private static int GENERIC_ERROR = 0;
    private static int INCOMPATIBLE_VERSION_CLIENT = 20;
    private static int INCOMPATIBLE_VERSION_SERVER = 30;
    private static int REQUIRED_PARAMETER_MISSING = 10;
    private static int TOKEN_AUTHENTICATION_NOT_SUPPORTED = 41;
    private static int TRIAL_PERIOD_OVER = 60;
    private static int USER_NOT_AUTHORIZED = 50;
    private static int WRONG_USERNAME_OR_PASSWORD = 40;
    private final int value;

    public ErrorCode(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
