.class public abstract Lun3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public static a(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_3

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p0, v0, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p0, v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    const-string p0, "Unknown"

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "Eraser"

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    const-string p0, "Stylus"

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_2
    const-string p0, "Mouse"

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_3
    const-string p0, "Touch"

    .line 26
    .line 27
    return-object p0
.end method
