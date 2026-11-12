package com.eddyizm.tempus.subsonic.models;

import defpackage.a21;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ErrorCode {
    public static final int $stable = 0;
    public static final a21 Companion = null;
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

    static {
        Companion = new a21();
    }

    public ErrorCode(int r1) {
        this.value = r1;
    }

    public static final /* synthetic */ int access$getDATA_NOT_FOUND$cp() {
        return DATA_NOT_FOUND;
    }

    public static final /* synthetic */ int access$getGENERIC_ERROR$cp() {
        return GENERIC_ERROR;
    }

    public static final /* synthetic */ int access$getINCOMPATIBLE_VERSION_CLIENT$cp() {
        return INCOMPATIBLE_VERSION_CLIENT;
    }

    public static final /* synthetic */ int access$getINCOMPATIBLE_VERSION_SERVER$cp() {
        return INCOMPATIBLE_VERSION_SERVER;
    }

    public static final /* synthetic */ int access$getREQUIRED_PARAMETER_MISSING$cp() {
        return REQUIRED_PARAMETER_MISSING;
    }

    public static final /* synthetic */ int access$getTOKEN_AUTHENTICATION_NOT_SUPPORTED$cp() {
        return TOKEN_AUTHENTICATION_NOT_SUPPORTED;
    }

    public static final /* synthetic */ int access$getTRIAL_PERIOD_OVER$cp() {
        return TRIAL_PERIOD_OVER;
    }

    public static final /* synthetic */ int access$getUSER_NOT_AUTHORIZED$cp() {
        return USER_NOT_AUTHORIZED;
    }

    public static final /* synthetic */ int access$getWRONG_USERNAME_OR_PASSWORD$cp() {
        return WRONG_USERNAME_OR_PASSWORD;
    }

    public static final /* synthetic */ void access$setDATA_NOT_FOUND$cp(int r0) {
        DATA_NOT_FOUND = r0;
    }

    public static final /* synthetic */ void access$setGENERIC_ERROR$cp(int r0) {
        GENERIC_ERROR = r0;
    }

    public static final /* synthetic */ void access$setINCOMPATIBLE_VERSION_CLIENT$cp(int r0) {
        INCOMPATIBLE_VERSION_CLIENT = r0;
    }

    public static final /* synthetic */ void access$setINCOMPATIBLE_VERSION_SERVER$cp(int r0) {
        INCOMPATIBLE_VERSION_SERVER = r0;
    }

    public static final /* synthetic */ void access$setREQUIRED_PARAMETER_MISSING$cp(int r0) {
        REQUIRED_PARAMETER_MISSING = r0;
    }

    public static final /* synthetic */ void access$setTOKEN_AUTHENTICATION_NOT_SUPPORTED$cp(int r0) {
        TOKEN_AUTHENTICATION_NOT_SUPPORTED = r0;
    }

    public static final /* synthetic */ void access$setTRIAL_PERIOD_OVER$cp(int r0) {
        TRIAL_PERIOD_OVER = r0;
    }

    public static final /* synthetic */ void access$setUSER_NOT_AUTHORIZED$cp(int r0) {
        USER_NOT_AUTHORIZED = r0;
    }

    public static final /* synthetic */ void access$setWRONG_USERNAME_OR_PASSWORD$cp(int r0) {
        WRONG_USERNAME_OR_PASSWORD = r0;
    }

    public final int getValue() {
        return this.value;
    }
}
